package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.ReservaDao;
import edu.upc.clase.demo.entity.Reserva;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gian
 */
@Repository
public class ReservaDaoImpl extends SimpleJdbcDaoSupport implements ReservaDao {

    private static Logger log = LoggerFactory.getLogger(ReservaDaoImpl.class);

    @Autowired
    public ReservaDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    @Override
    public Integer insertar(Reserva reserva) {

        getJdbcTemplate().update(
                "insert into reserva (fecha,hora,canthora,costo,idsala,idusuario) values (?, ?, ?, ?, ?,?)",
                reserva.getFecha(), reserva.getHora(), reserva.getCanthora(), reserva.getCosto(),reserva.getIdsala(),reserva.getIdusuario());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }

    @Override
    public void actualizar(Reserva reserva) {
        getJdbcTemplate().update(
                "update reserva set fecha = ?, hora=?, canthora = ?, costo = ? where idreserva = ?",
                reserva.getFecha(), reserva.getHora(), reserva.getCanthora(), reserva.getCosto(),reserva.getIdreserva());
    }

    @Override
    public void eliminar(Reserva reserva) {
        getJdbcTemplate().update(
                "delete from reserva where idreserva = ?", reserva.getIdreserva());
    }

    @Override
    public Reserva buscar(Integer id) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select idreserva,fecha,hora,canthora,costo,idsala,idusuario from reserva where idreserva=?",
                    new BeanPropertyRowMapper<Reserva>(Reserva.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Reserva> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select idreserva,fecha,hora,canthora,costo,idsala,idusuario from reserva",
                new BeanPropertyRowMapper<Reserva>(Reserva.class));
    }

    @Override
    public Reserva buscar(String correo) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select idreserva,fecha,hora,canthora,costo,idsala,idusuario from reserva where idusuario=?",
                    new BeanPropertyRowMapper<Reserva>(Reserva.class), correo);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Reserva> buscarPorNombre(String nombre) {
        try {
            Map<String,String> parametros = new HashMap<String,String>();
            parametros.put("nombre","%"+nombre+"%");
            return getSimpleJdbcTemplate().query(
                    "select * from reserva where nombre like :nombre",
                    new BeanPropertyRowMapper<Reserva>(Reserva.class),parametros);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
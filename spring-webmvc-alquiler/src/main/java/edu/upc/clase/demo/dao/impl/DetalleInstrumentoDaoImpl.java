package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.DetalleInstrumentoDao;
import edu.upc.clase.demo.entity.DetalleInstrumento;
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
public class DetalleInstrumentoDaoImpl extends SimpleJdbcDaoSupport implements DetalleInstrumentoDao {

    private static Logger log = LoggerFactory.getLogger(DetalleInstrumentoDaoImpl.class);

    @Autowired
    public DetalleInstrumentoDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    @Override
    public Integer insertar(DetalleInstrumento detallearmado) {

        getJdbcTemplate().update(
                "insert into detalleinstrumento (idinstrumento,idarmadosala) values (?, ?)",
                detallearmado.getIdinstrumento(), detallearmado.getIdarmadosala());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }

//    @Override
//    public void actualizar(DetalleArmado detallearmado) {
//        getJdbcTemplate().update(
////                "update detallearmado set nombre = ?, correo = ? where id = ?",
////                detallearmado.getNombre(), detallearmado.getCorreo(), detallearmado.getId());
//    }

    @Override
    public void eliminar(DetalleInstrumento detallearmado) {
        getJdbcTemplate().update(
                "delete from detalleinstrumento where iddetallearmado = ?", detallearmado.getIddetallearmado());
    }

    @Override
    public DetalleInstrumento buscar(Integer id) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select iddetallearmado,idinstrumento,idarmadosala  from detalleinstrumento where iddetallearmado=?",
                    new BeanPropertyRowMapper<DetalleInstrumento>(DetalleInstrumento.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<DetalleInstrumento> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select iddetallearmado,idinstrumento,idarmadosala from detalleinstrumento",
                new BeanPropertyRowMapper<DetalleInstrumento>(DetalleInstrumento.class));
    }

//    @Override
//    public DetalleArmado buscar(String correo) {
//        try {
//            return getSimpleJdbcTemplate().queryForObject(
//                    "select iddetallearmado,idinstrumento,idarmadosala from detallearmado where correo=?",
//                    new BeanPropertyRowMapper<DetalleArmado>(DetalleArmado.class), correo);
//        } catch (EmptyResultDataAccessException e) {
//            return null;
//        }
//    }

//    @Override
//    public List<DetalleArmado> buscarPorNombre(String nombre) {
//        try {
//            Map<String,String> parametros = new HashMap<String,String>();
//            parametros.put("nombre","%"+nombre+"%");
//            return getSimpleJdbcTemplate().query(
//                    "select * from detallearmado where nombre like :nombre",
//                    new BeanPropertyRowMapper<DetalleArmado>(DetalleArmado.class),parametros);
//        } catch (EmptyResultDataAccessException e) {
//            return null;
//        }
//    }
}
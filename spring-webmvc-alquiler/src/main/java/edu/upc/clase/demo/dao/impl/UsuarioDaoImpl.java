package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.UsuarioDao;
import edu.upc.clase.demo.entity.Usuario;
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
public class UsuarioDaoImpl extends SimpleJdbcDaoSupport implements UsuarioDao {

    private static Logger log = LoggerFactory.getLogger(UsuarioDaoImpl.class);

    @Autowired
    public UsuarioDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    @Override
    public Integer insertar(Usuario usuario) {

        getJdbcTemplate().update(
                "insert into usuario (nombre,apepat,apemat,email,fechanac,clave,tipousuario) values (?, ?, ?, ?, ?, ?, ?)",
                usuario.getNombre(), usuario.getApepat(), usuario.getApemat(),usuario.getEmail(),usuario.getFechanac(),usuario.getClave(),usuario.getTipousuario());
        return getSimpleJdbcTemplate().queryForInt("select last_insert_id()");
    }

    @Override
    public void actualizar(Usuario usuario) {
        getJdbcTemplate().update(
                "update usuario set nombre = ?, apepat = ?, apemat = ?, email = ?, fechanac = ?, clave=?, tipousuario=? where idusuario = ?",
                usuario.getNombre(), usuario.getApepat(),usuario.getApemat(),usuario.getEmail(),usuario.getFechanac(),usuario.getClave(),usuario.getTipousuario(),usuario.getIdusuario());
    }

    @Override
    public void eliminar(Usuario usuario) {
        getJdbcTemplate().update(
                "delete from usuario where idusuario = ?", usuario.getIdusuario());
    }

    @Override
    public Usuario buscar(Integer id) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select idusuario, nombre, apepat, apemat, email, fechanac, clave from usuario where idusuario=?",
                    new BeanPropertyRowMapper<Usuario>(Usuario.class), id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Usuario> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select idusuario,nombre, apepat, apemat, email, fechanac, clave from usuario",
                new BeanPropertyRowMapper<Usuario>(Usuario.class));
    }

    @Override
    public Usuario buscar(String email) {
        try {
            return getSimpleJdbcTemplate().queryForObject(
                    "select idusuario, nombre,apepat,apemat,email,fechanac,clave,tipousuario from usuario where email=?",
                    new BeanPropertyRowMapper<Usuario>(Usuario.class), email);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Usuario> buscarPorNombre(String nombre) {
        try {
            Map<String,String> parametros = new HashMap<String,String>();
            parametros.put("nombre","%"+nombre+"%");
            return getSimpleJdbcTemplate().query(
                    "select * from usuario where nombre like :nombre",
                    new BeanPropertyRowMapper<Usuario>(Usuario.class),parametros);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
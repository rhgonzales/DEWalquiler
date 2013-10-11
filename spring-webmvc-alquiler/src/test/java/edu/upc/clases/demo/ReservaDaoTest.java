package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.ReservaDao;
import edu.upc.clase.demo.entity.Reserva;
import edu.upc.clase.demo.dao.LocalDao;
import edu.upc.clase.demo.entity.Local;
import edu.upc.clase.demo.dao.SalaDao;
import edu.upc.clase.demo.entity.Sala;
import edu.upc.clase.demo.dao.UsuarioDao;
import edu.upc.clase.demo.entity.Usuario;
//import edu.upc.clase.demo.service.ReservaService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author gian
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
@Transactional
public class ReservaDaoTest {
    
    private static Logger log = LoggerFactory.getLogger(ReservaDaoTest.class);
    
    @Autowired
    ReservaDao reservaDao;
    
    @Autowired
    UsuarioDao usuarioDao;
    
    @Autowired
    LocalDao localDao;
    
    @Autowired
    SalaDao salaDao;

    @Autowired 
//    ReservaService reservaService;
        
    @Test
    public void testInsertarReserva() {
        Usuario usuario=   usuario=usuarioDao.buscar("gian.corzo@antartec.com");
        Integer idusuario=usuario.getIdusuario();
        
        Local local = new Local ("Administrador");
        Integer idlocal = localDao.insertar(local);         
        Sala sala = new Sala("Premium","Miraflores",50,"Moderna",idlocal);
        Integer idsala = salaDao.insertar(sala);
        
        Reserva reserva = new Reserva("2013/03/21","15:30",50,15,idsala,idusuario);
        Integer id = reservaDao.insertar(reserva);
        Assert.assertNotNull(id);
    }

    /**
     * Quiero probar que despues de haber registrado un valor, lo pueda actualizar
     * Primero registro, luego grabo, luego busco, actualizo.
     */
    @Test
    public void testActualizarReserva() {
       Usuario usuario=   usuario=usuarioDao.buscar("gian.corzo@antartec.com");
        Integer idusuario=usuario.getIdusuario();
        
        Local local = new Local ("Administrador");
        Integer idlocal = localDao.insertar(local);         
        Sala sala = new Sala("Premium","Miraflores",50,"Moderna",idlocal);
        Integer idsala = salaDao.insertar(sala);
        
        Reserva reserva = new Reserva("2013/03/21","15:30",50,15,idsala,idusuario);
        Integer id = reservaDao.insertar(reserva);
        reserva = reservaDao.buscar(id);
        reserva.setCanthora(16);
        reservaDao.actualizar(reserva);
        reserva = reservaDao.buscar(id);
        Assert.assertEquals(16.0, reserva.getCanthora(),0.1);
    }

    @Test
    public void testEliminarReserva() {
        Usuario usuario=   usuario=usuarioDao.buscar("gian.corzo@antartec.com");
        Integer idusuario=usuario.getIdusuario();
        
        Local local = new Local ("Administrador");
        Integer idlocal = localDao.insertar(local);         
        Sala sala = new Sala("Premium","Miraflores",50,"Moderna",idlocal);
        Integer idsala = salaDao.insertar(sala);
        
        Reserva reserva = new Reserva("2013/03/21","15:30",50,15,idsala,idusuario);
        Integer id = reservaDao.insertar(reserva);
        reserva = reservaDao.buscar(id);
        reservaDao.eliminar(reserva);
        reserva = reservaDao.buscar(id);
        Assert.assertNull(reserva);
    }

    @Test
    public void testBuscarPorLetras() {
       Usuario usuario=   usuario=usuarioDao.buscar("gian.corzo@antartec.com");
        Integer idusuario=usuario.getIdusuario();
        
        Local local = new Local ("Administrador");
        Integer idlocal = localDao.insertar(local);         
        Sala sala = new Sala("Premium","Miraflores",50,"Moderna",idlocal);
        Integer idsala = salaDao.insertar(sala);
        
        Reserva reserva = new Reserva("2013/03/21","15:30",50,15,idsala,idusuario);
        Integer id = reservaDao.insertar(reserva);
        reserva = reservaDao.buscar(-8);
        Assert.assertNull(reserva);
    }
}

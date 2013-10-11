package edu.upc.clases.demo;

import edu.upc.clase.demo.dao.DetalleInstrumentoDao;
import edu.upc.clase.demo.entity.DetalleInstrumento;
import edu.upc.clase.demo.dao.InstrumentoDao;
import edu.upc.clase.demo.entity.Instrumento;
import edu.upc.clase.demo.dao.SalaDao;
import edu.upc.clase.demo.entity.Sala;
import edu.upc.clase.demo.dao.ServicioDao;
import edu.upc.clase.demo.entity.Servicio;
import edu.upc.clase.demo.dao.ArmadoSalaDao;
import edu.upc.clase.demo.entity.ArmadoSala;
import edu.upc.clase.demo.dao.LocalDao;
import edu.upc.clase.demo.entity.Local;

import edu.upc.clase.demo.entity.*;
//import edu.upc.clase.demo.service.DetalleArmadoService;
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
public class DetalleArmadoDaoTest {

    private static Logger log = LoggerFactory.getLogger(DetalleArmadoDaoTest.class);
    @Autowired
    DetalleInstrumentoDao detallearmadoDao;
    @Autowired
    InstrumentoDao instrumentoDao;
    @Autowired
    SalaDao salaDao;
    @Autowired
    ArmadoSalaDao armadosalaDao;
    @Autowired
    LocalDao localDao;
    @Autowired
    ServicioDao servicioDao;

    @Autowired
//    DetalleArmadoService detallearmadoService;
    @Test
    public void testInsertarDetalleArmado() {
        Instrumento instrumento = new Instrumento("viento", "selmer", "cc2013", "2013", "Saxo Frances", 25, 10);
        Integer idinstrumento = instrumentoDao.insertar(instrumento);
        Local local = new Local("Administrador");
        Integer idlocal = localDao.insertar(local);
        Sala sala = new Sala("Premium", "Miraflores", 50, "Moderna", idlocal);
        Integer idsala = salaDao.insertar(sala);
        Servicio servicio = new Servicio("Alquiler", 20);
        Integer idservicio = servicioDao.insertar(servicio);
        ArmadoSala armadosala = new ArmadoSala(12, idsala, idservicio);
        Integer idarmadosala = armadosalaDao.insertar(armadosala);

        DetalleInstrumento detalleinstrumento = new DetalleInstrumento(idinstrumento, idarmadosala);
        Integer id = detallearmadoDao.insertar(detalleinstrumento);
        Assert.assertNotNull(id);
    }

    @Test
    public void testEliminarDetalleArmado() {
        Instrumento instrumento = new Instrumento("viento", "selmer", "cc2013", "2013", "Saxo Frances", 25, 10);
        Integer idinstrumento = instrumentoDao.insertar(instrumento);
        Local local = new Local("Administrador");
        Integer idlocal = localDao.insertar(local);
        Sala sala = new Sala("Premium", "Miraflores", 50, "Moderna", idlocal);
        Integer idsala = salaDao.insertar(sala);
        Servicio servicio = new Servicio("Alquiler", 20);
        Integer idservicio = servicioDao.insertar(servicio);
        ArmadoSala armadosala = new ArmadoSala(12.0, idsala, idservicio);
        Integer idarmadosala = armadosalaDao.insertar(armadosala);

        DetalleInstrumento detalleinstrumento = new DetalleInstrumento(idinstrumento, idarmadosala);
        Integer id = detallearmadoDao.insertar(detalleinstrumento);

        detalleinstrumento = detallearmadoDao.buscar(id);
        detallearmadoDao.eliminar(detalleinstrumento);
        detalleinstrumento = detallearmadoDao.buscar(id);
        Assert.assertNull(detalleinstrumento);
    }

    @Test
    public void testBuscarPorLetras() {
         Instrumento instrumento = new Instrumento("viento", "selmer", "cc2013", "2013", "Saxo Frances", 25, 10);
        Integer idinstrumento = instrumentoDao.insertar(instrumento);
        Local local = new Local("Administrador");
        Integer idlocal = localDao.insertar(local);
        Sala sala = new Sala("Premium", "Miraflores", 50, "Moderna", idlocal);
        Integer idsala = salaDao.insertar(sala);
        Servicio servicio = new Servicio("Alquiler", 20);
        Integer idservicio = servicioDao.insertar(servicio);
        ArmadoSala armadosala = new ArmadoSala(12.0, idsala, idservicio);
        Integer idarmadosala = armadosalaDao.insertar(armadosala);

        DetalleInstrumento detalleinstrumento = new DetalleInstrumento(idinstrumento, idarmadosala);        
        Integer id = detallearmadoDao.insertar(detalleinstrumento);
        
        detalleinstrumento = detallearmadoDao.buscar(-8);
        Assert.assertNull(detalleinstrumento);
    }
}

package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.DetalleInstrumento;
import java.util.List;

/**
 *
 * @author gian
 */
public interface DetalleInstrumentoDao {
    public Integer insertar(DetalleInstrumento detallearmado);
//    public void actualizar(DetalleArmado detallearmado);
    public void eliminar(DetalleInstrumento detallearmado); 
    public List<DetalleInstrumento> buscarTodos();
    public DetalleInstrumento buscar(Integer id);
//    public DetalleArmado buscar(String correo);
//    public List<DetalleArmado> buscarPorNombre(String nombre);
}

package edu.upc.clase.demo.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author gian
 */
@XmlRootElement
public class DetalleInstrumento implements Serializable {
    
   private int iddetallearmado;
   private int idinstrumento;
   private int idarmadosala;

    public DetalleInstrumento() {
    }

    public DetalleInstrumento(int idinstrumento, int idarmadosala) {        
        this.idinstrumento = idinstrumento;
        this.idarmadosala = idarmadosala;
    }

    public int getIddetallearmado() {
        return iddetallearmado;
    }

    public void setIddetallearmado(int iddetallearmado) {
        this.iddetallearmado = iddetallearmado;
    }

    public int getIdinstrumento() {
        return idinstrumento;
    }

    public void setIdinstrumento(int idinstrumento) {
        this.idinstrumento = idinstrumento;
    }

    public int getIdarmadosala() {
        return idarmadosala;
    }

    public void setIdarmadosala(int idarmadosala) {
        this.idarmadosala = idarmadosala;
    } 
    
}
package edu.upc.clase.demo.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author gian
 */
@XmlRootElement
public class ArmadoSala implements Serializable {
   
    private int idarmadosala;
    private double costo;
    private int idsala;
    private int idservicio;

    public ArmadoSala() {
    }  
    
    public ArmadoSala(double costo, int idsala, int idservicio) {        
        this.costo = costo;
        this.idsala = idsala;
        this.idservicio = idservicio;
    }

    public int getIdarmadosala() {
        return idarmadosala;
    }

    public void setIdarmadosala(int idarmadosala) {
        this.idarmadosala = idarmadosala;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

   
   
}
package edu.upc.clase.demo.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author gian
 */
@XmlRootElement
public class Reserva implements Serializable {
    
  private int idreserva;
  private String fecha;
  private String hora;
  private int canthora;  
  private double costo;  
  private int idsala;
  private int idusuario;

    public Reserva() {
    }

    public Reserva(String fecha, String hora, int canthora, double costo, int idsala, int idusuario) {        
        this.fecha = fecha;
        this.hora = hora;
        this.canthora = canthora;
        this.costo = costo;
        this.idsala = idsala;
        this.idusuario = idusuario;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCanthora() {
        return canthora;
    }

    public void setCanthora(int canthora) {
        this.canthora = canthora;
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

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    
}
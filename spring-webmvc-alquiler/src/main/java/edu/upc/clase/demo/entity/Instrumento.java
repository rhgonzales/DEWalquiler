package edu.upc.clase.demo.entity;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author gian
 */
@XmlRootElement
public class Instrumento implements Serializable {
    
  private int idinstrumento;  
  private String tipo;
  private String marca;
  private String modelo;
  private String aniofabricacion;
  private String caracteristicas;
  private double costo;
  private int stock;

    public Instrumento() {
    }

    public Instrumento(String tipo, String marca, String modelo, String aniofabricacion, String caracteristicas, double costo, int stock) {        
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.aniofabricacion = aniofabricacion;
        this.caracteristicas = caracteristicas;
        this.costo = costo;
        this.stock = stock;
    }

    public int getIdinstrumento() {
        return idinstrumento;
    }

    public void setIdinstrumento(int idinstrumento) {
        this.idinstrumento = idinstrumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(String aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
   
}
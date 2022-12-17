/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udp.programaudp;

import java.util.Date;
/**
 *
 * @author Francisco Riquelme <francisco.riquelme@konecta.com.py at Konecta SA>
 */
public class Data {
   private int IdEstacion;

    public int getIdEstacion() {
        return IdEstacion;
    }

    public void setIdEstacion(int IdEstacion) {
        this.IdEstacion = IdEstacion;
    }
   private String cedula;
   private String nombre;
   private String apellido;
   private String chapa;
   private String marca;
   private Long monto;

    public Data() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Long getMonto() {
        return monto;
    }

    public void setMonto(Long monto) {
        this.monto = monto;
    }


    
}

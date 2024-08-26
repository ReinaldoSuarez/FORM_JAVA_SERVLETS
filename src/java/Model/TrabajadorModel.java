/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Manue
 */
public class TrabajadorModel {
    private int codtrabajador, edad,telefono,dni;
    private String nombre,apellido,direccion,usuario,clave, estado,tipo_user;
    private Object fechaN;

    public TrabajadorModel() {
    }

    public TrabajadorModel(int codtrabajador, int edad, int telefono, int dni, String nombre, String apellido, String direccion, String usuario, String clave, String estado, String tipo_user, Object fechaN) {
        this.codtrabajador = codtrabajador;
        this.edad = edad;
        this.telefono = telefono;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
        this.tipo_user = tipo_user;
        this.fechaN = fechaN;
    }

    public int getCodtrabajador() {
        return codtrabajador;
    }

    public void setCodtrabajador(int codtrabajador) {
        this.codtrabajador = codtrabajador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_user() {
        return tipo_user;
    }

    public void setTipo_user(String tipo_user) {
        this.tipo_user = tipo_user;
    }

    public Object getFechaN() {
        return fechaN;
    }

    public void setFechaN(Object fechaN) {
        this.fechaN = fechaN;
    }
    
}

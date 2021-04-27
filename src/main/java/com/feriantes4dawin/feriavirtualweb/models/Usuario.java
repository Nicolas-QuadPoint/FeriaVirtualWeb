package com.feriantes4dawin.feriavirtualweb.models;

public class Usuario {
    
    public int id_usuario;
    public String personal_id;
    public String nombre;
    public String nombre_segundo;
    public String apellido_paterno;
    public String apellido_materno;
    public String fecha_nacimiento;
    public int telefono;
    public String direccion;
    public String email;
    public String contrasena;
    public String salt_contrasena;
    public Nacionalidad nacionalidad;
    public Rol rol;
    public EstadoUsuario estado_usuario;
    public EstadoContrato estado_contrato;
    
}

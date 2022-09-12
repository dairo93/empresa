package model;

import java.util.Date;
import java.util.List;

import Enum_Rol_Nombre.EnumeradorRolNombre;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String correo;
    private String telefono;
    @Enumerated(EnumType.STRING)
    @Column(name="Rol")
    private EnumeradorRolNombre Rol;

    //RELACION UNO A UNO
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    private List <Transaccion> transaccion;
    private Date fechaActualizacion;
    private Date fechaCreacion;

    public Usuario(Long id, String correo, String telefono, EnumeradorRolNombre rol, Empresa empresa, List<Transaccion> transaccion, Date fechaActualizacion, Date fechaCreacion) {

        this.id = id;
        this.correo = correo;
        this.telefono = telefono;
        this.Rol = rol;
        this.empresa = empresa;
        this.transaccion = transaccion;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public EnumeradorRolNombre getRol() {
        return Rol;
    }

    public void setRol(EnumeradorRolNombre rol) {
        this.Rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Transaccion> getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(List<Transaccion> transaccion) {
        this.transaccion = transaccion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

package ayiacademy.tp1.ejercicio2.persistence.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "proveedores")
@Data
@NoArgsConstructor
public class Proveedor implements Serializable {
    @Id
    @GeneratedValue
    private int idProveedor;

    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String sitioWeb;
    private int estado;

    public Proveedor(String nombre, String telefono, String direccion, String email, String sitioWeb, int estado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.sitioWeb = sitioWeb;
        this.estado = estado;
    }

    public String getEstadoDescripcion() {
        return Estado.toString(estado);
    }

    private static final long serialVersionUID = 1L;
}

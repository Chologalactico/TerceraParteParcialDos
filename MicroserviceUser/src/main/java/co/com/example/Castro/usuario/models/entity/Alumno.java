package co.com.example.Castro.usuario.models.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

//Indica que la clase es una entidad de JPA y está mapeada a una tabla en la base de datos.
@Entity
//Especifica los detalles de la tabla en la base de datos a la que está mapeada la entidad.
@Table
//Anotación de Lombok que genera automáticamente los métodos `getter` para todos los campos de la clase.
@Getter
//Anotación de Lombok que genera automáticamente los métodos `setter` para todos los campos de la clase.
@Setter
//Anotación de Lombok que genera un constructor sin argumentos.
@NoArgsConstructor
//Anotación de Lombok que genera un constructor con argumentos que incluyen todos los campos de la clase.
@AllArgsConstructor
//Anotación de Lombok que genera automáticamente el método `toString()`,
@ToString
public class Alumno {

	// Marca un campo como la clave primaria de la entidad.
    @Id
 // Genera automáticamente los valores de la clave primaria, y utiliza la estrategia de autoincremento en la base de datos.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;

 // @Column(name = "create_at")Indica que un campo de la clase está mapeado a una columna específica en la tabla de la base de datos.

 // @Temporal(TemporalType.TIMESTAMP)Especifica el tipo de dato temporal (fecha/hora) que se va a mapear en la base de datos.
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @PrePersist
    private void prePersiste() {
        this.createAt = new Date();
    }


}

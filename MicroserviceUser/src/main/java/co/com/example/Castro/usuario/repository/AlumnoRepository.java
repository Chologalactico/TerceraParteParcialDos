package co.com.example.Castro.usuario.repository;


import co.com.example.Castro.usuario.models.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
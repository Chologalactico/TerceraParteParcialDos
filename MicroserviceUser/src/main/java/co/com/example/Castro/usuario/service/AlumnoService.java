package co.com.example.Castro.usuario.service;

import co.com.example.Castro.usuario.models.entity.Alumno;

import java.util.Optional;

public interface AlumnoService {

    public Iterable<Alumno> findAll();
    public Optional<Alumno> findById(Long id);
    public Alumno save(Alumno alumno);
    public  void deleteById(Long id);
}

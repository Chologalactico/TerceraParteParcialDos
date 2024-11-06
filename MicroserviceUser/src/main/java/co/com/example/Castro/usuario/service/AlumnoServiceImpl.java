package co.com.example.Castro.usuario.service;

import co.com.example.Castro.usuario.models.entity.Alumno;

import co.com.example.Castro.usuario.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    AlumnoRepository dao;
    @Override
    /*
    @Transactional ->Se utiliza para gestionar la integridad y consistencia
    de transacciones en BD
     */
    @Transactional(readOnly =true)
    public Iterable<Alumno> findAll(){
        return  dao.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Optional<Alumno> findById(Long id){
        return dao.findById(id);
    }
    @Override
    @Transactional
    public Alumno save(Alumno alumno) {
        //TODO Auto-generated method stub
        return dao.save(alumno);
    }
    @Override
    @Transactional
    public void deleteById(Long id){
        //TODO Auto-generated method stub
        dao.deleteById(id);
    }


}

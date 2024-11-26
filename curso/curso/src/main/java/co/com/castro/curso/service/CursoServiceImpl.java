package co.com.castro.curso.service;

import org.springframework.stereotype.Service;

import co.com.castro.commons.service.CommonService;
import co.com.castro.commons.service.CommonServiceImpl;
import co.com.castro.curso.models.entity.Curso;
import co.com.castro.curso.repository.CursoRepository;


@Service
public class CursoServiceImpl extends CommonServiceImpl <Curso,CursoRepository>
implements CommonService<Curso>{

}

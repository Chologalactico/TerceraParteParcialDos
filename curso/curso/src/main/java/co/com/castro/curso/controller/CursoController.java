package co.com.castro.curso.controller;

import org.springframework.web.bind.annotation.RestController;

import co.com.castro.commons.controller.CommonController;
import co.com.castro.curso.models.entity.Curso;
import co.com.castro.curso.service.CursoService;

@RestController
public class CursoController extends  CommonController <Curso,CursoService>{

}

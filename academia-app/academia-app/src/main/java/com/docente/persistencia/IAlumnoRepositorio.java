package com.docente.persistencia;

import java.util.List;

import com.docente.modelo.Alumno;

public interface IAlumnoRepositorio {

  /**
   * Funciona que obtiene todos los alumnos del repositorio.
   * @return Lista de alumnos del repositorio.
   */
  List<Alumno> obtenerAlumnos();

  
  public boolean guardarAlumno();
  

}

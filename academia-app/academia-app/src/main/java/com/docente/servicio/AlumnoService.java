package com.docente.servicio;

import com.docente.modelo.Alumno;
import com.docente.persistencia.IAlumnoRepositorio;
import com.docente.persistencia.impl.AlumnoRepositorioCSV;

public class AlumnoService {
  final IAlumnoRepositorio alumnoRepositorio;
  List<Alumno> alumnos;
  public AlumnoService(){
    this.alumnoRepositorio = new AlumnoRepositorioCSV();
  }
}

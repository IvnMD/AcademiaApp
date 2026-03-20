package com.docente.modelo;

import java.util.Objects;

public abstract class PersonaAbstracta {

  private final String identificador;
  private String nombre;
  private int edad;

  protected PersonaAbstracta(String identificador) {
    this.identificador = identificador;
  }

  protected PersonaAbstracta(String identificador, String nombre, int edad) {
    this.identificador = identificador;
    this.nombre = nombre;
    this.edad = edad;
  }

  protected String getIdentificador() {
    return identificador;
  }

  protected String getNombre() {
    return nombre;
  }

  protected void setNombre(String nombre) {
    this.nombre = nombre;
  }

  protected int getEdad() {
    return edad;
  }

  protected void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificador);
  }

  @Override
  public boolean equals(Object obj) {

    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    }

    PersonaAbstracta other = (PersonaAbstracta) obj;
    if (identificador == null || other.getIdentificador() == null) {
      return false;
    }
    return identificador.equals(other.identificador);
  }

}
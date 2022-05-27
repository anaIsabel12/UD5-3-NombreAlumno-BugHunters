package com.digitalcastaway.biblioteca;

public abstract class Usuario {

    public abstract void obtenerLibro(int posicion, Biblioteca biblioteca);
    public abstract String obtenerLibroAleatorio(Biblioteca biblioteca);
    public abstract void devolverLibro(boolean titulo, Biblioteca biblioteca);
}

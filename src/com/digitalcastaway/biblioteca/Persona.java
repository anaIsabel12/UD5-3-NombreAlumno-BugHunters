package com.digitalcastaway.biblioteca;

import java.util.ArrayList;

public class Persona extends Usuario {
    private String nombre;
    private ArrayList<String> librosPrestados;
    public String biblioteca;
    private Object String;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<String>();
    }

    @Override
    public void obtenerLibro(int posicion, Biblioteca biblioteca) {
        String titulo = biblioteca.prestarLibro(posicion);
        librosPrestados.add(titulo);
    }

    @Override
    public String obtenerLibroAleatorio(Biblioteca biblioteca) {
        return null;
    }

    @Override
    public void devolverLibro(String titulo, Biblioteca biblioteca) {
        biblioteca.devolverLibro(obtenerTituloLibro(0);

        biblioteca.devolverLibro(librosPrestados.remove(String));
    }

    public String obtenerTituloLibro(int posicion) {
        return librosPrestados.get(posicion);
    }

    @Override
    public String toString() {
        String output = "Nombre='" + nombre + '\'' +
                " tiene los siguientes libros de la biblioteca: \n";

        int contador = 0;
        for (String titulo : librosPrestados) {
            output += contador + " --> " + titulo + "\n";
            contador++;
        }
    }
}

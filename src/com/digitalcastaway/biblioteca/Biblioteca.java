package com.digitalcastaway.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Biblioteca {
    private String name;
    private ArrayList<Boolean> catalogoLibros;

    public Biblioteca(String name) {
        this.name = name;
        this.catalogoLibros = new ArrayList<Boolean>(Arrays.stream(Catalogo.libros).toList());
    }

    public void showCatalog() {
        Iterator<Boolean> it = catalogoLibros.iterator();
        System.out.println("################################");
        System.out.println("# Mostrando catálogo de libros #");
        System.out.println("################################");

        int contador = 0;

    }

    public Boolean prestarLibro(int posicion) {
        return catalogoLibros.remove(posicion);
    }

    public Boolean prestarLibroAleatorio() {
        int posicionAleatoria = (int) (Math.random() * this.catalogoLibros.size());
        return prestarLibro(posicionAleatoria);
    }

    public void devolverLibro(boolean titulo) {
        catalogoLibros.add(titulo);
    }
}

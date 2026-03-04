package com.example;

public class Libro {

    // Atributos Privados
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor Vacio
    public Libro() {
        this.titulo = " Desconicido ";
        this.autor = " Anonimo ";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor Completo
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDetalles() {
        System.out.println(" Libro " + titulo
                + " |autor " + autor
                + " |paginas " + paginas);
    }

}

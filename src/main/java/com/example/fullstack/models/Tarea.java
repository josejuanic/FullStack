package com.example.fullstack.models;


public class Tarea {
    private long id;
    private String titulo;
    private boolean completada;

    public Tarea() {
    }

    public Tarea(String titulo, long id, boolean completada) {
        this.titulo = titulo;
        this.id = id;
        this.completada = completada;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", completada=" + completada +
                '}';
    }
}




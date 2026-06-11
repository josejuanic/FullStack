package com.example.fullstack.models;


import java.util.Objects;

public class Tarea {
    private Long id;
    private String titulo;
    private boolean completada;

    public Tarea() {
    }

    public Tarea(String titulo, long id, boolean completada) {
        this.titulo = titulo;
        this.id = id;
        this.completada = completada;
    }

    public Long getId() {
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return getId() == tarea.getId() && isCompletada() == tarea.isCompletada() && Objects.equals(getTitulo(), tarea.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitulo(), isCompletada());
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




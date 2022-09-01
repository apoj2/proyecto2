package org.example;

import clases.Estudiante;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.setNota(4);
        estudiante.setPromedioNota(3);

        System.out.println(estudiante.calcularPromedioNota());
    }
}
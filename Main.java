package org.example;


public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.listaPersonas.add(p1);
        Persona p2 = new Persona();
        p1.listaPersonas.add(p2);
        Persona p3 = new Persona();
        p1.listaPersonas.add(p3);
        Persona p4 = new Persona();
        p1.listaPersonas.add(p4);

        p1.listarPersonas();
    }
}
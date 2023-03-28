package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Persona {
    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String apellido;
    @Getter @Setter
    private int fechaNacimiento;
    private int i = 0;

    List<Persona> listaPersonas = new ArrayList<>();
    public Persona(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor rellene los siguientes campos");
        System.out.print("Nombre: ");
        setNombre(sc.nextLine());
        System.out.print("Apellido: ");
        setApellido(sc.nextLine());
        System.out.print("Fecha de nacimiento: ");
        setFechaNacimiento(sc.nextInt());

    }

    public void listarPersonas() {
        for(Persona persona: listaPersonas){
            this.i ++;
            System.out.println("Persona " + i);
            System.out.println(persona.getNombre()+" "+persona.getApellido() +" "+ persona.getFechaNacimiento());
        }
    }


}

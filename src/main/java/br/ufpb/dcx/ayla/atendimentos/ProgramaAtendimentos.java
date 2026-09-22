package br.ufpb.dcx.ayla.atendimentos;

import java.util.Scanner;

public class ProgramaAtendimentos {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente("Maria José da Silva",
                "111.1111.111-11", "01/01/2001");
        System.out.println(paciente1.getNome());
        System.out.println(paciente2.getNome());
        paciente1.setNome("João da Silva");
        System.out.println(paciente1.getNome());
        System.out.println("Info Pacientes:");
        System.out.println(paciente1.toString());
        System.out.println(paciente2.toString());

        leitor.close();
    }
}

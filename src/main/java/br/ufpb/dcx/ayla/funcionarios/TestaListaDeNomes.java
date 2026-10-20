package br.ufpb.dcx.ayla.funcionarios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaListaDeNomes {

    public static void main(String [] args){
        List<String> nomes = new ArrayList<>();
        int numNomes = 5;
        for (int k=0; k<numNomes; k++){
            String nome = JOptionPane.showInputDialog("Digite um nome");
            nomes.add(nome);
        }

        System.out.println("Nomes lidos:");
        for (String n: nomes){
            System.out.println(n);
        }

        Collections.sort(nomes);


        System.out.println("Nomes lidos ordenados:");
        for (String n: nomes){
            System.out.println(n);
        }
    }

}

package br.ufpb.dcx.ayla.classesiniciais;

public class TesteArray2 {
    public static void main(String [] args){
        int [] numeros = {3, 5, 6, 8, 17, 19};
        for(int k=0; k< numeros.length; k++){
            System.out.println("Número índice "+k+ " é "+ numeros[k]);
        }

        int contaImpares = 0;
        int cont = 0;
        while(cont<numeros.length){
            if (numeros[cont]%2==1){
                contaImpares+=1;
            }
            cont++;
        }
        System.out.println("Quantidade de ímpares é:"+ contaImpares);
    }
}

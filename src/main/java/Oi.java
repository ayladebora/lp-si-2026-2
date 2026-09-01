import javax.swing.JOptionPane;

public class Oi {

    public static void mostreMensagemBoasVindas(String nome){
        System.out.println("Oi "+ nome);
        System.out.println("Como vai você?");
    }


    public static void main(String [] args){
        String nomeLido = JOptionPane.showInputDialog("Diga seu nome");
        mostreMensagemBoasVindas(nomeLido);
        int numeroInteiro = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voce tem?"));
        double alturaUsuario = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
        int x = 10;
        String nome = "Ayla";
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(3));


        char letra = 'c';
        double altura = 1.75;
        float numeroReal = 8.87f;
        boolean toComFome = true;
        System.out.println(3+4);
        System.out.println(3*4);
        System.out.println(30.0/4);
        System.out.println(15%2);
        System.out.println(15-2);


    }


}

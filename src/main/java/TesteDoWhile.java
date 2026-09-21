import javax.swing.*;

public class TesteDoWhile {
    public static void main(String [] args){
        boolean sair = false;
        while(!sair){
            String nome = JOptionPane.showInputDialog("Digite seu nome");
            JOptionPane.showMessageDialog(null, "Oi "+nome);
            String querSair = JOptionPane.showInputDialog("Deseja sair?Sim(S) ou Não(N)");
            if (querSair.toUpperCase().charAt(0)=='S'){
                sair = true;
            }
        }
    }
}

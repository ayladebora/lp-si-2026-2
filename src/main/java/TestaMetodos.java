import java.util.Scanner;

public class TestaMetodos {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        digaOi10Vezes();
        System.out.println("Digite o número 1");
        int num1 =
                Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o número 2");
        int num2 =
                Integer.parseInt(leitor.nextLine());
        System.out.println("O maior é "+ max(num1,num2));
        leitor.close();
    }

    public static void digaOi10Vezes(){
        int cont = 10;
        while(cont>0){
            System.out.println("Oi "+cont);
            cont--;
        }
    }

    public static int max(int num1, int num2){
        if (num1>num2){
            return num1;
        } else {
            return num2;
        }
    }
}

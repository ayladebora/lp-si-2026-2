import java.util.Scanner;
public class Problema1001 {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int a = Integer.parseInt(leitor.nextLine());
        int b = Integer.parseInt(leitor.nextLine());
        System.out.println("X = "+(a+b));

        leitor.close();

    }
}

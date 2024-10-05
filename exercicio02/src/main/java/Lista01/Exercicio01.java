package Lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Porfavor digite seu nome:");
        String nome = scan.nextLine();
        
        System.out.println(nome.toUpperCase());
    }
}

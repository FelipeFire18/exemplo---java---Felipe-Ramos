package Lista01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor nos informe seu nome:");
        String nome = scan.nextLine();
        nome = nome.replace(" ", "");
        System.out.println(nome.toLowerCase() + "@gmail.com");
    }
}

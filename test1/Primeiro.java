/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiro;

import java.util.Scanner;

public class Primeiro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in,"latin1");
        System.out.println("Digite seu e-mail: ");
        String email = scan.nextLine();
        boolean valido = false;
        while (!valido) {
            try {
                if (email.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$")) {
                    System.out.println("Seu e-mail:"+email+" "+"é válido");
                    valido = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("\t\t\t\t[Formato de E-mail Incorreto]");
                System.out.println();
            }
        }
    }
}

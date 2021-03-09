package hn.edu.ujcv.pii.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, multiplicacion;

        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = teclado.nextInt();

        multiplicacion = num1 * num2 * num3;
        System.out.println("Total: " + multiplicacion);

        if (multiplicacion > 100) {
            System.out.println("multiplicacion es muy grande");
        } else {
            System.out.println("multiplicacion es aceptable");
        }
    }

}
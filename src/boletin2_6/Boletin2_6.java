
package boletin2_6;

import java.util.Scanner;

public class Boletin2_6 {

    public static void main(String[] args) {
        float pt, pp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio de la tarifa");
        pt = sc.nextFloat();
        System.out.println("Introduce el precio pagado");
        pp = sc.nextFloat();
        System.out.println((pt-pp)/pt*100+" de descuento");
    }
    
}

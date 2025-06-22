package javatask4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        // Swapping using temp variable
        temp = a;
        a = b;
        b = temp;

        // Print swapped values
        System.out.println("Swapped values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}
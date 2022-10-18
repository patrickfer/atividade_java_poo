package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        double area = x.area();
        System.out.printf("AREA = %.2f%n", area);

        double perimeter = x.perimeter();
        System.out.printf("PERIMETER = %.2f%n", perimeter);

        double diagonal = x.diagonal();
        System.out.printf("DIAGONAL = %.2f%n", diagonal);

        sc.close();
    }

}

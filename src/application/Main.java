package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // N vai indicar a quantidade de produtos que vão ser adicionados//
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i<vect.length ; i ++){
            sc.nextLine();
            String name = sc.nextLine(); //consumir uma linha em branco//
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("Average price = %.2f%n ", avg);

    }
}
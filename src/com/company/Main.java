package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Napisać program, który sprawdza czy podana liczba n,n>1, jest liczbą pierwszą.
        System.out.println("Start programu.");
        System.out.println("Program do sprawdzania czy wprowadzona liczba jest liczbą pierwszą.");
        System.out.println("Podaj liczbę, którą chcesz sprawdzić.");
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        n.close();
        boolean pierwsza = true;
        for(int i=2;i*i<=x;i++)
            if(x%i==0)
                pierwsza = false;

        if(pierwsza)
            System.out.println("Liczba "+x+" jest liczbą pierwszą.");
        else
            System.out.println("Liczba "+x+" nie jest liczbą pierwszą.");
        System.out.println("Koniec programu.");
    }
}

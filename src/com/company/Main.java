package com.company;

import java.util.Scanner;

public class Main {

    static float Atstumas;
    static float Kuras;

    public static void main(String[] args) {
        Nuskaitymas();

        Grazinimas();
    }

    public static void Nuskaitymas() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite nuvaziuota atstuma");

        Atstumas = sc.nextFloat();

        System.out.println("Iveskite sunaudota kuro kieki");

        Kuras = sc.nextFloat();
    }

    public static void Grazinimas() {

        float Vidurkis = Kuras * 100 / Atstumas;

        System.out.println("100km. buvo sunaudota " + Vidurkis + " l. degalu");

    }
}

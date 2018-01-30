package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Įvedimas();


        System.out.println("Vidurkis :" + Vidurkis());
    }
    static float km;
    static float ks;
    public static void Įvedimas(){
        System.out.println("Įveskite nuvažiuotus km ir kuro sąnaudas");
        Scanner sc = new Scanner(System.in);
         km = sc.nextFloat();
         ks = sc.nextFloat();

    }
    public static float Vidurkis(){
        return ks*100/km;

    }


}
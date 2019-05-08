package ba.unsa.etf.rs;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {

    //zadatak 1

    public static void funkcija(Function<Double, Double> funk){

        for(double i = 0; i<=100;i++){
            System.out.println(funk.apply(i));
        }


    }

    private static int suma(int a){
        int suma=0;
        while(a != 0){
            suma= suma + a%10;
            a=a/10;
        }
        return suma;
    }

    public static void main(String[] args) {

        System.out.println("1. Zadatak");
        funkcija(x -> Math.pow(x,2)+2*x+1);

        System.out.println("2. Zadatak");
        Scanner unos = new Scanner(System.in);
        int n = 0;
        n = unos.nextInt();

        Integer niz[]= new Integer[n];
        for(int i = 0; i<n;i++){
            niz[i]=unos.nextInt();
        }
        Arrays.sort(niz,(a,b)->suma(a)-suma(b));

        for(int i = 0;i<n;i++){
            System.out.println(niz[i]+ ", ");
        }


    }




}

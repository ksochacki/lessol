package com.company;

public class Main {

    public static void main(String[] args) {
        int a=2;
        int b=-3;
        int c=-8;
        int delta =b*b-4*a*c;
        double odelta;
                odelta=Math.sqrt(delta);
        double x1=(-b-odelta)/2*a;
        double x2=(-b+odelta)/2*a;
        double x0=-b/2*a;
        if(delta>0) {
            System.out.println(x1);
            System.out.println(x2);
        }
        if(delta==0) {
            System.out.println(x0);
        }
        if (delta<0){
            System.out.println( "rozpi¹zi¹zanie nie ma");
            

        }




    }

}

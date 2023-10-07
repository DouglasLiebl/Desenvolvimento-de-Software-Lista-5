package org.example;

import java.util.Arrays;

public class Ex12 {

    public static double[] alternate(double[] a, double[] b) {
        int min, max;
        int count = 0;
        min = Math.min(a.length, b.length);
        max = Math.max(a.length, b.length);
        double c[] = new double[min + max];

        for(int i=0; i<max; i++) {
            if(i<min) {
                c[count++] = a[i];
                c[count++] = b[i];
            }else {
                if(a.length==min) {
                    c[count++] = b[i];
                }else {
                    c[count++] = a[i];
                }
            }
        }

        return c;
    }

    public static void main(String[] args) {
        double[] a = {1,2,3,4} ;
        double[] b = {10,20,30} ;

        System.out.println(Arrays.toString(alternate(a, b)));
    }
}

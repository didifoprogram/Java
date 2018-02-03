package com.dfmzone;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the degree: ");

        int degree = sc.nextInt();
        System.out.print("Enter "+(degree+1)+" coefficients: ");

        double[] C = new double[degree+1];
        for(int i=0; i<C.length;i++) {
            C[i]=sc.nextDouble();
        }

        double derivative[] = new double[C.length-1];
        for(int i=0;i<derivative.length;i++){
            derivative[i] = C[i]*(C.length - 1 -i );
        }

        System.out.println(Arrays.toString(derivative));
    }

}

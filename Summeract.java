package com.mycompany.summeract;

import java.util.*;

public class Summeract {

    public static void main(String[] args) {
        Scanner basa = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int entries = basa.nextInt();
        int[][] matrix = new int[entries][entries];

        for (int i = 0; i < entries; i++) {

            for (int a = 0; a < entries; a++) {

                matrix[i][a] = (i + 1) * (a + 1);
            }
        }

        System.out.println("The generated matrix is:");
        for (int i = 0; i < entries; i++) {
            for (int a = 0; a < entries; a++) {
                System.out.print(matrix[i][a] + " ");
            }
            System.out.println();
        }

    }
}

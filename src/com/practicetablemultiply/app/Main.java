package com.practicetablemultiply.app;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //Declarations
        int tableNumber = 0;
        int result = 0;

        //Implements scanner
        Scanner In = new Scanner(System.in);

        //Input from user
        System.out.print("Write the table to multiply: ");
        tableNumber = In.nextByte();

        //Process
        for (int count = 1; count <=10; count++){
            result = tableNumber * count;

            //Output table
            System.out.println(tableNumber+" x "+count+" = "+result);
        }

        //Close input
        In.close();

    }
}

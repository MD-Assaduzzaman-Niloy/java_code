//The code is written by MD Assaduzzaman Niloy at 12 June 2020

package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int x,i;//Declare variable

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.print("Enter a number: ");
            x=scan.nextInt();

            for (i=1;i<=10;++i){

                System.out.println(x+"x"+i+"="+x*i);
                
            }
        }
    }
}

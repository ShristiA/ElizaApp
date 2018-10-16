package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Good day. What is your problem? ");
        String userInput;
        do{
            System.out.println("Enter your respone here or Q to quit");
            userInput = sc.nextLine();
            if(!userInput .equalsIgnoreCase("Q")){
                System.out.println(userInput);
            }
        }while(!userInput .equalsIgnoreCase("Q") && !userInput .equalsIgnoreCase("I am feeling great"));


    }
}

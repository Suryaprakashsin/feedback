package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int rating = 4;
        if(rating>=0 && rating<=5){
            if(rating<=2){
                // rating is less than or equal to two
                System.out.println("What is the reason for you low rating?");
            }
            System.out.println("Thank you for your feedback.");
        }
    }
}

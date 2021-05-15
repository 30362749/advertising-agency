package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Requirements {
    Scanner sc = new Scanner(System.in);
    int x=0,y=0,z=0,m=0,n=0;
    double k=0;
    String exposure="",name="",quote="";
    int weeks;
    int channel;
    public void Radio() {
        System.out.println("Press 1 for Morning business");
        System.out.println("Press 2 for evening business");
        System.out.println("Press 3 for overnight and weekend business");
        int choice = sc.nextInt();
        int hours;
        int week;
        if (choice == 1) {
            System.out.println("enter the business hours for played radio campaigns");
            hours = sc.nextInt();
            System.out.println("enter the week for played radio campaigns");
            week = sc.nextInt();

            if (hours >= 1 && hours <= 11) {
                if (week <= 1) {
                    x = 70;
                    System.out.println("cost of each Radio station is: " + x + "$");
                }
                else
                {
                    System.out.println("Try again");
                }
            } else {
                System.out.println("Invalid input");
            }
        } else if (choice == 2) {
            System.out.println("enter the business hours for played radio campaigns");
            hours = sc.nextInt();
            System.out.println("enter the week for played radio campaigns");
            week = sc.nextInt();

            if (hours >= 1 && hours <= 6) {
                if (week <= 1) {
                    x = 60;
                    System.out.println("cost of each Radio station is: $"+ x);
                }
                else
                {
                    System.out.println("Try again");
                }
            } else {
                System.out.println("Invalid input");
            }
        } else if (choice == 3) {
            System.out.println("enter the week for played radio campaigns");
            week = sc.nextInt();
            if (week <= 1) {
                x = 60;
                System.out.println("cost of each Radio station is: " + x + "$");
            } else {
                System.out.println("Try again");
            }
        }
            else {
                System.out.println("Invalid input");
            }
        }
    public void television(){
        System.out.println("how many channels do you want for ad");
        channel= sc.nextInt();
        System.out.println("how many week is required for ad");
        weeks=sc.nextInt();
        System.out.println("which exposure do you want");
        System.out.println("Press:1 for low");
        System.out.println("Press:2 for medium");
        System.out.println("Press:3 for high");
        int choice=sc.nextInt();
        if(choice==1)
        {
            int price=150;
            name+="Low exposure TV ";
            System.out.println("Do you want to add further feature ");
            System.out.println("Press:1 Yes");
            System.out.println("Press:2 No");
            int choic=sc.nextInt();
            if(choic==1)
            {
                y=channel*weeks*price*100;
            }
            else
            {
                y=channel*weeks*price;
            }
        }
        else if(choice==2)
        {
            int price=280;
            quote+="Medium exposure TV ";
            System.out.println("Do you want to add further feature ");
            System.out.println("Press:1 Yes");
            System.out.println("Press:2 No");
            int choic=sc.nextInt();
            if(choic==1)
            {
                m=channel*weeks*price*100;
            }
            else
            {
                m=channel*weeks*price;
            }
        }
        else if(choice==3)
        {
            int price=400;
            exposure+="High exposure TV ";
            System.out.println("Do you want to add further feature ");
            System.out.println("Press:1 Yes");
            System.out.println("Press:2 No");
            int choic=sc.nextInt();
            if(choic==1)
            {
                n=channel*weeks*price*100;
            }
            else
            {
                n=channel*weeks*price;
            }
        }
        else
        {
            System.out.println("invalid");
        }
    }
    public void newspaper(){
        double total_cost;
        k=1.35;
        System.out.println("The base cost to prepare an ad for newspaper is $ "+k +" per square cm");
        System.out.println("Do you want graphic designing on newspaper");
        System.out.println("Press:1 Yes");
        System.out.println("Press:2 No");
        int press= sc.nextInt();
        if(press==1)
        {
            k+=20;
            System.out.println("Do you colour on newspaper");
            System.out.println("Press:1 Yes");
            System.out.println("Press:2 No");
            int choice= sc.nextInt();
            if(choice==1)
            {
                System.out.println("press 1 for black and white");
                System.out.println("press 2 full colour");
                int colour= sc.nextInt();
                if(colour==1)
                {
                    k+=2.20;
                }
                else if(colour==2)
                {
                    k+=4.80;
                }
                else
                {
                    System.out.println("wrong input");
                }
            }
            else if(choice==2){
                k+=20;
            }
            else
            {
                System.out.println("wrong input");
            }
        }
        else if(press==2)
        {
            System.out.println("Do you colour on newspaper");
            System.out.println("Press:1 Yes");
            System.out.println("Press:2 No");
            int choice= sc.nextInt();
            if(choice==1) {
                System.out.println("press 1 for black and white");
                System.out.println("press 2 full colour");
                int colour = sc.nextInt();
                if (colour == 1) {
                    k += 2.20;
                } else if (colour == 2) {
                    k += 4.80;
                } else {
                    System.out.println("wrong input");
                }
            }
            else if(choice==2){
                k+=20;
            }
            else
            {
                System.out.println("wrong input");
            }
        }
        System.out.println("Total_cost of newspaper is: $"+k);
    }
    public void Web(){
        System.out.println("which image do you want on ads");
        System.out.println("Press:1 for static ");
        System.out.println("Press:2 for animated ");
        int choice=sc.nextInt();
        if(choice==1)
        {
            z+=5;
        }
        else if(choice==2){
            z+=7;
        }
        else {
            System.out.println("invalid input");
        }
        System.out.println("Total price of web and app is: $"+z);
    }
    public void display(){
        System.out.println(channel+" x "+exposure+"for "+weeks +" weeks: $"+n);
        System.out.println(channel+" x "+quote+"for "+weeks +" weeks: $"+m);
        System.out.println(channel+" x "+name+"for "+weeks +" weeks: $"+y);
        int Quote_Total;
        Quote_Total=n+m+y;
        System.out.println("Quote Total: $"+Quote_Total);
    }
}

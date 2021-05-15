package com.company;

import java.util.Scanner;

public class Main {
public static void menu(){
    System.out.println("Welcome to Advertising Agency quote-management system");
    System.out.println("Press:1 If you want for advertising");
    System.out.println("Press:0 for Exit");
}
public static void generalmenu(){
    System.out.println("Press 1 for Radio");
    System.out.println("Press 2 for television");
    System.out.println("Press 3 for newspaper");
    System.out.println("Press 4 for Web and app");
    System.out.println("Press 5 for Display quote");
    System.out.println("Press 0 for Exit");
}
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Requirements obj=new Requirements();
        menu();
        int press = sc.nextInt();
        if(press==1)
        {
            int choice;
            do{
                generalmenu();
                choice= sc.nextInt();
                sc.nextLine();
                switch (choice)
                {
                    case 1:
                        obj.Radio();
                        break;
                    case 2:
                        obj.television();
                        break;
                    case 3:
                        obj.newspaper();
                        break;
                    case 4:
                        obj.Web();
                        break;
                    case 5:
                        obj.display();
                        break;

                }

            }
            while(choice!=0);
            System.out.println("Good bye!");
        }
        else
        {
            System.out.println("Good bye!");
        }
    }
}

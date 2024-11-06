package ie.atu.test;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add Order");
        System.out.println("Update Order");
        System.out.println("Display All Orders");
        System.out.println("Exit");
        String option = sc.nextLine();

        switch(option){

            case "Add Order": add();break;

            case "Update Order": update();break;

            case "Display Order": display();break;

            case "Exit":
                System.out.println("Now exiting");
                break;

            default:
                System.out.println("Invalid option");
            break;
            }
        }

    public static void add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter order id number: ");
        String orderid = sc.nextLine();
        System.out.println("Please Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please Enter product name: ");
        String pname = sc.nextLine();
        System.out.println("Please Enter quantity needed: ");
        String quantity = sc.nextLine();


    }
    public static void update(){

    }

    public static void display()
    {

    }







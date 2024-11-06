package ie.atu.test;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> OrderList = new ArrayList<String>();

        System.out.println("Add Order");
        System.out.println("");
        System.out.println("Update Order");
        System.out.println("");
        System.out.println("Display All Orders");
        System.out.println("");
        System.out.println("Exit");
        System.out.println("");
        String option = sc.nextLine();

        switch (option) {

            case "Add Order":
                System.out.println("Please Enter order id number: ");
                String orderid = sc.nextLine();
                add();
                OrderList.add(orderid);
                break;

            case "Update Order":
                System.out.println("Do you want to add then type 1 or remove order then type 2: ");
                try {
                    int op = sc.nextInt();
                    switch(op){
                    case 1:
                        add();
                        boolean add = OrderList.add(orderid);
                        case 2:
                        OrderList.remove(orderid);
                    default:
                        System.out.println("Invalid");}
                } catch (InputMismatchException im) {
                    System.out.println("Incorrect input"+ im.getMessage());
                }
                finally {
                    close.sc;
                }


        break;

        case "Display Order":
        System.out.println("Order List: ");
        for (int i = 0; i < OrderList.size(); i++) {
            System.out.println((i + 1) + ". " + OrderList.get(i));
        }
        break;

        case "Exit":
        System.out.println("Now exiting");
        break;

        default:
        System.out.println("Invalid option");
        break;
    }
            }
    public static String add() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please Enter product name: ");
        String product_name = scanner.nextLine();
        System.out.println("Please Enter quantity needed: ");
        int quantity = scanner.nextInt();

        return name;
    }










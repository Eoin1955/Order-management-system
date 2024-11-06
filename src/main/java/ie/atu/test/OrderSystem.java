package ie.atu.test;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> OrderList = new ArrayList<String>();

        System.out.println("Add Order");
        System.out.println("Update Order");
        System.out.println("Display All Orders");
        System.out.println("Exit");
        String option = sc.nextLine();

        switch (option) {

            case "Add Order":
                add();
                OrderList.add(order);
                break;

            case "Update Order":
                System.out.println("Do you want to add then type 1 or remove order then type 2: ");
                try {
                    int op = sc.nextInt();
                    case 1:
                        add();
                        OrderList.add(order);
                    case 2:
                        OrderList.remove(order);
                    default:
                        System.out.println("Invalid");
                } catch () {
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

        System.out.println("Please Enter order id number: ");
        String orderid = scanner.nextLine();
        System.out.println("Please Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please Enter product name: ");
        String pname = scanner.nextLine();
        System.out.println("Please Enter quantity needed: ");
        String quantity = scanner.nextLine();

        }










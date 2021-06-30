package main.java;
import java.util.Scanner;

public class Calculator {
    String sin;
    String cos;
    String tan;
    String sqrt;

    public static void main(String[] args) {
        System.out.println("Welcome to the scientific calculator.");
        System.out.println("You can choose from the following operators: ");
        System.out.println("sin, cos, tan, sqrt.");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        if (operator.equals("sin")) {
            System.out.println("Please enter the number: ");
            Scanner scanner1 = new Scanner(System.in);
            double a = scanner1.nextDouble();
            double radians = Math.toRadians(a);
            double sin = Math.sin(a);
            System.out.println("Sin (" +a+ ") = " + (float)sin);
                }else if(operator.equals("tan")) {
                    System.out.println("Please enter the number: ");
                    Scanner scanner2 = new Scanner(System.in);
                    double b = scanner2.nextDouble();
                    double radians = Math.toRadians(b);
                    double tan = Math.tan(b);
                    System.out.println("Tan (" + b + ") = " + (float)tan);
                        }else if(operator.equals("cos")) {
                            System.out.println("Please enter the number: ");
                            Scanner scanner3 = new Scanner(System.in);
                            double c = scanner3.nextDouble();
                            double radians = Math.toRadians(c);
                            double cos = Math.cos(c);
                            System.out.println("Cos (" +c+ ") = " +(float) cos);
                                }else if (operator.equals("sqrt")) {
                                    System.out.println("Please enter the number: ");
                                    Scanner scanner4 = new Scanner(System.in);
                                    double d = scanner4.nextDouble();
                                    double sqrt = Math.sqrt(d);
                                    System.out.println("Sqrt " +d+ " = " + sqrt);
                                    }else {
            System.out.println("You entered illegal value");
        }
    }
}



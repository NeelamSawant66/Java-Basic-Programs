package calculator;

import java.util.Scanner;

public class Calculator {
        static int number1;
        static int number2;

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator");
        System.out.println("We Help You To Calculate Faster");
        operators();
    }
    private static void operators() {
        System.out.println("1.Addtion          2.Subtraction ");
        System.out.println("3.Multipilcation   4.Division" );
        System.out.println("5.Exit ");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Choose Your Operation");
        Scanner op =new Scanner(System.in);
        int opertaion = op.nextInt();
        if (opertaion==1) {
            System.out.println("You Want TO Use Addtion Operator");
            input();
            addition();
            operators();
        } else if (opertaion==2){
            System.out.println("You Want TO Use Subtraction Operator");
            input();
            subtraction();
            operators();
        }else if (opertaion==3){
            System.out.println("You Want TO Use multipilaction Operator");
            input();
            multiplication();
            operators();
        } else if (opertaion==4){
            System.out.println("You Want TO Use Division Operator");
            input();
            Division();
            operators();
        }else if(opertaion==5){
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("THANK YOU FOR USING OUR SERVICES");
            System.out.println("--------------------------------------------------------------------------------------------------");
        }else {
            System.out.println("INVALID SELECTION...TRY AGAIN");
            operators();
        }
    }

    public static void Division() {
    int Result = number1/number2;
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Result is " + Result);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Do You Want To Continue Using Division Operator?");
        System.out.println("1.Yes           2.No");
        Scanner yn =new Scanner(System.in);
        int YesNo = yn.nextInt();
        if (YesNo == 1){
            input();
            Division();
        }else {
            System.out.println("Thank you!!");
        }
    }
    public static void multiplication() {
        int Result = number1*number2;
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Result is " + Result);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Do You Want To Continue Using Multiplication Operator?");
        System.out.println("1.Yes           2.No");
        Scanner yn =new Scanner(System.in);
        int YesNo = yn.nextInt();
        if (YesNo == 1){
            input();
            multiplication();
        }else {
            System.out.println("Thank you!!");
        }
    }
    public static void subtraction() {
        int Result = number1-number2;
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Result is " + Result);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Do You Want To Continue Using Subtraction Operator?");
        System.out.println("1.Yes           2.No");
        Scanner yn =new Scanner(System.in);
        int YesNo = yn.nextInt();
        if (YesNo == 1){
            input();
            subtraction();
        }else {
            System.out.println("Thank you!!");
        }
    }
    private static void addition() {
        int Result = number1+number2;
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Result is " + Result);
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Do You Want To Continue Using Addtion Operator?");
        System.out.println("1.Yes           2.No");
        Scanner yn =new Scanner(System.in);
        int YesNo = yn.nextInt();
        if (YesNo == 1){
            input();
            addition();
        }else {
            System.out.println("Thank you!!");
        }
    }

    private static void input() {
        System.out.println("Enter  the First number:");
        Scanner num1 = new Scanner(System.in);
        number1 = num1.nextInt();
        System.out.println("Enter the Second number: ");
        Scanner num2 = new Scanner(System.in);
        number2 = num2.nextInt();
    }
}




import java.util.Scanner;
public class day2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        // division for double and int 
        // double x = 5/2;
        // System.out.println(x);
        // double y = 5.0/2.0;
        // System.out.println(y);
        // double z = 5.0%2;
        // System.out.println(z);
        // int x = 5;
        // x++;
        // System.out.println(x);

        // int x = 5;
        // int y = x++;
        // System.out.println("x: " + x); // 6
        // System.out.println("y: " + y); // 5

        // int x = 5;
        // int y = ++x;
        // System.out.println("x: " + x); // 6
        // System.out.println("y: " + y); // 6
        
        // int x = 5;
        // int y = ++x;
        // int z = x++;
        // System.out.println("x: " + x); // 7
        // System.out.println("y: " + y); // 6
        // System.out.println("z: " + z); // 6

        // int x = 5|2;
        // System.out.println(x); // 7
        // int y = 5&2;
        // System.out.println(y); // 0
        // System.out.println(5|2); // 7
        // System.out.println(5&2); // 0
        // System.out.println(7^6); // 1
        // System.out.println(8^16); // 24

        // relational operators
        // boolean a = (5>2)&&(2<5);
        // System.out.println(a); // true
        // boolean b = (5>2)||(2>5);
        // System.out.println(b); // true

        // if (a){
        //     System.out.println("a is true");
        // }
        // else{
        //     System.out.println("a is false");
        // }

        // if (5){ //strictly boolean
        //     System.out.println("5 is something");
        // }
        // int a = sc.nextInt();
        // if (a >= 33){
        //     System.out.println("You are pass");

        //     if (a >=60){
        //         System.out.println("You are first class");
        //     }
        //     else if (a >= 45 && a < 60){
        //         System.out.println("You are second class");
        //     }
        //     else if (a >= 33 && a < 45){
        //         System.out.println("You are third class");
        //     } 
        //     }
        // else{
        //     System.out.println("You are fail");
        // }




        // create a program to calculate discount and amount after discount based on purchase amount
        //(0-1000) 5% discount
        // (1001-5000) 10% discount
        // (5001-10000) 15% discount
        // more than 10000 20% discount
        // System.out.println("Enter the purchase amount: ");
        // int amount = sc.nextInt();
        // double discount = 0;
        // if (amount >= 0 && amount <= 1000){
        //     discount = 0.05;
        // }
        // else if (amount > 1000 && amount <= 5000){
        //     discount = 0.10;
        // }
        // else if (amount > 5000 && amount <= 10000){
        //     discount = 0.15;
        // }
        // else if (amount > 10000){
        //     discount = 0.20;
        // }
        // else{
        //     System.out.println("Invalid amount");
        //     return;
        // }
        // double discountAmount = amount * discount;
        // double amountAfterDiscount = amount - discountAmount;
        // System.out.println("Discount: " + discountAmount);
        // System.out.println("Amount after discount: " + amountAfterDiscount);

        // switch case for days of the week
        // System.out.println("Enter the day number (1-7): ");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day number");
        // }

        int num = sc.nextInt();
        System.out.println((num%2 == 0) ? "Even" : "Odd");
    }
}

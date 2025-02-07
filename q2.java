// import java.util.Scanner;

// public class q2 {

//     public static void main(String[] args) {

//         int mark = 50;

//         if (mark >= 35)
//         {
//             System.out.println("pass");
//         }
//         else
//         {
//             System.out.println("fail");
//         }
//     }

// }

// import java.util.Scanner;

// public class q2 {

//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         int income = scan.nextInt();

//         if (income >= 7000)
//         {
//             System.out.println("pass");
//         }
//         else
//         {
//             System.out.println("fail");
//         }
//     }

// }

// import java.util.Scanner;

// public class q2 {

//     public static void main(String[] args) {

//         int num = 20;

//         if (num % 3 == 0 && num % 5 ==0) 
//         {
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
// }

// import java.util.Scanner;

// public class q2 {

//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         int num = scan.nextInt();

//         if (num % 2 == 0) 
//         {
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }
//     }
// }

// import java.util.Scanner;

// public class q2 {

//     public static void main(String[] args) {

//         Scanner scna = new Scanner(System.in);

//         int score = scna.nextInt();

//         if (score < 50 ) {
//             System.out.println("Need to improve");
//         }

//         else if (score >= 50 && score <= 70) {
//             System.out.println("good job");
//         }

//         else if (score > 70) {
//             System.out.println("excellent job");
//         }

//         else
//         {
//             System.out.println("error");
//         }

//     }
// }

// import java.util.Scanner;

// public class q2 {

//     public static void main(String[] args) {

//         Scanner scna = new Scanner(System.in);

//         int s1 = scna.nextInt();
//         int s2 = scna.nextInt();
//         int s3 = scna.nextInt();
//         int s4 = scna.nextInt();
//         int s5 = scna.nextInt();

//         int add = s1+s2+s3+s4+s5;

//         int score = add/5;

//         if (score < 50 ) {
//             System.out.println("Need to improve");
//         }

//         else if (score >= 50 && score <= 70) {
//             System.out.println("good job");
//         }

//         else if (score > 70) {
//             System.out.println("excellent job");
//         }

//         else
//         {
//             System.out.println("error");
//         }

//     }
// }

// import java.util.Scanner;

// public class q2 {

//     public static void main(String[] args) {

//         Scanner scna = new Scanner(System.in);

//         String score = scna.nextLine();

//         String a = "red";
//         String b = "yellow";
//         String c = "green";

//         if (score.equals(a) ) {
//             System.out.println("Stop");
//         }

//         else if (score.equals(b)) {
//             System.out.println("get ready");
//         }

//         else if (score.equals(c)) {
//             System.out.println("Go");
//         }

//         else
//         {
//             System.out.println("error");
//         }

//     }
// }

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

        Scanner scna = new Scanner(System.in);

        System.out.println("salary");
        int salary = scna.nextInt();
        System.out.println("age");
        int age = scna.nextInt();

        if (salary >= 20000 || age < 25) {
            System.out.println("eligible");
            int loan = scna.nextInt();

            if (loan < 50000) {
                System.out.println("okay");
            } else {

                System.out.println("Nope");
            }
        } else {
            System.out.println("error");
        }

    }
}

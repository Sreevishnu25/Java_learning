// import java.util.Scanner;   

// public class q3 {
//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         int a = scan.nextInt();
//         int b = scan.nextInt();

//         for (int i = a; i <= b; i++)
//         {
//             System.out.println(i);
//         }

//         scan.close();
//     }
// }

// public class q3 {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 System.out.println(i);

//             }

//         }

//     }
// }

// public class q3 {
//     public static void main(String[] args) {

//         int count = 0;

//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 // System.out.println("Even" + i);

//             } else {

//                 count = count + 1;

//                 System.out.println("Odd" + i);

//             }

//         }
//         System.out.println("Count:" + count);

//     }
// }

public class q3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);

            }

        }

    }
}
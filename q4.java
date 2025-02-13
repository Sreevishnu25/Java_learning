
// import java.util.Scanner;

// public class q4 {
    


//     void evenorodd(int num){

//         if (num%2 == 0){
//             System.out.println("The number is even");
//         }
//         else{
//             System.out.println("The number is odd");
//         }

//     }

//     public static void main(String[] args) {
     
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         q4 obj1 = new q4();
//         obj1.evenorodd(number);

//         scan.close();



//     }
// }

import java.util.Scanner;

public class q4 {

    void passorfail(int marks){

        if (marks >= 40){
            System.out.println("You have passed the exam");
        }
        else{
            System.out.println("You have failed the exam");
        }

    }
    public static void main(String[] args) {

        q4 obj1 = new q4();
        
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        obj1.passorfail(num);

        scan.close();
        
    }
}
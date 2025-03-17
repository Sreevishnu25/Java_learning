// import java.util.Scanner;

// public class demo {

//     public static void main(String[] args) 
//     {
//         // Scanner scan = new Scanner(System.in);

//         String  a = "apple";
//         String b = "appl";

//         System.out.println(a.equals(b));

//     }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class demo {

//         public static void main(String[] args) {

//         Scanner scan  = new Scanner(System.in);
//         String RCB = scan.nextLine();

//         if (RCB.equals("win"))
//         {
//             System.out.println("cup");
//         }
//         else
//         {
//             System.out.println("papu");
//         }

//     }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

//     public static void main(String[] args) {
//         int score = 50;

//         if (score > 50 && score < 60) {
//             System.out.println("Need to improve");
//         }

//         else if (score > 60 && score <= 90) {
//             System.out.println("Iphone");
//         }

//         else if (score > 90) {
//             System.out.println("mac");
//         }

//     }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class demo {

//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         int score = scan.nextInt();
//         int score1 = scan.nextInt();  

//         String result = score > score1 ? "score" : "score1";
//         System.out.println(result);

//         scan.close();
//     }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

//     public static void main(String[] args) {

//          boolean rain = false;

//         String result = rain ? "umnerlla" : "sunlight";
//         System.out.println(result);
//     }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

//     public static void main(String[] args) {

//         for (int i= 10; i>=1; i = i-1)
//         {
//             System.out.println(i);
//         }

//     }
// } 

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class demo {

//     public static void main(String[] args) {

//         int[] score = new int[5];

//         Scanner scan = new Scanner(System.in);

//         score[0] = scan.nextInt();
//         score[1] = scan.nextInt();
//         score[2] = scan.nextInt();
//         score[3] = scan.nextInt();
//         score[4] = scan.nextInt();

//         System.out.println(score[0] + score[1] + score[2] + score[3] + score[4]);

//         scan.close();
//     }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

//     public static void main(String[] args) {

//         for (int j =1 ; j<=3; j++)
//         {
//             for (int i = 1; i<=1; i++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

//     public static void main(String[] args) {

//         for (int j = 3; j >= 1; j--){
//             for (int i =1; i<=j; i++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Random;

// public class demo {

//     public static void main(String[] args) {

//         int j =1;

//         while (j<=10){
//             System.out.println(j);
//             j++;
//         }
//     }
// } 

// ----------------------------------------------------------------------------------------------------------

// import java.util.Random;

// public class demo {

//     public static void main(String[] args) {

//         Random rand = new Random();

//         int newnum = 0;

//         while (newnum !=5) {

//             newnum = rand.nextInt(6);
//             System.out.println(newnum);

//         }
//     }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Random;

// public class demo {

//     public static void main(String[] args) {

// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class demo {

//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);
//         int count = 0;

//         do{
//             System.out.println("Enter the number > 10");
//             count = scan.nextInt();

//         }while(count < 10);

//         scan.close();

//     }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

//     void greeting()
//     {
//         System.out.println("vanakam");
//     }

//     public static void main(String[] args) {

//         demo obj = new demo();
//         obj.greeting();
//     }

// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

//     void display(int a , int b){
//         System.out.println(a+b);
//     }

//     void display(int a, int b, int c){
//         System.out.println(a+b+c);
//     }

//     public static void main(String[] args) {

//         demo obj = new demo();
//         obj.display(2, 3,4);
//     }

// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

//     public static void main(String[] args) {

//         String num[] = { "one", "two" };

//         for (String var : num) {
//             System.out.println(var);
//         }
//     }
// }

// ----------------------------------------------------------------------------------------------------------

//interface animal{
//	int mark = 20;
//	void sound();
//}
//
//
//class catt implements animal{
//	
//	@Override
//	public void sound() {
//		System.out.println("meow");
//	}
//}
//
//public class demo{
//	public static void main(String[] args) {
//		
//	catt c1 = new catt();
//	c1.sound();
//	System.out.println(c1.mark);
//	
//	}
//	
//}

// ----------------------------------------------------------------------------------------------------------

// interface playable {
//     void play();

// }

// class guitar implements playable {

//     @Override
//     public void play() {
//         System.out.println("play guitar");

//     }

// }

// class piano implements playable {

//     @Override
//     public void play() {
//         System.out.println("play piano");

//     }
// }

// public class demo {
//     public static void main(String[] args) {

//         piano c1 = new piano();
//         c1.play();
//         guitar g1 = new guitar();
//         g1.play();

//     }

// }

// ----------------------------------------------------------------------------------------------------------

// interface read {
//     void readable();
// }

// interface write {
//     void writable();
// }

// interface store {
//     void storable();
// }

// class ca implements read, write, store {

//     @Override
//     public void readable() {

//         System.out.println("reading");

//     }

//     @Override
//     public void writable() {

//         System.out.println("writing");

//     }

//     @Override
//     public void storable() {

//         System.out.println("storing");

//     }
// }

// public class demo {
//     public static void main(String[] args) {
//         ca r1 = new ca();

//         r1.readable();
//         r1.writable();
//         r1.storable();

//     }

// }

// ----------------------------------------------------------------------------------------------------------



public class demo{
	public static void main(String[ ] args) {
		

		try {
			int a = 10;
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("prgram ended");
	}
}


// ----------------------------------------------------------------------------------------------------------


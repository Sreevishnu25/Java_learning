// import java.util.Scanner;

// public class demo {

// public static void main(String[] args)
// {
// // Scanner scan = new Scanner(System.in);

// String a = "apple";
// String b = "appl";

// System.out.println(a.equals(b));

// }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class demo {

// public static void main(String[] args) {

// Scanner scan = new Scanner(System.in);
// String RCB = scan.nextLine();

// if (RCB.equals("win"))
// {
// System.out.println("cup");
// }
// else
// {
// System.out.println("papu");
// }

// }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

// public static void main(String[] args) {
// int score = 50;

// if (score > 50 && score < 60) {
// System.out.println("Need to improve");
// }

// else if (score > 60 && score <= 90) {
// System.out.println("Iphone");
// }

// else if (score > 90) {
// System.out.println("mac");
// }

// }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class demo {

// public static void main(String[] args) {

// Scanner scan = new Scanner(System.in);

// int score = scan.nextInt();
// int score1 = scan.nextInt();

// String result = score > score1 ? "score" : "score1";
// System.out.println(result);

// scan.close();
// }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

// public static void main(String[] args) {

// boolean rain = false;

// String result = rain ? "umnerlla" : "sunlight";
// System.out.println(result);
// }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

// public static void main(String[] args) {

// for (int i= 10; i>=1; i = i-1)
// {
// System.out.println(i);
// }

// }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class demo {

// public static void main(String[] args) {

// int[] score = new int[5];

// Scanner scan = new Scanner(System.in);

// score[0] = scan.nextInt();
// score[1] = scan.nextInt();
// score[2] = scan.nextInt();
// score[3] = scan.nextInt();
// score[4] = scan.nextInt();

// System.out.println(score[0] + score[1] + score[2] + score[3] + score[4]);

// scan.close();
// }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

// public static void main(String[] args) {

// for (int j =1 ; j<=3; j++)
// {
// for (int i = 1; i<=1; i++)
// {
// System.out.print("*");
// }
// System.out.println();
// }

// }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

// public static void main(String[] args) {

// for (int j = 3; j >= 1; j--){
// for (int i =1; i<=j; i++){
// System.out.print("*");
// }
// System.out.println();
// }

// }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Random;

// public class demo {

// public static void main(String[] args) {

// int j =1;

// while (j<=10){
// System.out.println(j);
// j++;
// }
// }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Random;

// public class demo {

// public static void main(String[] args) {

// Random rand = new Random();

// int newnum = 0;

// while (newnum !=5) {

// newnum = rand.nextInt(6);
// System.out.println(newnum);

// }
// }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Random;

// public class demo {

// public static void main(String[] args) {

// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// public class demo {

// public static void main(String[] args) {

// Scanner scan = new Scanner(System.in);
// int count = 0;

// do{
// System.out.println("Enter the number > 10");
// count = scan.nextInt();

// }while(count < 10);

// scan.close();

// }
// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

// void greeting()
// {
// System.out.println("vanakam");
// }

// public static void main(String[] args) {

// demo obj = new demo();
// obj.greeting();
// }

// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

// void display(int a , int b){
// System.out.println(a+b);
// }

// void display(int a, int b, int c){
// System.out.println(a+b+c);
// }

// public static void main(String[] args) {

// demo obj = new demo();
// obj.display(2, 3,4);
// }

// }

// ----------------------------------------------------------------------------------------------------------

// public class demo {

// public static void main(String[] args) {

// String num[] = { "one", "two" };

// for (String var : num) {
// System.out.println(var);
// }
// }
// }

// ----------------------------------------------------------------------------------------------------------

// interface animal{
// int mark = 20;
// void sound();
// }
//
//
// class catt implements animal{
//
// @Override
// public void sound() {
// System.out.println("meow");
// }
// }
//
// public class demo{
// public static void main(String[] args) {
//
// catt c1 = new catt();
// c1.sound();
// System.out.println(c1.mark);
//
// }
//
// }

// ----------------------------------------------------------------------------------------------------------

// interface playable {
// void play();

// }

// class guitar implements playable {

// @Override
// public void play() {
// System.out.println("play guitar");

// }

// }

// class piano implements playable {

// @Override
// public void play() {
// System.out.println("play piano");

// }
// }

// public class demo {
// public static void main(String[] args) {

// piano c1 = new piano();
// c1.play();
// guitar g1 = new guitar();
// g1.play();

// }

// }

// ----------------------------------------------------------------------------------------------------------

// interface read {
// void readable();
// }

// interface write {
// void writable();
// }

// interface store {
// void storable();
// }

// class ca implements read, write, store {

// @Override
// public void readable() {

// System.out.println("reading");

// }

// @Override
// public void writable() {

// System.out.println("writing");

// }

// @Override
// public void storable() {

// System.out.println("storing");

// }
// }

// public class demo {
// public static void main(String[] args) {
// ca r1 = new ca();

// r1.readable();
// r1.writable();
// r1.storable();

// }

// }

// ----------------------------------------------------------------------------------------------------------

// public class demo{
// public static void main(String[ ] args) {

// try {
// int a = 10;
// throw new ArithmeticException();
// }
// catch(ArithmeticException e)
// {
// System.out.println(e);
// }
// System.out.println("prgram ended");
// }
// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// class divisioneg{
// void dividenum(int num, int den) {

// try {
// int result = num/den;
// System.out.println(result);
// }
// catch(ArithmeticException e) {
// System.err.print("cannot divide");
// }
// }
// }

// public class demo{
// public static void main(String[ ] args) {

// Scanner scan = new Scanner(System.in);
// int n1 = scan.nextInt();
// int n2 = scan.nextInt();

// divisioneg d1 = new divisioneg();
// d1.dividenum(n1, n2);

// }

// }

// ----------------------------------------------------------------------------------------------------------

// import java.util.Scanner;

// class invalidageex extends Exception{
// public invalidageex(String message) {
// super(message);
// }
// }

// class agevalid{
// void checkage(int age) {

// try {
// if(age<0 || age>150)
// {
// throw new invalidageex("age is invalid");
// }
// else {
// System.out.println("valid age");
// }
// }
// catch (Exception e){
// System.out.println(e);

// }
// }
// }

// ----------------------------------------------------------------------------------------------------------------

// import java.io.FileWriter;

// public class demo{
// public static void main(String[ ] args) {

// try {
// FileWriter fw = new FileWriter("output.txt",true);
// BufferedWriter bw = new BufferedWriter(fw);
// bw.write("hey man");
// bw.newLine();
// bw.write("okay");
// bw.close();

// System.out.println("success");
// }catch (Exception e) {
// System.out.print("something has happened");
// }

// }

// }

// ----------------------------------------------------------------------------------------------------------

// import java.io.BufferedReader;
// import java.io.FileReader;

// public class demo {
//     public static void main(String[] args) {

//         try {
//             FileReader fr = new FileReader("output.txt");
//             BufferedReader br = new BufferedReader(fr);

//             String line = br.readLine();

//             while (line != null) {
//                 System.out.print(line);
//                 line = br.readLine();
//             }

//             br.close();

//         } catch (Exception e) {
//             System.out.print("something has happened");
//         }

//     }

// }

// ----------------------------------------------------------------------------------------------------------

// class a extends Thread {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("hey hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }

// class b extends Thread {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("okay byeee");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }

// public class demo {
//     public static void main(String[] args) {

//         a a1 = new a();
//         b b1 = new b();

//         b1.setPriority(10);
//         a1.setPriority(2);

//         a1.start();
//         b1.start();

//     }

// }

// ----------------------------------------------------------------------------------------------------------



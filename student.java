public class student {

    int marks;
    String name;

    student(int a, String b) {

        marks = a;
        name = b;
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        student ob1 = new student(32, "dhoni");
        System.out.println(ob1.marks);

    }

}

public class laptop {
    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;



    public static void main(String[] args) {
        

        laptop lap1 = new laptop();

        lap1.name = "hp";
        lap1.proc = "i5";
        lap1.ram = 8;
        lap1.price = 500;

        laptop lap2 = new laptop();

        lap2.name = "lenova";
        lap2.proc = "i7";
        lap2.ram = 16;
        lap2.price = 800;

        laptop  lap3 = new laptop();

        lap3.name = "amd";
        lap3.proc = "ryzen";
        lap3.ram = 32;
        lap3.price = 1000;


        System.out.println(lap2.price);

    }
}

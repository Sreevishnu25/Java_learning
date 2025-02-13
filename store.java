// public class store {

//      void soap(int money){

//         System.out.println(money);
//         System.out.println("purchase soap");
//      }

//      void chocolate(int money){

//         System.out.println(money);
//         System.out.println("purchase chocolate");
//      }

//      void chips(int money){

//         System.out.println(money);
//         System.out.println("purchase chips");
//      }

//      public static void main(String[] args) {

//         store obj1 = new store();
//         obj1.soap(100);

//         store obj2 = new store();
//         obj2.chocolate(200);

//         store obj3 = new store();
//         obj3.chips(300);

//      }

// }

// public class store {

//     void sum(int a, int b){

//        System.out.println(a+b);

//     }

//     void sub(int a, int b){

//         System.out.println(a-b);

//     }

//     void mul(int a, int b){

//         System.out.println(a*b);

//     }

//     public static void main(String[] args) {

//        store obj1 = new store();
//          obj1.sum(10,20);
//          obj1.sub(20,10);
//          obj1.mul(10,20);

//     }

// }

// public class store {

//     int soap(int money) {

//         int soap_p = 10;
//         int rem = money - soap_p;
//         return rem;
//     }

//     public static void main(String[] args) {

//         store obj1 = new store();

//         int remainder = obj1.soap(100);
//         System.out.println(remainder);

//     }

// }


public class store {

    String getname(String name) {

        String rem = name;
        return rem;
    }


    int getph(int phone) {

        int rem = phone;
        return rem;
    }

    String getaddress(String address) {

        String rem = address;
        return rem;
    }   

    public static void main(String[] args) {

        store obj1 = new store();

        String remainder = obj1.getname("john");
        String remainder1 = obj1.getaddress("newyork");
        int remainder2 = obj1.getph(1234567890);
        System.out.println(remainder);
        System.out.println(remainder1);
        System.out.println(remainder2);

    }

}






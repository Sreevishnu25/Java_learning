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










public class store {
    
    void sum(int a, int b){

       System.out.println(a+b);
       
    }

    void sub(int a, int b){

        System.out.println(a-b);

    }

    void mul(int a, int b){

        System.out.println(a*b);

    }

    

    public static void main(String[] args) {
       
       store obj1 = new store();
         obj1.sum(10,20);
         obj1.sub(20,10);
         obj1.mul(10,20);

    }

}

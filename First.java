import java.util.Scanner;



public class First {

    int a=100, b=200;
    void add() {
        System.out.println("Add function in the public class: "+(a+b));
    }

    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A of main class:");
        a=sc.nextInt();
        System.out.println("Enter B of main class:");
        b=sc.nextInt();
        System.out.println("Main class:"+(a+b));

        Temp obj = new Temp();
        System.out.println(obj.a+obj.b);
        obj.display();

        First obj2 = new First();
        obj2.add();

        System.out.println(a); // this accesses only the one insisde this main method, if it was not there we would have got error
        System.out.println(obj2.a); // we need to create obj to access even this class' objects.

    }
}

class Temp {
    int a=5,b=10;
    void display() {
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }
}
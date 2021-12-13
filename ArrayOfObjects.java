import java.util.Scanner;


class Person {
    String name;
    String address;

    void take()
    {
        Scanner sc = new Scanner(System.in)        ;
        name = sc.next();
        address = sc.next();
    }

    void show()
    {
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
    
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.take();
        obj.show();

        Person obj_arr[] = new Person[2];

        for (int i=0;i<2;i++)
        {
            obj_arr[i] = new Person(); // every obj in the array should also be initialised
            obj_arr[i].take();
        }
        for (int i=0;i<2;i++)
        {
            obj_arr[i].show();
        }

        // obj_arr[0]=new Person();
        // obj_arr[0].take();

    }
}

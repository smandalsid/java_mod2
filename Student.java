// public class House {
//     String street_name;
//     static String address;
//     int no=7;
//     static
//     {
//         // this.no=8;
//         // street_name="School back side";
//         address="vellore"+"632000"; // correction

//     }
//     House()
//     {
        // street_name="Back side school";
//         System.out.println(no);
//     }
//     class Room {
//         int room_no=no+1; // correction
//         String street_name="Back side";
//         Room()
//         {
//             System.out.println(address);
//             System.out.println(street_name);
//         }
//         int show()
//         {
//             House obj = new House();
//             System.out.println("House no"+obj.no);
//             System.out.println(street_name);
//             System.out.println("Room no"+room_no);
//             return 0;
//         }
//     }
//     static class hall {
//         String address="updated address is"+House.address;
//     }
//     public static void main(String[] args) {
//         House obj=new House();
//         House.Room r_obj =obj.new Room();
//         r_obj.show();
//         House.hall h_obj=new House.hall();
//         System.out.println(h_obj.address);
//     }
// }


// public class TestPract {
//     public static void main(String[] args) {
//         int a;
//         a=Integer.parseInt(args[0]);
//         String b;
//         b=args[1];
//         double c;
//         c=Double.parseDouble(args[2]);
//         System.out.println("a: "+a+"\nb: "+b+"\nc: "+c);
//         double d;
//         d=(double)a+c;
//         System.out.println("d: "+d);
//         String e;
//         e=args[3];
//         String f;
//         f=b.concat(e);
//         System.out.println("f: "+f);
//     }
// }

// public class Student {
//     String name;
//     String Student_Code;
//     String email;
//     public static void main(String[] args) {
//         Externals obj = new Externals(123.12, 234.23);
//     }
// }

// class Internals extends Student {
//     double CAT_Mark;
//     void show_internal_mark()
//     {
//         System.out.println("Internal mark: "+CAT_Mark);
//     }

// }

// class Externals extends Internals {
//     double External_Mark;
//     void show_marks()
//     {
//         System.out.println("Internal Marks: "+CAT_Mark);
//         System.out.println("External Marks: "+External_Mark);
//     }
//     Externals(double a, double b)
//     {
//         System.out.println("Student name: "+name);
//         System.out.println("Student code: "+Student_Code);
//         System.out.println("Student email: "+email);
//         CAT_Mark=a;
//         External_Mark = b;
//         show_internal_mark();
//         show_marks();
//     }
// }
// public class Student {
//     public static void main(String[] args) {
//         int n;
//         n=Integer.parseInt(args[0]);
//         int ar[][]=new int[n][n];
//         int pos=1;
//         for (int i=0;i<n;i++)
//         {
//             for (int j=0;j<n;j++)
//             {
//                 ar[i][j]=Integer.parseInt(args[pos++]);
//             }
//         }
//         int sum;
//         for (int i=0;i<n;i++)
//         {
//             sum=0;
//             for (int j=0;j<n;j++)
//             {
//                 sum+=ar[i][j];
//             }
//             System.out.println("Sum of "+(i+1)+" row is: "+sum);
//             sum=0;
//         }
        
//         for (int i=0;i<n;i++)
//         {
//             sum=0;
//             for (int j=0;j<n;j++)
//             {
//                 sum+=ar[j][i];
//             }
//             System.out.println("Sum of "+(i+1)+" column is: "+sum);
//             sum=0;
//         }
//     }
// }

public class Student {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3=new String("hello");
        System.out.println(str1==str2);
        System.out.println(str1==str3);

    }
}
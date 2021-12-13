public class Constructor {
    public static void main(String[] args) {
        TestPract obj = new TestPract();
        obj.show();
        
        TestPract obj2 = new TestPract(12);
        obj2.show();
        
        TestPract obj3 = new TestPract(13,"Siddharth");
        obj3.show();
    }
}

class Student {
    int roll;
    String name;
    Student()
    {
        roll=100;
    }
    Student(int r)
    {
        roll=r;
        name="HEHE";
    }
    Student(int r, String n)
    {
        roll=r;
        name=n;
    }
    void show()
    {
        System.out.println(roll);
        System.out.println(name);
    }
}
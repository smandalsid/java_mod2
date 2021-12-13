public class PassingObjects {
    int x,y;
    PassingObjects()
    {
        this(100,100); // calling a constructor in a constructor using this()
        // or
        PassingObjects obj = new PassingObjects(100,100); // but this will only be in the scope of the constructor
    }

    PassingObjects(int a, int b)
    {
        x=a;
        y=b;
    }

    PassingObjects(PassingObjects a, PassingObjects b) // passing objects in the constructor
    {
        x=a.x+b.x;
        y=a.y+b.y;
    }

    void access_obj(PassingObjects obj)
    {
        System.out.println(obj.x+obj.y+x+y); // accessing members of the class and the members of the passed objects
    }

    public static void main(String[] args) {
        PassingObjects obj1 = new PassingObjects();
        PassingObjects obj2 = new PassingObjects(10,20);
        PassingObjects obj3 = new PassingObjects(obj1, obj2);
        System.out.println(obj3.x+" "+obj3.y);
    }
}

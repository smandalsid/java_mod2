public class Super {
    String name;
    int age;
    Super()
    {
        age=19;
    }
    void get(String s)
    {
        name=s;
        // age=a;
    }
    public static void main(String[] args) {
        SuperChild obj= new SuperChild();
        obj.get("Siddharth", 19);
        obj.get("Shobhit", 20);
        obj.display();
    }
}

class SuperChild extends Super {
    String name;
    int age;
    SuperChild()
    {
        super();
    }
    void get(String s, int a)
    {
        name=s;
        age=a;
    }
    void display()
    {
        System.out.println(super.name);
        System.out.println(name);
        System.out.println(super.age);
        System.out.println(age);
    }
}

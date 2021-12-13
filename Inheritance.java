public class Inheritance {
    public static void main(String[] args) {
        Chil obj = new Chil();
        obj.getchild("Siddharh", 19, "20BDS0157");
        obj.display();
        obj.displaychild(); // takes from child class
        obj.display(); // takes from parent class
        // if we put same name for function in child or 
    }
}

class Parent {
    String name;
    int age;
    void get(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Chil extends Parent {
    String id;
    void getchild(String name, int age, String id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    void displaychild()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Id: "+id);
    }
}

class SecondChild extends Parent {
    int SSN;
    
}
abstract class abstract_example { // class having abstract method should be abstract class
    int a;
    abstract void show();
    abstract_example() // abstract class can also have a constructor
    {
        // this constructor cannot be directly called as abstract classes cannot have any object
        // it can be called by objects of classes which have inherited from this abstract class
        System.out.println("Abstract class Constructor called.");
    }
    void get(int a) // we can have normal member function in abstract class, it need not be an abstract method
    {
        this.a=a;
    }
}

class show_implements extends abstract_example {
    @Override
    void show()
    {
        System.out.println("Value of a: "+a);
    }
    public static void main(String[] args) {
        // abstract_example obj = new abstract_example(); // object of abstract class cannot be created
        show_implements obj = new show_implements();
        obj.get(10);
        obj.show();
    }
}
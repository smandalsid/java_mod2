interface interface_example {
    int a=0, b=0; // all variables in interface must be of final type; that is they should be initialsed to some value
    abstract void get();
    void show(); // by default jvm will convert this to abstract void show();
    // interfaces cannot have constructors
    // void s() // we cannot have thiss
    // {
    //     System.out.println("HEHE");
    // }
}

interface interface_example2 {
    int c=0;
    int d=0;
    void show1();
    void get1();
}

class test_interface implements interface_example, interface_example2 {
    @Override
    public void show()
    {
        System.out.println("value of a: "+a);
    }
    @Override
    public void get()
    {

    }
    @Override
    public void show1()
    {
        System.out.println("Value of c: "+c);
    }
    @Override
    public void get1()
    {

    }
    public static void main(String[] args) {
        test_interface obj = new test_interface();
        obj.show1();
    }
}
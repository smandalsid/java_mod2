class InnerClassEg {
    int a = 1, b = 2; // default
    public int c = 100;
    private int d = -10;

    class inner_class {
        int e, f;

        void disp() {
            int g = 99; // local variable of displ()
            // public int h=109;
            System.out.println("a value is " + a + " b value is " + b);
            System.out.println("e value is " + e + " f value is " + f);
            System.out.println("c value is " + c + " d value is " + d);
            System.out.println("g value is " + g);
        }
    }

    public static void main(String args[]) {
        InnerClassEg.inner_class obj_inner_class = new InnerClassEg().new inner_class();
        obj_inner_class.e = 100;
        obj_inner_class.f = 1000;

        obj_inner_class.disp();

        InnerClass obj = new InnerClass();
        // System.out.println("InnerClassEg.main()");

        // inner_class o=new inner_class(); //error

    }
}
// outer_class.class
// outer_class$inner_class
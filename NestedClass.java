public class NestedClass {
    int a=1, b=2;
    private int c=3;
    static int d=4;
    static void increment()
    {
        d+=1;
    }
    static class ActualNestedClass { // it will access only the static members
        static
        {
            d=12;
        }
        void disp()
        {
            System.out.println(d); // d is static, variables a, b, c wont work
        }
    }
    public static void main(String[] args) {
        NestedClass.ActualNestedClass obj = new NestedClass.ActualNestedClass();
        ActualNestedClass obj2 = new ActualNestedClass();
        obj.disp();
        increment();
        obj.disp();
        obj2.disp();
    }
}

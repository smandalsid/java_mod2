public class InnerClass {
    int a=1;
    public int b=2;
    private int c=3;
    class InnerInnerClass {
        int d=4;
        private int e=5;
        void disp()
        {
            System.out.println("a "+a+" b "+b);
            System.out.println("c "+c+" d "+d);
            System.out.println("e "+e);
        }
    }
    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        InnerClass.InnerInnerClass obj2 = new InnerClass().new InnerInnerClass();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj2.d);
        System.out.println(obj2.e);
        obj2.disp();
    }
}

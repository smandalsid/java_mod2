public class LocalInnerClass {
    int a=1, b=2;
    public int c=3;
    private int d=4;
    void func()
    {
        class LocalInnerInnerClass {
            int e=5;
            public int f=6;
            private int g=7;
            void disp()
            {
                System.out.println("a "+a+" b "+b);
                System.out.println("c "+c+" d "+d);
                System.out.println("e "+e+" f "+f);
                System.out.println("g "+g);
            }
        }

        LocalInnerInnerClass obj = new LocalInnerInnerClass();
        obj.disp();

    }
    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.func();
    }
}

class T1 {
    static int a;

    T1() {
        a = -20;
    }

    public static void main(String[] args) {
        System.out.print(a + " ");
        T1 obj = new T1();
        System.out.print(obj.a);
    }
}
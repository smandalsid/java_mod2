package math;
public class sub {
    int a,b;
    public void get(int x, int y)
    {
        a=x;
        b=y;
    }
    public void SUB()
    {
        System.out.println("Subtraction: "+(a-b));
    }
    public static void main(String[] args) {
        sub obj = new sub();
        obj.get(10,2);
        obj.SUB();
    }
}


// to compile -> javac -d . add.java
// to run java math.add
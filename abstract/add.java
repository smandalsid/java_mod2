package math;
public class add {
    int a,b;
    public void get(int x, int y)
    {
        a=x;
        b=y;
    }
    public void ADD()
    {
        System.out.println("Addition: "+(a+b));
    }
    public static void main(String[] args) {
        add obj = new add();
        obj.get(10,2);
        obj.ADD();
    }
}


// to compile -> javac -d . add.java
// to run java math.add
public class ThisKeyword {
    int x,y;

    ThisKeyword()
    {

    }
    ThisKeyword(int a)
    {
        x=a;
        y=500;
    }
    ThisKeyword(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void display()
    {
        System.out.println(x+" "+y);
    }
    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword(10);
        ThisKeyword obj2=new ThisKeyword(100,200);
        obj.display();
        obj2.display();
    }
}

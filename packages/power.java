package math.advanced_math;

public class power {
    int a,b;
    public void get(int x, int y)
    {
        a=x;
        b=y;
    }
    public void POWER()
    {
        int ans=1;
        for (int i=1;i<=b;i++)
        {
            ans*=a;
        }
        System.out.println(a+" power "+b+": "+ans);
    }
    public static void main(String[] args) {
        
    }
}

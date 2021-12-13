public class MainOverloading {
    static public void main(String[] args) {
        // int a,b;
        // a=0;
        // b=0;
        // System.out.println(a+' '+b);
        MainOverloading obj= new MainOverloading();
        String str=obj.main("Hello");
        System.out.println(str);
    }

    String main(String str)
    {
        String temp;
        temp=str+str;
        return temp;
    }

}

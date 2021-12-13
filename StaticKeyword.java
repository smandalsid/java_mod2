public class StaticKeyword {
    static int counter;
    int c=0;
    StaticKeyword()
    {
        counter=0;
    }
    static
    {
        counter=0;
    }
    static void increment()
    {
        counter++;
    }
    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
        StaticKeyword obj3 = new StaticKeyword();
        obj1.counter++;
        // obj2.counter++;
        // obj3.counter++;
        System.out.println(obj1.counter);
        System.out.println(obj2.counter); // even obj2 will show incremented value
        System.out.println(obj3.counter);
        counter++;
        // c++;// this will give error
        System.out.println(counter);
        obj1.increment();
        System.out.println(obj1.counter);
        increment();
        System.out.println(obj1.counter);
    }    
}

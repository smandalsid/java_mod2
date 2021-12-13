import math.add;
import math.sub;
import math.advanced_math.power;

public class master_package_tester {
    public static void main(String[] args) {
        add obj1 = new add();
        sub obj2 = new sub();
        power obj3 = new power();
        obj1.get(10,2);
        obj2.get(10,2);
        obj3.get(10,2);
        obj1.ADD();
        obj2.SUB();
        obj3.POWER();
    }
}

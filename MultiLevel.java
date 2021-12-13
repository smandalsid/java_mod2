public class MultiLevel {
    String name;
    int age;
    public static void main(String[] args) {
        ChildsChild obj = new ChildsChild();
        obj.get("Siddharth", 19);
        obj.get(100);
        obj.get(500000);
        obj.display();
    }
    void get(String n, int a)
    {
        name=n;
        age=a;
    }
}

class Child extends MultiLevel{
    int empcode;
    void get(int e)
    {
        empcode=e;
    }
}

class ChildsChild extends Child{
    double salary;
    void get(double s)
    {
        salary=s;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Empcode: "+empcode);
        System.out.println("Salary: "+salary);
    }
}

// class person1
// {
// String name,address;
// int age;
// void get_person_info(String n,String a,int x)
// {
// name=n;
// address=a;
// age=x;
// }
// void show_person_info()
// {
// System.out.println("Person Name "+name);
// System.out.println("Person Address "+address);
// System.out.println("Person Age "+age);
// }
// }
// class employee1 extends person1
// {
// //String name,address;
// //int age;  g_p_i() & s_p_i()
// String EMP_Code;
// void get_emp_info(String n,String a,int x,String e)
// {
// get_person_info(n,a,x);
// //name=n;
// //address=a;
// //age=x;
// EMP_Code=e;
// }
// void show_emp_info()
// {
// show_person_info();
// //System.out.println("Employee Name "+name);
// //System.out.println("Employee Address "+address);
// //System.out.println("Employee Age "+age);
// System.out.println("Employee Code "+EMP_Code);
// }
// }
// class employee_MLI extends employee1
// {
// //emplouyee1;-->immediate parent for employee_MLI
// //person1-->parent for employee1 class
// String emp_type;  //teaching or non_teaching
// int salary;
// void get(String n,String a,int i,String ec,String et,int s)
// {
// get_emp_info(n,a,i,ec);
// emp_type=et;
// salary=s;
// }
// void show()
// {
// show_emp_info();// person details(name,address,age) and Emp_code
// System.out.println("Employee Type "+emp_type);
// System.out.println("Employee Salary "+salary);
// }
// public static void main(String args[])
// {
// //preson1 
// //employee1
// employee_MLI obj=new employee_MLI();
// obj.get("ram","katpadi",21,"EMP007","Teaching",100000);
// obj.show();
// employee_MLI obj1=new employee_MLI();
// obj1.get("Babu","vellore",29,"EMP001","Non-Teaching",50000);
// obj1.show();
// }

 

// }
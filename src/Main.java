import java.util.ArrayList;

class Test {
    private int _x;

    Test() {
        _x = 0;
    }

    Test(int x) {
        _x = x;
    }

    public int get_x() {
        return _x;
    }

    public void set_x(int x) {
        _x = x;
    }
}

class Test2 {
    private int _y;

    Test2() {
        _y = 0;
    }

    Test2(int y) {
        _y = y;
    }

    public int get_y() {
        return _y;
    }

    public void set_y(int y) {
        _y = y;
    }
}
class Stuff<T> {
    private T _thing;
    public Stuff() {_thing = null;}
    public Stuff(T t) {_thing = t;}
    public T getThing() {return _thing;}
    public void setThing(T t) {_thing = t;}
    public void print() {
        if (_thing != null) {
            System.out.println("Type: " + _thing.getClass().getName() + ", value" + _thing);
        }
        else {
            System.out.println("null member variable");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Test e = new Test();
        Test2 e2 = new Test2();
        Stuff<Test> s = new Stuff<Test>();
        s.print();
        s.setThing(new Test(5));
        s.print();
        System.out.println(s.getThing().get_x()); // chaining

    }

}
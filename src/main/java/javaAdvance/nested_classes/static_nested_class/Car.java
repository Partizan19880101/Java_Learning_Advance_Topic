package javaAdvance.nested_classes.static_nested_class;
import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class Car {

    String colour;
    int doorCount;
    Engine engine;
    private static int i;

    void method() {
        System.out.println(Engine.horsePower);
        Engine e = new Engine(3);
        System.out.println(e.horsePower2); //можем обращаться к правэт переменным
    }

    @ToString
    public static class Engine {
        private static int horsePower;
        private int horsePower2;

        public Engine(int horsePower) {
            System.out.println(i);
            this.horsePower = horsePower;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println("Engine " + engine);
        Car car = new Car("red", 4, engine);
        System.out.println(car);
    }
}
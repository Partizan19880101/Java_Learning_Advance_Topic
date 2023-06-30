package javaAdvance.nested_classes.inner_class;

import lombok.ToString;


@ToString
public class Car2 {

    String colour;
    int doorCount;
    Car2.Engine2 engine;

    public Car2(String colour, int doorCount) {
        this.colour = colour;
        this.doorCount = doorCount;
        Engine2 e = new Engine2(3);
        System.out.println(e.horsePower);
//        this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine2 engine2){
        this.engine = this.engine;
    }
    @ToString
    public class Engine2 {
        private int horsePower;

        public Engine2(int horsePower) {
            System.out.println(horsePower);
            this.horsePower = horsePower;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car2 car2 = new Car2("Red", 4);
        Car2.Engine2 engine2 = car2.new Engine2(150);
        car2.setEngine(engine2);
        System.out.println(engine2);
        System.out.println(car2);

        Car2.Engine2 engine3 = new Car2("yellow", 4).new Engine2(150);
        System.out.println(engine3);
    }
}

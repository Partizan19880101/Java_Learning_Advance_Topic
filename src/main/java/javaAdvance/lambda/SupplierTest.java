package javaAdvance.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import lombok.AllArgsConstructor;
import lombok.ToString;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForImplementation;

public class SupplierTest {

    public static void main(String[] args) {
        ArrayList<Car> outCars = createThreeCars(() ->
            new Car("Nissan", "Red", 115));
        System.out.println("Our cars - " + outCars);

        changeCar(outCars.get(0), car -> {
            car.color = "Blue"; car.model = "Honda"; car.engine = 155;
            System.out.println("Upgraded car: " + car);
        });
        System.out.println(outCars);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }
    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }
}

@AllArgsConstructor
@ToString
class Car {
    String model;
    String color;
    double engine;
}
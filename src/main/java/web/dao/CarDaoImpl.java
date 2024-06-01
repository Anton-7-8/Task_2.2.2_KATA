package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class CarDaoImpl implements CarDao{
    private final List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", "black",6));
        cars.add(new Car("Honda", "white",8));
        cars.add(new Car("Ford", "red",3));
        cars.add(new Car("Toyota", "brown",5));
        cars.add(new Car("Mitsubishi", "gray",2));

    }

    @Override
    public List<Car> getSomeCars(int count) {
        return IntStream.range(0, cars.size())
                .filter(n -> n < count)
                .mapToObj(cars::get)
                .toList();
    }
}

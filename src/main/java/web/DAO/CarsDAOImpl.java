package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDAOImpl implements CarsDAO {
    public CarsDAOImpl() {
    }

    public List<Car> show(List<Car> cars, int count) {
        if (count == 0 || count > 5)
            return cars;
        else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}

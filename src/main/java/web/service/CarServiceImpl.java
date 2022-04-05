package web.service;

import org.springframework.stereotype.Service;
import web.DAO.CarsDAO;
import web.DAO.CarsDAOImpl;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    CarsDAO carsDAO = new CarsDAOImpl();

    @Override
    public List<Car> show(List<Car> cars, int count) {
        return carsDAO.show(cars, count);
    }
}

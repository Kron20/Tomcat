package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAOImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    private final CarsDAOImpl carsDAO;

    public CarsController(CarsDAOImpl carsDAO) {
        this.carsDAO = carsDAO;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") int index, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 1998, 80000));
        cars.add(new Car("BMW", 2010, 1000000));
        cars.add(new Car("Mazda", 2011, 700000));
        cars.add(new Car("Lexus", 2020, 10000000));
        cars.add(new Car("Ford", 2007, 500000));
        model.addAttribute("car", carsDAO.show(cars, index));
        return "car";
    }

}

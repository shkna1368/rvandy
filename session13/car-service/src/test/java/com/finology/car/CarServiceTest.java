package com.finology.car;

import com.finology.car.car.*;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarServiceTest {

    @Mock
    CarRepository repository;

    @InjectMocks
    CarService carService;

    @BeforeEach
    void initUseCase() {
        carService = new CarService(repository);
    }

@Order(1)
      @Test
    public void save() throws Exception {

          Car car=new Car();
String model="m1";
CarType carType=CarType.SPORT;
car.setModel(model);
car.setCarType(carType);


    when(repository.save(any(Car.class))).thenReturn(car);

Car savedCar =carService.save(car);


        assertNotNull(savedCar);
        Assert.assertEquals(model,savedCar.getModel());
        Assert.assertEquals(carType,savedCar.getCarType());
    }

    @Order(2)
    @Test
    public void findByCarTypeTest() throws Exception {

        Car car=new Car();
        String model="m1";
        CarType carType=CarType.SPORT;
        car.setModel(model);
        car.setCarType(carType);


        List<Car> cars=new ArrayList<>();
        cars.add(car);


        when(repository.findAllByCarType(CarType.SPORT)).thenReturn(cars);


        List<Car> queryResult = (List<Car>) carService.getByCarType(CarType.SPORT);

        assertFalse(queryResult.isEmpty());
        assertNotNull(queryResult.get(0));
    }


}

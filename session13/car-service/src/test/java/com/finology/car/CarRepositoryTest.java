package com.finology.car;

import com.finology.car.car.Car;
import com.finology.car.car.CarRepository;
import com.finology.car.car.CarType;
import com.finology.car.car_part.CarPartRepository;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.Assert.*;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarRepositoryTest {

    @Autowired
    CarRepository repository;




    @BeforeEach
    void initUseCase() {
        Car car=new Car();
        String model="mG";
        CarType carType=CarType.SPORT;
        car.setModel(model);
        car.setCarType(carType);

        Car savedCar =repository.save(car);
    }

    @AfterEach
    public void destroyAll(){
        repository.deleteAll();
    }

@Order(1)
      @Test
    public void save() throws Exception {

          Car car=new Car();
String model="m1";
CarType carType=CarType.SPORT;
car.setModel(model);
car.setCarType(carType);

Car savedCar =repository.save(car);


        assertNotNull(savedCar);
        Assert.assertEquals(model,savedCar.getModel());
        Assert.assertEquals(carType,savedCar.getCarType());
    }

    @Order(2)
    @Test
    public void findByCarTypeTest() throws Exception {



        List<Car> queryResult = (List<Car>) repository.findAllByCarType(CarType.SPORT);

        assertNotNull(queryResult.get(0));
    }


}

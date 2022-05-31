package com.finology.car.car;


import com.finology.car.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "T_CARS")
@Data
public class Car extends BaseEntity {

    @NotNull
    @Column(name = "MODEL")
    private String model;



    @NotNull
    @Column(name = "CAR_TYPE")
    @Enumerated(value = EnumType.STRING)
    private CarType carType;






}

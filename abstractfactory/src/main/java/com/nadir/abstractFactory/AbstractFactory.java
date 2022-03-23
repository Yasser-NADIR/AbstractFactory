package com.nadir.abstractFactory;

import com.nadir.entities.ProductA;
import com.nadir.entities.ProductB;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

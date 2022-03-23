package com.nadir.factories;

import com.nadir.abstractFactory.AbstractFactory;
import com.nadir.entities.ProductA;
import com.nadir.entities.ProductA1;
import com.nadir.entities.ProductB;
import com.nadir.entities.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
    
}

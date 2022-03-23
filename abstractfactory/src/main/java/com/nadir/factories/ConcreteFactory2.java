package com.nadir.factories;

import com.nadir.abstractFactory.AbstractFactory;
import com.nadir.entities.ProductA;
import com.nadir.entities.ProductA2;
import com.nadir.entities.ProductB;
import com.nadir.entities.ProductB2;

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
    
}

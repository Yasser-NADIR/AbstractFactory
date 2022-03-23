package com.nadir;

import java.util.Scanner;

import com.nadir.abstractFactory.AbstractFactory;
import com.nadir.entities.ProductA;
import com.nadir.entities.ProductB;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        AbstractFactory factory = (AbstractFactory)Class.forName(getFactory()).newInstance();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
        productA.consume();
        productB.consume();
    }


    private static String getFactory(){
        return "com.nadir.factories.ConcreteFactory"+makeChoise();
    }

    private static int makeChoise(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
            "choisit quelle factory tu veux: \n"+
            "1: factory1\n"+
            "2: factory2"
        );
        return sc.nextInt();
    }
}

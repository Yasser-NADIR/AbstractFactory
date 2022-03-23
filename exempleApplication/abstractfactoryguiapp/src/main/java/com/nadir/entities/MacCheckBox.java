package com.nadir.entities;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MacCheckBox implements CheckBox {

    @Override
    public List<String> getList() {
        return Stream.of("MacBook Air", "MacBook Pro").collect(Collectors.toList());
    }
    
}

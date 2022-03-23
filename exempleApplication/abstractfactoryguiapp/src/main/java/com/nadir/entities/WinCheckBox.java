package com.nadir.entities;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WinCheckBox implements CheckBox {

    @Override
    public List<String> getList() {
        return Stream.of("Windows XP", "Windows 7", "Windows 10").collect(Collectors.toList());
    }
    
}

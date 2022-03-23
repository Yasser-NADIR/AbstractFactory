package com.nadir.factories;

import com.nadir.abstractFactory.GUIFactory;
import com.nadir.entities.Button;
import com.nadir.entities.CheckBox;
import com.nadir.entities.MacButton;
import com.nadir.entities.MacCheckBox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
    
}

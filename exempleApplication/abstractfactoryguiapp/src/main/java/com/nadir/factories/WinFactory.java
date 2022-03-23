package com.nadir.factories;

import com.nadir.abstractFactory.GUIFactory;
import com.nadir.entities.Button;
import com.nadir.entities.CheckBox;
import com.nadir.entities.WinButton;
import com.nadir.entities.WinCheckBox;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
    
}

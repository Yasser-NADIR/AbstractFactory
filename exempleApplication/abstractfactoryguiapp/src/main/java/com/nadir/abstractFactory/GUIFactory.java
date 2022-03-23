package com.nadir.abstractFactory;

import com.nadir.entities.Button;
import com.nadir.entities.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}

package Strategy.abilities.impl;

import Strategy.abilities.api.CheckEngine;
import Strategy.abilities.api.CheckTrailer;

public class CheckCommonTrailer implements CheckTrailer {

    @Override
    public void checkTrailer() {
    System.out.println("Проверяем прицеп");

    }
}


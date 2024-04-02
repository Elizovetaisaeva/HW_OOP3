package Strategy.abilities.impl;

import Strategy.abilities.api.CheckEngine;

public class CheckCommonEngine implements CheckEngine {
    @Override
    public void CheckEngine() {
        System.out.println("Проверяем двигатель внутренего сгорания");

    }
}

package Strategy.abilities.impl;

import Strategy.abilities.api.CheckEngine;

public class CheckElectroEngine implements CheckEngine {
    @Override
    public void CheckEngine() {
        System.out.println("Проверяем электро двигатель");
    }
}

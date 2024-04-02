package Strategy.abilities.impl;

import Strategy.abilities.api.CheckWheels;

public class CheckGusenitsa implements CheckWheels {

    @Override
    public void updateTyre() {
        System.out.println("Меняем гусеницу");
    }
}

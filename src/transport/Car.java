package transport;

import Strategy.abilities.impl.CheckCommonEngine;
import Strategy.abilities.impl.CheckGusenitsa;
import Strategy.abilities.impl.NoTrailerCheck;

public class Car extends Transport {


    public Car(String modelName) {
        super(modelName, 4, new CheckCommonEngine(), new CheckGusenitsa(), new NoTrailerCheck());
    }
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount, new CheckCommonEngine(), new CheckGusenitsa(), new NoTrailerCheck());
    }

    public void checkEngine() {
        System.out.println("Проверяем двиготиль");
    }

    @Override
    public void check() {
        updateTyre();
        checkEngine();

    }
}


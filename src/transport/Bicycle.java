package transport;

import Strategy.abilities.impl.CheckCommonEngine;
import Strategy.abilities.impl.CheckGusenitsa;
import Strategy.abilities.impl.NoTrailerCheck;

public class Bicycle extends Transport {
    private static final Integer WHEELS = 2;
    public Bicycle (String modelName) {
        super(modelName,WHEELS, new CheckCommonEngine(), new CheckGusenitsa(), new NoTrailerCheck());
    }

    @Override
    public void check() {
        updateTyre();
    }
}


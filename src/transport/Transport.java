package transport;

import Strategy.abilities.impl.CheckCommonEngine;
import Strategy.abilities.impl.CheckGusenitsa;
import Strategy.abilities.impl.CheckTyre;
import Strategy.abilities.impl.NoTrailerCheck;

public abstract class Transport implements Checkable {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount, CheckCommonEngine checkCommonEngine, CheckGusenitsa checkGusenitsa, NoTrailerCheck noTrailerCheck) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public Transport(String mercedes, int wheelsCount, CheckCommonEngine checkCommonEngine, CheckTyre checkTyre, NoTrailerCheck noTrailerCheck) {

    }

    public String getModelName() {
        return modelName;
    }
        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre(){
        System.out.println("Меняем покрышки");

}

}


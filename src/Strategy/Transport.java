package Strategy;

import Strategy.abilities.api.CheckEngine;
import Strategy.abilities.api.CheckTrailer;
import Strategy.abilities.api.CheckWheels;
import transport.Checkable;

import java.util.Objects;

public class Transport implements Checkable {
    private String modelName;
    private int wheelsCount;

    public CheckEngine checkEngine;
    public CheckWheels checkWheels;
    public CheckTrailer checkTrailer;


    public Transport(String modelName, int wheelsCount,
                     CheckEngine checkEngine,
                     CheckWheels checkWheels,
                     CheckTrailer checkTrailer) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
        this.checkEngine = checkEngine;
        this.checkWheels = checkWheels;
        this.checkTrailer = checkTrailer;
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


    @Override
    public void check() {
        checkWheels.updateTyre();
        checkEngine.CheckEngine();
        checkTrailer.checkTrailer();
    }
}






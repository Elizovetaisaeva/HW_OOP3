package Strategy;

import Strategy.abilities.impl.*;


public class Main {

    public static void main(String[] args) {
        Transport mercedes = new Transport("Mercedes",
                4,
                new CheckCommonEngine(),
                new CheckTyre(),
                new NoTrailerCheck());

        Transport tesla = new Transport("Tesla",
                4,
                new CheckElectroEngine(),
                new CheckTyre(),
                new NoTrailerCheck());


        Transport tank = new Transport("Tank",
                2,
                new CheckCommonEngine(),
                new CheckGusenitsa(),
                new NoTrailerCheck());

        Transport electroTesla = new Transport("Tesla",
                4,
                new CheckElectroEngine(),
                new CheckTyre(),
                new NoTrailerCheck());

        Transport[] transports = new Transport[]{mercedes, tesla, tank , electroTesla};
        for (Transport transport : transports) {
            System.out.println("======================================================");
            System.out.println(transport.getModelName());
            transport.check();
        }

    }
}
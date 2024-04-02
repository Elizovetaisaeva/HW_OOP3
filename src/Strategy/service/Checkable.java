package Strategy.service;

import transport.Transport;

public interface Checkable {
    void check();

    class ServiceStation {
        public void check(Transport[] transports ) {
            for (Transport transport: transports) {
                check(transport);
            }
            }
            public void check(Transport  transports ) {
                    System.out.println("==============================================");
                    System.out.println(transports.getModelName());
                transports.check();


        }
        }
}

package transport;

public class Truck extends Car {
    public void checkTrailer() {
        System.out.println("Проверяем прицеп"); }
        public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);}

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}

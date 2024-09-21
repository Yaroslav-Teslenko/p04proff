package l07.serializationWithObj;

import java.io.Serializable;

public class Car implements Serializable {
    int price;
    String model;
    Engine engine;

    Car(int price, String model, Engine engine) {
        this.price = price;
        this.model = model;
        this.engine = engine;
    }
}

class Engine implements Serializable{
    int power;

    Engine(int power) {
        this.power = power;
    }
}

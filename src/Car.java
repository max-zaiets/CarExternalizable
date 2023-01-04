import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {

    private String model;
    private static int wheels = 4;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(model);
        out.writeObject(price);
        out.writeObject(wheels);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        model = (String)in.readObject();
        price = (Double)in.readObject();
        wheels = (Integer)in.readObject();
    }
}

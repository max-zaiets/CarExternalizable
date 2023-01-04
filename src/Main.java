import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Car car = new Car("Ferrari", 1000000);

        FileOutputStream fileOutputStream = new FileOutputStream("D:\\IntellijProjects\\CarExternalizable\\src\\Car.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        car.writeExternal(objectOutputStream);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}

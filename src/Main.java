import javax.swing.*;

public class Main {
    public static void main(String[] args) {
      Service[] transport = {
              new Car("car1", 4),
              new Car("car2", 4),
              new Truck("truck1", 6),
              new Truck("truck2", 8),
              new Bicycle("bicycle1", 2),
              new Bicycle("bicycle2", 2)
      };
      checkAllTransports(transport);

    }
  private static void checkAllTransports(Service[] transport) {
    for (int i = 0; i < transport.length; i++) {
      transport[i].check();
    }
  }

}
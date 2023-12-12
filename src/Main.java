import javax.swing.*;

public class Main {
    public static void main(String[] args) {
      Car[] cars = {
              new Car("car1", 4),
              new Car("car2", 4)
      };

      Truck[] trucks = {
              new Truck("truck1", 6),
              new Truck("truck2", 8)
      };
      Bicycle[] bicycles ={
              new Bicycle("bicycle1", 2),
              new Bicycle("bicycle2", 2)
      };

        Service station = new ServiceStation();
        checkAllTransport(station, cars, bicycles, trucks);
    }

  private static void checkAllTransport(Service station, Car[] cars, Bicycle[] bicycles, Truck[] trucks) {
    station.check(cars);
    station.check(bicycles);
    station.check(trucks);
  }
}
public class ServiceStation implements Service {
    @Override
    public void check(Car[] car) {
            for (int i = 0; i < car.length; i++) {
                if(car[i] != null){
                System.out.println("Обслуживаем " + car[i].getModelName());
                transportUpdateTyre(car[i]);
                car[i].checkEngine();
                }
            }
        }
    @Override
    public void check(Truck[] truck) {
        for (int i = 0; i < truck.length; i++) {
            if (truck[i] != null) {
                System.out.println("Обслуживаем " + truck[i].getModelName());
                transportUpdateTyre(truck[i]);
                truck[i].checkEngine();
                truck[i].checkTrailer();
            }
        }
    }
    @Override
    public void check(Bicycle[] bicycle){
        for (int i = 0; i < bicycle.length; i++) {
            if (bicycle[i] != null) {
                System.out.println("Обслуживаем " + bicycle[i].getModelName());
                transportUpdateTyre(bicycle[i]);
            }
        }
    }

    public void transportUpdateTyre(Transport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}

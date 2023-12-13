import java.lang.annotation.Native;

public class Truck extends EngineTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        transportUpdateTyre();
        checkEngine();
        checkTrailer();
    }
}




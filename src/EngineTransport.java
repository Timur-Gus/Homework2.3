public abstract class EngineTransport extends Transport implements Service {

    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}

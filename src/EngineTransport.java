public class EngineTransport implements Service {
    private final String modelName;
    private final int wheelsCount;

    public EngineTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void transportUpdateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        transportUpdateTyre();
        checkEngine();
    }
}

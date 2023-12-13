public class Transport implements Service {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


    @Override
    public void check() {
                System.out.println("Обслуживаем " + getModelName());
                transportUpdateTyre();
            }

    @Override
    public void transportUpdateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

}

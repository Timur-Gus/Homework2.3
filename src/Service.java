import com.sun.jdi.connect.Transport;

public interface Service {
    void check();
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    void transportUpdateTyre();
}
public class ServiceStation {
    public static void checkAllTransports(Service[] transport) {
        for (int i = 0; i < transport.length; i++) {
            transport[i].check();
        }
    }
}

import java.lang.reflect.*;

@interface Inject {}

class Service {
    void serve() {
        System.out.println("Service Injected");
    }
}

class Client {
    @Inject
    Service service;
}

public class SimpleDI {

    public static void main(String[] args) throws Exception {

        Client client = new Client();

        for (Field field : Client.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(client, field.getType().getDeclaredConstructor().newInstance());
            }
        }

        client.service.serve();
    }
}
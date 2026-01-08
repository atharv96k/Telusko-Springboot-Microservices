
// 1. The Interface (Abstractions over Implementations)

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface Engine {
    void start();
}

// 2. The Implementation
@Component
class TurboEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Turbo Engine started...");
    }
}

// 3. The Spring Managed Class (IoC in action)
@Component
class Car {
    private final Engine engine;

    // Dependency Injection: Spring injects the Engine bean here
    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving!");
    }
}
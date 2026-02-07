 
## API Gateway – Quick Lecture Notes

## 📌 What is API Gateway?

API Gateway is a **single entry point** for multiple microservices.

It receives client requests and routes them to the correct backend service.

---

## 🧱 Architecture Used

**Flow:** Client → **API Gateway** (Port: 8998) → **Microservice01** (8583) / **Microservice02** (8482)

> **Note:** Eureka Server is used for **service discovery** so the Gateway knows where the services live.

---

## ⚙️ Basic Configuration

```properties
spring.application.name=APIGateWay
server.port=8998

# Automatically find services registered in Eureka
spring.cloud.gateway.discovery.locator.enabled=true
spring.cloud.gateway.discovery.locator.lower-case-service-id=true

```

* `@EnableDiscoveryClient` → Enables Eureka registration.
* **Startup Order:** Gateway must start **after** Eureka.

---

## 🚦 Routing – Way 1 (Java Based)

Routes are defined using **Spring Cloud Gateway MVC functional routing**.

```java
GatewayRouterFunctions.route("microservice01")
  .route(RequestPredicates.path("/msg-m1"),
         HandlerFunctions.http("http://localhost:8583"))
  .build();

```

### Key Points

* `RequestPredicates.path()`: Matches the incoming request URL.
* `HandlerFunctions.http()`: Forwards the request to the specific microservice.
* **Pro:** More **flexible** and allows for **programmable logic**.

---

## 🚦 Routing – Way 2 (Properties Based)

Routes can also be defined directly in `application.properties`.

```properties
spring.cloud.gateway.mvc.routes[0].id=microservice01
spring.cloud.gateway.mvc.routes[0].uri=http://localhost:8583
spring.cloud.gateway.mvc.routes[0].predicates[0]=Path=/msg-m1

```

### Key Points

* No Java code required.
* Best for **simple/static routing**.
* **Con:** Usually requires an application restart to update.

---

## 🆚 Comparison

| Feature | Java Routing | Properties Routing |
| --- | --- | --- |
| **Flexibility** | High (Dynamic logic) | Low (Static) |
| **Complexity** | More boilerplate code | Minimal configuration |
| **Use Case** | Complex filtering/logic | Quick setups |

---

## 🌐 Example URLs

* `http://localhost:8998/msg-m1` → Routes to **Microservice01**
* `http://localhost:8998/msg-m2` → Routes to **Microservice02**

---

## ✅ Lecture Takeaways

* API Gateway **centralizes** routing and security.
* **Eureka** allows the gateway to find services without hardcoding IPs.
* Spring Cloud Gateway supports both **Java-based** and **Config-based** routing.

---
 
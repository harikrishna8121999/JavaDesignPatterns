## Lazy Initialization

### Explanation
Lazy Initialization is another way to implement the Singleton pattern. In this approach, the instance of the Singleton class is created only when it's requested for the first time. This conserves resources as the instance is not created upfront during class loading. However, it introduces a small overhead due to the need to check for instance existence.

### Implementation

```java
public class LazySingleton {
    // 1. Private static instance initially set to null.
    private static LazySingleton instance;

    // 2. Private constructor prevents external instantiation.
    private LazySingleton() {
        // Initialization code, if any.
    }

    // 3. Public method to provide access to the instance.
    public static LazySingleton getInstance() {
        // 4. Check if the instance is null and create it if needed.
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
```

### Code Example and Explanation

Let's break down the code step by step:

1. `private static LazySingleton instance;`: This line declares a private static instance variable called `instance` and initializes it to `null`. Unlike eager initialization, the instance is not created during class loading but remains null initially.

2. `private LazySingleton() { /* Initialization code, if any. */ }`: This is the private constructor of the `LazySingleton` class. It prevents external classes from creating new instances of `LazySingleton`. You can include initialization code inside this constructor if needed.

3. `public static LazySingleton getInstance() { /* ... */ }`: This is a public static method named `getInstance()`, which provides access to the single instance of `LazySingleton`.

4. In this part of the code:
   ```java
   if (instance == null) {
       instance = new LazySingleton();
   }
   ```
    - It checks if the `instance` is `null`. If it is, a new instance of `LazySingleton` is created.
    - This check ensures that the instance is created only when it's requested for the first time, implementing lazy initialization.

### Additional Information

Lazy Initialization is a resource-efficient way to implement the Singleton pattern because it creates the instance only when it's actually needed. This approach is suitable when the Singleton instance might not always be used, and you want to avoid unnecessary resource consumption.

However, it's essential to note that Lazy Initialization, as shown above, is not thread-safe. In a multi-threaded environment, two or more threads might simultaneously check if `instance` is null and potentially create multiple instances. To ensure thread safety, you can introduce synchronization, but it can impact performance. Alternatively, you can use other thread-safe Singleton patterns like the Thread-Safe Singleton or Bill Pugh Singleton.

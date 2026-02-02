import java.lang.annotation.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Calculator {
    Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        int result = n * n;
        cache.put(n, result);
        return result;
    }
}

public class CacheResultExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.square(4));
        System.out.println(c.square(4));
    }
}
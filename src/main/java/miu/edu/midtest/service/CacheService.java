package miu.edu.midtest.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CacheService <T>  {
    Map<String, List<T>> map = new HashMap<>();

    public List<T> getAll(String className) {
        return map.get(className);
    }

    public void put(String className, List<T> t) {
       map.put(className, t);
    }
}

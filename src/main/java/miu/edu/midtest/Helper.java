package miu.edu.midtest;

import lombok.RequiredArgsConstructor;
import miu.edu.midtest.service.CacheService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@RequiredArgsConstructor
public class Helper <T> {
    private final CacheService<T> CACHE;

    @Around("@annotation(MyCacheable)")
    public Object saveCacheable(ProceedingJoinPoint joinPoint) throws Throwable {
        List<T> items = CACHE.getAll(joinPoint.getTarget().getClass().getName());
        if (items == null) {
            items = (List<T>) joinPoint.proceed();
            CACHE.put(joinPoint.getTarget().getClass().getName(), items);
        }
        return items;
    }
}

package com.daijunyi.lb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class RoundRobinLB implements LoadBalancer{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getIncrement(){
        int current;
        int next;
        do {
            current = atomicInteger.get();
            next = current > Integer.MAX_VALUE ? 0 : current+1;
        } while (!atomicInteger.compareAndSet(current,next));
        log.info("当前值："+next);
        return next;
    }

    public ServiceInstance chooseService(List<ServiceInstance> serviceInstances) {
        if (serviceInstances == null || serviceInstances.size() == 0){
            return null;
        }
        int index = getIncrement() % serviceInstances.size();
        ServiceInstance instance = serviceInstances.get(index);
        return instance;
    }
}

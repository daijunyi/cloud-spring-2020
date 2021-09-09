package com.daijunyi.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {

    public ServiceInstance chooseService(List<ServiceInstance> serviceInstances);
}

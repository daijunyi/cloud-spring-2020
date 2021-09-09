package com.daijunyi.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class GlobalGatewayFilter implements GlobalFilter, Ordered {

    //具体实现代码的过滤方法
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        boolean username = exchange.getRequest().getQueryParams().containsKey("username");
        if (!username){
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            Mono<Void> voidMono = exchange.getResponse().setComplete();
            return voidMono;
        }
        return chain.filter(exchange);
    }

    //数值越小优先级越高
    @Override
    public int getOrder() {
        return 0;
    }
}

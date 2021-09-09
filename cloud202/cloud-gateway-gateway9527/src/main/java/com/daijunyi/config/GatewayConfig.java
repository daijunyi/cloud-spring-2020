package com.daijunyi.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_guoji", r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        routes.route("path_rote_guonei", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("path_rote_mil", r -> r.path("/mil").uri("http://news.baidu.com/mil")).build();
        return routes.build();
    }

}

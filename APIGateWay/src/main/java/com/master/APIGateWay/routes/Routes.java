package com.master.APIGateWay.routes;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; 
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class Routes {

	
	//Way 1
	@Bean
	public RouterFunction<ServerResponse> route() {
			return GatewayRouterFunctions
			.route("mircorservice01")
			.route(RequestPredicates.path("/msg-m1"),
					HandlerFunctions.http("http://localhost:8583")).build();
	}
	
	@Bean
	public RouterFunction<ServerResponse> route2() {
			return GatewayRouterFunctions
			.route("mircorservice02")
			.route(RequestPredicates.path("/msg-m2"),
					HandlerFunctions.http("http://localhost:8482")).build();
	}
}

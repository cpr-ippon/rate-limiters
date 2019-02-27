package fr.ippon.coding.challenge.ratelimiter.api;


import fr.ippon.coding.challenge.ratelimiter.service.RateLimiterService;

public class HelloController {

    private RateLimiterService rateLimiter;

    public String sayHello(String name) {

        rateLimiter.checkRate();
        return "Hello " + name + " !";
    }
}

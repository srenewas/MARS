package com.seenu.naya;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class JwtDecodeExample {
    @Value("${seenu.token}")
    String token;

    public String getToken() {
        return token;
    }
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(JwtDecodeExample.class);
        JwtDecodeExample jwt = context.getBean(JwtDecodeExample.class);

        String token = jwt.getToken();
        System.out.println("Token: " + token);

        DecodedJWT decoded = JWT.decode(jwt.getToken());
        System.out.println(decoded.getHeader());
        System.out.println(decoded.getPayload());
        System.out.println(decoded.getSignature());
        System.out.println(decoded.getAlgorithm());
        System.out.println(decoded.getExpiresAt());
        System.out.println(decoded.getIssuer());
        System.out.println("Role: " + decoded.getClaim("role").asString());
        System.out.println(decoded.getContentType());
    }
}

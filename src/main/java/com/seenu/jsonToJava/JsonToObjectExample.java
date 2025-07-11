package com.seenu.jsonToJava;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObjectExample {
    public static void main(String[] args) throws Exception {
        String json = "{\"name\":\"Seenu\", \"age\":25}";
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(json, User.class);
        System.out.println(user.getName());
        System.out.println(user.getAge());

    }
}

/*<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10</version>
</dependency>*/

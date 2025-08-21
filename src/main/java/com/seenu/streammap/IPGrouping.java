package com.seenu.streammap;

import java.util.*;
import java.util.stream.*;

public class IPGrouping {
    public static void main(String[] args) {
        String ips = "IP1|USA IP2|India IP3|USA IP4|UK IP5|India";

        Map<String, List<String>> result = Arrays.stream(ips.split(" "))
                .map(s -> s.split("\\|"))                        // Split by '|'
                .collect(Collectors.groupingBy(
                        arr -> arr[1],                              // Key = Country
                        LinkedHashMap::new,                         // Preserve insertion order
                        Collectors.mapping(arr -> arr[0], Collectors.toList()) // Value = List of IPs
                ));
        result.forEach((country, ipList) ->
                System.out.println(country + ": " + String.join(" ", ipList)));
    }
}
/*
USA: IP1 IP3
India: IP2 IP5
UK: IP4
 */
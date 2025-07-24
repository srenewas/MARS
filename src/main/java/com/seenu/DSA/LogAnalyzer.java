package com.seenu.DSA;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LogAnalyzer {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "2023-10-01T10:00:00 user1 LOGIN",
                "2023-10-01T10:05:00 user1 LOGOUT",
                "2023-10-01T10:06:00 user2 LOGIN");

       /* Given a list of log entries (String) in the format:
        "timestamp userId action"
        Extract the count of actions per user.*/

        Map<String, Long> map = list.stream()
                .map(m->m.split(" ")[1])  // 0-> timeStamp, 1-> userId , 2-> action
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}

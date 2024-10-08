package org.example.streams;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class QuickStart {
    public static void main(String[] args) {
        List<String> inp = new ArrayList<>();
        inp.add("viswa");
        inp.add("axel");
        List<String> res = inp.stream().filter(obj -> obj.contains("v") || obj.contains("V")).toList();
        System.out.println(res);

    }
}


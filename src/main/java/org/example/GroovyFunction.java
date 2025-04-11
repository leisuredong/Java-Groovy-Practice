package org.example;

import groovy.lang.Script;

import java.util.Map;
import java.util.Set;

public class GroovyFunction extends Script {
    public static String foo(String str1, String separator, String str2) {
        System.out.println("hello from foo");
        return str1 + separator + str2;
    }

    public static Set<String> bar(Map<String, String> map) {
        System.out.println("hello from bar");
        return map.keySet();
    }

    public Object run() {
        return null;
    }
}


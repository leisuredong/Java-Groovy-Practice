package org.example;
import groovy.lang.GroovyShell;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    private static final GroovyShell shell;
    static {
        shell = new GroovyShell();
    }
    public static void main(String[] args) throws IOException {
        shell.evaluate(new File("src/main/java/org/example/samples.groovy"));
        HashSet<Integer> set = new HashSet<>();
        Integer max = Collections.max(set);
        System.out.println(max);
    }
}
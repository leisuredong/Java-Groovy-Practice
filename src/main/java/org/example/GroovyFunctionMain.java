package org.example;

import groovy.lang.GroovyShell;
import groovy.lang.Script;
import org.codehaus.groovy.control.CompilerConfiguration;
import java.io.IOException;

public class GroovyFunctionMain {
    private static final GroovyShell shell;

    static {
        CompilerConfiguration cfg = new CompilerConfiguration();
        cfg.setScriptBaseClass(GroovyFunction.class.getName());
        shell = new GroovyShell(cfg);
    }

    public static void main(String[] args) throws IOException {
        Script script = shell.parse("foo('abc',',','xyz')");
        Object result = script.run();
        System.out.println(result);

        script = shell.parse("bar(['fName': 'Jen', 'lName': 'Cruise', 'sex': 'F'])");
        result = script.run();
        System.out.println(result);

        script = shell.parse("def obj = new Expando()\nobj.sayHello = { println 'Hello!' }\nobj.sayHello()");
        result = script.run();
    }
}
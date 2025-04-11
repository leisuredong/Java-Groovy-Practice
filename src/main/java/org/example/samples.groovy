package org.example

class Example {
    static void main(String[] args) {
        /*
        def keys = ['name', 'age', 'sex']
        def values = ['Tom', 20, 'M']
        def map = [keys, values].transpose()
        println map    // 输出：[name:Tom, age:20, sex:M]

        def clos = { println 'Hello World' };
        clos.call()
        clos()

        def y = ['fName': 'Jen', 'lName': 'Cruise', 'sex': 'F']
        println y.keySet()

        def s = ['hello', 'world', 'yeah']
        def m = [(s[0]): (s[1])]
        println m

        def l = ['hello,hi', 'world,word,wood'].collect({ it.split(',') })

        def list = [['OTHER', 'OTHER', 'AOMP', 'ITSM'],['1', '0', '1', '1']].transpose().collectEntries()
        println(list)
        */

        def s = 'hello';
        def s_new = "${s}"
        println(s_new)

        sayHello()

        Eval.me('33*3') == 99
    }

    def static sayHello() {
        println "Hello, world!"
    }
}


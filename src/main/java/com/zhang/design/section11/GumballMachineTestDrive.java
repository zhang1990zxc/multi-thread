package com.zhang.design.section11;

import com.zhang.concurrency.chapter3.Instance;

/**
 * @ClassName GumballMachineTestDrive
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/4/5 12:57
 * @Version 1.0
 **/
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();

    }

}

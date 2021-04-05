package com.zhang.design.section10;

/**
 * @ClassName WinnerState
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/4/4 0:16
 * @Version 1.0
 **/
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("error");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("error");
    }

    @Override
    public void turnCrank() {
        System.out.println("error");
    }

    @Override
    public void dispense() {
        System.out.println("You ...");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops....");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}


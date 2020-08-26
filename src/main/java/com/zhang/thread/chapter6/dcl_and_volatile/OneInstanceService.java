package com.zhang.thread.chapter6.dcl_and_volatile;

import java.util.Random;

/**
 * @ClassName OneInstanceService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/8/25 1:15
 * @Version 1.0
 **/
public class OneInstanceService {

    public int i_am_has_state = 0;

    private volatile static OneInstanceService test;

    private OneInstanceService() {
        i_am_has_state = new Random().nextInt(200) + 1;
    }

    public static OneInstanceService getInstance() {
        if(test == null) {
            synchronized (OneInstanceService.class) {
                if (test == null) {
                    test = new OneInstanceService();
                }
            }
        }
        return test;
    }

    public static void reset() {
        test = null;
    }

}

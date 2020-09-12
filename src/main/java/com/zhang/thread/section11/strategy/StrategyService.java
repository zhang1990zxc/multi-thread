package com.zhang.thread.section11.strategy;

import java.util.List;

/**
 * @ClassName StrategyService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/11 23:59
 * @Version 1.0
 **/
public interface StrategyService {

    void sendMsg(List<Msg> msgList, List<String> deviceIdList);

}

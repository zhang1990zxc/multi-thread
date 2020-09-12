package com.zhang.thread.section11.strategy;

import cn.hutool.json.JSONUtil;

import java.util.List;

/**
 * @ClassName StrategyOneService
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/12 0:08
 * @Version 1.0
 **/
public class StrategyOneService implements StrategyService {
    @Override
    public void sendMsg(List<Msg> msgList, List<String> deviceIdList) {
        for (Msg msg : msgList) {
            msg.setDataId("oneService_" + msg.getDataId());
            System.out.println(msg.getDataId() + " " + JSONUtil.toJsonStr(deviceIdList));
        }
    }
}

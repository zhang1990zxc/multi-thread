package com.zhang.thread.section11.strategy;

import java.util.*;

/**
 * @ClassName StrategyTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/11 23:59
 * @Version 1.0
 **/
public class StrategyTest {

    public static Map<Integer, StrategyService> serviceMap = new HashMap<>();

    static {
        serviceMap.put(111, new StrategyOneService());
        serviceMap.put(222, new StrategyTwoService());
    }

    public static void main(String[] args) {
        Map<Integer, List<String>> appKeyMap = new HashMap<>();

        List<String> oneList = new ArrayList<>();
        oneList.add("device_id1");
        appKeyMap.put(111, oneList);

        List<String> twoList = new ArrayList<>();
        twoList.add("device_id2");
        appKeyMap.put(222, twoList);

        List<Msg> msgList = new ArrayList<>();
        Msg msg = new Msg();
        msg.setDataId("abc");
        msg.setBody("hello");
        msgList.add(msg);

        Iterator<Integer> appKeyMapItr = appKeyMap.keySet().iterator();
        while(appKeyMapItr.hasNext()){
            int appKey = appKeyMapItr.next();
            StrategyService strategyService = serviceMap.get(appKey);
            if(strategyService!=null){
                strategyService.sendMsg(msgList, appKeyMap.get(appKey));
            }else {
                System.out.println(String.format("appKey:%s is not registered service", appKey));
            }
        }
    }

}

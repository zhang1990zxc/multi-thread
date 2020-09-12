package com.zhang.thread.section11.strategy;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @ClassName StrategyTest
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2020/9/11 23:59
 * @Version 1.0
 **/
public class StrategyTest2 {

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

        Iterator<Integer> appKeyItr = appKeyMap.keySet().iterator();
        Map<Integer, List<Msg>> appKeyMsgMap = new HashMap<>();

        while (appKeyItr.hasNext()) {
            List<Msg> tempList = new ArrayList<>();
            Iterator<Msg> msgIterator = msgList.listIterator();
            while (msgIterator.hasNext()) {
                Msg tempMsg = null;
                try {
                    tempMsg = (Msg) BeanUtils.cloneBean(msgIterator.next());
                } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (tempMsg != null) {
                    tempList.add(tempMsg);
                }
            }
            appKeyMsgMap.put(appKeyItr.next(), tempList);
        }

        appKeyItr = appKeyMap.keySet().iterator();
        while (appKeyItr.hasNext()) {
            int appKey = appKeyItr.next();
            StrategyService strategyService = serviceMap.get(appKey);
            if (strategyService != null) {
                strategyService.sendMsg(appKeyMsgMap.get(appKey), appKeyMap.get(appKey));
            } else {
                System.out.println(String.format("appKey:%s is not registered service", appKey));
            }
        }
    }

}

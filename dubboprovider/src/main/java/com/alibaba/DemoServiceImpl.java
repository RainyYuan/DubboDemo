package com.alibaba;

import com.alibaba.dubbo.demo.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/6/006 13:54
 * @Version 1.0
 */
public class DemoServiceImpl implements DemoService{


    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}

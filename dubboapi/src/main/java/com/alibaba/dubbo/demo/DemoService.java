package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/6/006 11:59
 * @Version 1.0
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}

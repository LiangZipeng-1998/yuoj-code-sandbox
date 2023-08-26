package com.yupi.yuojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : liang.zi.peng
 * @create 2023/8/22 22:48
 */
public class TestSecurityManager {
    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());
        // 检测读权限
//        List<String> strings = FileUtil.readLines("H:\\Desktop\\Java\\yupi_project\\yuoj-code-sandbox\\src\\main\\resources\\application.yml", StandardCharsets.UTF_8);
        // 检测写权限
//        FileUtil.writeString("aa", "aaa", Charset.defaultCharset());
    }
}

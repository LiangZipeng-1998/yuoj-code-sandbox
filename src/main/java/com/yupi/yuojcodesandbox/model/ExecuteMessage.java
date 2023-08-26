package com.yupi.yuojcodesandbox.model;

import lombok.Data;

/**
 * 进程执行信息
 *
 * @Author : liang.zi.peng
 * @create 2023/8/21 15:28
 */
@Data
public class ExecuteMessage {

    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;

    private Long memory;

}

package com.ncamc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 支付实体类
 * @Author: hugaoqiang
 * @CreateTime: 2022-09-01 10:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private static final long serialVersionUID = 10L;

    private Long id;

    private String serial;
}
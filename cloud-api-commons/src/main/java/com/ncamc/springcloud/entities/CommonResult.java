package com.ncamc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装返回JSON
 * @Author: hugaoqiang
 * @CreateTime: 2022-09-01 10:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>
{
    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code,String message)
    {
        this(code,message,null);
    }
}

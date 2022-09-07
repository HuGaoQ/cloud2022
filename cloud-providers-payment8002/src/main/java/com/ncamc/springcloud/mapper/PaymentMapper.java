package com.ncamc.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ncamc.springcloud.entities.Payment;

/**
 * @Author: hugaoqiang
 * @CreateTime: 2022-09-01 10:57
 */
public interface PaymentMapper extends BaseMapper<Payment>
{

    int create(Payment payment);

}
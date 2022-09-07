package com.ncamc.springcloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ncamc.springcloud.entities.CommonResult;
import com.ncamc.springcloud.entities.Payment;

public interface PaymentService extends IService<Payment>
{
    CommonResult create(Payment payment);

    CommonResult getPaymentById(Long id);
}
package com.ncamc.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ncamc.springcloud.entities.CommonResult;
import com.ncamc.springcloud.entities.Payment;
import com.ncamc.springcloud.mapper.PaymentMapper;
import com.ncamc.springcloud.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * @Author: hugaoqiang
 * @CreateTime: 2022-09-01 11:00
 */
@Log4j2
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper,Payment> implements PaymentService
{

    @Autowired
    private PaymentMapper paymentMapper;

    @Value("${server.port}")
    private String serverPort;

    @Override
    public CommonResult create(Payment payment)
    {
        CommonResult commonResult = null;
        int insert = paymentMapper.create(payment);
        log.info("插入结过："+insert+"^_^");
        if (insert > 0)
        {
            commonResult = new CommonResult(HttpStatus.OK.value(),"插入数据库成功,serverPort:"+serverPort,insert);
        }else
        {
            commonResult = new CommonResult(HttpStatus.NOT_IMPLEMENTED.value(),"插入数据库失败");
        }
        return commonResult;
    }

    @Override
    public CommonResult getPaymentById(Long id)
    {
        CommonResult commonResult = null;
        Payment payment = paymentMapper.selectById(id);
        log.info("查询结果："+payment+"O(∩_∩)O哈哈~");
        if (payment != null)
        {
            commonResult = new CommonResult(HttpStatus.OK.value(),"查询成功,serverPort:"+serverPort,payment);
        }else
        {
            commonResult = new CommonResult(HttpStatus.NOT_IMPLEMENTED.value(),"查询失败");
        }
        return commonResult;
    }
}
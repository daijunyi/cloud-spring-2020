package com.daijunyi.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.daijunyi.entities.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception)
    {
        return new CommonResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }
}

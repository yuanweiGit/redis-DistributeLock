package com.yw.lock;

import com.yw.lock.service.SeckillService;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * 功能描述: 秒杀实现
 *
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/3/29 10:33
 */
public class SeckillServiceImpl implements SeckillService {

    static Map<Long, Long> inventory;

    static {
        inventory = new HashMap<>();
        inventory.put(1001L, 1000l);
        inventory.put(1002L, 1000l);
    }

    @Override
    public void secKill(String arg1, Long arg2) {
        //这里仅作为秒杀的demo示例
        reduceInventory(arg2);
    }

    //实际情景要复杂的多，模拟秒杀操作，认为一个秒杀就是将库存减一
    public Long reduceInventory(Long commodityId) {
        inventory.put(commodityId, inventory.get(commodityId) - 1);
        return inventory.get(commodityId);
    }
}

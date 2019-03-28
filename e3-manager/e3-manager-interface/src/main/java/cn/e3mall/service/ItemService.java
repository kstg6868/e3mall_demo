package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/**
 * @method  商品service接口类
 * @create cj
 * @date 2019/3/28 0028 - 下午 3:00
 */
public interface ItemService {

    /*根据ID来查询商品*/
    TbItem getTbItemById(long itemId);

}

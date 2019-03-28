package cn.e3mall.service.impl;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @method 商品管理service实现类
 * @create cj
 * @date 2019/3/28 0028 - 下午 3:04
 */
@Service
public class ItemSeriveImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getTbItemById(long itemId) {

        //根据主键查询
/*        TbItem tbItem = TbItemMapper.selectByPrimary(itemId);*/
        //根据逆向工程方法查询
        TbItemExample  example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        //设置查询条件
        criteria.andIdEqualTo(itemId);
        //执行查询
        List<TbItem> tbItems = itemMapper.selectByExample(example);
        //判断空
        if (tbItems != null && tbItems.size()>0) {
            return tbItems.get(0);
        }
        return null;
    }
}

package cn.far.ssm.service.impl;


import cn.far.ssm.dao.ItemMapper;
import cn.far.ssm.pojo.Item;
import cn.far.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public Item findOne(int id) {
        Item one = itemMapper.findOne(id);
        return one;
    }
}

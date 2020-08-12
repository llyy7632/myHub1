package cn.far.ssm.service;

import cn.far.ssm.pojo.Item;
import org.springframework.stereotype.Service;

public interface ItemService {

    public Item findOne(int id);
}

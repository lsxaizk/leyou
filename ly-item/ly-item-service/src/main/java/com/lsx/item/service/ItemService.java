package com.lsx.item.service;

import com.lsx.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ItemService {
    public Item saveItem(Item item){
        int id =new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}

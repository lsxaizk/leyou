package com.lsx.item.controller;

import com.lsx.common.enums.ExceptionEnum;
import com.lsx.common.exception.LyException;
import com.lsx.item.pojo.Item;
import com.lsx.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("itemtest")
public class ItemController {
    @Autowired
    ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> saveItem(Item item){
        //校验价格
        if(item.getPrice()==null){
            //return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            throw new LyException(ExceptionEnum.PRICE_CANNOT_BE_NULL);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(itemService.saveItem(item));
    }

}

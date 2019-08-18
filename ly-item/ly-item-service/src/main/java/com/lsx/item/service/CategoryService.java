package com.lsx.item.service;

import com.lsx.common.enums.ExceptionEnum;
import com.lsx.common.exception.LyException;
import com.lsx.item.mapper.CategoryMapper;
import com.lsx.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryListByPid(Long pid) {
        // 查询条件，mapper会把对象中的非空属性作为查询条件
        Category t = new Category();
        t.setParentId(pid);
        List<Category> list = categoryMapper.select(t);
        //判断查询结果是否为空
        if(CollectionUtils.isEmpty(list)){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return list;
    }
}

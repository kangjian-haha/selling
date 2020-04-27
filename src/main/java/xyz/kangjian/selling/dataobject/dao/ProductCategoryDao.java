package xyz.kangjian.selling.dataobject.dao;

import xyz.kangjian.selling.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * mybatis实际用法
 *
 * @author kangjian
 * @date 2019/7/10 14:59
 */
public class ProductCategoryDao {

    @Autowired
    ProductCategoryMapper mapper;

    public int insertByMap(Map<String, Object> map) {
        return mapper.insertByMap(map);
    }


}

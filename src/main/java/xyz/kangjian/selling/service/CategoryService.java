package xyz.kangjian.selling.service;

import xyz.kangjian.selling.dataobject.ProductCategory;

import java.util.List;

/**
 * @author kangjian
 * @date 2019/6/3 20:31
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

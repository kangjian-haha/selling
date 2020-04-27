package xyz.kangjian.selling.repository;

import xyz.kangjian.selling.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author kangjian
 * @date 2019/6/2 21:03
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    ProductCategory findByCategoryId(Integer integer);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

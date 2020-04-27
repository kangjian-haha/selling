package xyz.kangjian.selling.dataobject.mapper;

import xyz.kangjian.selling.dataobject.ProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author kangjian
 * @date 2019/7/10 10:35
 */
public interface ProductCategoryMapper {

    @Insert("insert into product_category(category_name,category_type) value (#{categoryName,jdbcType=VARCHAR}, #{categoryType,jdbcType=INTEGER})")
    int insertByMap(Map<String, Object> map);

    @Insert("insert into product_category(category_name,category_type) value (#{categoryName,jdbcType=VARCHAR}, #{categoryType,jdbcType=INTEGER})")
    int insertByObject(ProductCategory productCategory);

    @Select("select * from product_category where category_type = #{categoryType}")
    @Results({
        @Result(column = "category_id",property = "categoryId"),
        @Result(column = "category_name",property = "categoryName"),
        @Result(column = "category_type",property = "categoryType"),
    })
    ProductCategory findByCategoryType(Integer categoryType);

    @Select("select * from product_category where category_name = #{categoryName}")
    @Results({
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "category_name",property = "categoryName"),
            @Result(column = "category_type",property = "categoryType"),
    })
    List<ProductCategory> findByCategoryName(String categoryName);

    /**
     * 更新
     */
    @Update("update product_category set category_name = #{categoryName} where category_type = #{categoryType}")
    int updateByCategoryType(@Param("categoryName") String categoryName,@Param("categoryType") Integer categoryType);

    @Update("update product_category set category_name = #{categoryName} where category_type = #{categoryType}")
    int updateByObject(ProductCategory productCategory);

    /**
     * 删除
     */
    @Delete("delete from product_category where category_type = #{categoryType}")
    int deleteByCategoryType(Integer categoryType);

}

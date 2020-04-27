package xyz.kangjian.selling.form;

import lombok.Data;

/**
 * @author kangjian
 * @date 2019/7/8 17:52
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字 **/
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;
}

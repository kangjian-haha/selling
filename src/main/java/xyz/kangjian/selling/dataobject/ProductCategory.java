package xyz.kangjian.selling.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.util.Date;

/**
 * 类目
 * @author kangjian
 * @date 2019/6/2 16:50
 */
@Data
@Entity
@DynamicUpdate//动态更新,主要用于管理--"更新时间"
public class ProductCategory {

    /** 类目id */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    /**
     * -GenerationType.AUTO主键由程序控制, 是默认选项 ,不设置就是这个
     * -GenerationType.IDENTITY 主键由数据库生成, 采用数据库自增长, Oracle不支持这种方式
     * -GenerationType.SEQUENCE 通过数据库的序列产生主键, MYSQL  不支持
     * -GenerationType.Table 提供特定的数据库产生主键, 该方式更有利于数据库的移植
     */

    /** 类目名字 **/
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    /** 创建时间 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time", updatable = false)
    @Generated(GenerationTime.INSERT)
    private Date createTime;

    /** 更新时间 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_time")
    @Generated(GenerationTime.ALWAYS)
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }


}

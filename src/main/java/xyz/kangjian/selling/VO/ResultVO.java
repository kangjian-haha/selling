package xyz.kangjian.selling.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 * @author kangjian
 * @date 2019/6/23 10:14
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 7456593319944750416L;

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;

}

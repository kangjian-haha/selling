package xyz.kangjian.selling.utils;

import xyz.kangjian.selling.enums.CodeEnum;

/**
 * @author kangjian
 * @date 2019/7/5 12:05
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}

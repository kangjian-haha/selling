package xyz.kangjian.selling.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 对象转Json类
 * @author kangjian
 * @date 2019/7/1 22:06
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}

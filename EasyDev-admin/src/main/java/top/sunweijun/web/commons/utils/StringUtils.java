package top.sunweijun.web.commons.utils;

import java.util.Collection;

/**
 * @BelongsProject: EasyDev-Vue
 * @BelongsPackage: top.sunweijun.web.commons.utils
 * @Author: sunweijun
 * @CreateTime: 2024-04-16  16:57
 * @Description: 字符串工具类
 * @Version: 1.0
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils{
    /**
     * * 判断一个对象是否非空
     *
     * @param object Object
     * @return true：非空 false：空
     */
    public static boolean isNotNull(Object object)
    {
        return !isNull(object);
    }

    /**
     * * 判断一个对象是否为空
     *
     * @param object Object
     * @return true：为空 false：非空
     */
    public static boolean isNull(Object object)
    {
        return object == null;
    }

    /**
     * * 判断一个Collection是否非空，包含List，Set，Queue
     *
     * @param coll 要判断的Collection
     * @return true：非空 false：空
     */
    public static boolean isNotEmpty(Collection<?> coll)
    {
        return !isEmpty(coll);
    }

    /**
     * * 判断一个Collection是否为空， 包含List，Set，Queue
     *
     * @param coll 要判断的Collection
     * @return true：为空 false：非空
     */
    public static boolean isEmpty(Collection<?> coll)
    {
        return isNull(coll) || coll.isEmpty();
    }
}

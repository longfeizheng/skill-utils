package com.niocoder.util;


import com.niocoder.emums.CodeEnmu;

/**
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public abstract class EnumUtil {
    /**
     * @param code
     * @param enumClass
     * @param <T>
     * @return
     */
    public static <T extends CodeEnmu> T getEnumByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

    /**
     * @param code
     * @param enumClass
     * @param <T>
     * @return
     */
    public static <T extends CodeEnmu> String getMessageByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each.getMessage();
            }
        }
        return null;
    }

    /**
     * @param message
     * @param enumClass
     * @param <T>
     * @return
     */
    public static <T extends CodeEnmu> Integer getCodeByMessage(String message, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (message.equalsIgnoreCase(each.getMessage())) {
                return each.getCode();
            }
        }
        return null;
    }

}

package com.workrc.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtils {
    public static Logger getInstance(Class<?> clazz){
        return LoggerFactory.getLogger(clazz);
    }
}

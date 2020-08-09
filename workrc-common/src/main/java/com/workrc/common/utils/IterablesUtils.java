package com.workrc.common.utils;


import java.util.Objects;
import java.util.function.BiConsumer;


public class IterablesUtils {
    public static <T> void forEach(Integer startIndex,Iterable<? extends T> elements, BiConsumer<Integer, ? super T> action) {
        Objects.requireNonNull(elements);
        Objects.requireNonNull(action);
        for (T element : elements) {
            action.accept(startIndex++, element);
        }
    }
}
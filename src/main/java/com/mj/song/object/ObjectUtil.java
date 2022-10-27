package com.mj.song.object;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ObjectUtil {

    public static void removeEmptyFields(Object o){
        Objects.requireNonNull(o);
        Class<?> clazz = o.getClass();

        List<Field> fields = new ArrayList<>();

        while(clazz != null){
            fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
            clazz = clazz.getSuperclass();
        }

        fields.forEach(field -> {
            try {
                field.setAccessible(true);
                if ("".equals(field.get(o))) {
                    field.set(o, null);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        clazz = null;
        fields = null;
    }
}

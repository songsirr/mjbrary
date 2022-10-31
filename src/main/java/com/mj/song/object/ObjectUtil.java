package com.mj.song.object;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class ObjectUtil {

    public static void removeEmptyFields(Object o){
        Objects.requireNonNull(o);

        List<Field> fields = getFields(o);

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

        fields = null;
    }

    /**
     * convert Map to Object
     * @param map
     * @param object
     */
    public static Object mapToObject(Map<?, ?> map, Object object){
        Objects.requireNonNull(object);
        String prefix = "set";
        StringBuilder sb = new StringBuilder();
        if (map != null) {
            for (Map.Entry<?, ?> e : map.entrySet()) {
                sb.append(prefix);
                sb.append(String.valueOf(e.getKey()).substring(0,1).toUpperCase());
                sb.append(String.valueOf(e.getKey()).substring(1));
                try {
                    Method[] methods = object.getClass().getDeclaredMethods();
                    for (Method m : methods){
                        if(sb.toString().equals(m.getName())){
                            m.setAccessible(true);
                            m.invoke(object, e.getValue());
                            sb.delete(0, sb.length());
                            break;
                        }
                    }
                } catch (SecurityException ex) {
                    ex.printStackTrace();
                } catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                } catch (InvocationTargetException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return object;
    }

    /**
     * convert Object to Map
     * @param object
     */
    public static Map objectToMap(Object object){
        try {
            Map<String, Object> map = new HashMap<>();
            List<Field> fields = getFields(object);
            for (Field f : fields){
                f.setAccessible(true);
                // skip synthetic field
                if (!f.isSynthetic()){
                    map.put(f.getName(), f.get(object));
                }
            }
            return map;
        } catch (IllegalArgumentException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    private static List<Field> getFields(Object o){
        Class<?> clazz = o.getClass();

        List<Field> fields = new ArrayList<>();

        while(clazz != null){
            fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
            clazz = clazz.getSuperclass();
        }

        return fields;
    }
}

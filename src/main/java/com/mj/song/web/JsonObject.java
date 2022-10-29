package com.mj.song.web;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JsonObject {

    private final Map<String, Object> map;

    public JsonObject() {
        this.map = new HashMap<>();
    }

    public JsonObject(Map<?, ?> m) {
        if (m == null) {
            this.map = new HashMap<String, Object>();
        } else {
            this.map = new HashMap<String, Object>(m.size());
            for (final Entry<?, ?> e : m.entrySet()) {
                if(e.getKey() == null) {
                    throw new NullPointerException("Null key.");
                }
                final Object value = e.getValue();
                if (value != null) {
                    this.map.put(String.valueOf(e.getKey()), value);
                }
            }
        }
    }
}

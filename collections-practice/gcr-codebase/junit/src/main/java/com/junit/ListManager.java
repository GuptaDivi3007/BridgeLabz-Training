package com.junit;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    private List<String> list = new ArrayList<>();

    public void addItem(String item) {
        list.add(item);
    }
    public void removeItem(String item) {
        list.remove(item);
    }
    public int size() {
        return list.size();
    }
    public boolean contains(String item) {
        return list.contains(item);
    }
}

package com.problem.dsa;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCacheImpl {
    HashMap<Integer, String> data = new HashMap<>();
    LinkedList<Integer> order = new LinkedList<>();
    int capacity;

    LRUCacheImpl(int capacity){
        this.capacity = capacity;
    }

    public static void main(String arg[]) {
        LRUCacheImpl cache = new LRUCacheImpl(3);
        cache.put(1,"one");
        cache.put(3,"three");
        cache.put(4,"four");
        cache.get(3);
        cache.put(2,"two");
        cache.display();
    }

    void put(int key, String value){
        if(order.size() >= capacity){
            int keyRemoved = order.removeLast();
            data.remove(keyRemoved);
        }
        order.addFirst(key);
        data.put(key,value);
    }

    String get(int key){
        String res = data.get(key);
        if(res != null){
            order.remove((Object) key);
            order.addFirst(key);
        } else {
            res = null;
        }
        return res;
    }

    public void display() {
        for(int i = 0; i< order.size(); i++)
        {
            int key = order.get(i);
            System.out.println(key + " => " + data.get(key));
        }
    }
}

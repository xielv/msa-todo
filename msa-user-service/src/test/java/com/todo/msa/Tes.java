package com.todo.msa;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by rochuan on 2017/6/5.
 */
public class Tes {
    public static void main(String[] args) {

        int j = 0;
        for (int i = 0;i<30;i++){
            j = ++j;
        }

        System.out.printf("j = " + j);
        String text = "abc12a3fe1a1";

        LinkedHashMap<String , Object> hashMap = new LinkedHashMap<String , Object>();
        char[] array = text.toCharArray();
        for (char f: array)
        {
            if (hashMap.containsKey(String.valueOf(f))){
                System.out.printf("" + String.valueOf(f));
                return;
            }else {
                hashMap.put(String.valueOf(f) , null);
            }
        }
    }
}

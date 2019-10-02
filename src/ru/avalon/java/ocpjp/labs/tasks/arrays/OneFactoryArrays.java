package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.common.Factory;

public class OneFactoryArrays implements Factory<int[]>{

    @Override
    public int[] create() {
        int RandomLenght = 10 + (int)(Math.random()*20);
        int[] arr = new int[RandomLenght];
        for (int i = 0; i < RandomLenght; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }
    
}

package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

public class SortOneArrays implements Sort<int[]>{

    @Override
    public void run(int[] dataSet) {
        Arrays.sort(dataSet);
    }
    
}

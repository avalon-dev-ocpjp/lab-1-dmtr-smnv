package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import java.util.Arrays;

import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

public class OneArraysWriter implements ObjectWriter<int[]> {

    @Override
    public void write(int[] object) throws IOException {
        System.out.println(Arrays.toString(object));
    }

    @Override
    public void close() throws IOException {}
    
}

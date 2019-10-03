package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CitizenSource implements Iterable<Citizen>{

    private List<Citizen> citizen;

    public CitizenSource() {
    Random random = new Random();
    citizen = new ArrayList<>();
    int count = random.nextInt(10)+20;
    for(int i=0; i < count; i++) {
        citizen.add(new RandomCitizen().create());
	        }        
    }

    @Override
    public Iterator<Citizen> iterator() {
        return citizen.iterator();
    }
    
}

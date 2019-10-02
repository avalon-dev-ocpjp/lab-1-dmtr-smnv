package ru.avalon.java.ocpjp.labs.tasks.objects;

public class CitizenFactory implements Citizen{

    private Country country;
    private String name;
    private String lastName;
    
    public CitizenFactory (Country country, String name, String lastName) {
        this.country = country;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    
}

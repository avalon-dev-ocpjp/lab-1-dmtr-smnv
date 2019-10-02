package ru.avalon.java.ocpjp.labs.tasks.objects;

public class CountryFactory implements Country {

    private String code;
    private String name;
    
    CountryFactory (String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }
    
}

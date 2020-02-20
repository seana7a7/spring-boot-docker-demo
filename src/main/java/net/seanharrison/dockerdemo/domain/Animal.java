package net.seanharrison.dockerdemo.domain;

public class Animal {

    private String species;
    private String type;

    public Animal(String species, String type) {
        this.species = species;
        this.type = type;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "{" + " species='" + getSpecies() + "'" + ", type='" + getType() + "'" + "}";
    }

}
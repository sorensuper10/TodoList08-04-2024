package com.example.todolist08042024.model;

public class Opgave {
    private long id;
    private String beskrivelse;

    public Opgave() {
    }

    public Opgave(long id, String beskrivelse) {
        this.id = id;
        this.beskrivelse = beskrivelse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
}

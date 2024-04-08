package com.example.todolist08042024.Usecase;

import com.example.todolist08042024.model.Opgave;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Opgaveusecase {
    ArrayList<Opgave> opgaveArrayList = new ArrayList<>();
    AtomicLong counter = new AtomicLong();

    public void addAssignment(Opgave opgave) {
        opgave.setId(counter.incrementAndGet());
        opgaveArrayList.add(opgave);
    }

    public List<Opgave> hentalleopgaver() {
        return opgaveArrayList;
    }
}

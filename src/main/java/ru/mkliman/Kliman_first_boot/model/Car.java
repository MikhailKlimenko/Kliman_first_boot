package ru.mkliman.Kliman_first_boot.model;

import java.util.*;

public class Car {

    Set<Model> models = new HashSet<>();

    List<SimilarModels> similarModels = new ArrayList<>();


    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }

    public List<SimilarModels> getSimilarModels() {
        return similarModels;
    }

    public void setSimilarModels(List<SimilarModels> similarModels) {
        this.similarModels = similarModels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return models.equals(car.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(models);
    }
}

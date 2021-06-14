package io.muic.ooc.fab;

import java.awt.*;

public enum AnimalType {
    RABBIT(0.08, Rabbit.class, Color.orange),
    FOX(0.02, Fox.class, Color.blue),
    TIGER(0.02, Tiger.class, Color.RED),
    HUNTER(0.02, Hunter.class, Color.green);


    private double breedingProbability;

    private Class animalClass;

    private Color color;

    AnimalType(double breedingProbability, Class animalClass, Color color){
        this.breedingProbability = breedingProbability;
        this.animalClass = animalClass;
        this.color = color;
    }

    public double getBreedingProbability() {
        return breedingProbability;
    }

    public Class getAnimalClass() {
        return animalClass;
    }

    public Color getColor() {
        return color;
    }
}
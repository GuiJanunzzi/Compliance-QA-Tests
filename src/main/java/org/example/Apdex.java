package org.example;

public class Apdex {

    public float calcular(float satisfatorio, float toleravel, float amostras){
        return (satisfatorio + (toleravel/2)) / amostras;
    }
}

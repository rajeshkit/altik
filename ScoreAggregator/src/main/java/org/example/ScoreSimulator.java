package org.example;

public class ScoreSimulator {
    public float calculateCgpa(float score){
        return score/100*10;
    }
    public float nonCurricularCgpa(float score){
        return score/70*100;
    }
}

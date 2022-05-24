package com.example.myapplication3

data class Pacient (
    public val FIO: String,
    public val Gender: String,
    public val Birth: UInt,
    public val City: String,
    public val Diagnosis: String
) {/*
    override fun toString(): String {
        return  "FIO: " + FIO +
                ", Gender: " + Gender +
                ", Birth: " + Birth +
                ", City: " + City +
                ", Diagnosis: " + Diagnosis
    }*/
}

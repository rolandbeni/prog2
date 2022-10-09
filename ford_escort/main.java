package com.demo.lesson4.exercises.ford_escort;

import com.demo.lesson4.exercises.biostats.CSVReader;

import java.io.FileNotFoundException;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        reader csvReader = new reader();
        csvReader.printCars();
}

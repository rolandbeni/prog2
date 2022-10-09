package com.demo.lesson4.exercises.ford_escort;

import com.demo.lesson4.exercises.biostats.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reader {
    public void printCars() throws FileNotFoundException {
        List<ford_escort> carsList = readcarsFromCSV();

        for(ford_escort car: carList) {
            System.out.println(car);
        }
    }

    private List<ford_escort> readcarsFromCSV() throws FileNotFoundException {
        List<ford_escort> result = new ArrayList<>();
        File file = new File("C:\\DE\\Code\\Lessons\\src\\com\\demo\\lesson4\\ford_escort\\ford_escort.csv");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("\n");
        if(scanner.hasNext()){
            scanner.nextLine();
        }

        while(scanner.hasNext()) {
            result.add(convertToford_escort(scanner.nextLine()));
        }

        return result;
    }


    private Person convertToford_escort(String line) {
        String[] fields = line.split(",\\s+");
        ford_escort car = new ford_escort();
        ford_escort.setYear(Integer.parseInt(fields[0]));
        ford_escort.setMileage(Integer.parseInt(fields[1]));
        ford_escort.setPrice(Integer.parseInt(fields[2]));
        return ford_escort;
    }

}

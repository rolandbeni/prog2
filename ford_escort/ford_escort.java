package com.demo.lesson4.exercises.ford_escort;

public class ford_escort {

    private int Year;
    private int Milaege;
    private int Price;

    public Person() {
    }

    public Person(int Year, int Mileage, int Price ) {
        this.Year = Year;
        this.Milaege = Mileage;
        this.Price = Price;
    }

    public int getYear() {
        return Year;
    }
    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMilaege() {
        return Milaege;
    }

    public void setMileage(int Mileage) {
        this.Milaege = Mileage;
    }

    public int getPrice() {
        return Price;
    }

    public void set(int Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "Year='" + Year + '\'' +
                ", Mileage='" + Milaege + '\'' +
                ", Price=" + Price +
                '}';
    }

    public void given_year(int y){



        for (ford_escort i:carList){
            if (i.Year>y){
                System.Out.Println(i);
            }

        }

    }
    public void given_m(int m, int n){
        for (ford_escort i:carList){
            if (i.Milaege>m, & i.Milaege<n){
                System.Out.Println(i);
            }

        }

    }
}
}

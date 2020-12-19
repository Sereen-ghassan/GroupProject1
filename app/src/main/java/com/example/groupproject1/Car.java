package com.example.groupproject1;

public class Car {
    private String nameCar;
    private String Color;
    private String Manufactorer;
    private int imageID;
    private String Year;
    private int id;
     static Car [] cars = {
            new Car( "BMW" , "Black , white", "Germany","2017",R.drawable.bmw),
            new Car("Porsche" , "Green", "Germany","2019",R.drawable.porsche),
            new Car("Audi" , "Blue", "Germany","2019",R.drawable.audi),
            new Car("Chevrolet" , "white", "USA","2015",R.drawable.chevrolet),
            new Car("Ford" , "Red", "UK","2018",R.drawable.ford),
            new Car("Golf Car" , "white", "china","2014",R.drawable.golf_car),
            new Car("Golf" , "Yellow", "Italy","2017",R.drawable.golf),
            new Car("Mercedes" , "White", "Germany","2020",R.drawable.mercedes),
            new Car("MiniCober" , "Black", "UK","2019",R.drawable.minicober),
            new Car("RangeRover" , "Blue", "Germany","2017",R.drawable.rangerover),
            new Car("Tesla" , "White", "Germany","2021",R.drawable.tesla),
    };

    public Car( String nameCar, String color, String manufactorer, String year,int imageID) {
        this.nameCar = nameCar;
        this.Color = color;
        this.Manufactorer = manufactorer;
        this.Year = year;
        this.imageID=imageID;
        this.id=id;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getManufactorer() {
        return Manufactorer;
    }

    public void setManufactorer(String manufactorer) {
        Manufactorer = manufactorer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}

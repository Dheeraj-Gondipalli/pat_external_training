public class sample {
    
}

class Bike{
    String name;
    String model;
    int year;
    public Bike(String name, String model, int year){
        this.name = name;
        this.year = year;
        this.model = model;
    }
}

class Dealer{
    Bike b1 = new Bike("meteor", "350", 2020);
    Bike b2 = new Bike("bullet", "350", 2020);
    Bike b3 = new Bike("Classic", "500", 2022);

}


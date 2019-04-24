
//creating our class
public class Toys {
    public String name;
    public String size;
    public double price;
    public String baby_gender;
    public int baby_age;
// creating constructor
    public Toys(){
        name="";
        size="";
        price=0;
        baby_gender="";
        baby_age=0;
    }
    public Toys(String name, String size, double price, String baby_gender, int baby_age){
        this.name=name;
        this.size=size;
        this.price=price;
        this.baby_gender=baby_gender;
        this.baby_age=baby_age;
    }

     //function for display our objects
    public void Display(){
        System.out.println(this.name + " " + this.size + " " + this.price + " " + this.baby_gender + " " + this.baby_age);
    }
    //function for search objects in some diapasons

    public void Search(double start_price, double end_price) {

        if (this.price > start_price && this.price < end_price) {

            Display();
        }
    }

}

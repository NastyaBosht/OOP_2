import java.util.ArrayList;



public class Main {
    //function for sorting ArrayList
    public static void sort (ArrayList<Toys> toys) {
        double buf;
        for (int i = 0; i < toys.size() - 1; i++) {
            if (toys.get(i).price > toys.get(i + 1).price) {
                buf = toys.get(i).price;
                toys.get(i).price = toys.get(i + 1).price;
                toys.get(i + 1).price = buf;
            }
        }
        for (int i = 0; i < toys.size(); i++) {
            toys.get(i).Display();
        }
    }


    public static void main(String[] args) {
        // creating object
        Toys t_1 = new Toys("doll","medium",150,"girl",8);
        Toys t_2 = new Toys("car","small", 45,"boy",5);
        Toys t_3 = new Toys("train","medium",99.2, "boy", 7);
        // creating ArrayList
        ArrayList<Toys> toys = new ArrayList<>();
        //add to ArrayList our objects
        toys.add(t_1);
        toys.add(t_2);
        toys.add(t_3);
         // call function "sort"
          System.out.println("Відсортовані значення за ціною");
            sort(toys);
            System.out.println("Значення в веденому діапазоні");
        for(int i=0; i<toys.size(); i++){
            toys.get(i).Search(30,50);
        }

          }
}

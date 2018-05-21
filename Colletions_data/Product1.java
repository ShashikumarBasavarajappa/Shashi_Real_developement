
public class Product1 {
    
    private final String name;
    private final int weight;

    public Product1(String name, int weight){
        this.name = name;
        this.weight =  weight;
        

    }
    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return "name = " + name + "weight = " + weight;
    }
}
public class Fruits {
    private String name;
    private String colour;
    private float weight;

    public Fruits(String name, String colour, float weight){
        this.name = name;
        this.colour = colour;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}


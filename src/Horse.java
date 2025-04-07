public class Horse implements Animal{
    private Integer legs;
    private String sound;
    private String food;
    private String color;

    public Horse(Integer legs, String sound, String food, String color){
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Animal clone() {
        return new Horse(this.legs,this.sound,this.food,this.color);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}

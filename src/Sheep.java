public class Sheep implements Animal{
    private Integer legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(Integer legs,String sound,String food,String name){
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(this.legs, this.sound, this.food, this.name);
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}

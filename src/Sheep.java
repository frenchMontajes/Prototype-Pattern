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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(legs, sound, food, name);
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " says " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}

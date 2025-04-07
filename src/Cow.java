public class Cow implements Animal{
    private Integer legs;
    private String sound;
    private String food;

    public Cow(Integer legs, String sound, String food){
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    @Override
    public Animal clone() {
        return new Cow(legs,food,food);
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " says " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}

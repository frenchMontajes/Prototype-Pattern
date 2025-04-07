public class TestAnimal {
    public static void main(String[] args) {
        
        AnimalRegistry registry = new AnimalRegistry();

        Animal jack = registry.createSheep("jack");
        jack.makeSound();

        Animal cow = registry.createCow();
        cow.makeSound();

        Animal horse = registry.createHorse();
        horse.makeSound();
    }
}

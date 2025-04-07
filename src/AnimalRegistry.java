public class AnimalRegistry {
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;


    public AnimalRegistry() {
        this.sheepPrototype = new Sheep(4,"Baa,Baa..","Grass","jake");
        this.cowPrototype = new Cow(4,"Moo,Moo..","Hay");
        this.horsePrototype = new Horse(4,"neigh..","Grass,Hay","Black");
    }

    public Animal createSheep(String name){
        Sheep cloned = (Sheep) sheepPrototype.clone();
        cloned.setName(name);
        return cloned;
    }

    public Animal createCow(){
        return cowPrototype;
    }

    public Animal createHorse(){
        return horsePrototype;
    }
}

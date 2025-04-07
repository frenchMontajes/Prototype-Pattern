public class AnimalRegistry {
    private Sheep sheepPrototype = new Sheep(4,"Baa, Baa","Grass","jake");
    private Cow cowPrototype = new Cow(4,"Moo,Moo..","Hay");
    private Horse horsePrototype = new Horse(4,"neigh","Grass,Hay","Black");

    public AnimalRegistry(Sheep sheepPrototype, Cow cowPrototype, Horse horsePrototype){
        this.sheepPrototype = sheepPrototype;
        this.cowPrototype = cowPrototype;
        this.horsePrototype = horsePrototype;
    }

    public Animal createSheep(String name){
        return ;
    }

    public Animal createCow(){

    }

    public Animal createHorse(){

    }
}

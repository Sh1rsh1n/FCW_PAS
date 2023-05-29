public class Cat extends Pet {

    private String breed;
    private List<Command> commandList;
    
    public Cat(int id, String nikname, LocalDateTime birthday, String colour, int ownerId, boolean hasPetHouse, String breed) {
        super(id, nikname, birthday, colour, ownerId, hasPetHouse);
        this.breed = breed;
        commandList = new ArrayList<>();
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public List<Command> getCommandList() {
        return commandList;
    }
}
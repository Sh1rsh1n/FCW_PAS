

public class Horse extends Pack {

    private String purpose;
    private String breed;
    private List<Command> commandList;

    public Horse(int id, String nikname, LocalDateTime birthday, String colour, int ownerId, int loadCapacity, int maxSpeed, String purpose, String breed) {
        super(id, nikname, birthday, colour, ownerId, loadCapacity, maxSpeed);
        this.purpose = purpose;
        this.breed = breed;
        commandList = new ArrayList<>();
    }
    
    public String getPurpouse() {
        return purpose;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public List<Command> getCommandList() {
        return commandList;
    }
}
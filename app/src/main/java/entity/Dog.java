

public class Dog extends Pet {

    private String purpose;
    private List<Command> commandList;
    
    public Cat(int id, String nikname, LocalDateTime birthday, String colour, int ownerId, boolean hasPetHouse, String purpose) {
        super(id, nikname, birthday, colour, ownerId, hasPetHouse);
        this.purpose = purpose;
        commandList = new ArrayList<>();
    }
    
    public String getPurpose() {
        return purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    public List<Command> getCommandList() {
        return commandList;
    }
}
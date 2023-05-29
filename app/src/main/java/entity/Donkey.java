

public class Donkey extends Pack {

    private List<Command> commandList;
    
    public Donkey(int id, String nikname, LocalDateTime birthday, String colour, int ownerId, int loadCapacity, int maxSpeed) {
        super(id, nikname, birthday, colour, ownerId, loadCapacity, maxSpeed);
        commandList = new ArrayList<>();
    }
    
    public List<Command> getCommandList() {
        return commandList;
    }
}
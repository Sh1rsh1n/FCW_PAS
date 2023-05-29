

public class Camel extends Pack {

    private int humpsAmount;
    private List<Command> commandList;
    
    public Camel(int id, String nikname, LocalDateTime birthday, String colour, int ownerId, int loadCapacity, int maxSpeed, int humpsAmount) {
        super(id, nikname, birthday, colour, ownerId, loadCapacity, maxSpeed);
        this.humpsAmount = checkHumpsAmount(humpsAmount);
        commandList = new ArrayList<>();
    }
    
    public int getHumpsAmount() {
        return humpsAmount;
    }
    
    public void setHumpsAmount(int humpsAmount) {
        this.humpsAmount = checkHumpsAmount(humpsAmount);
    }
    
    public List<Command> getCommandList() {
        return commandList;
    }
    
    private int checkHumpsAmount(int humpsAmount) {
        if (humpAmount == 1)
            return humpAmount;
        if (humpAmount == 2)
            return humpAmount;
        throw new RuntimeException("У верблюда может быть только 1 или 2 горба"); 
    }
}
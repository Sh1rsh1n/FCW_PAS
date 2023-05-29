

public abstract class Pack extends Animal {

    protected int loadCapacity;
    protected int maxSpeed;
    
    public Pack(int id, String nikname, LocalDateTime birthday, String colour, int ownerId, int loadCapacity, int maxSpeed) {
        super(id, nikname, birthday, colour, ownerId);
        this.loadCapacity = loadCapacity;
        this.maxSpeed = maxSpeed;
    }
    
    public int getLoadCapacity() {
        return loadCapacity; 
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }
    
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
}
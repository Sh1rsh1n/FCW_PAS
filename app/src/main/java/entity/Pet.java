public class Pet extends Animal {
    protected boolean hasPetHouse;
    
    public Pet(int id, String nikname, LocalDateTime birthday, String colour, int ownerId, boolean hasPetHouse) {
        super(id, nikname, birthday, colour, ownerId);
        this.hasPetHouse = hasPetHouse;
    }
    
    public boolean getHasPetHouse() {
        return hasPetHouse;
    }
    
    public void setHasPetHouse(boolean hasPetHouse) {
        this.hasPetHouse = hasPetHouse;
    }
}
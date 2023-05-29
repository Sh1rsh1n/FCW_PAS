

public abstract class Animal {

    protected int id;
    protected String nikname;
    protected LocalDateTime birthday;
    protected String colour;
    protected int ownerId;
    
    public Animal(int id, String nikname, LocalDateTime birthday, String colour, int ownerId){
        this.id = id;
        this.nikname = nikname;
        this.birthday = birthday;
        this.colour = colour;
        this.ownerId = ownerId;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNikname() {
        return nikname;
    }
    
    public LocalDateTime getBirthday() {
        return birthday;
    }
    
    public String getColour() {
        return colour;
    }
    
    public int getOwnerId() {
        return ownerId;
    }
    
    public void setNikname(String nikname) {
        this.nikname = nikname;
    }
    
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    
    
}
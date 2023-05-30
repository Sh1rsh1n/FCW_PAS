package shirshin.human_friends.model;



public abstract class Pet extends HumanFriend{
    
    protected String breed;
    
    public Pet(){
        super();
    }
    
    public Pet(int id, String nikname, LocalDateTime birthday, String colour, String breed){
        super(id, nikname, birthday, colour);
        this.breed = breed;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public void setBreed(String breed){
        this.breed = breed;
    }
}
package shirshin.human_friends.model;



public abstract class HumanFriend {
    
    protected int id;
    
    protected String nikname;
    
    protected LocalDateTime birthday;
    
    protected String colour;
    
    protected List<String> commandsList;
    
    public HumanFriend(){
    }
    
    public HumanFriend(int id, String nikname, LocalDateTime birthday, String colour) {
        this.id = id;
        this.nikname = nikname;
        this.birthday = birthday;
        this.colour = colour;
        commandsList = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }
    
    public String getNikname(){
        return nikname;
    }
    
    public void setNikname(String nikname){
        this.nikname = nikname;
    }
    
    public LocalDateTime getBirthday(){
        return birthday;
    }
    
    public void setBirthday(LocalDateTime birthday){
        this.birthday = birthday;
    }
    
    public String getColour(){
        return colour;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public List<String> getCommandsList(){
        List<String> list = new ArrayList<>(commandsList);
        return list;
    } 
    
    public void addCommand(String command){
        commandsList.add(command);
    }
    
    
}
package shirshin.human_friends.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class HumanFriend {
    
    protected int id;
    
    protected String nikname;
    
    protected LocalDate birthday;
    
    protected String colour;
    
    protected List<String> commandsList;
    
    public HumanFriend(){
    }
    
    public HumanFriend(int id, String nikname, LocalDate birthday, String colour) {
        this.id = id;
        this.nikname = nikname;
        this.birthday = birthday;
        this.colour = colour;
        commandsList = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNikname(){
        return nikname;
    }
    
    public void setNikname(String nikname){
        this.nikname = nikname;
    }
    
    public LocalDate getBirthday(){
        return birthday;
    }
    
    public void setBirthday(LocalDate birthday){
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

    @Override
    public String toString() {
        return "HumanFriend{" +
                "nikname='" + nikname + '\'' +
                ", birthday=" + birthday +
                ", colour='" + colour + '\'' +
                ", commandsList=" + commandsList +
                '}';
    }
}
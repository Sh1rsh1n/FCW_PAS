package shirshin.final_task.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class HumanFriend {

    protected int id;
    protected String nikname;
    protected LocalDateTime birthday;
    protected String colour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public LocalDateTime getBirthdayDate() {
        return birthday;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "HumanFriend{" +
                "id=" + id +
                ", nikname='" + nikname + '\'' +
                ", birthday=" + birthday +
                ", colour='" + colour + '\'' +
                '}';
    }
}

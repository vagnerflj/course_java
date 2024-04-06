package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String username;
    private Date moment;

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        LogEntry other = (LogEntry) obj;
        if(username == null){
            if(other.username != null)
                return false;
        }else if(!username.equals(other.username))
            return false;
        return true;
    }
}

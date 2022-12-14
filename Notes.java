import java.util.*;
import java.time.*;

public class Notes implements Comparable<Notes>{
    private LocalTime Time;
    private String Text;
    public Notes(LocalTime Time, String Text){
        this.Text = Text;
        this.Time = Time;
    }
    public LocalTime getTime(){
        return Time;
    }
    public String getText(){
        return Text;
    }
    public int compareTo(Notes other){
        if(this.Time.compareTo(other.getTime())==1){
            return 1;
        }
        else{
            if(this.Time.compareTo(other.getTime())==0){
                return 0;
            }
            else{
                return -1;
            }
            
        }
    }
}

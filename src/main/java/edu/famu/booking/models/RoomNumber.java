package edu.famu.booking.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

@Data //creates setters and getters automatically
@AllArgsConstructor //creates constructor with all values automatically
@NoArgsConstructor //creates no argument constructor automatically
public class RoomNumber {
    private String id;
    private int number;
    private ArrayList<Date> unavailableDates;
    public JSONObject getJSONObject(){
        JSONObject obj = new JSONObject();
        obj.append("id",id);
        obj.append("number",number);
        obj.append("unavailableDates", unavailableDates);
        return obj;
    }
}
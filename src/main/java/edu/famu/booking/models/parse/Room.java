package edu.famu.booking.models.parse;

import edu.famu.booking.models.RoomNumber;
import edu.famu.booking.models.Serializable.SerializableRoom;
import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;

import java.util.ArrayList;

@ParseClassName("Room")
public class Room extends ParseObject {
    final static String ID= "id";
    final static String TITLE = "title";
    final static String PRICE = "price";
    final static String MAXPEOPLE = "maxPeolpe";
    final static String ROOMNUMBERS = "roomNumbers";

    public String getId() {
        return getString(ID);
    }
    public void setId(String id) {
        put(ID, id);
    }
    public String getTitle() {
        return getString(TITLE);
    }
    public void setTitle(String title) {
        put(TITLE, title);
    }
    public double getPrice() {
        return getDouble(PRICE);
    }
    public void setPrice(String price) {
        put(PRICE, price);
    }
    public int getMaxPeople() {
        return getInt(MAXPEOPLE);
    }
    public void setMaxPeople(int maxPeople) {
        put(MAXPEOPLE, maxPeople);
    }
    public ArrayList<RoomNumber> getRoomNumbers()
    {
        return (ArrayList<RoomNumber>) get(ROOMNUMBERS);
    }
    public void setRoomNumbers(ArrayList<RoomNumber> roomNumbers)
    {
        JSONArray items = new JSONArray();
        for(RoomNumber c : roomNumbers)
            items.put(c.getJSONObject());

        put(ROOMNUMBERS, items);
    }



    public SerializableRoom getSerializable() {
        return new SerializableRoom(getId(), getTitle(), getPrice(), getMaxPeople(), getRoomNumbers()
        );
    }
}

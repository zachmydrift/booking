package edu.famu.booking.models.Serializable;

import edu.famu.booking.models.RoomNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data //creates setters and getters automatically
@AllArgsConstructor //creates constructor with all values automatically
@NoArgsConstructor //creates no argument constructor automatically
public class SerializableUser {
    private String id;
    private String username;
    private String email;
    private String country;
    private String img;
    private String city;
    private String phone;
    private boolean isAdmin;
}

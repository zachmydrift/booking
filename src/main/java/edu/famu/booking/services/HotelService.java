package edu.famu.booking.services;

import edu.famu.booking.models.parse.Hotel;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.Parse;
import org.parse4j.ParseException;
import org.parse4j.ParseQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    protected final Log logger = LogFactory.getLog(this.getClass()); //used to write to the console

    public ArrayList<Hotel> retrieveHotels()
    {

        logger.info(Parse.isIsRootMode());
        final ArrayList<Hotel> hotels = new ArrayList<>();

        ParseQuery<Hotel> query = ParseQuery.getQuery(Hotel.class);

        try {
            List<Hotel> list = query.find();
            for (Hotel p : list) {
                hotels.add(p);
            }
        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }
        logger.info(hotels.size());
        return hotels;
    }

    public Hotel getHotelById(String id)
    {
        Hotel hotel = null;

        ParseQuery<Hotel> query = ParseQuery.getQuery(Hotel.class);

        try{
            hotel = query.get(id);
        }catch (ParseException e)
        {
            e.printStackTrace();
        }

        return hotel;
    }
}

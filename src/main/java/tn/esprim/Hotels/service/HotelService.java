package tn.esprim.Hotels.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.Hotels.model.Hotel;
import tn.esprim.Hotels.repository.HotelRepository;
import java.util.List;
import java.util.Optional;

@Service
public class HotelService {
    
    @Autowired
    private HotelRepository hotelRepository;
    
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
    
    public Optional<Hotel> getHotelById(String id) {
        return hotelRepository.findById(id);
    }
    
    public List<Hotel> getHotelsByLocation(String location) {
        return hotelRepository.findByLocation(location);
    }
    
    public List<Hotel> getHotelsByStars(String stars) {
        return hotelRepository.findByStars(stars);
    }
    
    public List<Hotel> getHotelsByMaxPrice(String price) {
        return hotelRepository.findByPriceLessThanEqual(price);
    }
    
    public List<Hotel> getHotelsByLocationAndStars(String location, String stars) {
        return hotelRepository.findByLocationAndStars(location, stars);
    }
    
   /* public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
    
  /*  public void deleteHotel(String id) {
        hotelRepository.deleteById(id);
    }*/
} 
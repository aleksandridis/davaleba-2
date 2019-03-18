import java.util.ArrayList;
import java.util.List;

public class Hotel {
  private String name;
  private String city;
  private String country;
  private int stars;

    public Hotel(String name, String city, String country, int stars) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
    List<Room>rooms=new ArrayList<>();
}

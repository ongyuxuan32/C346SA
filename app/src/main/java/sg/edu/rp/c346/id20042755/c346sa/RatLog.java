//Ong Yu Xuan 20042755
package sg.edu.rp.c346.id20042755.c346sa;

public class RatLog {
    private int number;
    private String place;

    public void TemperatureLog(int number, String place) {
        this.number = number;
        this.place = place;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}


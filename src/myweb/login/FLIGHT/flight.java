package myweb.login.FLIGHT;

public class flight {
    private String flightNum;
    private int price;
    private int numSeats;
    private int numAvail;
    private String FromCity;
    private String ArriveCity;

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getNumAvail() {
        return numAvail;
    }

    public void setNumAvail(int numAvail) {
        this.numAvail = numAvail;
    }

    public String getFromCity() {
        return FromCity;
    }

    public void setFromCity(String fromCity) {
        FromCity = fromCity;
    }

    public String getArriveCity() {
        return ArriveCity;
    }

    public void setArriveCity(String arriveCity) {
        ArriveCity = arriveCity;
    }


}

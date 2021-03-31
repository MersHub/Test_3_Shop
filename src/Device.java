public class Device {

    private String brand ;
    private String country_of_origin ;
    private int cost ;

    Device (String brand, String country_of_origin, int cost) {

        this.brand = brand ;
        this.country_of_origin = country_of_origin;
        this.cost = cost;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }

    public String getCountry_of_origin() {
        return country_of_origin;
    }
    @Override
    public String toString() {
        return "Device : " +
                "brand = '" + brand + '\'' +
                ", country_of_origin = '" + country_of_origin + '\'' +
                ", cost = " + cost ;
    }


}

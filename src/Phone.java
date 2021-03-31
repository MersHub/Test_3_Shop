public class Phone extends Device {
    public Phone(String brand, String country_of_origin, int cost) {

        super(brand, country_of_origin, cost);
    }
    @Override
    public void setCountry_of_origin(String country_of_origin) {
        super.setCountry_of_origin(country_of_origin);
    }

    @Override
    public String getCountry_of_origin() {
        return super.getCountry_of_origin();
    }

    @Override
    public void setCost(int cost) {
        super.setCost(cost);
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }
}

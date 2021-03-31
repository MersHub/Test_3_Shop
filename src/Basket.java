import java.util.ArrayList;
import java.util.List;

public class Basket {

    private  List<Device> devices = new ArrayList<>();

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void addDevice (Device device) {
        devices.add(device);
    }

    @Override
    public String toString() {
        return "Basket : " +
                devices ;

    }


}
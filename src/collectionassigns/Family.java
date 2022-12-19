package collectionassigns;

public class Family {
    private String name;
    private String address;
    private int aptNo;
    private String cityName;
    public Family(String name,String address,int aptNo,String cityName){
        this.name = name;
        this.address = address;
        this.aptNo = aptNo;
        this.cityName = cityName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAptNo() {
        return aptNo;
    }

    public void setAptNo(int aptNo) {
        this.aptNo = aptNo;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", aptNo=" + aptNo +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}

package question29.ken;

public class Ken {

    private String prefecture;
    private String city;
    private double area;

    public Ken(String prefecture, String city, double area) {
        this.prefecture = prefecture;
        this.city = city;
        this.area = area;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public String getCity() {
        return city;
    }

    public double getArea() {
        return area;
    }
}


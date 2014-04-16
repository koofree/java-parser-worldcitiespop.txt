package worldcitiespop;

public class WorldCitiesPop {
    public final String country;
    public final String city;
    public final String accentCity;
    public final String region;
    public final String population;
    public final String latitude;
    public final String longitude;

    public WorldCitiesPop(String country, String city, String accentCity, String region, String population, String latitude, String longitude) {
        this.country = country;
        this.city = city;
        this.accentCity = accentCity;
        this.region = region;
        this.population = population;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "WorldCitiesPop{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", accentCity='" + accentCity + '\'' +
                ", region='" + region + '\'' +
                ", population='" + population + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}

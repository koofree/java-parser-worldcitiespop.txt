package worldcitiespop;

import java.util.HashSet;

public class World {
    public final String country;
    public final HashSet<String> cities;

    public World(String country) {
        this.country = country;
        this.cities = new HashSet<String>();
    }

    @Override
    public String toString() {
        String result = country + "=";
        for (String city : cities) {
            result += city + ",";
        }
        return result.substring(0, result.length() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        World world = (World) o;

        if (!country.equals(world.country)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return country.hashCode();
    }
}

package worldcitiespop;

public class ResourceBinder {

    public WorldCitiesPop bind(String raw) {
        String[] splitRaw = raw.split(",");
        if (splitRaw.length != 7) {
            throw new ParsingException("Wrong File Type Exception of [" + raw + "]");
        }
        return new WorldCitiesPop(splitRaw[0], splitRaw[1], splitRaw[2], splitRaw[3], splitRaw[4], splitRaw[5], splitRaw[6]);
    }
}

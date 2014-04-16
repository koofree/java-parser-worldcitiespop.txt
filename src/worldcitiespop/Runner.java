package worldcitiespop;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) {
        System.out.println("[worldcitiespop.txt] parsing start...");
        String outputFilePath = null;
        if (args.length > 1) {
            outputFilePath = args[1];
            System.out.println("output file path is [" + outputFilePath + "]");
        }

        World world = null;
        ResourceFileReader reader = null;
        OutputFileWriter writer = null;
        try {
            ResourceBinder binder = new ResourceBinder();
            reader = new ResourceFileReader();
            if (outputFilePath != null) writer = new OutputFileWriter(outputFilePath);
            else writer = new OutputFileWriter();
            String line;
            while ((line = reader.read()) != null) {
                WorldCitiesPop data = binder.bind(line);

                if (world != null && world.country.equals(data.country)) {
                    world.cities.add(data.city);
                } else {
                    if (world != null) writer.write(world.toString());
                    System.out.println("country[" + data.country + "] file writing...");
                    world = new World(data.country);
                    world.cities.add(data.city);
                }

                if (reader.getCount() % 1000 == 0) {
                    System.out.print(".");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParsingException e) {
            System.out.println(e.getMessage());
        } finally {
            if (world != null) writer.write(world.toString());
            reader.finalize();
            writer.finalize();
            System.out.println();
            System.out.println("worldcitiespop parsing finished");
        }

    }
}

package worldcitiespop;

import java.io.*;

public class ResourceFileReader {

    private static final String RESOURCE_FILE_PATH = "/worldcitiespop.txt";
    private static final String DEFAULT_ENCODING = "UTF-8";

    private final InputStream is;
    private final BufferedReader reader;

    public final String title;

    private long count;

    public ResourceFileReader() throws IOException {
        is = getClass().getResourceAsStream(RESOURCE_FILE_PATH);
        reader = new BufferedReader(new InputStreamReader(new BufferedInputStream(is), DEFAULT_ENCODING));
        this.title = reader.readLine();
    }

    public void finalize() {
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read() throws IOException {
        this.count++;
        return reader.readLine();
    }

    public long getCount() {
        return this.count;
    }

}

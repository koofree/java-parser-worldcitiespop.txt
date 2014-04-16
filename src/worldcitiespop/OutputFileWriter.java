package worldcitiespop;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class OutputFileWriter {

    private static final String DEFAULT_OUTPUT_FILENAME = "output.txt";
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final boolean debug = false;

    private final String outputFileName;
    private final PrintWriter writer;

    public OutputFileWriter(String outputFileName) throws FileNotFoundException, UnsupportedEncodingException {
        this.outputFileName = outputFileName;
        writer = new PrintWriter(outputFileName, DEFAULT_ENCODING);
    }

    public OutputFileWriter() throws FileNotFoundException, UnsupportedEncodingException {
        this(DEFAULT_OUTPUT_FILENAME);
    }

    public void write(String line) {
        if (debug) System.out.println(line);
        writer.println(line);
    }

    public void finalize() {
        this.writer.close();
    }
}

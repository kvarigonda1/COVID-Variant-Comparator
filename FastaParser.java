import java.util.*;
import java.io.*;
public class FastaParser {

    public static List<Sequence> parse(String filePath) throws IOException {
        List<Sequence> sequences = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        StringBuilder seqBuilder = new StringBuilder();
        String currentId = null;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.startsWith(">")) {
                if (currentId != null) {
                    sequences.add(new Sequence(currentId, seqBuilder.toString()));
                    seqBuilder.setLength(0); // Clear the builder
                }
                currentId = line.substring(1); // remove '>'
            } else {
                seqBuilder.append(line);
            }
        }
        if (currentId != null && seqBuilder.length() > 0) {
            sequences.add(new Sequence(currentId, seqBuilder.toString()));
        }

        reader.close();
        return sequences;
    }
}
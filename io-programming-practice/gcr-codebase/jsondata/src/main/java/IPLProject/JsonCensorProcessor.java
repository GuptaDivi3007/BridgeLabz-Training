package IPLProject;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Arrays;
import java.util.List;
public class JsonCensorProcessor {
	public static void processJson() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        File input = new File("src/main/resources/ipl_input.json");
        File output = new File("src/main/resources/ipl_censored.json");

        List<IPL> matches =
                Arrays.asList(mapper.readValue(input, IPL[].class));

        // Apply censorship
        for (IPL match : matches) {
            match.censor();
        }

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(output, matches);

        System.out.println("Censored JSON file created");
    }
}

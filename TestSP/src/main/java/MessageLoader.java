import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.util.Collections;
import java.util.List;

public class MessageLoader {

    public List<Message> loadMessages(String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(filePath), new TypeReference<List<Message>>(){});
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}

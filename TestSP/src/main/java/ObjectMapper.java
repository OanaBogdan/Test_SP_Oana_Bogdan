import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.util.List;

public class ObjectMapper {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Message> messages = mapper.readValue(
                    new File("src/main/resources/messages.json"),
                    new TypeReference<List<Message>>(){}
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class AtreidesMessageProcessing implements MessageProcessingStrategy {
    @Override
    public void processMessage(Message message) {
        String decodedMessage = decodeAtreidesMessage(message.getMessage());
        System.out.println("Decoded Atreides message: " + decodedMessage);
    }

    private String decodeAtreidesMessage(String message) {
        return message.replace("Jbppf", "Messi");
    }
}


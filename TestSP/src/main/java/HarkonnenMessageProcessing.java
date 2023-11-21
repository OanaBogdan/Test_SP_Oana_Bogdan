public class HarkonnenMessageProcessing implements MessageProcessingStrategy {
    @Override
    public void processMessage(Message message) {
        String decodedMessage = decodeHarkonnenMessage(message.getMessage());
        System.out.println("Decoded Harkonnen message: " + decodedMessage);
    }

    private String decodeHarkonnenMessage(String message) {
        return message.replace("Oguuk", "Messi");
    }
}

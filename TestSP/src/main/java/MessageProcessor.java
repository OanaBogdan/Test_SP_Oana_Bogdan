public class MessageProcessor {
    private MessageProcessingStrategy strategy;

    public MessageProcessor(MessageProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public void processMessage(Message message) {
        strategy.processMessage(message);
    }
}

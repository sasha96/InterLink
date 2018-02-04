package alex.zhurylo.exception;

public class QueueFailedException extends RuntimeException {
    public QueueFailedException (String message){
        super(message);
    }
}

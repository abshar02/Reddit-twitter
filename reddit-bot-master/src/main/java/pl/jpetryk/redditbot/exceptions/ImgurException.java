package pl.jpetryk.redditbot.exceptions;


public class ImgurException extends Exception {

    public ImgurException(String message) {
        super(message);
    }

    public ImgurException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImgurException(Throwable cause) {
        super(cause);
    }

    public ImgurException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

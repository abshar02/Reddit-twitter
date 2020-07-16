package pl.jpetryk.redditbot.exceptions;


public class NetworkConnectionException extends Exception {


    public NetworkConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NetworkConnectionException(String message) {
        super(message);
    }

    public NetworkConnectionException(Throwable cause) {
        super(cause);
    }

}

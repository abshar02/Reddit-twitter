package pl.jpetryk.redditbot.exceptions;


public class RedditApiException extends RuntimeException {

    private String reason;

    private String explanation;

    public RedditApiException(String reason, String explanation) {
        super("Reddit API returned error reason: " + reason + " and explanation: " + explanation);
        this.reason = reason;
        this.explanation = explanation;
    }

    public String getReason() {
        return reason;
    }

    public String getExplanation() {
        return explanation;
    }
}

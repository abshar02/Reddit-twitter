package pl.jpetryk.redditbot.connectors;

import pl.jpetryk.redditbot.exceptions.TwitterApiException;
import pl.jpetryk.redditbot.model.Tweet;

public interface TwitterConnectorInterface {
    Tweet showStatus(Long id) throws TwitterApiException;
}

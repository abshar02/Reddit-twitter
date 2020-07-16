package pl.jpetryk.redditbot.utils;

import pl.jpetryk.redditbot.model.Comment;
import pl.jpetryk.redditbot.model.TweetWithRehostedImages;

import java.util.List;


public interface ResponseCommentCreatorInterface {

    public String createResponseComment(List<TweetWithRehostedImages> tweetList, Comment comment);

}

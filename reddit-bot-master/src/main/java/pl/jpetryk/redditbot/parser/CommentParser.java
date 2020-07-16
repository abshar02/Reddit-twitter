package pl.jpetryk.redditbot.parser;

import pl.jpetryk.redditbot.model.Comment;

import java.util.Collection;


public interface CommentParser {

    Collection<String> getTwitterStatusIdsFromComment(Comment comment);

}
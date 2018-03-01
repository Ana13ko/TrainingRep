package net.comments.objects;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public interface CommentsPage {

    void open();

    void newComment();

    //CommentsActions commentsActions();

    CommentsTable currentComments();

    CommentsTable commentsFrom(int page);

    int commentsPagesSize();
}

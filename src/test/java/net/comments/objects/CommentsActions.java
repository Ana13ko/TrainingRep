package net.comments.objects;

/**
 * @author Dmytro Serdiuk (dmytro.serdiuk@gmail.com)
 * @version $Id$
 * @since ?????
 */
public interface CommentsActions {

    void duplicate();

    void edit(String comment);

    void delete(String comment);
}

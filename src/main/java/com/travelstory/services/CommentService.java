package com.travelstory.services;

import com.travelstory.entity.Comment;
import com.travelstory.entity.Media;
import com.travelstory.entity.TravelStory;
import com.travelstory.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    Comment saveComment(Comment comment);

    List<Comment> getAllComments();

    Comment add(Comment comment, Long userId, Long travelStoryId, Long mediaId);

    List<Comment> getCommentsByMedia(Media media);

    List<Comment> getCommentsByUserAndMedia(User user, Media media);

    List<Comment> getCommentsByUserAndTravelStory(User user, TravelStory travelStory);

    List<Comment> getCommentsByTravelStory(TravelStory travelStory);

    Comment getComment(Long id);

    void deleteComment(Comment comment);

}

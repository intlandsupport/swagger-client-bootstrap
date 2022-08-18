/*
 * codebeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.client.api;

import java.io.File;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.model.Comment;

/**
 * API tests for TrackerItemsCommentApi
 */
@Disabled
public class TrackerItemsCommentApiTest {

    private final TrackerItemsCommentApi api = new TrackerItemsCommentApi();

    /**
     * Comment on a tracker item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void commentOnTrackerItemTest() throws ApiException {
        Integer itemId = null;
        String comment = null;
        File attachments = null;
        String commentFormat = null;
        Comment response = api.commentOnTrackerItem(itemId, comment, attachments, commentFormat);
        // TODO: test validations
    }

    /**
     * Delete comment of tracker item by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTrackerItemCommentTest() throws ApiException {
        Integer itemId = null;
        Integer commentId = null;
        Comment response = api.deleteTrackerItemComment(itemId, commentId);
        // TODO: test validations
    }

    /**
     * Delete comments of tracker item by item id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTrackerItemCommentsTest() throws ApiException {
        Integer itemId = null;
        api.deleteTrackerItemComments(itemId);
        // TODO: test validations
    }

    /**
     * Edit comment on a tracker item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editCommentOnTrackerItemTest() throws ApiException {
        Integer itemId = null;
        Integer commentId = null;
        String comment = null;
        File attachments = null;
        String commentFormat = null;
        Comment response = api.editCommentOnTrackerItem(itemId, commentId, comment, attachments, commentFormat);
        // TODO: test validations
    }

    /**
     * Get comment of tracker item by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTrackerItemCommentTest() throws ApiException {
        Integer itemId = null;
        Integer commentId = null;
        Comment response = api.getTrackerItemComment(itemId, commentId);
        // TODO: test validations
    }

    /**
     * Get comments of tracker item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTrackerItemCommentsTest() throws ApiException {
        Integer itemId = null;
        List<Comment> response = api.getTrackerItemComments(itemId);
        // TODO: test validations
    }

    /**
     * Reply on a comment of a tracker item
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void replyOnCommentOfTrackerItemTest() throws ApiException {
        Integer itemId = null;
        Integer commentId = null;
        String comment = null;
        File attachments = null;
        String commentFormat = null;
        Comment response = api.replyOnCommentOfTrackerItem(itemId, commentId, comment, attachments, commentFormat);
        // TODO: test validations
    }

}

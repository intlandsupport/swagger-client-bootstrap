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


package com.intland.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A tracker item review instance including its reviewers and their decisions
 */
@ApiModel(description = "A tracker item review instance including its reviewers and their decisions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class TrackerItemReviewExport {
  public static final String SERIALIZED_NAME_REVIEWERS = "reviewers";
  @SerializedName(SERIALIZED_NAME_REVIEWERS)
  private List<TrackerItemReviewVoteExport> reviewers = null;

  public static final String SERIALIZED_NAME_TRACKER_ITEM_VERSION = "trackerItemVersion";
  @SerializedName(SERIALIZED_NAME_TRACKER_ITEM_VERSION)
  private Integer trackerItemVersion;


  public TrackerItemReviewExport reviewers(List<TrackerItemReviewVoteExport> reviewers) {
    
    this.reviewers = reviewers;
    return this;
  }

  public TrackerItemReviewExport addReviewersItem(TrackerItemReviewVoteExport reviewersItem) {
    if (this.reviewers == null) {
      this.reviewers = new ArrayList<TrackerItemReviewVoteExport>();
    }
    this.reviewers.add(reviewersItem);
    return this;
  }

   /**
   * List of reviewers and their votes
   * @return reviewers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of reviewers and their votes")

  public List<TrackerItemReviewVoteExport> getReviewers() {
    return reviewers;
  }


  public void setReviewers(List<TrackerItemReviewVoteExport> reviewers) {
    this.reviewers = reviewers;
  }


  public TrackerItemReviewExport trackerItemVersion(Integer trackerItemVersion) {
    
    this.trackerItemVersion = trackerItemVersion;
    return this;
  }

   /**
   * Version of the Tracker Item at the time of the review
   * @return trackerItemVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of the Tracker Item at the time of the review")

  public Integer getTrackerItemVersion() {
    return trackerItemVersion;
  }


  public void setTrackerItemVersion(Integer trackerItemVersion) {
    this.trackerItemVersion = trackerItemVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReviewExport trackerItemReviewExport = (TrackerItemReviewExport) o;
    return Objects.equals(this.reviewers, trackerItemReviewExport.reviewers) &&
        Objects.equals(this.trackerItemVersion, trackerItemReviewExport.trackerItemVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewers, trackerItemVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReviewExport {\n");
    sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
    sb.append("    trackerItemVersion: ").append(toIndentedString(trackerItemVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A tracker item review instance including its reviewers and their decisions
 */
@ApiModel(description = "A tracker item review instance including its reviewers and their decisions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T12:30:20.007+01:00[Europe/Budapest]")
public class TrackerItemReview {
  public static final String SERIALIZED_NAME_REVIEWERS = "reviewers";
  @SerializedName(SERIALIZED_NAME_REVIEWERS)
  private List<TrackerItemReviewVote> reviewers = null;

  /**
   * Whether the review is approved or rejected
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    APPROVED("APPROVED"),
    
    REJECTED("REJECTED"),
    
    UNDECIDED("UNDECIDED");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  public static final String SERIALIZED_NAME_TRACKER_ITEM = "trackerItem";
  @SerializedName(SERIALIZED_NAME_TRACKER_ITEM)
  private TrackerItemRevision trackerItem;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private TrackerItemReviewConfig config;


  public TrackerItemReview reviewers(List<TrackerItemReviewVote> reviewers) {
    
    this.reviewers = reviewers;
    return this;
  }

  public TrackerItemReview addReviewersItem(TrackerItemReviewVote reviewersItem) {
    if (this.reviewers == null) {
      this.reviewers = new ArrayList<TrackerItemReviewVote>();
    }
    this.reviewers.add(reviewersItem);
    return this;
  }

   /**
   * List of reviewers, and their votes
   * @return reviewers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of reviewers, and their votes")

  public List<TrackerItemReviewVote> getReviewers() {
    return reviewers;
  }


  public void setReviewers(List<TrackerItemReviewVote> reviewers) {
    this.reviewers = reviewers;
  }


  public TrackerItemReview result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Whether the review is approved or rejected
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the review is approved or rejected")

  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public TrackerItemReview trackerItem(TrackerItemRevision trackerItem) {
    
    this.trackerItem = trackerItem;
    return this;
  }

   /**
   * Get trackerItem
   * @return trackerItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItemRevision getTrackerItem() {
    return trackerItem;
  }


  public void setTrackerItem(TrackerItemRevision trackerItem) {
    this.trackerItem = trackerItem;
  }


  public TrackerItemReview config(TrackerItemReviewConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItemReviewConfig getConfig() {
    return config;
  }


  public void setConfig(TrackerItemReviewConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReview trackerItemReview = (TrackerItemReview) o;
    return Objects.equals(this.reviewers, trackerItemReview.reviewers) &&
        Objects.equals(this.result, trackerItemReview.result) &&
        Objects.equals(this.trackerItem, trackerItemReview.trackerItem) &&
        Objects.equals(this.config, trackerItemReview.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewers, result, trackerItem, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReview {\n");
    sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    trackerItem: ").append(toIndentedString(trackerItem)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


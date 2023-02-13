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

import io.swagger.annotations.ApiModelProperty;

/**
 * TrackerFilteringRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class TrackerFilteringRequest {
  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_KEY_NAME = "keyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<TrackerTypeReference> types = null;


  public TrackerFilteringRequest deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * True to also show removed trackers.
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True to also show removed trackers.")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public TrackerFilteringRequest hidden(Boolean hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * True to also show hidden trackers.
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "True to also show hidden trackers.")

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public TrackerFilteringRequest keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Filter by project key name
   * @return keyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filter by project key name")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public TrackerFilteringRequest types(List<TrackerTypeReference> types) {
    
    this.types = types;
    return this;
  }

  public TrackerFilteringRequest addTypesItem(TrackerTypeReference typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<TrackerTypeReference>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * List of tracker type references, to only show trackers of these types.
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tracker type references, to only show trackers of these types.")

  public List<TrackerTypeReference> getTypes() {
    return types;
  }


  public void setTypes(List<TrackerTypeReference> types) {
    this.types = types;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerFilteringRequest trackerFilteringRequest = (TrackerFilteringRequest) o;
    return Objects.equals(this.deleted, trackerFilteringRequest.deleted) &&
        Objects.equals(this.hidden, trackerFilteringRequest.hidden) &&
        Objects.equals(this.keyName, trackerFilteringRequest.keyName) &&
        Objects.equals(this.types, trackerFilteringRequest.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, hidden, keyName, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerFilteringRequest {\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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


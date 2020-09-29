/*
 * codeBeamer swagger API
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.model.TrackerItemAttachmentRequestAllOf;
import com.intland.swagger.client.model.TrackerItemReference;
import com.intland.swagger.client.model.TrackerItemsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request data to retrieve tracker item attachments.
 */
@ApiModel(description = "Request data to retrieve tracker item attachments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class TrackerItemAttachmentRequest extends TrackerItemsRequest {
  public static final String SERIALIZED_NAME_BASELINE_ID = "baselineId";
  @SerializedName(SERIALIZED_NAME_BASELINE_ID)
  private Integer baselineId;

  public static final String SERIALIZED_NAME_EXCLUDE_FILTER = "excludeFilter";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FILTER)
  private Boolean excludeFilter;

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private List<String> extensions = null;

  public static final String SERIALIZED_NAME_MIME_TYPES = "mimeTypes";
  @SerializedName(SERIALIZED_NAME_MIME_TYPES)
  private List<String> mimeTypes = null;


  public TrackerItemAttachmentRequest baselineId(Integer baselineId) {
    
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Baseline id to specify the versions of the tracker items.
   * @return baselineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1203", value = "Baseline id to specify the versions of the tracker items.")

  public Integer getBaselineId() {
    return baselineId;
  }


  public void setBaselineId(Integer baselineId) {
    this.baselineId = baselineId;
  }


  public TrackerItemAttachmentRequest excludeFilter(Boolean excludeFilter) {
    
    this.excludeFilter = excludeFilter;
    return this;
  }

   /**
   * Indicator if the attachments matching the filters need to be excluded or not
   * @return excludeFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicator if the attachments matching the filters need to be excluded or not")

  public Boolean getExcludeFilter() {
    return excludeFilter;
  }


  public void setExcludeFilter(Boolean excludeFilter) {
    this.excludeFilter = excludeFilter;
  }


  public TrackerItemAttachmentRequest extensions(List<String> extensions) {
    
    this.extensions = extensions;
    return this;
  }

  public TrackerItemAttachmentRequest addExtensionsItem(String extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<String>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * File extension filters.
   * @return extensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"docx\",\"xlsx\"]", value = "File extension filters.")

  public List<String> getExtensions() {
    return extensions;
  }


  public void setExtensions(List<String> extensions) {
    this.extensions = extensions;
  }


  public TrackerItemAttachmentRequest mimeTypes(List<String> mimeTypes) {
    
    this.mimeTypes = mimeTypes;
    return this;
  }

  public TrackerItemAttachmentRequest addMimeTypesItem(String mimeTypesItem) {
    if (this.mimeTypes == null) {
      this.mimeTypes = new ArrayList<String>();
    }
    this.mimeTypes.add(mimeTypesItem);
    return this;
  }

   /**
   * File mime type filters.
   * @return mimeTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"image/png\",\"application/zip\"]", value = "File mime type filters.")

  public List<String> getMimeTypes() {
    return mimeTypes;
  }


  public void setMimeTypes(List<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemAttachmentRequest trackerItemAttachmentRequest = (TrackerItemAttachmentRequest) o;
    return Objects.equals(this.baselineId, trackerItemAttachmentRequest.baselineId) &&
        Objects.equals(this.excludeFilter, trackerItemAttachmentRequest.excludeFilter) &&
        Objects.equals(this.extensions, trackerItemAttachmentRequest.extensions) &&
        Objects.equals(this.mimeTypes, trackerItemAttachmentRequest.mimeTypes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineId, excludeFilter, extensions, mimeTypes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemAttachmentRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
    sb.append("    excludeFilter: ").append(toIndentedString(excludeFilter)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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


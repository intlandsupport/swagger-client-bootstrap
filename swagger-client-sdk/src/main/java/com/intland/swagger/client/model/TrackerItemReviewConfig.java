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
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The configuration from which the review was created
 */
@ApiModel(description = "The configuration from which the review was created")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class TrackerItemReviewConfig {
  public static final String SERIALIZED_NAME_REQUIRED_APPROVALS = "requiredApprovals";
  @SerializedName(SERIALIZED_NAME_REQUIRED_APPROVALS)
  private Integer requiredApprovals;

  public static final String SERIALIZED_NAME_REQUIRED_REJECTIONS = "requiredRejections";
  @SerializedName(SERIALIZED_NAME_REQUIRED_REJECTIONS)
  private Integer requiredRejections;

  /**
   * Whether the user has to provide its credentials to vote
   */
  @JsonAdapter(RequiredSignatureEnum.Adapter.class)
  public enum RequiredSignatureEnum {
    NONE("NONE"),
    
    PASSWORD("PASSWORD"),
    
    USERNAME_AND_PASSWORD("USERNAME_AND_PASSWORD");

    private String value;

    RequiredSignatureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequiredSignatureEnum fromValue(String value) {
      for (RequiredSignatureEnum b : RequiredSignatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequiredSignatureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequiredSignatureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequiredSignatureEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RequiredSignatureEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUIRED_SIGNATURE = "requiredSignature";
  @SerializedName(SERIALIZED_NAME_REQUIRED_SIGNATURE)
  private RequiredSignatureEnum requiredSignature;

  public static final String SERIALIZED_NAME_ROLE_REQUIRED = "roleRequired";
  @SerializedName(SERIALIZED_NAME_ROLE_REQUIRED)
  private Boolean roleRequired;


  public TrackerItemReviewConfig requiredApprovals(Integer requiredApprovals) {
    
    this.requiredApprovals = requiredApprovals;
    return this;
  }

   /**
   * Number of approvals after which the review is considered approved
   * @return requiredApprovals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of approvals after which the review is considered approved")

  public Integer getRequiredApprovals() {
    return requiredApprovals;
  }


  public void setRequiredApprovals(Integer requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
  }


  public TrackerItemReviewConfig requiredRejections(Integer requiredRejections) {
    
    this.requiredRejections = requiredRejections;
    return this;
  }

   /**
   * Number of rejections after which the review is considered rejected
   * @return requiredRejections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of rejections after which the review is considered rejected")

  public Integer getRequiredRejections() {
    return requiredRejections;
  }


  public void setRequiredRejections(Integer requiredRejections) {
    this.requiredRejections = requiredRejections;
  }


  public TrackerItemReviewConfig requiredSignature(RequiredSignatureEnum requiredSignature) {
    
    this.requiredSignature = requiredSignature;
    return this;
  }

   /**
   * Whether the user has to provide its credentials to vote
   * @return requiredSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user has to provide its credentials to vote")

  public RequiredSignatureEnum getRequiredSignature() {
    return requiredSignature;
  }


  public void setRequiredSignature(RequiredSignatureEnum requiredSignature) {
    this.requiredSignature = requiredSignature;
  }


  public TrackerItemReviewConfig roleRequired(Boolean roleRequired) {
    
    this.roleRequired = roleRequired;
    return this;
  }

   /**
   * Whether the reviewers have to chose in which of their roles do they want to vote
   * @return roleRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the reviewers have to chose in which of their roles do they want to vote")

  public Boolean getRoleRequired() {
    return roleRequired;
  }


  public void setRoleRequired(Boolean roleRequired) {
    this.roleRequired = roleRequired;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReviewConfig trackerItemReviewConfig = (TrackerItemReviewConfig) o;
    return Objects.equals(this.requiredApprovals, trackerItemReviewConfig.requiredApprovals) &&
        Objects.equals(this.requiredRejections, trackerItemReviewConfig.requiredRejections) &&
        Objects.equals(this.requiredSignature, trackerItemReviewConfig.requiredSignature) &&
        Objects.equals(this.roleRequired, trackerItemReviewConfig.roleRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredApprovals, requiredRejections, requiredSignature, roleRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReviewConfig {\n");
    sb.append("    requiredApprovals: ").append(toIndentedString(requiredApprovals)).append("\n");
    sb.append("    requiredRejections: ").append(toIndentedString(requiredRejections)).append("\n");
    sb.append("    requiredSignature: ").append(toIndentedString(requiredSignature)).append("\n");
    sb.append("    roleRequired: ").append(toIndentedString(roleRequired)).append("\n");
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


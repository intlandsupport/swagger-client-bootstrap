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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Configuration to request a lock. If &#39;hard&#39; is true, duration must be null, or unspecified.
 */
@ApiModel(description = "Configuration to request a lock. If 'hard' is true, duration must be null, or unspecified.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class LockRequest {
  public static final String SERIALIZED_NAME_HARD = "hard";
  @SerializedName(SERIALIZED_NAME_HARD)
  private Boolean hard;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;


  public LockRequest hard(Boolean hard) {
    
    this.hard = hard;
    return this;
  }

   /**
   * Whether the lock should be hard
   * @return hard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the lock should be hard")

  public Boolean getHard() {
    return hard;
  }


  public void setHard(Boolean hard) {
    this.hard = hard;
  }


  public LockRequest duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * If not a hard lock, the duration specified in time notation
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1:30h", value = "If not a hard lock, the duration specified in time notation")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockRequest lockRequest = (LockRequest) o;
    return Objects.equals(this.hard, lockRequest.hard) &&
        Objects.equals(this.duration, lockRequest.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hard, duration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockRequest {\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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


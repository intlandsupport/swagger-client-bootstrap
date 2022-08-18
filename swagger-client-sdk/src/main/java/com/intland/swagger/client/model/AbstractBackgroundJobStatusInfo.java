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
import java.util.HashSet;
import java.util.Objects;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.intland.swagger.client.JSON;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Status information of a background job
 */
@ApiModel(description = "Status information of a background job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class AbstractBackgroundJobStatusInfo {
  public static final String SERIALIZED_NAME_PROGRESS_PERCENTAGE = "progressPercentage";
  @SerializedName(SERIALIZED_NAME_PROGRESS_PERCENTAGE)
  private Integer progressPercentage;

  public static final String SERIALIZED_NAME_STEP_IN_PROGRESS = "stepInProgress";
  @SerializedName(SERIALIZED_NAME_STEP_IN_PROGRESS)
  private String stepInProgress;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public AbstractBackgroundJobStatusInfo() { 
    this.type = this.getClass().getSimpleName();
  }

  public AbstractBackgroundJobStatusInfo progressPercentage(Integer progressPercentage) {
    
    this.progressPercentage = progressPercentage;
    return this;
  }

   /**
   * Progress in percentage (calculated based on pre-set weights)
   * @return progressPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Progress in percentage (calculated based on pre-set weights)")

  public Integer getProgressPercentage() {
    return progressPercentage;
  }


  public void setProgressPercentage(Integer progressPercentage) {
    this.progressPercentage = progressPercentage;
  }


  public AbstractBackgroundJobStatusInfo stepInProgress(String stepInProgress) {
    
    this.stepInProgress = stepInProgress;
    return this;
  }

   /**
   * Step currently in progress
   * @return stepInProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Step currently in progress")

  public String getStepInProgress() {
    return stepInProgress;
  }


  public void setStepInProgress(String stepInProgress) {
    this.stepInProgress = stepInProgress;
  }


  public AbstractBackgroundJobStatusInfo type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of status info object
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of status info object")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractBackgroundJobStatusInfo abstractBackgroundJobStatusInfo = (AbstractBackgroundJobStatusInfo) o;
    return Objects.equals(this.progressPercentage, abstractBackgroundJobStatusInfo.progressPercentage) &&
        Objects.equals(this.stepInProgress, abstractBackgroundJobStatusInfo.stepInProgress) &&
        Objects.equals(this.type, abstractBackgroundJobStatusInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progressPercentage, stepInProgress, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractBackgroundJobStatusInfo {\n");
    sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
    sb.append("    stepInProgress: ").append(toIndentedString(stepInProgress)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("progressPercentage");
    openapiFields.add("stepInProgress");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AbstractBackgroundJobStatusInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AbstractBackgroundJobStatusInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AbstractBackgroundJobStatusInfo is not found in the empty JSON string", AbstractBackgroundJobStatusInfo.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "DefaultBackgroundJobStatusInfo":
          DefaultBackgroundJobStatusInfo.validateJsonObject(jsonObj);
          break;
        case "DependencyFinderJobStatusInfo":
          DependencyFinderJobStatusInfo.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of AbstractBackgroundJobStatusInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AbstractBackgroundJobStatusInfo
  * @throws IOException if the JSON string is invalid with respect to AbstractBackgroundJobStatusInfo
  */
  public static AbstractBackgroundJobStatusInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AbstractBackgroundJobStatusInfo.class);
  }

 /**
  * Convert an instance of AbstractBackgroundJobStatusInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


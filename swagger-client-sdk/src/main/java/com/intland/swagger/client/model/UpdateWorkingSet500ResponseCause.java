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
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.JSON;

import io.swagger.annotations.ApiModelProperty;

/**
 * UpdateWorkingSet500ResponseCause
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class UpdateWorkingSet500ResponseCause {
  public static final String SERIALIZED_NAME_LOCALIZED_MESSAGE = "localizedMessage";
  @SerializedName(SERIALIZED_NAME_LOCALIZED_MESSAGE)
  private String localizedMessage;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STACK_TRACE = "stackTrace";
  @SerializedName(SERIALIZED_NAME_STACK_TRACE)
  private List<UpdateWorkingSet500ResponseCauseStackTraceInner> stackTrace = null;

  public static final String SERIALIZED_NAME_SUPPRESSED = "suppressed";
  @SerializedName(SERIALIZED_NAME_SUPPRESSED)
  private List<UpdateWorkingSet500ResponseCauseSuppressedInner> suppressed = null;

  public UpdateWorkingSet500ResponseCause() { 
  }

  public UpdateWorkingSet500ResponseCause localizedMessage(String localizedMessage) {
    
    this.localizedMessage = localizedMessage;
    return this;
  }

   /**
   * Get localizedMessage
   * @return localizedMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocalizedMessage() {
    return localizedMessage;
  }


  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }


  public UpdateWorkingSet500ResponseCause message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public UpdateWorkingSet500ResponseCause stackTrace(List<UpdateWorkingSet500ResponseCauseStackTraceInner> stackTrace) {
    
    this.stackTrace = stackTrace;
    return this;
  }

  public UpdateWorkingSet500ResponseCause addStackTraceItem(UpdateWorkingSet500ResponseCauseStackTraceInner stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UpdateWorkingSet500ResponseCauseStackTraceInner> getStackTrace() {
    return stackTrace;
  }


  public void setStackTrace(List<UpdateWorkingSet500ResponseCauseStackTraceInner> stackTrace) {
    this.stackTrace = stackTrace;
  }


  public UpdateWorkingSet500ResponseCause suppressed(List<UpdateWorkingSet500ResponseCauseSuppressedInner> suppressed) {
    
    this.suppressed = suppressed;
    return this;
  }

  public UpdateWorkingSet500ResponseCause addSuppressedItem(UpdateWorkingSet500ResponseCauseSuppressedInner suppressedItem) {
    if (this.suppressed == null) {
      this.suppressed = new ArrayList<>();
    }
    this.suppressed.add(suppressedItem);
    return this;
  }

   /**
   * Get suppressed
   * @return suppressed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UpdateWorkingSet500ResponseCauseSuppressedInner> getSuppressed() {
    return suppressed;
  }


  public void setSuppressed(List<UpdateWorkingSet500ResponseCauseSuppressedInner> suppressed) {
    this.suppressed = suppressed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkingSet500ResponseCause updateWorkingSet500ResponseCause = (UpdateWorkingSet500ResponseCause) o;
    return Objects.equals(this.localizedMessage, updateWorkingSet500ResponseCause.localizedMessage) &&
        Objects.equals(this.message, updateWorkingSet500ResponseCause.message) &&
        Objects.equals(this.stackTrace, updateWorkingSet500ResponseCause.stackTrace) &&
        Objects.equals(this.suppressed, updateWorkingSet500ResponseCause.suppressed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localizedMessage, message, stackTrace, suppressed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkingSet500ResponseCause {\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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
    openapiFields.add("localizedMessage");
    openapiFields.add("message");
    openapiFields.add("stackTrace");
    openapiFields.add("suppressed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateWorkingSet500ResponseCause
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateWorkingSet500ResponseCause.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateWorkingSet500ResponseCause is not found in the empty JSON string", UpdateWorkingSet500ResponseCause.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateWorkingSet500ResponseCause.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateWorkingSet500ResponseCause` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("localizedMessage") != null && !jsonObj.get("localizedMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localizedMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localizedMessage").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      JsonArray jsonArraystackTrace = jsonObj.getAsJsonArray("stackTrace");
      if (jsonArraystackTrace != null) {
        // ensure the json data is an array
        if (!jsonObj.get("stackTrace").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `stackTrace` to be an array in the JSON string but got `%s`", jsonObj.get("stackTrace").toString()));
        }

        // validate the optional field `stackTrace` (array)
        for (int i = 0; i < jsonArraystackTrace.size(); i++) {
          UpdateWorkingSet500ResponseCauseStackTraceInner.validateJsonObject(jsonArraystackTrace.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysuppressed = jsonObj.getAsJsonArray("suppressed");
      if (jsonArraysuppressed != null) {
        // ensure the json data is an array
        if (!jsonObj.get("suppressed").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `suppressed` to be an array in the JSON string but got `%s`", jsonObj.get("suppressed").toString()));
        }

        // validate the optional field `suppressed` (array)
        for (int i = 0; i < jsonArraysuppressed.size(); i++) {
          UpdateWorkingSet500ResponseCauseSuppressedInner.validateJsonObject(jsonArraysuppressed.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateWorkingSet500ResponseCause.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateWorkingSet500ResponseCause' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateWorkingSet500ResponseCause> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateWorkingSet500ResponseCause.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateWorkingSet500ResponseCause>() {
           @Override
           public void write(JsonWriter out, UpdateWorkingSet500ResponseCause value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateWorkingSet500ResponseCause read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateWorkingSet500ResponseCause given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateWorkingSet500ResponseCause
  * @throws IOException if the JSON string is invalid with respect to UpdateWorkingSet500ResponseCause
  */
  public static UpdateWorkingSet500ResponseCause fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateWorkingSet500ResponseCause.class);
  }

 /**
  * Convert an instance of UpdateWorkingSet500ResponseCause to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


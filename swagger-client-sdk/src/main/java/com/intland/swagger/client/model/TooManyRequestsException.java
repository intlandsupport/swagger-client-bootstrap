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
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
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
 * TooManyRequestsException
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class TooManyRequestsException {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RESOURCE_URI = "resourceUri";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URI)
  private String resourceUri;

  public static final String SERIALIZED_NAME_RETRY_AFTER_SECOND = "retryAfterSecond";
  @SerializedName(SERIALIZED_NAME_RETRY_AFTER_SECOND)
  private Long retryAfterSecond;

  public TooManyRequestsException() { 
  }

  public TooManyRequestsException message(String message) {
    
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


  public TooManyRequestsException resourceUri(String resourceUri) {
    
    this.resourceUri = resourceUri;
    return this;
  }

   /**
   * Get resourceUri
   * @return resourceUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceUri() {
    return resourceUri;
  }


  public void setResourceUri(String resourceUri) {
    this.resourceUri = resourceUri;
  }


  public TooManyRequestsException retryAfterSecond(Long retryAfterSecond) {
    
    this.retryAfterSecond = retryAfterSecond;
    return this;
  }

   /**
   * Get retryAfterSecond
   * @return retryAfterSecond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getRetryAfterSecond() {
    return retryAfterSecond;
  }


  public void setRetryAfterSecond(Long retryAfterSecond) {
    this.retryAfterSecond = retryAfterSecond;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TooManyRequestsException tooManyRequestsException = (TooManyRequestsException) o;
    return Objects.equals(this.message, tooManyRequestsException.message) &&
        Objects.equals(this.resourceUri, tooManyRequestsException.resourceUri) &&
        Objects.equals(this.retryAfterSecond, tooManyRequestsException.retryAfterSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resourceUri, retryAfterSecond);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TooManyRequestsException {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
    sb.append("    retryAfterSecond: ").append(toIndentedString(retryAfterSecond)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("resourceUri");
    openapiFields.add("retryAfterSecond");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TooManyRequestsException
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TooManyRequestsException.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TooManyRequestsException is not found in the empty JSON string", TooManyRequestsException.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TooManyRequestsException.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TooManyRequestsException` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("resourceUri") != null && !jsonObj.get("resourceUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TooManyRequestsException.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TooManyRequestsException' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TooManyRequestsException> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TooManyRequestsException.class));

       return (TypeAdapter<T>) new TypeAdapter<TooManyRequestsException>() {
           @Override
           public void write(JsonWriter out, TooManyRequestsException value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TooManyRequestsException read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TooManyRequestsException given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TooManyRequestsException
  * @throws IOException if the JSON string is invalid with respect to TooManyRequestsException
  */
  public static TooManyRequestsException fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TooManyRequestsException.class);
  }

 /**
  * Convert an instance of TooManyRequestsException to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


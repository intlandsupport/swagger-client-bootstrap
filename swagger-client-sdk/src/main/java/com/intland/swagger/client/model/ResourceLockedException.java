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
 * ResourceLockedException
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class ResourceLockedException {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RESOURCE_URI = "resourceUri";
  @SerializedName(SERIALIZED_NAME_RESOURCE_URI)
  private String resourceUri;

  public ResourceLockedException() { 
  }

  public ResourceLockedException message(String message) {
    
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


  public ResourceLockedException resourceUri(String resourceUri) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceLockedException resourceLockedException = (ResourceLockedException) o;
    return Objects.equals(this.message, resourceLockedException.message) &&
        Objects.equals(this.resourceUri, resourceLockedException.resourceUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resourceUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLockedException {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResourceLockedException
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResourceLockedException.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResourceLockedException is not found in the empty JSON string", ResourceLockedException.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResourceLockedException.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResourceLockedException` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!ResourceLockedException.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResourceLockedException' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResourceLockedException> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResourceLockedException.class));

       return (TypeAdapter<T>) new TypeAdapter<ResourceLockedException>() {
           @Override
           public void write(JsonWriter out, ResourceLockedException value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResourceLockedException read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResourceLockedException given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResourceLockedException
  * @throws IOException if the JSON string is invalid with respect to ResourceLockedException
  */
  public static ResourceLockedException fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResourceLockedException.class);
  }

 /**
  * Convert an instance of ResourceLockedException to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


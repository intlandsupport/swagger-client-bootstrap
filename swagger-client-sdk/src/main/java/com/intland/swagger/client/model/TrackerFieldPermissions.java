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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tracker field permissions
 */
@ApiModel(description = "Tracker field permissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class TrackerFieldPermissions {
  public static final String SERIALIZED_NAME_FIELD_PERMISSIONS = "fieldPermissions";
  @SerializedName(SERIALIZED_NAME_FIELD_PERMISSIONS)
  private List<TrackerFieldStatusPermissions> fieldPermissions = null;

  public static final String SERIALIZED_NAME_FIELD_REFERENCE = "fieldReference";
  @SerializedName(SERIALIZED_NAME_FIELD_REFERENCE)
  private FieldReference fieldReference;

  public TrackerFieldPermissions() { 
  }

  public TrackerFieldPermissions fieldPermissions(List<TrackerFieldStatusPermissions> fieldPermissions) {
    
    this.fieldPermissions = fieldPermissions;
    return this;
  }

  public TrackerFieldPermissions addFieldPermissionsItem(TrackerFieldStatusPermissions fieldPermissionsItem) {
    if (this.fieldPermissions == null) {
      this.fieldPermissions = new ArrayList<>();
    }
    this.fieldPermissions.add(fieldPermissionsItem);
    return this;
  }

   /**
   * Permissions for the given field
   * @return fieldPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Permissions for the given field")

  public List<TrackerFieldStatusPermissions> getFieldPermissions() {
    return fieldPermissions;
  }


  public void setFieldPermissions(List<TrackerFieldStatusPermissions> fieldPermissions) {
    this.fieldPermissions = fieldPermissions;
  }


  public TrackerFieldPermissions fieldReference(FieldReference fieldReference) {
    
    this.fieldReference = fieldReference;
    return this;
  }

   /**
   * Get fieldReference
   * @return fieldReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldReference getFieldReference() {
    return fieldReference;
  }


  public void setFieldReference(FieldReference fieldReference) {
    this.fieldReference = fieldReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerFieldPermissions trackerFieldPermissions = (TrackerFieldPermissions) o;
    return Objects.equals(this.fieldPermissions, trackerFieldPermissions.fieldPermissions) &&
        Objects.equals(this.fieldReference, trackerFieldPermissions.fieldReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldPermissions, fieldReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerFieldPermissions {\n");
    sb.append("    fieldPermissions: ").append(toIndentedString(fieldPermissions)).append("\n");
    sb.append("    fieldReference: ").append(toIndentedString(fieldReference)).append("\n");
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
    openapiFields.add("fieldPermissions");
    openapiFields.add("fieldReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackerFieldPermissions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackerFieldPermissions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackerFieldPermissions is not found in the empty JSON string", TrackerFieldPermissions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackerFieldPermissions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackerFieldPermissions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfieldPermissions = jsonObj.getAsJsonArray("fieldPermissions");
      if (jsonArrayfieldPermissions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fieldPermissions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fieldPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("fieldPermissions").toString()));
        }

        // validate the optional field `fieldPermissions` (array)
        for (int i = 0; i < jsonArrayfieldPermissions.size(); i++) {
          TrackerFieldStatusPermissions.validateJsonObject(jsonArrayfieldPermissions.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `fieldReference`
      if (jsonObj.getAsJsonObject("fieldReference") != null) {
        FieldReference.validateJsonObject(jsonObj.getAsJsonObject("fieldReference"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackerFieldPermissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackerFieldPermissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackerFieldPermissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackerFieldPermissions.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackerFieldPermissions>() {
           @Override
           public void write(JsonWriter out, TrackerFieldPermissions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackerFieldPermissions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackerFieldPermissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackerFieldPermissions
  * @throws IOException if the JSON string is invalid with respect to TrackerFieldPermissions
  */
  public static TrackerFieldPermissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackerFieldPermissions.class);
  }

 /**
  * Convert an instance of TrackerFieldPermissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


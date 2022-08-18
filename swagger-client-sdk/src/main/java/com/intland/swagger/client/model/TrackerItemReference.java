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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Reference to a tracker item
 */
@ApiModel(description = "Reference to a tracker item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class TrackerItemReference extends AbstractReference {
  public static final String SERIALIZED_NAME_REFERENCE_DATA = "referenceData";
  @SerializedName(SERIALIZED_NAME_REFERENCE_DATA)
  private TrackerItemReferenceData referenceData;

  public TrackerItemReference() { 
    this.type = this.getClass().getSimpleName();
  }

  public TrackerItemReference referenceData(TrackerItemReferenceData referenceData) {
    
    this.referenceData = referenceData;
    return this;
  }

   /**
   * Get referenceData
   * @return referenceData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItemReferenceData getReferenceData() {
    return referenceData;
  }


  public void setReferenceData(TrackerItemReferenceData referenceData) {
    this.referenceData = referenceData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReference trackerItemReference = (TrackerItemReference) o;
    return Objects.equals(this.referenceData, trackerItemReference.referenceData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReference {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    referenceData: ").append(toIndentedString(referenceData)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("referenceData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackerItemReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackerItemReference.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackerItemReference is not found in the empty JSON string", TrackerItemReference.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackerItemReference.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackerItemReference` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackerItemReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackerItemReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackerItemReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackerItemReference.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackerItemReference>() {
           @Override
           public void write(JsonWriter out, TrackerItemReference value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackerItemReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackerItemReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackerItemReference
  * @throws IOException if the JSON string is invalid with respect to TrackerItemReference
  */
  public static TrackerItemReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackerItemReference.class);
  }

 /**
  * Convert an instance of TrackerItemReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


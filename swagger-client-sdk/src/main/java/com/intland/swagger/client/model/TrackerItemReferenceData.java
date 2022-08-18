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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.JSON;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Properties of a tracker item reference
 */
@ApiModel(description = "Properties of a tracker item reference")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class TrackerItemReferenceData {
  /**
   * Type of suspect propagation
   */
  @JsonAdapter(SuspectPropagationEnum.Adapter.class)
  public enum SuspectPropagationEnum {
    DO_NOT_PROPAGATE("DO_NOT_PROPAGATE"),
    
    PROPAGATE("PROPAGATE"),
    
    REVERSE("REVERSE"),
    
    BIDIRECTIONAL("BIDIRECTIONAL");

    private String value;

    SuspectPropagationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SuspectPropagationEnum fromValue(String value) {
      for (SuspectPropagationEnum b : SuspectPropagationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SuspectPropagationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SuspectPropagationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SuspectPropagationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SuspectPropagationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUSPECT_PROPAGATION = "suspectPropagation";
  @SerializedName(SERIALIZED_NAME_SUSPECT_PROPAGATION)
  private SuspectPropagationEnum suspectPropagation;

  public TrackerItemReferenceData() { 
  }

  public TrackerItemReferenceData suspectPropagation(SuspectPropagationEnum suspectPropagation) {
    
    this.suspectPropagation = suspectPropagation;
    return this;
  }

   /**
   * Type of suspect propagation
   * @return suspectPropagation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of suspect propagation")

  public SuspectPropagationEnum getSuspectPropagation() {
    return suspectPropagation;
  }


  public void setSuspectPropagation(SuspectPropagationEnum suspectPropagation) {
    this.suspectPropagation = suspectPropagation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemReferenceData trackerItemReferenceData = (TrackerItemReferenceData) o;
    return Objects.equals(this.suspectPropagation, trackerItemReferenceData.suspectPropagation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspectPropagation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemReferenceData {\n");
    sb.append("    suspectPropagation: ").append(toIndentedString(suspectPropagation)).append("\n");
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
    openapiFields.add("suspectPropagation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackerItemReferenceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackerItemReferenceData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackerItemReferenceData is not found in the empty JSON string", TrackerItemReferenceData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackerItemReferenceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackerItemReferenceData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("suspectPropagation") != null && !jsonObj.get("suspectPropagation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suspectPropagation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suspectPropagation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackerItemReferenceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackerItemReferenceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackerItemReferenceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackerItemReferenceData.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackerItemReferenceData>() {
           @Override
           public void write(JsonWriter out, TrackerItemReferenceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackerItemReferenceData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackerItemReferenceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackerItemReferenceData
  * @throws IOException if the JSON string is invalid with respect to TrackerItemReferenceData
  */
  public static TrackerItemReferenceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackerItemReferenceData.class);
  }

 /**
  * Convert an instance of TrackerItemReferenceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


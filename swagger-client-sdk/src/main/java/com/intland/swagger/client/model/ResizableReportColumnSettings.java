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
 * Settings for a resizeable column definition.
 */
@ApiModel(description = "Settings for a resizeable column definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class ResizableReportColumnSettings {
  public static final String SERIALIZED_NAME_COLUMN_INDEX = "columnIndex";
  @SerializedName(SERIALIZED_NAME_COLUMN_INDEX)
  private Integer columnIndex;

  public static final String SERIALIZED_NAME_COLUMN_WIDTH_PERCENTAGE = "columnWidthPercentage";
  @SerializedName(SERIALIZED_NAME_COLUMN_WIDTH_PERCENTAGE)
  private Double columnWidthPercentage;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldReference field;

  public ResizableReportColumnSettings() { 
  }

  public ResizableReportColumnSettings columnIndex(Integer columnIndex) {
    
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Index of the column in the report table.
   * @return columnIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Index of the column in the report table.")

  public Integer getColumnIndex() {
    return columnIndex;
  }


  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }


  public ResizableReportColumnSettings columnWidthPercentage(Double columnWidthPercentage) {
    
    this.columnWidthPercentage = columnWidthPercentage;
    return this;
  }

   /**
   * Width of the column in percentage.
   * @return columnWidthPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "43.2", value = "Width of the column in percentage.")

  public Double getColumnWidthPercentage() {
    return columnWidthPercentage;
  }


  public void setColumnWidthPercentage(Double columnWidthPercentage) {
    this.columnWidthPercentage = columnWidthPercentage;
  }


  public ResizableReportColumnSettings field(FieldReference field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FieldReference getField() {
    return field;
  }


  public void setField(FieldReference field) {
    this.field = field;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResizableReportColumnSettings resizableReportColumnSettings = (ResizableReportColumnSettings) o;
    return Objects.equals(this.columnIndex, resizableReportColumnSettings.columnIndex) &&
        Objects.equals(this.columnWidthPercentage, resizableReportColumnSettings.columnWidthPercentage) &&
        Objects.equals(this.field, resizableReportColumnSettings.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnIndex, columnWidthPercentage, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResizableReportColumnSettings {\n");
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
    sb.append("    columnWidthPercentage: ").append(toIndentedString(columnWidthPercentage)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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
    openapiFields.add("columnIndex");
    openapiFields.add("columnWidthPercentage");
    openapiFields.add("field");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("columnIndex");
    openapiRequiredFields.add("field");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResizableReportColumnSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResizableReportColumnSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResizableReportColumnSettings is not found in the empty JSON string", ResizableReportColumnSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResizableReportColumnSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResizableReportColumnSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResizableReportColumnSettings.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `field`
      if (jsonObj.getAsJsonObject("field") != null) {
        FieldReference.validateJsonObject(jsonObj.getAsJsonObject("field"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResizableReportColumnSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResizableReportColumnSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResizableReportColumnSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResizableReportColumnSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<ResizableReportColumnSettings>() {
           @Override
           public void write(JsonWriter out, ResizableReportColumnSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResizableReportColumnSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResizableReportColumnSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResizableReportColumnSettings
  * @throws IOException if the JSON string is invalid with respect to ResizableReportColumnSettings
  */
  public static ResizableReportColumnSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResizableReportColumnSettings.class);
  }

 /**
  * Convert an instance of ResizableReportColumnSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


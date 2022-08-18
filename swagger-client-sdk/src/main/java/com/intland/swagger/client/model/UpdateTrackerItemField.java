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
 * Update fields of a tracker item
 */
@ApiModel(description = "Update fields of a tracker item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class UpdateTrackerItemField {
  public static final String SERIALIZED_NAME_FIELD_VALUES = "fieldValues";
  @SerializedName(SERIALIZED_NAME_FIELD_VALUES)
  private List<AbstractFieldValue> fieldValues = null;

  public static final String SERIALIZED_NAME_TABLE_VALUES = "tableValues";
  @SerializedName(SERIALIZED_NAME_TABLE_VALUES)
  private List<TableFieldValue> tableValues = null;

  public UpdateTrackerItemField() { 
  }

  public UpdateTrackerItemField fieldValues(List<AbstractFieldValue> fieldValues) {
    
    this.fieldValues = fieldValues;
    return this;
  }

  public UpdateTrackerItemField addFieldValuesItem(AbstractFieldValue fieldValuesItem) {
    if (this.fieldValues == null) {
      this.fieldValues = new ArrayList<>();
    }
    this.fieldValues.add(fieldValuesItem);
    return this;
  }

   /**
   * Fields of a tracker item
   * @return fieldValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields of a tracker item")

  public List<AbstractFieldValue> getFieldValues() {
    return fieldValues;
  }


  public void setFieldValues(List<AbstractFieldValue> fieldValues) {
    this.fieldValues = fieldValues;
  }


  public UpdateTrackerItemField tableValues(List<TableFieldValue> tableValues) {
    
    this.tableValues = tableValues;
    return this;
  }

  public UpdateTrackerItemField addTableValuesItem(TableFieldValue tableValuesItem) {
    if (this.tableValues == null) {
      this.tableValues = new ArrayList<>();
    }
    this.tableValues.add(tableValuesItem);
    return this;
  }

   /**
   * Fields of a tracker item
   * @return tableValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields of a tracker item")

  public List<TableFieldValue> getTableValues() {
    return tableValues;
  }


  public void setTableValues(List<TableFieldValue> tableValues) {
    this.tableValues = tableValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTrackerItemField updateTrackerItemField = (UpdateTrackerItemField) o;
    return Objects.equals(this.fieldValues, updateTrackerItemField.fieldValues) &&
        Objects.equals(this.tableValues, updateTrackerItemField.tableValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldValues, tableValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTrackerItemField {\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    tableValues: ").append(toIndentedString(tableValues)).append("\n");
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
    openapiFields.add("fieldValues");
    openapiFields.add("tableValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateTrackerItemField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateTrackerItemField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateTrackerItemField is not found in the empty JSON string", UpdateTrackerItemField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateTrackerItemField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateTrackerItemField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayfieldValues = jsonObj.getAsJsonArray("fieldValues");
      if (jsonArrayfieldValues != null) {
        // ensure the json data is an array
        if (!jsonObj.get("fieldValues").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `fieldValues` to be an array in the JSON string but got `%s`", jsonObj.get("fieldValues").toString()));
        }

        // validate the optional field `fieldValues` (array)
        for (int i = 0; i < jsonArrayfieldValues.size(); i++) {
          AbstractFieldValue.validateJsonObject(jsonArrayfieldValues.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraytableValues = jsonObj.getAsJsonArray("tableValues");
      if (jsonArraytableValues != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tableValues").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tableValues` to be an array in the JSON string but got `%s`", jsonObj.get("tableValues").toString()));
        }

        // validate the optional field `tableValues` (array)
        for (int i = 0; i < jsonArraytableValues.size(); i++) {
          TableFieldValue.validateJsonObject(jsonArraytableValues.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateTrackerItemField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateTrackerItemField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateTrackerItemField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateTrackerItemField.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateTrackerItemField>() {
           @Override
           public void write(JsonWriter out, UpdateTrackerItemField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateTrackerItemField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateTrackerItemField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateTrackerItemField
  * @throws IOException if the JSON string is invalid with respect to UpdateTrackerItemField
  */
  public static UpdateTrackerItemField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateTrackerItemField.class);
  }

 /**
  * Convert an instance of UpdateTrackerItemField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


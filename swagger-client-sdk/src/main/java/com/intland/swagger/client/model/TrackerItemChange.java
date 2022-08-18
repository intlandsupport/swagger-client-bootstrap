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
 * Reference to an item
 */
@ApiModel(description = "Reference to an item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class TrackerItemChange {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldReference field;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private AbstractFieldValue newValue;

  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private AbstractFieldValue oldValue;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  protected String type;

  public TrackerItemChange() { 
    this.type = this.getClass().getSimpleName();
  }

  public TrackerItemChange field(FieldReference field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldReference getField() {
    return field;
  }


  public void setField(FieldReference field) {
    this.field = field;
  }


  public TrackerItemChange name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the field
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the field")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TrackerItemChange newValue(AbstractFieldValue newValue) {
    
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbstractFieldValue getNewValue() {
    return newValue;
  }


  public void setNewValue(AbstractFieldValue newValue) {
    this.newValue = newValue;
  }


  public TrackerItemChange oldValue(AbstractFieldValue oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AbstractFieldValue getOldValue() {
    return oldValue;
  }


  public void setOldValue(AbstractFieldValue oldValue) {
    this.oldValue = oldValue;
  }


  public TrackerItemChange type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Change model type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Change model type")

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
    TrackerItemChange trackerItemChange = (TrackerItemChange) o;
    return Objects.equals(this.field, trackerItemChange.field) &&
        Objects.equals(this.name, trackerItemChange.name) &&
        Objects.equals(this.newValue, trackerItemChange.newValue) &&
        Objects.equals(this.oldValue, trackerItemChange.oldValue) &&
        Objects.equals(this.type, trackerItemChange.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, name, newValue, oldValue, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemChange {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("name");
    openapiFields.add("newValue");
    openapiFields.add("oldValue");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackerItemChange
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackerItemChange.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackerItemChange is not found in the empty JSON string", TrackerItemChange.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonObj.get("type").getAsString();
      switch (discriminatorValue) {
        case "TrackerItemRowChange":
          TrackerItemRowChange.validateJsonObject(jsonObj);
          break;
        default: 
          throw new IllegalArgumentException(String.format("The value of the `type` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of TrackerItemChange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackerItemChange
  * @throws IOException if the JSON string is invalid with respect to TrackerItemChange
  */
  public static TrackerItemChange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackerItemChange.class);
  }

 /**
  * Convert an instance of TrackerItemChange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


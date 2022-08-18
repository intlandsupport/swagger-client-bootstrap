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
 * Value container of a referred test step
 */
@ApiModel(description = "Value container of a referred test step")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class ReferredTestStepFieldValue extends AbstractFieldValue {
  public static final String SERIALIZED_NAME_REFERRED_STEP_ID = "referredStepId";
  @SerializedName(SERIALIZED_NAME_REFERRED_STEP_ID)
  private String referredStepId;

  public static final String SERIALIZED_NAME_REFERRED_TEST_CASE_ID = "referredTestCaseId";
  @SerializedName(SERIALIZED_NAME_REFERRED_TEST_CASE_ID)
  private Integer referredTestCaseId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ReferredTestStepFieldValue() { 
    this.type = this.getClass().getSimpleName();
  }

  public ReferredTestStepFieldValue referredStepId(String referredStepId) {
    
    this.referredStepId = referredStepId;
    return this;
  }

   /**
   * Id of the referred test step
   * @return referredStepId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Id of the referred test step")

  public String getReferredStepId() {
    return referredStepId;
  }


  public void setReferredStepId(String referredStepId) {
    this.referredStepId = referredStepId;
  }


  public ReferredTestStepFieldValue referredTestCaseId(Integer referredTestCaseId) {
    
    this.referredTestCaseId = referredTestCaseId;
    return this;
  }

   /**
   * Id of the test case where the referred test step comes
   * @return referredTestCaseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Id of the test case where the referred test step comes")

  public Integer getReferredTestCaseId() {
    return referredTestCaseId;
  }


  public void setReferredTestCaseId(Integer referredTestCaseId) {
    this.referredTestCaseId = referredTestCaseId;
  }


  public ReferredTestStepFieldValue value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Id of the Test Step
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the Test Step")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferredTestStepFieldValue referredTestStepFieldValue = (ReferredTestStepFieldValue) o;
    return Objects.equals(this.referredStepId, referredTestStepFieldValue.referredStepId) &&
        Objects.equals(this.referredTestCaseId, referredTestStepFieldValue.referredTestCaseId) &&
        Objects.equals(this.value, referredTestStepFieldValue.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredStepId, referredTestCaseId, value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferredTestStepFieldValue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    referredStepId: ").append(toIndentedString(referredStepId)).append("\n");
    sb.append("    referredTestCaseId: ").append(toIndentedString(referredTestCaseId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("fieldId");
    openapiFields.add("name");
    openapiFields.add("sharedFieldName");
    openapiFields.add("type");
    openapiFields.add("referredStepId");
    openapiFields.add("referredTestCaseId");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("referredStepId");
    openapiRequiredFields.add("referredTestCaseId");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReferredTestStepFieldValue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReferredTestStepFieldValue.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReferredTestStepFieldValue is not found in the empty JSON string", ReferredTestStepFieldValue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReferredTestStepFieldValue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReferredTestStepFieldValue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReferredTestStepFieldValue.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReferredTestStepFieldValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReferredTestStepFieldValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReferredTestStepFieldValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReferredTestStepFieldValue.class));

       return (TypeAdapter<T>) new TypeAdapter<ReferredTestStepFieldValue>() {
           @Override
           public void write(JsonWriter out, ReferredTestStepFieldValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReferredTestStepFieldValue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReferredTestStepFieldValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReferredTestStepFieldValue
  * @throws IOException if the JSON string is invalid with respect to ReferredTestStepFieldValue
  */
  public static ReferredTestStepFieldValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReferredTestStepFieldValue.class);
  }

 /**
  * Convert an instance of ReferredTestStepFieldValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


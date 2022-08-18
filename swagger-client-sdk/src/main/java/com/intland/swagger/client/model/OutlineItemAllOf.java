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
 * OutlineItemAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class OutlineItemAllOf {
  public static final String SERIALIZED_NAME_HAS_CHILDREN = "hasChildren";
  @SerializedName(SERIALIZED_NAME_HAS_CHILDREN)
  private Boolean hasChildren;

  public static final String SERIALIZED_NAME_ITEM_REFERENCE = "itemReference";
  @SerializedName(SERIALIZED_NAME_ITEM_REFERENCE)
  private TrackerItemReference itemReference;

  public OutlineItemAllOf() { 
  }

  public OutlineItemAllOf hasChildren(Boolean hasChildren) {
    
    this.hasChildren = hasChildren;
    return this;
  }

   /**
   * Indicator if the item has child items.
   * @return hasChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator if the item has child items.")

  public Boolean getHasChildren() {
    return hasChildren;
  }


  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }


  public OutlineItemAllOf itemReference(TrackerItemReference itemReference) {
    
    this.itemReference = itemReference;
    return this;
  }

   /**
   * Get itemReference
   * @return itemReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItemReference getItemReference() {
    return itemReference;
  }


  public void setItemReference(TrackerItemReference itemReference) {
    this.itemReference = itemReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineItemAllOf outlineItemAllOf = (OutlineItemAllOf) o;
    return Objects.equals(this.hasChildren, outlineItemAllOf.hasChildren) &&
        Objects.equals(this.itemReference, outlineItemAllOf.itemReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasChildren, itemReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineItemAllOf {\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    itemReference: ").append(toIndentedString(itemReference)).append("\n");
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
    openapiFields.add("hasChildren");
    openapiFields.add("itemReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OutlineItemAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OutlineItemAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutlineItemAllOf is not found in the empty JSON string", OutlineItemAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OutlineItemAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutlineItemAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `itemReference`
      if (jsonObj.getAsJsonObject("itemReference") != null) {
        TrackerItemReference.validateJsonObject(jsonObj.getAsJsonObject("itemReference"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutlineItemAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutlineItemAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutlineItemAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutlineItemAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<OutlineItemAllOf>() {
           @Override
           public void write(JsonWriter out, OutlineItemAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutlineItemAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutlineItemAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutlineItemAllOf
  * @throws IOException if the JSON string is invalid with respect to OutlineItemAllOf
  */
  public static OutlineItemAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutlineItemAllOf.class);
  }

 /**
  * Convert an instance of OutlineItemAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


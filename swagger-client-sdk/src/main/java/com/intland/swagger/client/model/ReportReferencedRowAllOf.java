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

import io.swagger.annotations.ApiModelProperty;

/**
 * ReportReferencedRowAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class ReportReferencedRowAllOf {
  public static final String SERIALIZED_NAME_CELLS = "cells";
  @SerializedName(SERIALIZED_NAME_CELLS)
  private List<ReportCell> cells = null;

  public static final String SERIALIZED_NAME_IS_REAL_RESULT = "isRealResult";
  @SerializedName(SERIALIZED_NAME_IS_REAL_RESULT)
  private Boolean isRealResult;

  public static final String SERIALIZED_NAME_ITEM_REF = "itemRef";
  @SerializedName(SERIALIZED_NAME_ITEM_REF)
  private ReportItemReference itemRef;

  public static final String SERIALIZED_NAME_OUTLINE_LEVEL = "outlineLevel";
  @SerializedName(SERIALIZED_NAME_OUTLINE_LEVEL)
  private Integer outlineLevel;

  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private ReportReferenceLevel references;

  public ReportReferencedRowAllOf() { 
  }

  public ReportReferencedRowAllOf cells(List<ReportCell> cells) {
    
    this.cells = cells;
    return this;
  }

  public ReportReferencedRowAllOf addCellsItem(ReportCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Cells in a row.
   * @return cells
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cells in a row.")

  public List<ReportCell> getCells() {
    return cells;
  }


  public void setCells(List<ReportCell> cells) {
    this.cells = cells;
  }


  public ReportReferencedRowAllOf isRealResult(Boolean isRealResult) {
    
    this.isRealResult = isRealResult;
    return this;
  }

   /**
   * Indicator if the item is a real query result (e.g. not an ancestor item).
   * @return isRealResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator if the item is a real query result (e.g. not an ancestor item).")

  public Boolean getIsRealResult() {
    return isRealResult;
  }


  public void setIsRealResult(Boolean isRealResult) {
    this.isRealResult = isRealResult;
  }


  public ReportReferencedRowAllOf itemRef(ReportItemReference itemRef) {
    
    this.itemRef = itemRef;
    return this;
  }

   /**
   * Get itemRef
   * @return itemRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportItemReference getItemRef() {
    return itemRef;
  }


  public void setItemRef(ReportItemReference itemRef) {
    this.itemRef = itemRef;
  }


  public ReportReferencedRowAllOf outlineLevel(Integer outlineLevel) {
    
    this.outlineLevel = outlineLevel;
    return this;
  }

   /**
   * Item&#39;s level in the tracker outline.
   * @return outlineLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item's level in the tracker outline.")

  public Integer getOutlineLevel() {
    return outlineLevel;
  }


  public void setOutlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
  }


  public ReportReferencedRowAllOf references(ReportReferenceLevel references) {
    
    this.references = references;
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportReferenceLevel getReferences() {
    return references;
  }


  public void setReferences(ReportReferenceLevel references) {
    this.references = references;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReferencedRowAllOf reportReferencedRowAllOf = (ReportReferencedRowAllOf) o;
    return Objects.equals(this.cells, reportReferencedRowAllOf.cells) &&
        Objects.equals(this.isRealResult, reportReferencedRowAllOf.isRealResult) &&
        Objects.equals(this.itemRef, reportReferencedRowAllOf.itemRef) &&
        Objects.equals(this.outlineLevel, reportReferencedRowAllOf.outlineLevel) &&
        Objects.equals(this.references, reportReferencedRowAllOf.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells, isRealResult, itemRef, outlineLevel, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReferencedRowAllOf {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    isRealResult: ").append(toIndentedString(isRealResult)).append("\n");
    sb.append("    itemRef: ").append(toIndentedString(itemRef)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
    openapiFields.add("cells");
    openapiFields.add("isRealResult");
    openapiFields.add("itemRef");
    openapiFields.add("outlineLevel");
    openapiFields.add("references");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportReferencedRowAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportReferencedRowAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportReferencedRowAllOf is not found in the empty JSON string", ReportReferencedRowAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportReferencedRowAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportReferencedRowAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycells = jsonObj.getAsJsonArray("cells");
      if (jsonArraycells != null) {
        // ensure the json data is an array
        if (!jsonObj.get("cells").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `cells` to be an array in the JSON string but got `%s`", jsonObj.get("cells").toString()));
        }

        // validate the optional field `cells` (array)
        for (int i = 0; i < jsonArraycells.size(); i++) {
          ReportCell.validateJsonObject(jsonArraycells.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `itemRef`
      if (jsonObj.getAsJsonObject("itemRef") != null) {
        ReportItemReference.validateJsonObject(jsonObj.getAsJsonObject("itemRef"));
      }
      // validate the optional field `references`
      if (jsonObj.getAsJsonObject("references") != null) {
        ReportReferenceLevel.validateJsonObject(jsonObj.getAsJsonObject("references"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportReferencedRowAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportReferencedRowAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportReferencedRowAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportReferencedRowAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportReferencedRowAllOf>() {
           @Override
           public void write(JsonWriter out, ReportReferencedRowAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportReferencedRowAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportReferencedRowAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportReferencedRowAllOf
  * @throws IOException if the JSON string is invalid with respect to ReportReferencedRowAllOf
  */
  public static ReportReferencedRowAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportReferencedRowAllOf.class);
  }

 /**
  * Convert an instance of ReportReferencedRowAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


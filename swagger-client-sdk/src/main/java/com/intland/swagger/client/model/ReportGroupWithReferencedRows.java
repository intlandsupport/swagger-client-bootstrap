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
 * ReportGroup having rows with references.
 */
@ApiModel(description = "ReportGroup having rows with references.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class ReportGroupWithReferencedRows extends ReportGroup {
  public static final String SERIALIZED_NAME_GROUPING_LEVEL = "groupingLevel";
  @SerializedName(SERIALIZED_NAME_GROUPING_LEVEL)
  private Integer groupingLevel;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<ReportReferencedRow> rows = null;

  public static final String SERIALIZED_NAME_STAR_ROW = "starRow";
  @SerializedName(SERIALIZED_NAME_STAR_ROW)
  private Integer starRow;

  public ReportGroupWithReferencedRows() { 
    this.type = this.getClass().getSimpleName();
  }

  public ReportGroupWithReferencedRows groupingLevel(Integer groupingLevel) {
    
    this.groupingLevel = groupingLevel;
    return this;
  }

   /**
   * Get groupingLevel
   * @return groupingLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGroupingLevel() {
    return groupingLevel;
  }


  public void setGroupingLevel(Integer groupingLevel) {
    this.groupingLevel = groupingLevel;
  }


  public ReportGroupWithReferencedRows rows(List<ReportReferencedRow> rows) {
    
    this.rows = rows;
    return this;
  }

  public ReportGroupWithReferencedRows addRowsItem(ReportReferencedRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReportReferencedRow> getRows() {
    return rows;
  }


  public void setRows(List<ReportReferencedRow> rows) {
    this.rows = rows;
  }


  public ReportGroupWithReferencedRows starRow(Integer starRow) {
    
    this.starRow = starRow;
    return this;
  }

   /**
   * Get starRow
   * @return starRow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStarRow() {
    return starRow;
  }


  public void setStarRow(Integer starRow) {
    this.starRow = starRow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportGroupWithReferencedRows reportGroupWithReferencedRows = (ReportGroupWithReferencedRows) o;
    return Objects.equals(this.groupingLevel, reportGroupWithReferencedRows.groupingLevel) &&
        Objects.equals(this.rows, reportGroupWithReferencedRows.rows) &&
        Objects.equals(this.starRow, reportGroupWithReferencedRows.starRow) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupingLevel, rows, starRow, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportGroupWithReferencedRows {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    groupingLevel: ").append(toIndentedString(groupingLevel)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    starRow: ").append(toIndentedString(starRow)).append("\n");
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
    openapiFields.add("aggregates");
    openapiFields.add("count");
    openapiFields.add("groupingValue");
    openapiFields.add("groupingValueId");
    openapiFields.add("header");
    openapiFields.add("type");
    openapiFields.add("groupingLevel");
    openapiFields.add("rows");
    openapiFields.add("starRow");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportGroupWithReferencedRows
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportGroupWithReferencedRows.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportGroupWithReferencedRows is not found in the empty JSON string", ReportGroupWithReferencedRows.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportGroupWithReferencedRows.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportGroupWithReferencedRows` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportGroupWithReferencedRows.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportGroupWithReferencedRows' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportGroupWithReferencedRows> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportGroupWithReferencedRows.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportGroupWithReferencedRows>() {
           @Override
           public void write(JsonWriter out, ReportGroupWithReferencedRows value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportGroupWithReferencedRows read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportGroupWithReferencedRows given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportGroupWithReferencedRows
  * @throws IOException if the JSON string is invalid with respect to ReportGroupWithReferencedRows
  */
  public static ReportGroupWithReferencedRows fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportGroupWithReferencedRows.class);
  }

 /**
  * Convert an instance of ReportGroupWithReferencedRows to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


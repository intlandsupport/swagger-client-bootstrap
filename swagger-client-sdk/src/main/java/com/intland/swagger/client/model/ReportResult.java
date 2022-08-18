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
 * Report data model
 */
@ApiModel(description = "Report data model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class ReportResult {
  public static final String SERIALIZED_NAME_CB_Q_L = "cbQL";
  @SerializedName(SERIALIZED_NAME_CB_Q_L)
  private String cbQL;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ReportColumn> columns = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ReportGroup data;

  public static final String SERIALIZED_NAME_PAGING_INFORMATION = "pagingInformation";
  @SerializedName(SERIALIZED_NAME_PAGING_INFORMATION)
  private ReportPagingInformation pagingInformation;

  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private ReportReference report;

  public static final String SERIALIZED_NAME_SHOW_ALL_CHILDREN = "showAllChildren";
  @SerializedName(SERIALIZED_NAME_SHOW_ALL_CHILDREN)
  private Boolean showAllChildren;

  public ReportResult() { 
  }

  public ReportResult cbQL(String cbQL) {
    
    this.cbQL = cbQL;
    return this;
  }

   /**
   * CbQL query behind the report
   * @return cbQL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "project.id IN (2) AND tracker.id IN (21323) ORDER BY priority ASC", value = "CbQL query behind the report")

  public String getCbQL() {
    return cbQL;
  }


  public void setCbQL(String cbQL) {
    this.cbQL = cbQL;
  }


  public ReportResult columns(List<ReportColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public ReportResult addColumnsItem(ReportColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Column information
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Column information")

  public List<ReportColumn> getColumns() {
    return columns;
  }


  public void setColumns(List<ReportColumn> columns) {
    this.columns = columns;
  }


  public ReportResult data(ReportGroup data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportGroup getData() {
    return data;
  }


  public void setData(ReportGroup data) {
    this.data = data;
  }


  public ReportResult pagingInformation(ReportPagingInformation pagingInformation) {
    
    this.pagingInformation = pagingInformation;
    return this;
  }

   /**
   * Get pagingInformation
   * @return pagingInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportPagingInformation getPagingInformation() {
    return pagingInformation;
  }


  public void setPagingInformation(ReportPagingInformation pagingInformation) {
    this.pagingInformation = pagingInformation;
  }


  public ReportResult report(ReportReference report) {
    
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportReference getReport() {
    return report;
  }


  public void setReport(ReportReference report) {
    this.report = report;
  }


  public ReportResult showAllChildren(Boolean showAllChildren) {
    
    this.showAllChildren = showAllChildren;
    return this;
  }

   /**
   * Indicator to ability to collapse/expand all child items.
   * @return showAllChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator to ability to collapse/expand all child items.")

  public Boolean getShowAllChildren() {
    return showAllChildren;
  }


  public void setShowAllChildren(Boolean showAllChildren) {
    this.showAllChildren = showAllChildren;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportResult reportResult = (ReportResult) o;
    return Objects.equals(this.cbQL, reportResult.cbQL) &&
        Objects.equals(this.columns, reportResult.columns) &&
        Objects.equals(this.data, reportResult.data) &&
        Objects.equals(this.pagingInformation, reportResult.pagingInformation) &&
        Objects.equals(this.report, reportResult.report) &&
        Objects.equals(this.showAllChildren, reportResult.showAllChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cbQL, columns, data, pagingInformation, report, showAllChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportResult {\n");
    sb.append("    cbQL: ").append(toIndentedString(cbQL)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    pagingInformation: ").append(toIndentedString(pagingInformation)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    showAllChildren: ").append(toIndentedString(showAllChildren)).append("\n");
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
    openapiFields.add("cbQL");
    openapiFields.add("columns");
    openapiFields.add("data");
    openapiFields.add("pagingInformation");
    openapiFields.add("report");
    openapiFields.add("showAllChildren");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportResult is not found in the empty JSON string", ReportResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cbQL") != null && !jsonObj.get("cbQL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cbQL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cbQL").toString()));
      }
      JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
      if (jsonArraycolumns != null) {
        // ensure the json data is an array
        if (!jsonObj.get("columns").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
        }

        // validate the optional field `columns` (array)
        for (int i = 0; i < jsonArraycolumns.size(); i++) {
          ReportColumn.validateJsonObject(jsonArraycolumns.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        ReportGroup.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      // validate the optional field `pagingInformation`
      if (jsonObj.getAsJsonObject("pagingInformation") != null) {
        ReportPagingInformation.validateJsonObject(jsonObj.getAsJsonObject("pagingInformation"));
      }
      // validate the optional field `report`
      if (jsonObj.getAsJsonObject("report") != null) {
        ReportReference.validateJsonObject(jsonObj.getAsJsonObject("report"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportResult>() {
           @Override
           public void write(JsonWriter out, ReportResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportResult
  * @throws IOException if the JSON string is invalid with respect to ReportResult
  */
  public static ReportResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportResult.class);
  }

 /**
  * Convert an instance of ReportResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


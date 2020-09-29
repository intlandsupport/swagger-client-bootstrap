/*
 * codeBeamer swagger API
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.model.TraceabilityItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Traceability result
 */
@ApiModel(description = "Traceability result")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class TraceabilityResult {
  public static final String SERIALIZED_NAME_LIMIT_WARNINGS = "limitWarnings";
  @SerializedName(SERIALIZED_NAME_LIMIT_WARNINGS)
  private String limitWarnings;

  public static final String SERIALIZED_NAME_TRACEABILITY_ITEMS = "traceabilityItems";
  @SerializedName(SERIALIZED_NAME_TRACEABILITY_ITEMS)
  private List<TraceabilityItem> traceabilityItems = null;


  public TraceabilityResult limitWarnings(String limitWarnings) {
    
    this.limitWarnings = limitWarnings;
    return this;
  }

   /**
   * limit warnings
   * @return limitWarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "limit warnings")

  public String getLimitWarnings() {
    return limitWarnings;
  }


  public void setLimitWarnings(String limitWarnings) {
    this.limitWarnings = limitWarnings;
  }


  public TraceabilityResult traceabilityItems(List<TraceabilityItem> traceabilityItems) {
    
    this.traceabilityItems = traceabilityItems;
    return this;
  }

  public TraceabilityResult addTraceabilityItemsItem(TraceabilityItem traceabilityItemsItem) {
    if (this.traceabilityItems == null) {
      this.traceabilityItems = new ArrayList<TraceabilityItem>();
    }
    this.traceabilityItems.add(traceabilityItemsItem);
    return this;
  }

   /**
   * traceability items
   * @return traceabilityItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "traceability items")

  public List<TraceabilityItem> getTraceabilityItems() {
    return traceabilityItems;
  }


  public void setTraceabilityItems(List<TraceabilityItem> traceabilityItems) {
    this.traceabilityItems = traceabilityItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityResult traceabilityResult = (TraceabilityResult) o;
    return Objects.equals(this.limitWarnings, traceabilityResult.limitWarnings) &&
        Objects.equals(this.traceabilityItems, traceabilityResult.traceabilityItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitWarnings, traceabilityItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityResult {\n");
    sb.append("    limitWarnings: ").append(toIndentedString(limitWarnings)).append("\n");
    sb.append("    traceabilityItems: ").append(toIndentedString(traceabilityItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Cell value for a column.
 */
@ApiModel(description = "Cell value for a column.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class ReportCell {
  public static final String SERIALIZED_NAME_COLUMN_REF = "columnRef";
  @SerializedName(SERIALIZED_NAME_COLUMN_REF)
  private String columnRef;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value;


  public ReportCell columnRef(String columnRef) {
    
    this.columnRef = columnRef;
    return this;
  }

   /**
   * Column reference
   * @return columnRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Column reference")

  public String getColumnRef() {
    return columnRef;
  }


  public void setColumnRef(String columnRef) {
    this.columnRef = columnRef;
  }


  public ReportCell value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * Cell value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12.32", value = "Cell value")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
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
    ReportCell reportCell = (ReportCell) o;
    return Objects.equals(this.columnRef, reportCell.columnRef) &&
        Objects.equals(this.value, reportCell.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnRef, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCell {\n");
    sb.append("    columnRef: ").append(toIndentedString(columnRef)).append("\n");
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

}


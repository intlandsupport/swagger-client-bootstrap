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
 * Settings for a column definition.
 */
@ApiModel(description = "Settings for a column definition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T12:30:20.007+01:00[Europe/Budapest]")
public class ReportColumnSettings {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldReference field;

  public static final String SERIALIZED_NAME_COLUMN_INDEX = "columnIndex";
  @SerializedName(SERIALIZED_NAME_COLUMN_INDEX)
  private Integer columnIndex;


  public ReportColumnSettings field(FieldReference field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(required = true, value = "")

  public FieldReference getField() {
    return field;
  }


  public void setField(FieldReference field) {
    this.field = field;
  }


  public ReportColumnSettings columnIndex(Integer columnIndex) {
    
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Index of the column in the report table.
   * @return columnIndex
  **/
  @ApiModelProperty(example = "0", required = true, value = "Index of the column in the report table.")

  public Integer getColumnIndex() {
    return columnIndex;
  }


  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportColumnSettings reportColumnSettings = (ReportColumnSettings) o;
    return Objects.equals(this.field, reportColumnSettings.field) &&
        Objects.equals(this.columnIndex, reportColumnSettings.columnIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, columnIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportColumnSettings {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
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


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
 * Aggregated values for a column of a group.
 */
@ApiModel(description = "Aggregated values for a column of a group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class ReportAggregate {
  public static final String SERIALIZED_NAME_AVERAGE = "average";
  @SerializedName(SERIALIZED_NAME_AVERAGE)
  private Double average;

  public static final String SERIALIZED_NAME_COLUMN_REF = "columnRef";
  @SerializedName(SERIALIZED_NAME_COLUMN_REF)
  private String columnRef;

  public static final String SERIALIZED_NAME_MAXIMUM = "maximum";
  @SerializedName(SERIALIZED_NAME_MAXIMUM)
  private Double maximum;

  public static final String SERIALIZED_NAME_MINIMUM = "minimum";
  @SerializedName(SERIALIZED_NAME_MINIMUM)
  private Double minimum;

  public static final String SERIALIZED_NAME_SUM = "sum";
  @SerializedName(SERIALIZED_NAME_SUM)
  private Double sum;


  public ReportAggregate average(Double average) {
    
    this.average = average;
    return this;
  }

   /**
   * Average of the column values
   * @return average
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11.32", value = "Average of the column values")

  public Double getAverage() {
    return average;
  }


  public void setAverage(Double average) {
    this.average = average;
  }


  public ReportAggregate columnRef(String columnRef) {
    
    this.columnRef = columnRef;
    return this;
  }

   /**
   * Column reference
   * @return columnRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11-1", value = "Column reference")

  public String getColumnRef() {
    return columnRef;
  }


  public void setColumnRef(String columnRef) {
    this.columnRef = columnRef;
  }


  public ReportAggregate maximum(Double maximum) {
    
    this.maximum = maximum;
    return this;
  }

   /**
   * Average of the column values
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21.32", value = "Average of the column values")

  public Double getMaximum() {
    return maximum;
  }


  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }


  public ReportAggregate minimum(Double minimum) {
    
    this.minimum = minimum;
    return this;
  }

   /**
   * Minimum of the column values
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.32", value = "Minimum of the column values")

  public Double getMinimum() {
    return minimum;
  }


  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }


  public ReportAggregate sum(Double sum) {
    
    this.sum = sum;
    return this;
  }

   /**
   * Sum of the column values
   * @return sum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "22.64", value = "Sum of the column values")

  public Double getSum() {
    return sum;
  }


  public void setSum(Double sum) {
    this.sum = sum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAggregate reportAggregate = (ReportAggregate) o;
    return Objects.equals(this.average, reportAggregate.average) &&
        Objects.equals(this.columnRef, reportAggregate.columnRef) &&
        Objects.equals(this.maximum, reportAggregate.maximum) &&
        Objects.equals(this.minimum, reportAggregate.minimum) &&
        Objects.equals(this.sum, reportAggregate.sum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, columnRef, maximum, minimum, sum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAggregate {\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    columnRef: ").append(toIndentedString(columnRef)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
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


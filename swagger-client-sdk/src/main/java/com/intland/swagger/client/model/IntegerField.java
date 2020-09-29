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
import com.intland.swagger.client.model.AbstractField;
import com.intland.swagger.client.model.ChoiceOptionReference;
import com.intland.swagger.client.model.IntegerFieldAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Integer field
 */
@ApiModel(description = "Integer field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class IntegerField extends AbstractField {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_FORMULA = "formula";
  @SerializedName(SERIALIZED_NAME_FORMULA)
  private String formula;


  public IntegerField min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * Minimum value of a field
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum value of a field")

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
    this.min = min;
  }


  public IntegerField max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * Maximum value of a field
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum value of a field")

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public IntegerField formula(String formula) {
    
    this.formula = formula;
    return this;
  }

   /**
   * Formula value of a field
   * @return formula
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Formula value of a field")

  public String getFormula() {
    return formula;
  }


  public void setFormula(String formula) {
    this.formula = formula;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegerField integerField = (IntegerField) o;
    return Objects.equals(this.min, integerField.min) &&
        Objects.equals(this.max, integerField.max) &&
        Objects.equals(this.formula, integerField.formula) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, formula, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegerField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
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


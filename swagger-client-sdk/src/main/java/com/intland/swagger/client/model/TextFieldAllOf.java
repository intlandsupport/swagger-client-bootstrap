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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TextFieldAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class TextFieldAllOf {
  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_FORMULA = "formula";
  @SerializedName(SERIALIZED_NAME_FORMULA)
  private String formula;


  public TextFieldAllOf min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * Minimum length of value of a field
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum length of value of a field")

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
    this.min = min;
  }


  public TextFieldAllOf max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * Max length of value of a field
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max length of value of a field")

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public TextFieldAllOf formula(String formula) {
    
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
    TextFieldAllOf textFieldAllOf = (TextFieldAllOf) o;
    return Objects.equals(this.min, textFieldAllOf.min) &&
        Objects.equals(this.max, textFieldAllOf.max) &&
        Objects.equals(this.formula, textFieldAllOf.formula);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, formula);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFieldAllOf {\n");
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


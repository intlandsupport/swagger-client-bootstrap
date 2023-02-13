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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Option type choice field
 */
@ApiModel(description = "Option type choice field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T12:30:20.007+01:00[Europe/Budapest]")
public class OptionChoiceField extends AbstractField {
  public static final String SERIALIZED_NAME_MULTIPLE_VALUES = "multipleValues";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_VALUES)
  private Boolean multipleValues;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ChoiceOptionReference> options = null;

  public static final String SERIALIZED_NAME_REFERENCE_TYPE = "referenceType";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TYPE)
  private String referenceType;


  public OptionChoiceField multipleValues(Boolean multipleValues) {
    
    this.multipleValues = multipleValues;
    return this;
  }

   /**
   * Multiple values state of a field
   * @return multipleValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Multiple values state of a field")

  public Boolean getMultipleValues() {
    return multipleValues;
  }


  public void setMultipleValues(Boolean multipleValues) {
    this.multipleValues = multipleValues;
  }


  public OptionChoiceField options(List<ChoiceOptionReference> options) {
    
    this.options = options;
    return this;
  }

  public OptionChoiceField addOptionsItem(ChoiceOptionReference optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<ChoiceOptionReference>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Available options of a choice field
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Available options of a choice field")

  public List<ChoiceOptionReference> getOptions() {
    return options;
  }


  public void setOptions(List<ChoiceOptionReference> options) {
    this.options = options;
  }


  public OptionChoiceField referenceType(String referenceType) {
    
    this.referenceType = referenceType;
    return this;
  }

   /**
   * Type of the contained references
   * @return referenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the contained references")

  public String getReferenceType() {
    return referenceType;
  }


  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionChoiceField optionChoiceField = (OptionChoiceField) o;
    return Objects.equals(this.multipleValues, optionChoiceField.multipleValues) &&
        Objects.equals(this.options, optionChoiceField.options) &&
        Objects.equals(this.referenceType, optionChoiceField.referenceType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleValues, options, referenceType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionChoiceField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    multipleValues: ").append(toIndentedString(multipleValues)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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


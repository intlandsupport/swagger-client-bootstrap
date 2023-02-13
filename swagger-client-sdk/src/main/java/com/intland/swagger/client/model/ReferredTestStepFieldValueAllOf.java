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

import io.swagger.annotations.ApiModelProperty;

/**
 * ReferredTestStepFieldValueAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T12:30:20.007+01:00[Europe/Budapest]")
public class ReferredTestStepFieldValueAllOf {
  public static final String SERIALIZED_NAME_REFERRED_STEP_ID = "referredStepId";
  @SerializedName(SERIALIZED_NAME_REFERRED_STEP_ID)
  private String referredStepId;

  public static final String SERIALIZED_NAME_REFERRED_TEST_CASE_ID = "referredTestCaseId";
  @SerializedName(SERIALIZED_NAME_REFERRED_TEST_CASE_ID)
  private Integer referredTestCaseId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public ReferredTestStepFieldValueAllOf referredStepId(String referredStepId) {
    
    this.referredStepId = referredStepId;
    return this;
  }

   /**
   * Id of the referred test step
   * @return referredStepId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the referred test step")

  public String getReferredStepId() {
    return referredStepId;
  }


  public void setReferredStepId(String referredStepId) {
    this.referredStepId = referredStepId;
  }


  public ReferredTestStepFieldValueAllOf referredTestCaseId(Integer referredTestCaseId) {
    
    this.referredTestCaseId = referredTestCaseId;
    return this;
  }

   /**
   * Id of the test case where the referred test step comes
   * @return referredTestCaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the test case where the referred test step comes")

  public Integer getReferredTestCaseId() {
    return referredTestCaseId;
  }


  public void setReferredTestCaseId(Integer referredTestCaseId) {
    this.referredTestCaseId = referredTestCaseId;
  }


  public ReferredTestStepFieldValueAllOf value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Id of the Test Step
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the Test Step")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferredTestStepFieldValueAllOf referredTestStepFieldValueAllOf = (ReferredTestStepFieldValueAllOf) o;
    return Objects.equals(this.referredStepId, referredTestStepFieldValueAllOf.referredStepId) &&
        Objects.equals(this.referredTestCaseId, referredTestStepFieldValueAllOf.referredTestCaseId) &&
        Objects.equals(this.value, referredTestStepFieldValueAllOf.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referredStepId, referredTestCaseId, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferredTestStepFieldValueAllOf {\n");
    sb.append("    referredStepId: ").append(toIndentedString(referredStepId)).append("\n");
    sb.append("    referredTestCaseId: ").append(toIndentedString(referredTestCaseId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


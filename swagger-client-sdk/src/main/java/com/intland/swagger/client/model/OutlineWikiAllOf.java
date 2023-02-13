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
 * OutlineWikiAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class OutlineWikiAllOf {
  public static final String SERIALIZED_NAME_WIKI_PAGE_REFERENCE_MODEL = "wikiPageReferenceModel";
  @SerializedName(SERIALIZED_NAME_WIKI_PAGE_REFERENCE_MODEL)
  private WikiPageReference wikiPageReferenceModel;


  public OutlineWikiAllOf wikiPageReferenceModel(WikiPageReference wikiPageReferenceModel) {
    
    this.wikiPageReferenceModel = wikiPageReferenceModel;
    return this;
  }

   /**
   * Get wikiPageReferenceModel
   * @return wikiPageReferenceModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WikiPageReference getWikiPageReferenceModel() {
    return wikiPageReferenceModel;
  }


  public void setWikiPageReferenceModel(WikiPageReference wikiPageReferenceModel) {
    this.wikiPageReferenceModel = wikiPageReferenceModel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineWikiAllOf outlineWikiAllOf = (OutlineWikiAllOf) o;
    return Objects.equals(this.wikiPageReferenceModel, outlineWikiAllOf.wikiPageReferenceModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wikiPageReferenceModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineWikiAllOf {\n");
    sb.append("    wikiPageReferenceModel: ").append(toIndentedString(wikiPageReferenceModel)).append("\n");
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


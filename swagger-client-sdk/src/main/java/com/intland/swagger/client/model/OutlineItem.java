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
 * Represents an outline item.
 */
@ApiModel(description = "Represents an outline item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T12:30:20.007+01:00[Europe/Budapest]")
public class OutlineItem extends AbstractOutline {
  public static final String SERIALIZED_NAME_ITEM_REFERENCE = "itemReference";
  @SerializedName(SERIALIZED_NAME_ITEM_REFERENCE)
  private TrackerItemReference itemReference;

  public static final String SERIALIZED_NAME_HAS_CHILDREN = "hasChildren";
  @SerializedName(SERIALIZED_NAME_HAS_CHILDREN)
  private Boolean hasChildren;


  public OutlineItem itemReference(TrackerItemReference itemReference) {
    
    this.itemReference = itemReference;
    return this;
  }

   /**
   * Get itemReference
   * @return itemReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItemReference getItemReference() {
    return itemReference;
  }


  public void setItemReference(TrackerItemReference itemReference) {
    this.itemReference = itemReference;
  }


  public OutlineItem hasChildren(Boolean hasChildren) {
    
    this.hasChildren = hasChildren;
    return this;
  }

   /**
   * Indicator if the item has child items.
   * @return hasChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator if the item has child items.")

  public Boolean getHasChildren() {
    return hasChildren;
  }


  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineItem outlineItem = (OutlineItem) o;
    return Objects.equals(this.itemReference, outlineItem.itemReference) &&
        Objects.equals(this.hasChildren, outlineItem.hasChildren) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemReference, hasChildren, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    itemReference: ").append(toIndentedString(itemReference)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
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


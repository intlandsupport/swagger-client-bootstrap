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

import io.swagger.annotations.ApiModelProperty;

/**
 * ReportReferencedRowAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class ReportReferencedRowAllOf {
  public static final String SERIALIZED_NAME_CELLS = "cells";
  @SerializedName(SERIALIZED_NAME_CELLS)
  private List<ReportCell> cells = null;

  public static final String SERIALIZED_NAME_IS_REAL_RESULT = "isRealResult";
  @SerializedName(SERIALIZED_NAME_IS_REAL_RESULT)
  private Boolean isRealResult;

  public static final String SERIALIZED_NAME_ITEM_REF = "itemRef";
  @SerializedName(SERIALIZED_NAME_ITEM_REF)
  private ReportItemReference itemRef;

  public static final String SERIALIZED_NAME_OUTLINE_LEVEL = "outlineLevel";
  @SerializedName(SERIALIZED_NAME_OUTLINE_LEVEL)
  private Integer outlineLevel;

  public static final String SERIALIZED_NAME_REFERENCES = "references";
  @SerializedName(SERIALIZED_NAME_REFERENCES)
  private ReportReferenceLevel references;


  public ReportReferencedRowAllOf cells(List<ReportCell> cells) {
    
    this.cells = cells;
    return this;
  }

  public ReportReferencedRowAllOf addCellsItem(ReportCell cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<ReportCell>();
    }
    this.cells.add(cellsItem);
    return this;
  }

   /**
   * Cells in a row.
   * @return cells
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cells in a row.")

  public List<ReportCell> getCells() {
    return cells;
  }


  public void setCells(List<ReportCell> cells) {
    this.cells = cells;
  }


  public ReportReferencedRowAllOf isRealResult(Boolean isRealResult) {
    
    this.isRealResult = isRealResult;
    return this;
  }

   /**
   * Indicator if the item is a real query result (e.g. not an ancestor item).
   * @return isRealResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator if the item is a real query result (e.g. not an ancestor item).")

  public Boolean getIsRealResult() {
    return isRealResult;
  }


  public void setIsRealResult(Boolean isRealResult) {
    this.isRealResult = isRealResult;
  }


  public ReportReferencedRowAllOf itemRef(ReportItemReference itemRef) {
    
    this.itemRef = itemRef;
    return this;
  }

   /**
   * Get itemRef
   * @return itemRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportItemReference getItemRef() {
    return itemRef;
  }


  public void setItemRef(ReportItemReference itemRef) {
    this.itemRef = itemRef;
  }


  public ReportReferencedRowAllOf outlineLevel(Integer outlineLevel) {
    
    this.outlineLevel = outlineLevel;
    return this;
  }

   /**
   * Item&#39;s level in the tracker outline.
   * @return outlineLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item's level in the tracker outline.")

  public Integer getOutlineLevel() {
    return outlineLevel;
  }


  public void setOutlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
  }


  public ReportReferencedRowAllOf references(ReportReferenceLevel references) {
    
    this.references = references;
    return this;
  }

   /**
   * Get references
   * @return references
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportReferenceLevel getReferences() {
    return references;
  }


  public void setReferences(ReportReferenceLevel references) {
    this.references = references;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReferencedRowAllOf reportReferencedRowAllOf = (ReportReferencedRowAllOf) o;
    return Objects.equals(this.cells, reportReferencedRowAllOf.cells) &&
        Objects.equals(this.isRealResult, reportReferencedRowAllOf.isRealResult) &&
        Objects.equals(this.itemRef, reportReferencedRowAllOf.itemRef) &&
        Objects.equals(this.outlineLevel, reportReferencedRowAllOf.outlineLevel) &&
        Objects.equals(this.references, reportReferencedRowAllOf.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cells, isRealResult, itemRef, outlineLevel, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReferencedRowAllOf {\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    isRealResult: ").append(toIndentedString(isRealResult)).append("\n");
    sb.append("    itemRef: ").append(toIndentedString(itemRef)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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


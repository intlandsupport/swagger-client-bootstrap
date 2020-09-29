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
import com.intland.swagger.client.model.OutlineItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Paginated search result of outline items
 */
@ApiModel(description = "Paginated search result of outline items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class OutlineItemSearchResult {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_OUTLINE_ITEMS = "outlineItems";
  @SerializedName(SERIALIZED_NAME_OUTLINE_ITEMS)
  private List<OutlineItem> outlineItems = null;


  public OutlineItemSearchResult page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * Index of the page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index of the page")

  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public OutlineItemSearchResult pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Size of the found page
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the found page")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public OutlineItemSearchResult total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Number of matched tracker items by the search criteria
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of matched tracker items by the search criteria")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public OutlineItemSearchResult outlineItems(List<OutlineItem> outlineItems) {
    
    this.outlineItems = outlineItems;
    return this;
  }

  public OutlineItemSearchResult addOutlineItemsItem(OutlineItem outlineItemsItem) {
    if (this.outlineItems == null) {
      this.outlineItems = new ArrayList<OutlineItem>();
    }
    this.outlineItems.add(outlineItemsItem);
    return this;
  }

   /**
   * Found outline items
   * @return outlineItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Found outline items")

  public List<OutlineItem> getOutlineItems() {
    return outlineItems;
  }


  public void setOutlineItems(List<OutlineItem> outlineItems) {
    this.outlineItems = outlineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlineItemSearchResult outlineItemSearchResult = (OutlineItemSearchResult) o;
    return Objects.equals(this.page, outlineItemSearchResult.page) &&
        Objects.equals(this.pageSize, outlineItemSearchResult.pageSize) &&
        Objects.equals(this.total, outlineItemSearchResult.total) &&
        Objects.equals(this.outlineItems, outlineItemSearchResult.outlineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, total, outlineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlineItemSearchResult {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    outlineItems: ").append(toIndentedString(outlineItems)).append("\n");
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


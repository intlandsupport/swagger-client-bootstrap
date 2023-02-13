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
 * Report data model
 */
@ApiModel(description = "Report data model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class ReportResult {
  public static final String SERIALIZED_NAME_CB_Q_L = "cbQL";
  @SerializedName(SERIALIZED_NAME_CB_Q_L)
  private String cbQL;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ReportColumn> columns = null;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private ReportGroup data;

  public static final String SERIALIZED_NAME_PAGING_INFORMATION = "pagingInformation";
  @SerializedName(SERIALIZED_NAME_PAGING_INFORMATION)
  private ReportPagingInformation pagingInformation;

  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private ReportReference report;

  public static final String SERIALIZED_NAME_SHOW_ALL_CHILDREN = "showAllChildren";
  @SerializedName(SERIALIZED_NAME_SHOW_ALL_CHILDREN)
  private Boolean showAllChildren;


  public ReportResult cbQL(String cbQL) {
    
    this.cbQL = cbQL;
    return this;
  }

   /**
   * CbQL query behind the report
   * @return cbQL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "project.id IN (2) AND tracker.id IN (21323) ORDER BY priority ASC", value = "CbQL query behind the report")

  public String getCbQL() {
    return cbQL;
  }


  public void setCbQL(String cbQL) {
    this.cbQL = cbQL;
  }


  public ReportResult columns(List<ReportColumn> columns) {
    
    this.columns = columns;
    return this;
  }

  public ReportResult addColumnsItem(ReportColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ReportColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Column information
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Column information")

  public List<ReportColumn> getColumns() {
    return columns;
  }


  public void setColumns(List<ReportColumn> columns) {
    this.columns = columns;
  }


  public ReportResult data(ReportGroup data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportGroup getData() {
    return data;
  }


  public void setData(ReportGroup data) {
    this.data = data;
  }


  public ReportResult pagingInformation(ReportPagingInformation pagingInformation) {
    
    this.pagingInformation = pagingInformation;
    return this;
  }

   /**
   * Get pagingInformation
   * @return pagingInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportPagingInformation getPagingInformation() {
    return pagingInformation;
  }


  public void setPagingInformation(ReportPagingInformation pagingInformation) {
    this.pagingInformation = pagingInformation;
  }


  public ReportResult report(ReportReference report) {
    
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReportReference getReport() {
    return report;
  }


  public void setReport(ReportReference report) {
    this.report = report;
  }


  public ReportResult showAllChildren(Boolean showAllChildren) {
    
    this.showAllChildren = showAllChildren;
    return this;
  }

   /**
   * Indicator to ability to collapse/expand all child items.
   * @return showAllChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator to ability to collapse/expand all child items.")

  public Boolean getShowAllChildren() {
    return showAllChildren;
  }


  public void setShowAllChildren(Boolean showAllChildren) {
    this.showAllChildren = showAllChildren;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportResult reportResult = (ReportResult) o;
    return Objects.equals(this.cbQL, reportResult.cbQL) &&
        Objects.equals(this.columns, reportResult.columns) &&
        Objects.equals(this.data, reportResult.data) &&
        Objects.equals(this.pagingInformation, reportResult.pagingInformation) &&
        Objects.equals(this.report, reportResult.report) &&
        Objects.equals(this.showAllChildren, reportResult.showAllChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cbQL, columns, data, pagingInformation, report, showAllChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportResult {\n");
    sb.append("    cbQL: ").append(toIndentedString(cbQL)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    pagingInformation: ").append(toIndentedString(pagingInformation)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    showAllChildren: ").append(toIndentedString(showAllChildren)).append("\n");
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


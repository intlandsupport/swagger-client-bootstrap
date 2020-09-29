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
import com.intland.swagger.client.model.ReportReferenceLevelSettings;
import com.intland.swagger.client.model.ResizableReportColumnSettings;
import com.intland.swagger.client.model.TrackerReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Settings of a report on a tracker.
 */
@ApiModel(description = "Settings of a report on a tracker.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class TrackerReportSettings {
  public static final String SERIALIZED_NAME_REPORT_ID = "reportId";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private Integer reportId;

  public static final String SERIALIZED_NAME_CB_QL = "cbQl";
  @SerializedName(SERIALIZED_NAME_CB_QL)
  private String cbQl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ResizableReportColumnSettings> columns = new ArrayList<ResizableReportColumnSettings>();

  public static final String SERIALIZED_NAME_SHOW_ANCESTORS = "showAncestors";
  @SerializedName(SERIALIZED_NAME_SHOW_ANCESTORS)
  private Boolean showAncestors;

  public static final String SERIALIZED_NAME_SHOW_DESCENDANTS = "showDescendants";
  @SerializedName(SERIALIZED_NAME_SHOW_DESCENDANTS)
  private Boolean showDescendants;

  public static final String SERIALIZED_NAME_SHOW_ALL_CHILDREN = "showAllChildren";
  @SerializedName(SERIALIZED_NAME_SHOW_ALL_CHILDREN)
  private Boolean showAllChildren;

  public static final String SERIALIZED_NAME_TRACKER = "tracker";
  @SerializedName(SERIALIZED_NAME_TRACKER)
  private TrackerReference tracker;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "isPublic";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  /**
   * Rendering method for Intelligent Table View.
   */
  @JsonAdapter(RenderingMethodEnum.Adapter.class)
  public enum RenderingMethodEnum {
    DISABLED("disabled"),
    
    TABLE("table"),
    
    TREE("tree");

    private String value;

    RenderingMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RenderingMethodEnum fromValue(String value) {
      for (RenderingMethodEnum b : RenderingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RenderingMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RenderingMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RenderingMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RenderingMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RENDERING_METHOD = "renderingMethod";
  @SerializedName(SERIALIZED_NAME_RENDERING_METHOD)
  private RenderingMethodEnum renderingMethod;

  public static final String SERIALIZED_NAME_REFERENCE_LEVEL_SETTINGS = "referenceLevelSettings";
  @SerializedName(SERIALIZED_NAME_REFERENCE_LEVEL_SETTINGS)
  private List<ReportReferenceLevelSettings> referenceLevelSettings = null;


  public TrackerReportSettings reportId(Integer reportId) {
    
    this.reportId = reportId;
    return this;
  }

   /**
   * Id of a report
   * @return reportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Id of a report")

  public Integer getReportId() {
    return reportId;
  }


  public void setReportId(Integer reportId) {
    this.reportId = reportId;
  }


  public TrackerReportSettings cbQl(String cbQl) {
    
    this.cbQl = cbQl;
    return this;
  }

   /**
   * CbQL query string of the report.
   * @return cbQl
  **/
  @ApiModelProperty(example = "priority='Normal'", required = true, value = "CbQL query string of the report.")

  public String getCbQl() {
    return cbQl;
  }


  public void setCbQl(String cbQl) {
    this.cbQl = cbQl;
  }


  public TrackerReportSettings name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the report.
   * @return name
  **/
  @ApiModelProperty(example = "My first query", required = true, value = "Name of the report.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TrackerReportSettings description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the report.
   * @return description
  **/
  @ApiModelProperty(example = "Normal priority items.", required = true, value = "Description of the report.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TrackerReportSettings columns(List<ResizableReportColumnSettings> columns) {
    
    this.columns = columns;
    return this;
  }

  public TrackerReportSettings addColumnsItem(ResizableReportColumnSettings columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Column definitions.
   * @return columns
  **/
  @ApiModelProperty(required = true, value = "Column definitions.")

  public List<ResizableReportColumnSettings> getColumns() {
    return columns;
  }


  public void setColumns(List<ResizableReportColumnSettings> columns) {
    this.columns = columns;
  }


  public TrackerReportSettings showAncestors(Boolean showAncestors) {
    
    this.showAncestors = showAncestors;
    return this;
  }

   /**
   * Indicator to show the ancestors of a result item.
   * @return showAncestors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicator to show the ancestors of a result item.")

  public Boolean getShowAncestors() {
    return showAncestors;
  }


  public void setShowAncestors(Boolean showAncestors) {
    this.showAncestors = showAncestors;
  }


  public TrackerReportSettings showDescendants(Boolean showDescendants) {
    
    this.showDescendants = showDescendants;
    return this;
  }

   /**
   * Indicator to show the descendants of a result item.
   * @return showDescendants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicator to show the descendants of a result item.")

  public Boolean getShowDescendants() {
    return showDescendants;
  }


  public void setShowDescendants(Boolean showDescendants) {
    this.showDescendants = showDescendants;
  }


  public TrackerReportSettings showAllChildren(Boolean showAllChildren) {
    
    this.showAllChildren = showAllChildren;
    return this;
  }

   /**
   * Indicator to ability to collapse/expand all child items.
   * @return showAllChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Indicator to ability to collapse/expand all child items.")

  public Boolean getShowAllChildren() {
    return showAllChildren;
  }


  public void setShowAllChildren(Boolean showAllChildren) {
    this.showAllChildren = showAllChildren;
  }


  public TrackerReportSettings tracker(TrackerReference tracker) {
    
    this.tracker = tracker;
    return this;
  }

   /**
   * Get tracker
   * @return tracker
  **/
  @ApiModelProperty(required = true, value = "")

  public TrackerReference getTracker() {
    return tracker;
  }


  public void setTracker(TrackerReference tracker) {
    this.tracker = tracker;
  }


  public TrackerReportSettings isPublic(Boolean isPublic) {
    
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Public report indicator.
   * @return isPublic
  **/
  @ApiModelProperty(example = "true", required = true, value = "Public report indicator.")

  public Boolean getIsPublic() {
    return isPublic;
  }


  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public TrackerReportSettings renderingMethod(RenderingMethodEnum renderingMethod) {
    
    this.renderingMethod = renderingMethod;
    return this;
  }

   /**
   * Rendering method for Intelligent Table View.
   * @return renderingMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "table", value = "Rendering method for Intelligent Table View.")

  public RenderingMethodEnum getRenderingMethod() {
    return renderingMethod;
  }


  public void setRenderingMethod(RenderingMethodEnum renderingMethod) {
    this.renderingMethod = renderingMethod;
  }


  public TrackerReportSettings referenceLevelSettings(List<ReportReferenceLevelSettings> referenceLevelSettings) {
    
    this.referenceLevelSettings = referenceLevelSettings;
    return this;
  }

  public TrackerReportSettings addReferenceLevelSettingsItem(ReportReferenceLevelSettings referenceLevelSettingsItem) {
    if (this.referenceLevelSettings == null) {
      this.referenceLevelSettings = new ArrayList<ReportReferenceLevelSettings>();
    }
    this.referenceLevelSettings.add(referenceLevelSettingsItem);
    return this;
  }

   /**
   * Reference level setting for Intelligent Table View.
   * @return referenceLevelSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference level setting for Intelligent Table View.")

  public List<ReportReferenceLevelSettings> getReferenceLevelSettings() {
    return referenceLevelSettings;
  }


  public void setReferenceLevelSettings(List<ReportReferenceLevelSettings> referenceLevelSettings) {
    this.referenceLevelSettings = referenceLevelSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerReportSettings trackerReportSettings = (TrackerReportSettings) o;
    return Objects.equals(this.reportId, trackerReportSettings.reportId) &&
        Objects.equals(this.cbQl, trackerReportSettings.cbQl) &&
        Objects.equals(this.name, trackerReportSettings.name) &&
        Objects.equals(this.description, trackerReportSettings.description) &&
        Objects.equals(this.columns, trackerReportSettings.columns) &&
        Objects.equals(this.showAncestors, trackerReportSettings.showAncestors) &&
        Objects.equals(this.showDescendants, trackerReportSettings.showDescendants) &&
        Objects.equals(this.showAllChildren, trackerReportSettings.showAllChildren) &&
        Objects.equals(this.tracker, trackerReportSettings.tracker) &&
        Objects.equals(this.isPublic, trackerReportSettings.isPublic) &&
        Objects.equals(this.renderingMethod, trackerReportSettings.renderingMethod) &&
        Objects.equals(this.referenceLevelSettings, trackerReportSettings.referenceLevelSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, cbQl, name, description, columns, showAncestors, showDescendants, showAllChildren, tracker, isPublic, renderingMethod, referenceLevelSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerReportSettings {\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    cbQl: ").append(toIndentedString(cbQl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    showAncestors: ").append(toIndentedString(showAncestors)).append("\n");
    sb.append("    showDescendants: ").append(toIndentedString(showDescendants)).append("\n");
    sb.append("    showAllChildren: ").append(toIndentedString(showAllChildren)).append("\n");
    sb.append("    tracker: ").append(toIndentedString(tracker)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    renderingMethod: ").append(toIndentedString(renderingMethod)).append("\n");
    sb.append("    referenceLevelSettings: ").append(toIndentedString(referenceLevelSettings)).append("\n");
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


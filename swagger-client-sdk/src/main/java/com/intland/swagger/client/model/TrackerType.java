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

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.JSON;

import io.swagger.annotations.ApiModelProperty;

/**
 * TrackerType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class TrackerType {
  public static final String SERIALIZED_NAME_BRANCHABLE = "branchable";
  @SerializedName(SERIALIZED_NAME_BRANCHABLE)
  private Boolean branchable;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_DOC_EDIT_VIEW = "docEditView";
  @SerializedName(SERIALIZED_NAME_DOC_EDIT_VIEW)
  private Boolean docEditView;

  public static final String SERIALIZED_NAME_EDITOR_URL = "editorUrl";
  @SerializedName(SERIALIZED_NAME_EDITOR_URL)
  private String editorUrl;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ITEM_ICON_URL = "itemIconUrl";
  @SerializedName(SERIALIZED_NAME_ITEM_ICON_URL)
  private String itemIconUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OUTLINE = "outline";
  @SerializedName(SERIALIZED_NAME_OUTLINE)
  private Boolean outline;

  public static final String SERIALIZED_NAME_TRACKER_ICON_URL = "trackerIconUrl";
  @SerializedName(SERIALIZED_NAME_TRACKER_ICON_URL)
  private String trackerIconUrl;

  public static final String SERIALIZED_NAME_URL_LINK_FORMAT = "urlLinkFormat";
  @SerializedName(SERIALIZED_NAME_URL_LINK_FORMAT)
  private String urlLinkFormat;

  public static final String SERIALIZED_NAME_VAR_NAME = "varName";
  @SerializedName(SERIALIZED_NAME_VAR_NAME)
  private String varName;

  public TrackerType() { 
  }

  public TrackerType branchable(Boolean branchable) {
    
    this.branchable = branchable;
    return this;
  }

   /**
   * True if tracker type is branchable
   * @return branchable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if tracker type is branchable")

  public Boolean getBranchable() {
    return branchable;
  }


  public void setBranchable(Boolean branchable) {
    this.branchable = branchable;
  }


  public TrackerType color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Color of a tracker type
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color of a tracker type")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public TrackerType docEditView(Boolean docEditView) {
    
    this.docEditView = docEditView;
    return this;
  }

   /**
   * True if tracker type has document view
   * @return docEditView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if tracker type has document view")

  public Boolean getDocEditView() {
    return docEditView;
  }


  public void setDocEditView(Boolean docEditView) {
    this.docEditView = docEditView;
  }


  public TrackerType editorUrl(String editorUrl) {
    
    this.editorUrl = editorUrl;
    return this;
  }

   /**
   * Editor URL of a tracker type
   * @return editorUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Editor URL of a tracker type")

  public String getEditorUrl() {
    return editorUrl;
  }


  public void setEditorUrl(String editorUrl) {
    this.editorUrl = editorUrl;
  }


  public TrackerType id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the entity
   * minimum: 0
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the entity")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TrackerType itemIconUrl(String itemIconUrl) {
    
    this.itemIconUrl = itemIconUrl;
    return this;
  }

   /**
   * Item icon URL of a tracker type
   * @return itemIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item icon URL of a tracker type")

  public String getItemIconUrl() {
    return itemIconUrl;
  }


  public void setItemIconUrl(String itemIconUrl) {
    this.itemIconUrl = itemIconUrl;
  }


  public TrackerType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the entity")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TrackerType outline(Boolean outline) {
    
    this.outline = outline;
    return this;
  }

   /**
   * True if outline is enabled
   * @return outline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if outline is enabled")

  public Boolean getOutline() {
    return outline;
  }


  public void setOutline(Boolean outline) {
    this.outline = outline;
  }


  public TrackerType trackerIconUrl(String trackerIconUrl) {
    
    this.trackerIconUrl = trackerIconUrl;
    return this;
  }

   /**
   * Tracker icon URL of a tracker type
   * @return trackerIconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tracker icon URL of a tracker type")

  public String getTrackerIconUrl() {
    return trackerIconUrl;
  }


  public void setTrackerIconUrl(String trackerIconUrl) {
    this.trackerIconUrl = trackerIconUrl;
  }


  public TrackerType urlLinkFormat(String urlLinkFormat) {
    
    this.urlLinkFormat = urlLinkFormat;
    return this;
  }

   /**
   * URL link format of a tracker type
   * @return urlLinkFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL link format of a tracker type")

  public String getUrlLinkFormat() {
    return urlLinkFormat;
  }


  public void setUrlLinkFormat(String urlLinkFormat) {
    this.urlLinkFormat = urlLinkFormat;
  }


  public TrackerType varName(String varName) {
    
    this.varName = varName;
    return this;
  }

   /**
   * Internal/variable name of a tracker type
   * @return varName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal/variable name of a tracker type")

  public String getVarName() {
    return varName;
  }


  public void setVarName(String varName) {
    this.varName = varName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerType trackerType = (TrackerType) o;
    return Objects.equals(this.branchable, trackerType.branchable) &&
        Objects.equals(this.color, trackerType.color) &&
        Objects.equals(this.docEditView, trackerType.docEditView) &&
        Objects.equals(this.editorUrl, trackerType.editorUrl) &&
        Objects.equals(this.id, trackerType.id) &&
        Objects.equals(this.itemIconUrl, trackerType.itemIconUrl) &&
        Objects.equals(this.name, trackerType.name) &&
        Objects.equals(this.outline, trackerType.outline) &&
        Objects.equals(this.trackerIconUrl, trackerType.trackerIconUrl) &&
        Objects.equals(this.urlLinkFormat, trackerType.urlLinkFormat) &&
        Objects.equals(this.varName, trackerType.varName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchable, color, docEditView, editorUrl, id, itemIconUrl, name, outline, trackerIconUrl, urlLinkFormat, varName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerType {\n");
    sb.append("    branchable: ").append(toIndentedString(branchable)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    docEditView: ").append(toIndentedString(docEditView)).append("\n");
    sb.append("    editorUrl: ").append(toIndentedString(editorUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemIconUrl: ").append(toIndentedString(itemIconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outline: ").append(toIndentedString(outline)).append("\n");
    sb.append("    trackerIconUrl: ").append(toIndentedString(trackerIconUrl)).append("\n");
    sb.append("    urlLinkFormat: ").append(toIndentedString(urlLinkFormat)).append("\n");
    sb.append("    varName: ").append(toIndentedString(varName)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("branchable");
    openapiFields.add("color");
    openapiFields.add("docEditView");
    openapiFields.add("editorUrl");
    openapiFields.add("id");
    openapiFields.add("itemIconUrl");
    openapiFields.add("name");
    openapiFields.add("outline");
    openapiFields.add("trackerIconUrl");
    openapiFields.add("urlLinkFormat");
    openapiFields.add("varName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackerType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackerType.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackerType is not found in the empty JSON string", TrackerType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackerType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackerType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("color") != null && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      if (jsonObj.get("editorUrl") != null && !jsonObj.get("editorUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `editorUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("editorUrl").toString()));
      }
      if (jsonObj.get("itemIconUrl") != null && !jsonObj.get("itemIconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemIconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemIconUrl").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("trackerIconUrl") != null && !jsonObj.get("trackerIconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackerIconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackerIconUrl").toString()));
      }
      if (jsonObj.get("urlLinkFormat") != null && !jsonObj.get("urlLinkFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `urlLinkFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("urlLinkFormat").toString()));
      }
      if (jsonObj.get("varName") != null && !jsonObj.get("varName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `varName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("varName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackerType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackerType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackerType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackerType.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackerType>() {
           @Override
           public void write(JsonWriter out, TrackerType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackerType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackerType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackerType
  * @throws IOException if the JSON string is invalid with respect to TrackerType
  */
  public static TrackerType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackerType.class);
  }

 /**
  * Convert an instance of TrackerType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


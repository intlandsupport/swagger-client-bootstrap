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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.JSON;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * One page of attachments.
 */
@ApiModel(description = "One page of attachments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class AttachmentSearchResult {
  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public AttachmentSearchResult() { 
  }

  public AttachmentSearchResult attachments(List<Attachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public AttachmentSearchResult addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Found attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Found attachments")

  public List<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  public AttachmentSearchResult page(Integer page) {
    
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


  public AttachmentSearchResult pageSize(Integer pageSize) {
    
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


  public AttachmentSearchResult total(Integer total) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentSearchResult attachmentSearchResult = (AttachmentSearchResult) o;
    return Objects.equals(this.attachments, attachmentSearchResult.attachments) &&
        Objects.equals(this.page, attachmentSearchResult.page) &&
        Objects.equals(this.pageSize, attachmentSearchResult.pageSize) &&
        Objects.equals(this.total, attachmentSearchResult.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, page, pageSize, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentSearchResult {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("page");
    openapiFields.add("pageSize");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttachmentSearchResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AttachmentSearchResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentSearchResult is not found in the empty JSON string", AttachmentSearchResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AttachmentSearchResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachmentSearchResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      if (jsonArrayattachments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attachments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
        }

        // validate the optional field `attachments` (array)
        for (int i = 0; i < jsonArrayattachments.size(); i++) {
          Attachment.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentSearchResult>() {
           @Override
           public void write(JsonWriter out, AttachmentSearchResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachmentSearchResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttachmentSearchResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachmentSearchResult
  * @throws IOException if the JSON string is invalid with respect to AttachmentSearchResult
  */
  public static AttachmentSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentSearchResult.class);
  }

 /**
  * Convert an instance of AttachmentSearchResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


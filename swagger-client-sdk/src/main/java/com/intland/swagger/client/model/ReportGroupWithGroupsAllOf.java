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

import io.swagger.annotations.ApiModelProperty;

/**
 * ReportGroupWithGroupsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class ReportGroupWithGroupsAllOf {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<ReportGroup> groups = null;

  public ReportGroupWithGroupsAllOf() { 
  }

  public ReportGroupWithGroupsAllOf groups(List<ReportGroup> groups) {
    
    this.groups = groups;
    return this;
  }

  public ReportGroupWithGroupsAllOf addGroupsItem(ReportGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Subgroups in the group.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subgroups in the group.")

  public List<ReportGroup> getGroups() {
    return groups;
  }


  public void setGroups(List<ReportGroup> groups) {
    this.groups = groups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportGroupWithGroupsAllOf reportGroupWithGroupsAllOf = (ReportGroupWithGroupsAllOf) o;
    return Objects.equals(this.groups, reportGroupWithGroupsAllOf.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportGroupWithGroupsAllOf {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
    openapiFields.add("groups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportGroupWithGroupsAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportGroupWithGroupsAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportGroupWithGroupsAllOf is not found in the empty JSON string", ReportGroupWithGroupsAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportGroupWithGroupsAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportGroupWithGroupsAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
      if (jsonArraygroups != null) {
        // ensure the json data is an array
        if (!jsonObj.get("groups").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
        }

        // validate the optional field `groups` (array)
        for (int i = 0; i < jsonArraygroups.size(); i++) {
          ReportGroup.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportGroupWithGroupsAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportGroupWithGroupsAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportGroupWithGroupsAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportGroupWithGroupsAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportGroupWithGroupsAllOf>() {
           @Override
           public void write(JsonWriter out, ReportGroupWithGroupsAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportGroupWithGroupsAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportGroupWithGroupsAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportGroupWithGroupsAllOf
  * @throws IOException if the JSON string is invalid with respect to ReportGroupWithGroupsAllOf
  */
  public static ReportGroupWithGroupsAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportGroupWithGroupsAllOf.class);
  }

 /**
  * Convert an instance of ReportGroupWithGroupsAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


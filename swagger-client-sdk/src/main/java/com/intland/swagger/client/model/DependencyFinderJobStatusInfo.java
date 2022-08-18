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
 * Status information of a dependency finder job
 */
@ApiModel(description = "Status information of a dependency finder job")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class DependencyFinderJobStatusInfo extends AbstractBackgroundJobStatusInfo {
  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<CrossProjectDependency> dependencies = null;

  public static final String SERIALIZED_NAME_PROJECTS_CHECKED = "projectsChecked";
  @SerializedName(SERIALIZED_NAME_PROJECTS_CHECKED)
  private Integer projectsChecked;

  public static final String SERIALIZED_NAME_PROJECTS_SCHEDULED = "projectsScheduled";
  @SerializedName(SERIALIZED_NAME_PROJECTS_SCHEDULED)
  private Integer projectsScheduled;

  public DependencyFinderJobStatusInfo() { 
    this.type = this.getClass().getSimpleName();
  }

  public DependencyFinderJobStatusInfo dependencies(List<CrossProjectDependency> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public DependencyFinderJobStatusInfo addDependenciesItem(CrossProjectDependency dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Dependencies found among projects.
   * @return dependencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dependencies found among projects.")

  public List<CrossProjectDependency> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<CrossProjectDependency> dependencies) {
    this.dependencies = dependencies;
  }


  public DependencyFinderJobStatusInfo projectsChecked(Integer projectsChecked) {
    
    this.projectsChecked = projectsChecked;
    return this;
  }

   /**
   * Number of projects already checked for dependencies
   * @return projectsChecked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of projects already checked for dependencies")

  public Integer getProjectsChecked() {
    return projectsChecked;
  }


  public void setProjectsChecked(Integer projectsChecked) {
    this.projectsChecked = projectsChecked;
  }


  public DependencyFinderJobStatusInfo projectsScheduled(Integer projectsScheduled) {
    
    this.projectsScheduled = projectsScheduled;
    return this;
  }

   /**
   * Number of projects scheduled for dependency collection
   * @return projectsScheduled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of projects scheduled for dependency collection")

  public Integer getProjectsScheduled() {
    return projectsScheduled;
  }


  public void setProjectsScheduled(Integer projectsScheduled) {
    this.projectsScheduled = projectsScheduled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependencyFinderJobStatusInfo dependencyFinderJobStatusInfo = (DependencyFinderJobStatusInfo) o;
    return Objects.equals(this.dependencies, dependencyFinderJobStatusInfo.dependencies) &&
        Objects.equals(this.projectsChecked, dependencyFinderJobStatusInfo.projectsChecked) &&
        Objects.equals(this.projectsScheduled, dependencyFinderJobStatusInfo.projectsScheduled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependencies, projectsChecked, projectsScheduled, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependencyFinderJobStatusInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    projectsChecked: ").append(toIndentedString(projectsChecked)).append("\n");
    sb.append("    projectsScheduled: ").append(toIndentedString(projectsScheduled)).append("\n");
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
    openapiFields.add("progressPercentage");
    openapiFields.add("stepInProgress");
    openapiFields.add("type");
    openapiFields.add("dependencies");
    openapiFields.add("projectsChecked");
    openapiFields.add("projectsScheduled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DependencyFinderJobStatusInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DependencyFinderJobStatusInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DependencyFinderJobStatusInfo is not found in the empty JSON string", DependencyFinderJobStatusInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DependencyFinderJobStatusInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DependencyFinderJobStatusInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DependencyFinderJobStatusInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DependencyFinderJobStatusInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DependencyFinderJobStatusInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DependencyFinderJobStatusInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DependencyFinderJobStatusInfo>() {
           @Override
           public void write(JsonWriter out, DependencyFinderJobStatusInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DependencyFinderJobStatusInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DependencyFinderJobStatusInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DependencyFinderJobStatusInfo
  * @throws IOException if the JSON string is invalid with respect to DependencyFinderJobStatusInfo
  */
  public static DependencyFinderJobStatusInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DependencyFinderJobStatusInfo.class);
  }

 /**
  * Convert an instance of DependencyFinderJobStatusInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


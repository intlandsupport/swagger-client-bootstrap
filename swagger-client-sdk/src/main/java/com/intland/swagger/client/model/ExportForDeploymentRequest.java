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
 * Request export for deployment
 */
@ApiModel(description = "Request export for deployment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T11:38:56.646+02:00[Europe/Budapest]")
public class ExportForDeploymentRequest {
  public static final String SERIALIZED_NAME_EXPORT_FILE_NAME = "exportFileName";
  @SerializedName(SERIALIZED_NAME_EXPORT_FILE_NAME)
  private String exportFileName;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_PROJECT_SETTINGS = "projectSettings";
  @SerializedName(SERIALIZED_NAME_PROJECT_SETTINGS)
  private List<DeploymentProjectExportSettings> projectSettings = null;

  public static final String SERIALIZED_NAME_SCHEMA_NAME = "schemaName";
  @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
  private String schemaName;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schemaVersion";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private String schemaVersion;

  public ExportForDeploymentRequest() { 
  }

  
  public ExportForDeploymentRequest(
     String schemaName, 
     String schemaVersion
  ) {
    this();
    this.schemaName = schemaName;
    this.schemaVersion = schemaVersion;
  }

  public ExportForDeploymentRequest exportFileName(String exportFileName) {
    
    this.exportFileName = exportFileName;
    return this;
  }

   /**
   * Name of the resulting export file (without extension).
   * @return exportFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the resulting export file (without extension).")

  public String getExportFileName() {
    return exportFileName;
  }


  public void setExportFileName(String exportFileName) {
    this.exportFileName = exportFileName;
  }


  public ExportForDeploymentRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * A password that is used during the project encryption.
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A password that is used during the project encryption.")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public ExportForDeploymentRequest projectSettings(List<DeploymentProjectExportSettings> projectSettings) {
    
    this.projectSettings = projectSettings;
    return this;
  }

  public ExportForDeploymentRequest addProjectSettingsItem(DeploymentProjectExportSettings projectSettingsItem) {
    if (this.projectSettings == null) {
      this.projectSettings = new ArrayList<>();
    }
    this.projectSettings.add(projectSettingsItem);
    return this;
  }

   /**
   * Project settings
   * @return projectSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Project settings")

  public List<DeploymentProjectExportSettings> getProjectSettings() {
    return projectSettings;
  }


  public void setProjectSettings(List<DeploymentProjectExportSettings> projectSettings) {
    this.projectSettings = projectSettings;
  }


   /**
   * Name of deployment settings schema
   * @return schemaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of deployment settings schema")

  public String getSchemaName() {
    return schemaName;
  }




   /**
   * Version of deployment settings schema
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of deployment settings schema")

  public String getSchemaVersion() {
    return schemaVersion;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportForDeploymentRequest exportForDeploymentRequest = (ExportForDeploymentRequest) o;
    return Objects.equals(this.exportFileName, exportForDeploymentRequest.exportFileName) &&
        Objects.equals(this.password, exportForDeploymentRequest.password) &&
        Objects.equals(this.projectSettings, exportForDeploymentRequest.projectSettings) &&
        Objects.equals(this.schemaName, exportForDeploymentRequest.schemaName) &&
        Objects.equals(this.schemaVersion, exportForDeploymentRequest.schemaVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportFileName, password, projectSettings, schemaName, schemaVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportForDeploymentRequest {\n");
    sb.append("    exportFileName: ").append(toIndentedString(exportFileName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    projectSettings: ").append(toIndentedString(projectSettings)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
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
    openapiFields.add("exportFileName");
    openapiFields.add("password");
    openapiFields.add("projectSettings");
    openapiFields.add("schemaName");
    openapiFields.add("schemaVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExportForDeploymentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExportForDeploymentRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExportForDeploymentRequest is not found in the empty JSON string", ExportForDeploymentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExportForDeploymentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExportForDeploymentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("exportFileName") != null && !jsonObj.get("exportFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportFileName").toString()));
      }
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      JsonArray jsonArrayprojectSettings = jsonObj.getAsJsonArray("projectSettings");
      if (jsonArrayprojectSettings != null) {
        // ensure the json data is an array
        if (!jsonObj.get("projectSettings").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `projectSettings` to be an array in the JSON string but got `%s`", jsonObj.get("projectSettings").toString()));
        }

        // validate the optional field `projectSettings` (array)
        for (int i = 0; i < jsonArrayprojectSettings.size(); i++) {
          DeploymentProjectExportSettings.validateJsonObject(jsonArrayprojectSettings.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("schemaName") != null && !jsonObj.get("schemaName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemaName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schemaName").toString()));
      }
      if (jsonObj.get("schemaVersion") != null && !jsonObj.get("schemaVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schemaVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schemaVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExportForDeploymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExportForDeploymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExportForDeploymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExportForDeploymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ExportForDeploymentRequest>() {
           @Override
           public void write(JsonWriter out, ExportForDeploymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExportForDeploymentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExportForDeploymentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExportForDeploymentRequest
  * @throws IOException if the JSON string is invalid with respect to ExportForDeploymentRequest
  */
  public static ExportForDeploymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExportForDeploymentRequest.class);
  }

 /**
  * Convert an instance of ExportForDeploymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


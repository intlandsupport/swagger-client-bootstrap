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
 * UpdateWorkingSet500ResponseCauseStackTraceInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class UpdateWorkingSet500ResponseCauseStackTraceInner {
  public static final String SERIALIZED_NAME_CLASS_LOADER_NAME = "classLoaderName";
  @SerializedName(SERIALIZED_NAME_CLASS_LOADER_NAME)
  private String classLoaderName;

  public static final String SERIALIZED_NAME_CLASS_NAME = "className";
  @SerializedName(SERIALIZED_NAME_CLASS_NAME)
  private String className;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_LINE_NUMBER = "lineNumber";
  @SerializedName(SERIALIZED_NAME_LINE_NUMBER)
  private Integer lineNumber;

  public static final String SERIALIZED_NAME_METHOD_NAME = "methodName";
  @SerializedName(SERIALIZED_NAME_METHOD_NAME)
  private String methodName;

  public static final String SERIALIZED_NAME_MODULE_NAME = "moduleName";
  @SerializedName(SERIALIZED_NAME_MODULE_NAME)
  private String moduleName;

  public static final String SERIALIZED_NAME_MODULE_VERSION = "moduleVersion";
  @SerializedName(SERIALIZED_NAME_MODULE_VERSION)
  private String moduleVersion;

  public static final String SERIALIZED_NAME_NATIVE_METHOD = "nativeMethod";
  @SerializedName(SERIALIZED_NAME_NATIVE_METHOD)
  private Boolean nativeMethod;

  public UpdateWorkingSet500ResponseCauseStackTraceInner() { 
  }

  public UpdateWorkingSet500ResponseCauseStackTraceInner classLoaderName(String classLoaderName) {
    
    this.classLoaderName = classLoaderName;
    return this;
  }

   /**
   * Get classLoaderName
   * @return classLoaderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassLoaderName() {
    return classLoaderName;
  }


  public void setClassLoaderName(String classLoaderName) {
    this.classLoaderName = classLoaderName;
  }


  public UpdateWorkingSet500ResponseCauseStackTraceInner className(String className) {
    
    this.className = className;
    return this;
  }

   /**
   * Get className
   * @return className
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClassName() {
    return className;
  }


  public void setClassName(String className) {
    this.className = className;
  }


  public UpdateWorkingSet500ResponseCauseStackTraceInner fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public UpdateWorkingSet500ResponseCauseStackTraceInner lineNumber(Integer lineNumber) {
    
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLineNumber() {
    return lineNumber;
  }


  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }


  public UpdateWorkingSet500ResponseCauseStackTraceInner methodName(String methodName) {
    
    this.methodName = methodName;
    return this;
  }

   /**
   * Get methodName
   * @return methodName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMethodName() {
    return methodName;
  }


  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }


  public UpdateWorkingSet500ResponseCauseStackTraceInner moduleName(String moduleName) {
    
    this.moduleName = moduleName;
    return this;
  }

   /**
   * Get moduleName
   * @return moduleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModuleName() {
    return moduleName;
  }


  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }


  public UpdateWorkingSet500ResponseCauseStackTraceInner moduleVersion(String moduleVersion) {
    
    this.moduleVersion = moduleVersion;
    return this;
  }

   /**
   * Get moduleVersion
   * @return moduleVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModuleVersion() {
    return moduleVersion;
  }


  public void setModuleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
  }


  public UpdateWorkingSet500ResponseCauseStackTraceInner nativeMethod(Boolean nativeMethod) {
    
    this.nativeMethod = nativeMethod;
    return this;
  }

   /**
   * Get nativeMethod
   * @return nativeMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNativeMethod() {
    return nativeMethod;
  }


  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWorkingSet500ResponseCauseStackTraceInner updateWorkingSet500ResponseCauseStackTraceInner = (UpdateWorkingSet500ResponseCauseStackTraceInner) o;
    return Objects.equals(this.classLoaderName, updateWorkingSet500ResponseCauseStackTraceInner.classLoaderName) &&
        Objects.equals(this.className, updateWorkingSet500ResponseCauseStackTraceInner.className) &&
        Objects.equals(this.fileName, updateWorkingSet500ResponseCauseStackTraceInner.fileName) &&
        Objects.equals(this.lineNumber, updateWorkingSet500ResponseCauseStackTraceInner.lineNumber) &&
        Objects.equals(this.methodName, updateWorkingSet500ResponseCauseStackTraceInner.methodName) &&
        Objects.equals(this.moduleName, updateWorkingSet500ResponseCauseStackTraceInner.moduleName) &&
        Objects.equals(this.moduleVersion, updateWorkingSet500ResponseCauseStackTraceInner.moduleVersion) &&
        Objects.equals(this.nativeMethod, updateWorkingSet500ResponseCauseStackTraceInner.nativeMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classLoaderName, className, fileName, lineNumber, methodName, moduleName, moduleVersion, nativeMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWorkingSet500ResponseCauseStackTraceInner {\n");
    sb.append("    classLoaderName: ").append(toIndentedString(classLoaderName)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
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
    openapiFields.add("classLoaderName");
    openapiFields.add("className");
    openapiFields.add("fileName");
    openapiFields.add("lineNumber");
    openapiFields.add("methodName");
    openapiFields.add("moduleName");
    openapiFields.add("moduleVersion");
    openapiFields.add("nativeMethod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateWorkingSet500ResponseCauseStackTraceInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateWorkingSet500ResponseCauseStackTraceInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateWorkingSet500ResponseCauseStackTraceInner is not found in the empty JSON string", UpdateWorkingSet500ResponseCauseStackTraceInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateWorkingSet500ResponseCauseStackTraceInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateWorkingSet500ResponseCauseStackTraceInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("classLoaderName") != null && !jsonObj.get("classLoaderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classLoaderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classLoaderName").toString()));
      }
      if (jsonObj.get("className") != null && !jsonObj.get("className").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `className` to be a primitive type in the JSON string but got `%s`", jsonObj.get("className").toString()));
      }
      if (jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if (jsonObj.get("methodName") != null && !jsonObj.get("methodName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `methodName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("methodName").toString()));
      }
      if (jsonObj.get("moduleName") != null && !jsonObj.get("moduleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moduleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moduleName").toString()));
      }
      if (jsonObj.get("moduleVersion") != null && !jsonObj.get("moduleVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moduleVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moduleVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateWorkingSet500ResponseCauseStackTraceInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateWorkingSet500ResponseCauseStackTraceInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateWorkingSet500ResponseCauseStackTraceInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateWorkingSet500ResponseCauseStackTraceInner.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateWorkingSet500ResponseCauseStackTraceInner>() {
           @Override
           public void write(JsonWriter out, UpdateWorkingSet500ResponseCauseStackTraceInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateWorkingSet500ResponseCauseStackTraceInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateWorkingSet500ResponseCauseStackTraceInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateWorkingSet500ResponseCauseStackTraceInner
  * @throws IOException if the JSON string is invalid with respect to UpdateWorkingSet500ResponseCauseStackTraceInner
  */
  public static UpdateWorkingSet500ResponseCauseStackTraceInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateWorkingSet500ResponseCauseStackTraceInner.class);
  }

 /**
  * Convert an instance of UpdateWorkingSet500ResponseCauseStackTraceInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


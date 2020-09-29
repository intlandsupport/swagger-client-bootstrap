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
import com.intland.swagger.client.model.ProjectReference;
import com.intland.swagger.client.model.RoleReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Access permissions for the report.
 */
@ApiModel(description = "Access permissions for the report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class ReportPermission {
  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectReference project;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleReference role;

  /**
   * Access level
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    NONE("NONE"),
    
    READ("READ"),
    
    WRITE("WRITE");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String value) {
      for (AccessEnum b : AccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS = "access";
  @SerializedName(SERIALIZED_NAME_ACCESS)
  private AccessEnum access;


  public ReportPermission project(ProjectReference project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(required = true, value = "")

  public ProjectReference getProject() {
    return project;
  }


  public void setProject(ProjectReference project) {
    this.project = project;
  }


  public ReportPermission role(RoleReference role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")

  public RoleReference getRole() {
    return role;
  }


  public void setRole(RoleReference role) {
    this.role = role;
  }


  public ReportPermission access(AccessEnum access) {
    
    this.access = access;
    return this;
  }

   /**
   * Access level
   * @return access
  **/
  @ApiModelProperty(example = "READ", required = true, value = "Access level")

  public AccessEnum getAccess() {
    return access;
  }


  public void setAccess(AccessEnum access) {
    this.access = access;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportPermission reportPermission = (ReportPermission) o;
    return Objects.equals(this.project, reportPermission.project) &&
        Objects.equals(this.role, reportPermission.role) &&
        Objects.equals(this.access, reportPermission.access);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, role, access);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportPermission {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
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


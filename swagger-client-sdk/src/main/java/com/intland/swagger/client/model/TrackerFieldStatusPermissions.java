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
 * Field permissions by role for specific status
 */
@ApiModel(description = "Field permissions by role for specific status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class TrackerFieldStatusPermissions {
  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<AccessPermission> permissions = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ChoiceOptionReference status;


  public TrackerFieldStatusPermissions permissions(List<AccessPermission> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public TrackerFieldStatusPermissions addPermissionsItem(AccessPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<AccessPermission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Access permissions by role
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Access permissions by role")

  public List<AccessPermission> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<AccessPermission> permissions) {
    this.permissions = permissions;
  }


  public TrackerFieldStatusPermissions status(ChoiceOptionReference status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChoiceOptionReference getStatus() {
    return status;
  }


  public void setStatus(ChoiceOptionReference status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerFieldStatusPermissions trackerFieldStatusPermissions = (TrackerFieldStatusPermissions) o;
    return Objects.equals(this.permissions, trackerFieldStatusPermissions.permissions) &&
        Objects.equals(this.status, trackerFieldStatusPermissions.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerFieldStatusPermissions {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


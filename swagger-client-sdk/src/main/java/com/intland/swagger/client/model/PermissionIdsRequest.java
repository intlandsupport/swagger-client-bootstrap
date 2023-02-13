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
 * Request model for multiple items.
 */
@ApiModel(description = "Request model for multiple items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:51:27.016473+01:00[Europe/Budapest]")
public class PermissionIdsRequest {
  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<TrackerPermissionReference> permissions = null;


  public PermissionIdsRequest permissions(List<TrackerPermissionReference> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public PermissionIdsRequest addPermissionsItem(TrackerPermissionReference permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<TrackerPermissionReference>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permission references.
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Permission references.")

  public List<TrackerPermissionReference> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<TrackerPermissionReference> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionIdsRequest permissionIdsRequest = (PermissionIdsRequest) o;
    return Objects.equals(this.permissions, permissionIdsRequest.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionIdsRequest {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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


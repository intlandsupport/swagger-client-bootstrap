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
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

/**
 * UserFilteringRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T12:30:20.007+01:00[Europe/Budapest]")
public class UserFilteringRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Integer projectId;

  /**
   * Status of the user
   */
  @JsonAdapter(UserStatusEnum.Adapter.class)
  public enum UserStatusEnum {
    ACTIVATED("ACTIVATED"),
    
    DISABLED("DISABLED"),
    
    INACTIVATION("INACTIVATION");

    private String value;

    UserStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserStatusEnum fromValue(String value) {
      for (UserStatusEnum b : UserStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USER_STATUS = "userStatus";
  @SerializedName(SERIALIZED_NAME_USER_STATUS)
  private UserStatusEnum userStatus;


  public UserFilteringRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the user
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "Name of the user")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserFilteringRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the user
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "Last name of the user")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserFilteringRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the user
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "First name of the user")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserFilteringRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of the user
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john.doe@codebeamer.com", value = "Email of the user")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserFilteringRequest projectId(Integer projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Id of the project where the user is a member
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the project where the user is a member")

  public Integer getProjectId() {
    return projectId;
  }


  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }


  public UserFilteringRequest userStatus(UserStatusEnum userStatus) {
    
    this.userStatus = userStatus;
    return this;
  }

   /**
   * Status of the user
   * @return userStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the user")

  public UserStatusEnum getUserStatus() {
    return userStatus;
  }


  public void setUserStatus(UserStatusEnum userStatus) {
    this.userStatus = userStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFilteringRequest userFilteringRequest = (UserFilteringRequest) o;
    return Objects.equals(this.name, userFilteringRequest.name) &&
        Objects.equals(this.lastName, userFilteringRequest.lastName) &&
        Objects.equals(this.firstName, userFilteringRequest.firstName) &&
        Objects.equals(this.email, userFilteringRequest.email) &&
        Objects.equals(this.projectId, userFilteringRequest.projectId) &&
        Objects.equals(this.userStatus, userFilteringRequest.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName, firstName, email, projectId, userStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFilteringRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
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


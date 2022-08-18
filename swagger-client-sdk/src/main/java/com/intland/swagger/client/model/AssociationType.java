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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.JSON;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Basic properties of a codebeamer association type
 */
@ApiModel(description = "Basic properties of a codebeamer association type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class AssociationType {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Description format of the entity
   */
  @JsonAdapter(DescriptionFormatEnum.Adapter.class)
  public enum DescriptionFormatEnum {
    PLAINTEXT("PlainText"),
    
    HTML("Html"),
    
    WIKI("Wiki");

    private String value;

    DescriptionFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DescriptionFormatEnum fromValue(String value) {
      for (DescriptionFormatEnum b : DescriptionFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DescriptionFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DescriptionFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DescriptionFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DescriptionFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESCRIPTION_FORMAT = "descriptionFormat";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION_FORMAT)
  private DescriptionFormatEnum descriptionFormat;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AssociationType() { 
  }

  public AssociationType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the entity
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the entity")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AssociationType descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
    this.descriptionFormat = descriptionFormat;
    return this;
  }

   /**
   * Description format of the entity
   * @return descriptionFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description format of the entity")

  public DescriptionFormatEnum getDescriptionFormat() {
    return descriptionFormat;
  }


  public void setDescriptionFormat(DescriptionFormatEnum descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
  }


  public AssociationType id(Integer id) {
    
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


  public AssociationType name(String name) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociationType associationType = (AssociationType) o;
    return Objects.equals(this.description, associationType.description) &&
        Objects.equals(this.descriptionFormat, associationType.descriptionFormat) &&
        Objects.equals(this.id, associationType.id) &&
        Objects.equals(this.name, associationType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, descriptionFormat, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociationType {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("descriptionFormat");
    openapiFields.add("id");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssociationType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssociationType.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssociationType is not found in the empty JSON string", AssociationType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssociationType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssociationType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("descriptionFormat") != null && !jsonObj.get("descriptionFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptionFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptionFormat").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssociationType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssociationType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssociationType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssociationType.class));

       return (TypeAdapter<T>) new TypeAdapter<AssociationType>() {
           @Override
           public void write(JsonWriter out, AssociationType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssociationType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssociationType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssociationType
  * @throws IOException if the JSON string is invalid with respect to AssociationType
  */
  public static AssociationType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssociationType.class);
  }

 /**
  * Convert an instance of AssociationType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


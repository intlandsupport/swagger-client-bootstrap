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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.io.IOException;

/**
 * UpdateAttachment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-29T09:51:27.838+02:00[Europe/Budapest]")
public class UpdateAttachment {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Format of description
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
  private DescriptionFormatEnum descriptionFormat = DescriptionFormatEnum.PLAINTEXT;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private File content;


  public UpdateAttachment description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateAttachment descriptionFormat(DescriptionFormatEnum descriptionFormat) {
    
    this.descriptionFormat = descriptionFormat;
    return this;
  }

   /**
   * Format of description
   * @return descriptionFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Format of description")

  public DescriptionFormatEnum getDescriptionFormat() {
    return descriptionFormat;
  }


  public void setDescriptionFormat(DescriptionFormatEnum descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
  }


  public UpdateAttachment content(File content) {
    
    this.content = content;
    return this;
  }

   /**
   * Content of attachment
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content of attachment")

  public File getContent() {
    return content;
  }


  public void setContent(File content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAttachment updateAttachment = (UpdateAttachment) o;
    return Objects.equals(this.description, updateAttachment.description) &&
        Objects.equals(this.descriptionFormat, updateAttachment.descriptionFormat) &&
        Objects.equals(this.content, updateAttachment.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, descriptionFormat, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAttachment {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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


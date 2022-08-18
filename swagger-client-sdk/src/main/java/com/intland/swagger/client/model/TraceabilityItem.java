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
 * Traceability Item
 */
@ApiModel(description = "Traceability Item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class TraceabilityItem {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<TraceabilityItem> children = null;

  public static final String SERIALIZED_NAME_INCOMING_ASSOCIATION = "incoming association";
  @SerializedName(SERIALIZED_NAME_INCOMING_ASSOCIATION)
  private List<TrackerItemRevision> incomingAssociation = null;

  public static final String SERIALIZED_NAME_INCOMING_REFERENCE = "incoming reference";
  @SerializedName(SERIALIZED_NAME_INCOMING_REFERENCE)
  private List<TrackerItemRevision> incomingReference = null;

  public static final String SERIALIZED_NAME_INCOMING_ASSOCIATIONS = "incomingAssociations";
  @SerializedName(SERIALIZED_NAME_INCOMING_ASSOCIATIONS)
  private List<TrackerItemRevision> incomingAssociations = null;

  public static final String SERIALIZED_NAME_INCOMING_REFERENCES = "incomingReferences";
  @SerializedName(SERIALIZED_NAME_INCOMING_REFERENCES)
  private List<TrackerItemRevision> incomingReferences = null;

  public static final String SERIALIZED_NAME_ITEM_REVISION = "itemRevision";
  @SerializedName(SERIALIZED_NAME_ITEM_REVISION)
  private TrackerItemRevision itemRevision;

  public static final String SERIALIZED_NAME_OUTGOING_ASSOCIATION = "outgoing association";
  @SerializedName(SERIALIZED_NAME_OUTGOING_ASSOCIATION)
  private List<TrackerItemRevision> outgoingAssociation = null;

  public static final String SERIALIZED_NAME_OUTGOING_REFERENCE = "outgoing reference";
  @SerializedName(SERIALIZED_NAME_OUTGOING_REFERENCE)
  private List<TrackerItemRevision> outgoingReference = null;

  public static final String SERIALIZED_NAME_OUTGOING_ASSOCIATIONS = "outgoingAssociations";
  @SerializedName(SERIALIZED_NAME_OUTGOING_ASSOCIATIONS)
  private List<TrackerItemRevision> outgoingAssociations = null;

  public static final String SERIALIZED_NAME_OUTGOING_REFERENCES = "outgoingReferences";
  @SerializedName(SERIALIZED_NAME_OUTGOING_REFERENCES)
  private List<TrackerItemRevision> outgoingReferences = null;

  public TraceabilityItem() { 
  }

  public TraceabilityItem children(List<TraceabilityItem> children) {
    
    this.children = children;
    return this;
  }

  public TraceabilityItem addChildrenItem(TraceabilityItem childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * children
   * @return children
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "children")

  public List<TraceabilityItem> getChildren() {
    return children;
  }


  public void setChildren(List<TraceabilityItem> children) {
    this.children = children;
  }


  public TraceabilityItem incomingAssociation(List<TrackerItemRevision> incomingAssociation) {
    
    this.incomingAssociation = incomingAssociation;
    return this;
  }

  public TraceabilityItem addIncomingAssociationItem(TrackerItemRevision incomingAssociationItem) {
    if (this.incomingAssociation == null) {
      this.incomingAssociation = new ArrayList<>();
    }
    this.incomingAssociation.add(incomingAssociationItem);
    return this;
  }

   /**
   * Get incomingAssociation
   * @return incomingAssociation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TrackerItemRevision> getIncomingAssociation() {
    return incomingAssociation;
  }


  public void setIncomingAssociation(List<TrackerItemRevision> incomingAssociation) {
    this.incomingAssociation = incomingAssociation;
  }


  public TraceabilityItem incomingReference(List<TrackerItemRevision> incomingReference) {
    
    this.incomingReference = incomingReference;
    return this;
  }

  public TraceabilityItem addIncomingReferenceItem(TrackerItemRevision incomingReferenceItem) {
    if (this.incomingReference == null) {
      this.incomingReference = new ArrayList<>();
    }
    this.incomingReference.add(incomingReferenceItem);
    return this;
  }

   /**
   * Get incomingReference
   * @return incomingReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TrackerItemRevision> getIncomingReference() {
    return incomingReference;
  }


  public void setIncomingReference(List<TrackerItemRevision> incomingReference) {
    this.incomingReference = incomingReference;
  }


  public TraceabilityItem incomingAssociations(List<TrackerItemRevision> incomingAssociations) {
    
    this.incomingAssociations = incomingAssociations;
    return this;
  }

  public TraceabilityItem addIncomingAssociationsItem(TrackerItemRevision incomingAssociationsItem) {
    if (this.incomingAssociations == null) {
      this.incomingAssociations = new ArrayList<>();
    }
    this.incomingAssociations.add(incomingAssociationsItem);
    return this;
  }

   /**
   * incoming associations
   * @return incomingAssociations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "incoming associations")

  public List<TrackerItemRevision> getIncomingAssociations() {
    return incomingAssociations;
  }


  public void setIncomingAssociations(List<TrackerItemRevision> incomingAssociations) {
    this.incomingAssociations = incomingAssociations;
  }


  public TraceabilityItem incomingReferences(List<TrackerItemRevision> incomingReferences) {
    
    this.incomingReferences = incomingReferences;
    return this;
  }

  public TraceabilityItem addIncomingReferencesItem(TrackerItemRevision incomingReferencesItem) {
    if (this.incomingReferences == null) {
      this.incomingReferences = new ArrayList<>();
    }
    this.incomingReferences.add(incomingReferencesItem);
    return this;
  }

   /**
   * incoming references
   * @return incomingReferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "incoming references")

  public List<TrackerItemRevision> getIncomingReferences() {
    return incomingReferences;
  }


  public void setIncomingReferences(List<TrackerItemRevision> incomingReferences) {
    this.incomingReferences = incomingReferences;
  }


  public TraceabilityItem itemRevision(TrackerItemRevision itemRevision) {
    
    this.itemRevision = itemRevision;
    return this;
  }

   /**
   * Get itemRevision
   * @return itemRevision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItemRevision getItemRevision() {
    return itemRevision;
  }


  public void setItemRevision(TrackerItemRevision itemRevision) {
    this.itemRevision = itemRevision;
  }


  public TraceabilityItem outgoingAssociation(List<TrackerItemRevision> outgoingAssociation) {
    
    this.outgoingAssociation = outgoingAssociation;
    return this;
  }

  public TraceabilityItem addOutgoingAssociationItem(TrackerItemRevision outgoingAssociationItem) {
    if (this.outgoingAssociation == null) {
      this.outgoingAssociation = new ArrayList<>();
    }
    this.outgoingAssociation.add(outgoingAssociationItem);
    return this;
  }

   /**
   * Get outgoingAssociation
   * @return outgoingAssociation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TrackerItemRevision> getOutgoingAssociation() {
    return outgoingAssociation;
  }


  public void setOutgoingAssociation(List<TrackerItemRevision> outgoingAssociation) {
    this.outgoingAssociation = outgoingAssociation;
  }


  public TraceabilityItem outgoingReference(List<TrackerItemRevision> outgoingReference) {
    
    this.outgoingReference = outgoingReference;
    return this;
  }

  public TraceabilityItem addOutgoingReferenceItem(TrackerItemRevision outgoingReferenceItem) {
    if (this.outgoingReference == null) {
      this.outgoingReference = new ArrayList<>();
    }
    this.outgoingReference.add(outgoingReferenceItem);
    return this;
  }

   /**
   * Get outgoingReference
   * @return outgoingReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TrackerItemRevision> getOutgoingReference() {
    return outgoingReference;
  }


  public void setOutgoingReference(List<TrackerItemRevision> outgoingReference) {
    this.outgoingReference = outgoingReference;
  }


  public TraceabilityItem outgoingAssociations(List<TrackerItemRevision> outgoingAssociations) {
    
    this.outgoingAssociations = outgoingAssociations;
    return this;
  }

  public TraceabilityItem addOutgoingAssociationsItem(TrackerItemRevision outgoingAssociationsItem) {
    if (this.outgoingAssociations == null) {
      this.outgoingAssociations = new ArrayList<>();
    }
    this.outgoingAssociations.add(outgoingAssociationsItem);
    return this;
  }

   /**
   * outgoing association
   * @return outgoingAssociations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "outgoing association")

  public List<TrackerItemRevision> getOutgoingAssociations() {
    return outgoingAssociations;
  }


  public void setOutgoingAssociations(List<TrackerItemRevision> outgoingAssociations) {
    this.outgoingAssociations = outgoingAssociations;
  }


  public TraceabilityItem outgoingReferences(List<TrackerItemRevision> outgoingReferences) {
    
    this.outgoingReferences = outgoingReferences;
    return this;
  }

  public TraceabilityItem addOutgoingReferencesItem(TrackerItemRevision outgoingReferencesItem) {
    if (this.outgoingReferences == null) {
      this.outgoingReferences = new ArrayList<>();
    }
    this.outgoingReferences.add(outgoingReferencesItem);
    return this;
  }

   /**
   * outgoing reference
   * @return outgoingReferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "outgoing reference")

  public List<TrackerItemRevision> getOutgoingReferences() {
    return outgoingReferences;
  }


  public void setOutgoingReferences(List<TrackerItemRevision> outgoingReferences) {
    this.outgoingReferences = outgoingReferences;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityItem traceabilityItem = (TraceabilityItem) o;
    return Objects.equals(this.children, traceabilityItem.children) &&
        Objects.equals(this.incomingAssociation, traceabilityItem.incomingAssociation) &&
        Objects.equals(this.incomingReference, traceabilityItem.incomingReference) &&
        Objects.equals(this.incomingAssociations, traceabilityItem.incomingAssociations) &&
        Objects.equals(this.incomingReferences, traceabilityItem.incomingReferences) &&
        Objects.equals(this.itemRevision, traceabilityItem.itemRevision) &&
        Objects.equals(this.outgoingAssociation, traceabilityItem.outgoingAssociation) &&
        Objects.equals(this.outgoingReference, traceabilityItem.outgoingReference) &&
        Objects.equals(this.outgoingAssociations, traceabilityItem.outgoingAssociations) &&
        Objects.equals(this.outgoingReferences, traceabilityItem.outgoingReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, incomingAssociation, incomingReference, incomingAssociations, incomingReferences, itemRevision, outgoingAssociation, outgoingReference, outgoingAssociations, outgoingReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityItem {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    incomingAssociation: ").append(toIndentedString(incomingAssociation)).append("\n");
    sb.append("    incomingReference: ").append(toIndentedString(incomingReference)).append("\n");
    sb.append("    incomingAssociations: ").append(toIndentedString(incomingAssociations)).append("\n");
    sb.append("    incomingReferences: ").append(toIndentedString(incomingReferences)).append("\n");
    sb.append("    itemRevision: ").append(toIndentedString(itemRevision)).append("\n");
    sb.append("    outgoingAssociation: ").append(toIndentedString(outgoingAssociation)).append("\n");
    sb.append("    outgoingReference: ").append(toIndentedString(outgoingReference)).append("\n");
    sb.append("    outgoingAssociations: ").append(toIndentedString(outgoingAssociations)).append("\n");
    sb.append("    outgoingReferences: ").append(toIndentedString(outgoingReferences)).append("\n");
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
    openapiFields.add("children");
    openapiFields.add("incoming association");
    openapiFields.add("incoming reference");
    openapiFields.add("incomingAssociations");
    openapiFields.add("incomingReferences");
    openapiFields.add("itemRevision");
    openapiFields.add("outgoing association");
    openapiFields.add("outgoing reference");
    openapiFields.add("outgoingAssociations");
    openapiFields.add("outgoingReferences");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TraceabilityItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TraceabilityItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TraceabilityItem is not found in the empty JSON string", TraceabilityItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TraceabilityItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TraceabilityItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
      if (jsonArraychildren != null) {
        // ensure the json data is an array
        if (!jsonObj.get("children").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
        }

        // validate the optional field `children` (array)
        for (int i = 0; i < jsonArraychildren.size(); i++) {
          TraceabilityItem.validateJsonObject(jsonArraychildren.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayincomingAssociation = jsonObj.getAsJsonArray("incoming association");
      if (jsonArrayincomingAssociation != null) {
        // ensure the json data is an array
        if (!jsonObj.get("incoming association").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `incoming association` to be an array in the JSON string but got `%s`", jsonObj.get("incoming association").toString()));
        }

        // validate the optional field `incoming association` (array)
        for (int i = 0; i < jsonArrayincomingAssociation.size(); i++) {
          TrackerItemRevision.validateJsonObject(jsonArrayincomingAssociation.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayincomingReference = jsonObj.getAsJsonArray("incoming reference");
      if (jsonArrayincomingReference != null) {
        // ensure the json data is an array
        if (!jsonObj.get("incoming reference").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `incoming reference` to be an array in the JSON string but got `%s`", jsonObj.get("incoming reference").toString()));
        }

        // validate the optional field `incoming reference` (array)
        for (int i = 0; i < jsonArrayincomingReference.size(); i++) {
          TrackerItemRevision.validateJsonObject(jsonArrayincomingReference.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayincomingAssociations = jsonObj.getAsJsonArray("incomingAssociations");
      if (jsonArrayincomingAssociations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("incomingAssociations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `incomingAssociations` to be an array in the JSON string but got `%s`", jsonObj.get("incomingAssociations").toString()));
        }

        // validate the optional field `incomingAssociations` (array)
        for (int i = 0; i < jsonArrayincomingAssociations.size(); i++) {
          TrackerItemRevision.validateJsonObject(jsonArrayincomingAssociations.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayincomingReferences = jsonObj.getAsJsonArray("incomingReferences");
      if (jsonArrayincomingReferences != null) {
        // ensure the json data is an array
        if (!jsonObj.get("incomingReferences").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `incomingReferences` to be an array in the JSON string but got `%s`", jsonObj.get("incomingReferences").toString()));
        }

        // validate the optional field `incomingReferences` (array)
        for (int i = 0; i < jsonArrayincomingReferences.size(); i++) {
          TrackerItemRevision.validateJsonObject(jsonArrayincomingReferences.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `itemRevision`
      if (jsonObj.getAsJsonObject("itemRevision") != null) {
        TrackerItemRevision.validateJsonObject(jsonObj.getAsJsonObject("itemRevision"));
      }
      JsonArray jsonArrayoutgoingAssociation = jsonObj.getAsJsonArray("outgoing association");
      if (jsonArrayoutgoingAssociation != null) {
        // ensure the json data is an array
        if (!jsonObj.get("outgoing association").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `outgoing association` to be an array in the JSON string but got `%s`", jsonObj.get("outgoing association").toString()));
        }

        // validate the optional field `outgoing association` (array)
        for (int i = 0; i < jsonArrayoutgoingAssociation.size(); i++) {
          TrackerItemRevision.validateJsonObject(jsonArrayoutgoingAssociation.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayoutgoingReference = jsonObj.getAsJsonArray("outgoing reference");
      if (jsonArrayoutgoingReference != null) {
        // ensure the json data is an array
        if (!jsonObj.get("outgoing reference").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `outgoing reference` to be an array in the JSON string but got `%s`", jsonObj.get("outgoing reference").toString()));
        }

        // validate the optional field `outgoing reference` (array)
        for (int i = 0; i < jsonArrayoutgoingReference.size(); i++) {
          TrackerItemRevision.validateJsonObject(jsonArrayoutgoingReference.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayoutgoingAssociations = jsonObj.getAsJsonArray("outgoingAssociations");
      if (jsonArrayoutgoingAssociations != null) {
        // ensure the json data is an array
        if (!jsonObj.get("outgoingAssociations").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `outgoingAssociations` to be an array in the JSON string but got `%s`", jsonObj.get("outgoingAssociations").toString()));
        }

        // validate the optional field `outgoingAssociations` (array)
        for (int i = 0; i < jsonArrayoutgoingAssociations.size(); i++) {
          TrackerItemRevision.validateJsonObject(jsonArrayoutgoingAssociations.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayoutgoingReferences = jsonObj.getAsJsonArray("outgoingReferences");
      if (jsonArrayoutgoingReferences != null) {
        // ensure the json data is an array
        if (!jsonObj.get("outgoingReferences").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `outgoingReferences` to be an array in the JSON string but got `%s`", jsonObj.get("outgoingReferences").toString()));
        }

        // validate the optional field `outgoingReferences` (array)
        for (int i = 0; i < jsonArrayoutgoingReferences.size(); i++) {
          TrackerItemRevision.validateJsonObject(jsonArrayoutgoingReferences.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TraceabilityItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TraceabilityItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TraceabilityItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TraceabilityItem.class));

       return (TypeAdapter<T>) new TypeAdapter<TraceabilityItem>() {
           @Override
           public void write(JsonWriter out, TraceabilityItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TraceabilityItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TraceabilityItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TraceabilityItem
  * @throws IOException if the JSON string is invalid with respect to TraceabilityItem
  */
  public static TraceabilityItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TraceabilityItem.class);
  }

 /**
  * Convert an instance of TraceabilityItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


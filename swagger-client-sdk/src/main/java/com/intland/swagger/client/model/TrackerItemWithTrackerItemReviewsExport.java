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
 * A Tracker Item with all of its corresponding Tracker Item Reviews
 */
@ApiModel(description = "A Tracker Item with all of its corresponding Tracker Item Reviews")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-18T17:30:04.683+02:00[Europe/Budapest]")
public class TrackerItemWithTrackerItemReviewsExport {
  public static final String SERIALIZED_NAME_TRACKER_ITEM = "trackerItem";
  @SerializedName(SERIALIZED_NAME_TRACKER_ITEM)
  private TrackerItem trackerItem;

  public static final String SERIALIZED_NAME_TRACKER_ITEM_REVIEWS = "trackerItemReviews";
  @SerializedName(SERIALIZED_NAME_TRACKER_ITEM_REVIEWS)
  private List<TrackerItemReviewExport> trackerItemReviews = null;

  public TrackerItemWithTrackerItemReviewsExport() { 
  }

  public TrackerItemWithTrackerItemReviewsExport trackerItem(TrackerItem trackerItem) {
    
    this.trackerItem = trackerItem;
    return this;
  }

   /**
   * Get trackerItem
   * @return trackerItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItem getTrackerItem() {
    return trackerItem;
  }


  public void setTrackerItem(TrackerItem trackerItem) {
    this.trackerItem = trackerItem;
  }


  public TrackerItemWithTrackerItemReviewsExport trackerItemReviews(List<TrackerItemReviewExport> trackerItemReviews) {
    
    this.trackerItemReviews = trackerItemReviews;
    return this;
  }

  public TrackerItemWithTrackerItemReviewsExport addTrackerItemReviewsItem(TrackerItemReviewExport trackerItemReviewsItem) {
    if (this.trackerItemReviews == null) {
      this.trackerItemReviews = new ArrayList<>();
    }
    this.trackerItemReviews.add(trackerItemReviewsItem);
    return this;
  }

   /**
   * List of Tracker Item Reviews
   * @return trackerItemReviews
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Tracker Item Reviews")

  public List<TrackerItemReviewExport> getTrackerItemReviews() {
    return trackerItemReviews;
  }


  public void setTrackerItemReviews(List<TrackerItemReviewExport> trackerItemReviews) {
    this.trackerItemReviews = trackerItemReviews;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemWithTrackerItemReviewsExport trackerItemWithTrackerItemReviewsExport = (TrackerItemWithTrackerItemReviewsExport) o;
    return Objects.equals(this.trackerItem, trackerItemWithTrackerItemReviewsExport.trackerItem) &&
        Objects.equals(this.trackerItemReviews, trackerItemWithTrackerItemReviewsExport.trackerItemReviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackerItem, trackerItemReviews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemWithTrackerItemReviewsExport {\n");
    sb.append("    trackerItem: ").append(toIndentedString(trackerItem)).append("\n");
    sb.append("    trackerItemReviews: ").append(toIndentedString(trackerItemReviews)).append("\n");
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
    openapiFields.add("trackerItem");
    openapiFields.add("trackerItemReviews");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrackerItemWithTrackerItemReviewsExport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TrackerItemWithTrackerItemReviewsExport.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrackerItemWithTrackerItemReviewsExport is not found in the empty JSON string", TrackerItemWithTrackerItemReviewsExport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrackerItemWithTrackerItemReviewsExport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrackerItemWithTrackerItemReviewsExport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `trackerItem`
      if (jsonObj.getAsJsonObject("trackerItem") != null) {
        TrackerItem.validateJsonObject(jsonObj.getAsJsonObject("trackerItem"));
      }
      JsonArray jsonArraytrackerItemReviews = jsonObj.getAsJsonArray("trackerItemReviews");
      if (jsonArraytrackerItemReviews != null) {
        // ensure the json data is an array
        if (!jsonObj.get("trackerItemReviews").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `trackerItemReviews` to be an array in the JSON string but got `%s`", jsonObj.get("trackerItemReviews").toString()));
        }

        // validate the optional field `trackerItemReviews` (array)
        for (int i = 0; i < jsonArraytrackerItemReviews.size(); i++) {
          TrackerItemReviewExport.validateJsonObject(jsonArraytrackerItemReviews.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrackerItemWithTrackerItemReviewsExport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrackerItemWithTrackerItemReviewsExport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrackerItemWithTrackerItemReviewsExport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrackerItemWithTrackerItemReviewsExport.class));

       return (TypeAdapter<T>) new TypeAdapter<TrackerItemWithTrackerItemReviewsExport>() {
           @Override
           public void write(JsonWriter out, TrackerItemWithTrackerItemReviewsExport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrackerItemWithTrackerItemReviewsExport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrackerItemWithTrackerItemReviewsExport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrackerItemWithTrackerItemReviewsExport
  * @throws IOException if the JSON string is invalid with respect to TrackerItemWithTrackerItemReviewsExport
  */
  public static TrackerItemWithTrackerItemReviewsExport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrackerItemWithTrackerItemReviewsExport.class);
  }

 /**
  * Convert an instance of TrackerItemWithTrackerItemReviewsExport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


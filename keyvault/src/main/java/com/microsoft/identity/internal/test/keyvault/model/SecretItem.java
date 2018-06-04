/*
 * KeyVaultClient
 * The key vault client performs cryptographic key operations and vault operations against the Key Vault service.
 *
 * OpenAPI spec version: 2016-10-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.microsoft.identity.internal.test.keyvault.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * The secret item containing secret metadata.
 */
@ApiModel(description = "The secret item containing secret metadata.")

public class SecretItem {
  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private SecretAttributes attributes = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  @SerializedName("contentType")
  private String contentType = null;

  @SerializedName("managed")
  private Boolean managed = null;

  public SecretItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Secret identifier.
   * @return id
  **/
  @ApiModelProperty(value = "Secret identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecretItem attributes(SecretAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * The secret management attributes.
   * @return attributes
  **/
  @ApiModelProperty(value = "The secret management attributes.")
  public SecretAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SecretAttributes attributes) {
    this.attributes = attributes;
  }

  public SecretItem tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public SecretItem putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Application specific metadata in the form of key-value pairs.
   * @return tags
  **/
  @ApiModelProperty(value = "Application specific metadata in the form of key-value pairs.")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public SecretItem contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Type of the secret value such as a password.
   * @return contentType
  **/
  @ApiModelProperty(value = "Type of the secret value such as a password.")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

   /**
   * True if the secret&#39;s lifetime is managed by key vault. If this is a key backing a certificate, then managed will be true.
   * @return managed
  **/
  @ApiModelProperty(value = "True if the secret's lifetime is managed by key vault. If this is a key backing a certificate, then managed will be true.")
  public Boolean isManaged() {
    return managed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretItem secretItem = (SecretItem) o;
    return Objects.equals(this.id, secretItem.id) &&
        Objects.equals(this.attributes, secretItem.attributes) &&
        Objects.equals(this.tags, secretItem.tags) &&
        Objects.equals(this.contentType, secretItem.contentType) &&
        Objects.equals(this.managed, secretItem.managed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attributes, tags, contentType, managed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
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

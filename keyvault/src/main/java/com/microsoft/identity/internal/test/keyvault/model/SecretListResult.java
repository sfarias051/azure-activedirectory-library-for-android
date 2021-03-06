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

import java.util.List;

/**
 * The secret list result.
 */
@ApiModel(description = "The secret list result.")

public class SecretListResult {
  @SerializedName("value")
  private List<SecretItem> value = null;

  @SerializedName("nextLink")
  private String nextLink = null;

   /**
   * A response message containing a list of secrets in the key vault along with a link to the next page of secrets.
   * @return value
  **/
  @ApiModelProperty(value = "A response message containing a list of secrets in the key vault along with a link to the next page of secrets.")
  public List<SecretItem> getValue() {
    return value;
  }

   /**
   * The URL to get the next set of secrets.
   * @return nextLink
  **/
  @ApiModelProperty(value = "The URL to get the next set of secrets.")
  public String getNextLink() {
    return nextLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretListResult secretListResult = (SecretListResult) o;
    return Objects.equals(this.value, secretListResult.value) &&
        Objects.equals(this.nextLink, secretListResult.nextLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, nextLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretListResult {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
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


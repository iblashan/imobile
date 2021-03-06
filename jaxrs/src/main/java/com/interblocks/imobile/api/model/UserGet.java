/*
 * Project iMobile
 * An API to work with Money
 *
 * OpenAPI spec version: 1.0.1
 * Contact: dulitha@cabbageapps.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.interblocks.imobile.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserGet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-03-04T05:01:25.177Z")
public class UserGet   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("mobile")
  private String mobile = null;

  @JsonProperty("profile_image")
  private String profileImage = null;

  public UserGet id(String id) {
    this.id = id;
    return this;
  }

   /**
   * unqiue identification for user
   * @return id
  **/
  @ApiModelProperty(required = true, value = "unqiue identification for user")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserGet email(String email) {
    this.email = email;
    return this;
  }

   /**
   * email address of the user
   * @return email
  **/
  @ApiModelProperty(required = true, value = "email address of the user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserGet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of user
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name of user")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserGet password(String password) {
    this.password = password;
    return this;
  }

   /**
   * user pasword
   * @return password
  **/
  @ApiModelProperty(required = true, value = "user pasword")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserGet mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * mobile number of the user
   * @return mobile
  **/
  @ApiModelProperty(required = true, value = "mobile number of the user")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public UserGet profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * profile image url
   * @return profileImage
  **/
  @ApiModelProperty(required = true, value = "profile image url")
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGet userGet = (UserGet) o;
    return Objects.equals(this.id, userGet.id) &&
        Objects.equals(this.email, userGet.email) &&
        Objects.equals(this.name, userGet.name) &&
        Objects.equals(this.password, userGet.password) &&
        Objects.equals(this.mobile, userGet.mobile) &&
        Objects.equals(this.profileImage, userGet.profileImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, name, password, mobile, profileImage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
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


package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Error  {
  
  @SerializedName("code")
  private Integer code = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("errors")
  private Object errors = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Object getErrors() {
    return errors;
  }
  public void setErrors(Object errors) {
    this.errors = errors;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  errors: ").append(errors).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

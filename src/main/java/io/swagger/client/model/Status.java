package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Status  {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("info")
  private String info = null;

  
  /**
   * Status code identifier.
   **/
  @ApiModelProperty(required = true, value = "Status code identifier.")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * Description of the status code.
   **/
  @ApiModelProperty(required = true, value = "Description of the status code.")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

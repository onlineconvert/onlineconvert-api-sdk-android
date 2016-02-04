package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class History  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("info")
  private String info = null;
  @SerializedName("created_at")
  private Date createdAt = null;

  
  /**
   * Unique identifier of the event.
   **/
  @ApiModelProperty(value = "Unique identifier of the event.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Status of the job.
   **/
  @ApiModelProperty(value = "Status of the job.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Addtional information.
   **/
  @ApiModelProperty(value = "Addtional information.")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }

  
  /**
   * Date and time when the job was created.
   **/
  @ApiModelProperty(value = "Date and time when the job was created.")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

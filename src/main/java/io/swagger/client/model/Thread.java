package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Thread  {
  
  @SerializedName("hash")
  private String hash = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("info")
  private String info = null;
  @SerializedName("exec_time")
  private Integer execTime = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("modified_at")
  private Date modifiedAt = null;

  
  /**
   * Unique identifier of the thread.
   **/
  @ApiModelProperty(value = "Unique identifier of the thread.")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }

  
  /**
   * Status of the thread.
   **/
  @ApiModelProperty(value = "Status of the thread.")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Extra information.
   **/
  @ApiModelProperty(value = "Extra information.")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }

  
  /**
   * Execution time for the thread in seconds
   **/
  @ApiModelProperty(value = "Execution time for the thread in seconds")
  public Integer getExecTime() {
    return execTime;
  }
  public void setExecTime(Integer execTime) {
    this.execTime = execTime;
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

  
  /**
   * Date and time when the job was last modified.
   **/
  @ApiModelProperty(value = "Date and time when the job was last modified.")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thread {\n");
    
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  execTime: ").append(execTime).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

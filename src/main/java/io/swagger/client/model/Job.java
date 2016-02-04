package io.swagger.client.model;

import io.swagger.client.model.Status;
import java.util.Date;
import io.swagger.client.model.OutputFile;
import io.swagger.client.model.Conversion;
import io.swagger.client.model.InputFile;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Job  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("token")
  private String token = null;
  public enum TypeEnum {
     job, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("status")
  private Status status = null;
  @SerializedName("process")
  private Boolean process = null;
  @SerializedName("conversion")
  private List<Conversion> conversion = null;
  @SerializedName("input")
  private List<InputFile> input = null;
  @SerializedName("output")
  private List<OutputFile> output = null;
  @SerializedName("callback")
  private String callback = null;
  @SerializedName("server")
  private String server = null;
  @SerializedName("spent")
  private Integer spent = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("modified_at")
  private Date modifiedAt = null;

  
  /**
   * Unique identifier for the job.
   **/
  @ApiModelProperty(value = "Unique identifier for the job.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Token to identify client allowed to run the job.
   **/
  @ApiModelProperty(value = "Token to identify client allowed to run the job.")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Type of the job created.
   **/
  @ApiModelProperty(required = true, value = "Type of the job created.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Current status for the job
   **/
  @ApiModelProperty(value = "Current status for the job")
  public Status getStatus() {
    return status;
  }
  public void setStatus(Status status) {
    this.status = status;
  }

  
  /**
   * Determine if the job must be processed as soon as it is ready.
   **/
  @ApiModelProperty(value = "Determine if the job must be processed as soon as it is ready.")
  public Boolean getProcess() {
    return process;
  }
  public void setProcess(Boolean process) {
    this.process = process;
  }

  
  /**
   * Type of conversion or conversions to be carried out.
   **/
  @ApiModelProperty(value = "Type of conversion or conversions to be carried out.")
  public List<Conversion> getConversion() {
    return conversion;
  }
  public void setConversion(List<Conversion> conversion) {
    this.conversion = conversion;
  }

  
  /**
   * Source or sources of the files to be converted.
   **/
  @ApiModelProperty(value = "Source or sources of the files to be converted.")
  public List<InputFile> getInput() {
    return input;
  }
  public void setInput(List<InputFile> input) {
    this.input = input;
  }

  
  /**
   * Output or Outputs of the conversion.
   **/
  @ApiModelProperty(value = "Output or Outputs of the conversion.")
  public List<OutputFile> getOutput() {
    return output;
  }
  public void setOutput(List<OutputFile> output) {
    this.output = output;
  }

  
  /**
   * Callback url to the the status updates
   **/
  @ApiModelProperty(value = "Callback url to the the status updates")
  public String getCallback() {
    return callback;
  }
  public void setCallback(String callback) {
    this.callback = callback;
  }

  
  /**
   * Server assigned for file uploads and downloads
   **/
  @ApiModelProperty(value = "Server assigned for file uploads and downloads")
  public String getServer() {
    return server;
  }
  public void setServer(String server) {
    this.server = server;
  }

  
  /**
   * Converion minutes spent to complete the job
   **/
  @ApiModelProperty(value = "Converion minutes spent to complete the job")
  public Integer getSpent() {
    return spent;
  }
  public void setSpent(Integer spent) {
    this.spent = spent;
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
    sb.append("class Job {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  process: ").append(process).append("\n");
    sb.append("  conversion: ").append(conversion).append("\n");
    sb.append("  input: ").append(input).append("\n");
    sb.append("  output: ").append(output).append("\n");
    sb.append("  callback: ").append(callback).append("\n");
    sb.append("  server: ").append(server).append("\n");
    sb.append("  spent: ").append(spent).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

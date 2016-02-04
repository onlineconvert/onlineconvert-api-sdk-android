package io.swagger.client.model;

import java.util.Date;
import io.swagger.client.model.OutputFileSource;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OutputFile  {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("source")
  private OutputFileSource source = null;
  @SerializedName("uri")
  private String uri = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("checksum")
  private String checksum = null;
  @SerializedName("created_at")
  private Date createdAt = null;

  
  /**
   * Unique identifier for the file.
   **/
  @ApiModelProperty(value = "Unique identifier for the file.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public OutputFileSource getSource() {
    return source;
  }
  public void setSource(OutputFileSource source) {
    this.source = source;
  }

  
  /**
   * Url for downloading the file.
   **/
  @ApiModelProperty(value = "Url for downloading the file.")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Size of the file in bytes.
   **/
  @ApiModelProperty(value = "Size of the file in bytes.")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   * Checksum of the file
   **/
  @ApiModelProperty(value = "Checksum of the file")
  public String getChecksum() {
    return checksum;
  }
  public void setChecksum(String checksum) {
    this.checksum = checksum;
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
    sb.append("class OutputFile {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  checksum: ").append(checksum).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

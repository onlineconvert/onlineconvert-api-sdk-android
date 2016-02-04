package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class InputFile  {
  
  @SerializedName("id")
  private String id = null;
  public enum TypeEnum {
     upload,  remote,  output, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("source")
  private String source = null;
  @SerializedName("filename")
  private String filename = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("hash")
  private String hash = null;
  @SerializedName("content_type")
  private String contentType = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("modified_at")
  private Date modifiedAt = null;

  
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
   * How the file has been generated.
   **/
  @ApiModelProperty(value = "How the file has been generated.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The source of the file to be used that can be either, an external url. An identifier for an uploaded file to the server or an identifier for another job.
   **/
  @ApiModelProperty(required = true, value = "The source of the file to be used that can be either, an external url. An identifier for an uploaded file to the server or an identifier for another job.")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Filename of the file.
   **/
  @ApiModelProperty(value = "Filename of the file.")
  public String getFilename() {
    return filename;
  }
  public void setFilename(String filename) {
    this.filename = filename;
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
   * File hash for content verification
   **/
  @ApiModelProperty(value = "File hash for content verification")
  public String getHash() {
    return hash;
  }
  public void setHash(String hash) {
    this.hash = hash;
  }

  
  /**
   * Content type for file conversion definition
   **/
  @ApiModelProperty(value = "Content type for file conversion definition")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
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
    sb.append("class InputFile {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  filename: ").append(filename).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  hash: ").append(hash).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

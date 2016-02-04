package io.swagger.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Sources for the files including the input files and conversion used.
 **/
@ApiModel(description = "Sources for the files including the input files and conversion used.")
public class OutputFileSource  {
  
  @SerializedName("input")
  private List<String> input = null;
  @SerializedName("conversion")
  private String conversion = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getInput() {
    return input;
  }
  public void setInput(List<String> input) {
    this.input = input;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getConversion() {
    return conversion;
  }
  public void setConversion(String conversion) {
    this.conversion = conversion;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputFileSource {\n");
    
    sb.append("  input: ").append(input).append("\n");
    sb.append("  conversion: ").append(conversion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.OutputFile;
import io.swagger.client.model.Error;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class OutputApi {
  String basePath = "https://api2.online-convert.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Get list of converted.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param conversionId 
   * @param inputId 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return List<OutputFile>
   */
  public List<OutputFile>  jobsJobIdOutputGet (String jobId, String conversionId, String inputId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdOutputGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/output".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "conversion_id", conversionId));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "input_id", inputId));
    

    
    headerParams.put("X-Oc-Token", ApiInvoker.parameterToString(xOcToken));
    
    headerParams.put("X-Oc-Api-Key", ApiInvoker.parameterToString(xOcApiKey));
    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<OutputFile>) ApiInvoker.deserialize(response, "array", OutputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get information about an output file source.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return OutputFile
   */
  public OutputFile  jobsJobIdOutputFileIdGet (String jobId, String fileId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdOutputFileIdGet");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
       throw new ApiException(400, "Missing the required parameter 'fileId' when calling jobsJobIdOutputFileIdGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/output/{file_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString())).replaceAll("\\{" + "file_id" + "\\}", apiInvoker.escapeString(fileId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("X-Oc-Token", ApiInvoker.parameterToString(xOcToken));
    
    headerParams.put("X-Oc-Api-Key", ApiInvoker.parameterToString(xOcApiKey));
    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (OutputFile) ApiInvoker.deserialize(response, "", OutputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Deletes a file from the output.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return List<OutputFile>
   */
  public List<OutputFile>  jobsJobIdOutputFileIdDelete (String jobId, String fileId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdOutputFileIdDelete");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
       throw new ApiException(400, "Missing the required parameter 'fileId' when calling jobsJobIdOutputFileIdDelete");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/output/{file_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString())).replaceAll("\\{" + "file_id" + "\\}", apiInvoker.escapeString(fileId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("X-Oc-Token", ApiInvoker.parameterToString(xOcToken));
    
    headerParams.put("X-Oc-Api-Key", ApiInvoker.parameterToString(xOcApiKey));
    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<OutputFile>) ApiInvoker.deserialize(response, "array", OutputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

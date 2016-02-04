package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.InputFile;
import io.swagger.client.model.Error;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class InputApi {
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
   * Get list of binary source files for the conversion.hhh
   * Description of the get for the inputs of a specific job.
   * @param jobId ID of job that needs to be fetched
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return List<InputFile>
   */
  public List<InputFile>  jobsJobIdInputGet (String jobId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdInputGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/input".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
        return (List<InputFile>) ApiInvoker.deserialize(response, "array", InputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cretes a new input for the current job.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param body 
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return InputFile
   */
  public InputFile  jobsJobIdInputPost (String jobId, InputFile body, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdInputPost");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/input".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (InputFile) ApiInvoker.deserialize(response, "", InputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get list of conversions defined for the current job.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return InputFile
   */
  public InputFile  jobsJobIdInputFileIdGet (String jobId, String fileId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdInputFileIdGet");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
       throw new ApiException(400, "Missing the required parameter 'fileId' when calling jobsJobIdInputFileIdGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/input/{file_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString())).replaceAll("\\{" + "file_id" + "\\}", apiInvoker.escapeString(fileId.toString()));

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
        return (InputFile) ApiInvoker.deserialize(response, "", InputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Removes the input for a job.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param fileId Id of the file to download
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return InputFile
   */
  public InputFile  jobsJobIdInputFileIdDelete (String jobId, String fileId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdInputFileIdDelete");
    }
    
    // verify the required parameter 'fileId' is set
    if (fileId == null) {
       throw new ApiException(400, "Missing the required parameter 'fileId' when calling jobsJobIdInputFileIdDelete");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/input/{file_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString())).replaceAll("\\{" + "file_id" + "\\}", apiInvoker.escapeString(fileId.toString()));

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
        return (InputFile) ApiInvoker.deserialize(response, "", InputFile.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

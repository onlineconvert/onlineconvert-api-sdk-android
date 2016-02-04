package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Job;
import java.math.BigDecimal;
import io.swagger.client.model.Error;
import io.swagger.client.model.History;
import io.swagger.client.model.Thread;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class JobsApi {
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
   * List of jobs active for the current user identified by the key.
   * It will return the list of jobs for the given user. In order to get the jobs a key or token must be provided:\n  - If the user key is provided all jobs for the current will be return.\n  - If one token is provided it will return the job assigned to that token if any.\n  \nThe request is paginated with an amount of 50 elements per page in any case.
   * @param status Filter the status of the job.
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @param page Pagination for list of elements.
   * @return List<Job>
   */
  public List<Job>  jobsGet (String status, String xOcToken, String xOcApiKey, BigDecimal page) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/jobs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    

    
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
        return (List<Job>) ApiInvoker.deserialize(response, "array", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Creates a new Job with the user key.
   * 
   * @param xOcApiKey Api key for the user to filter.
   * @param body Content of the job.
   * @return Job
   */
  public Job  jobsPost (String xOcApiKey, Job body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'xOcApiKey' is set
    if (xOcApiKey == null) {
       throw new ApiException(400, "Missing the required parameter 'xOcApiKey' when calling jobsPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling jobsPost");
    }
    

    // create path and map variables
    String path = "/jobs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
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
        return (Job) ApiInvoker.deserialize(response, "", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get information about a Job
   * 
   * @param jobId ID of job that needs to be fetched
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return Job
   */
  public Job  jobsJobIdGet (String jobId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
        return (Job) ApiInvoker.deserialize(response, "", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cancels a job created that haven&#39;t been started. (Allow to cancel jobs in process.)
   * 
   * @param jobId ID of job that needs to be fetched
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return Job
   */
  public Job  jobsJobIdDelete (String jobId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdDelete");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
        return (Job) ApiInvoker.deserialize(response, "", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Modifies the job identified by the id, allows to start a created job.
   * 
   * @param body Content of the job.
   * @param jobId ID of job that needs to be fetched
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return Job
   */
  public Job  jobsJobIdPatch (Job body, String jobId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling jobsJobIdPatch");
    }
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdPatch");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Job) ApiInvoker.deserialize(response, "", Job.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the change history for the current job.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return List<History>
   */
  public List<History>  jobsJobIdHistoryGet (String jobId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdHistoryGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/history".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
        return (List<History>) ApiInvoker.deserialize(response, "array", History.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get list of threads defined for the current job.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return List<Thread>
   */
  public List<Thread>  jobsJobIdThreadsGet (String jobId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdThreadsGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/threads".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
        return (List<Thread>) ApiInvoker.deserialize(response, "array", Thread.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

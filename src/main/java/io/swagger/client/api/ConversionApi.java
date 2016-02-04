package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Conversion;
import io.swagger.client.model.Error;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ConversionApi {
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
   * Get list of conversions defined for the current job.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return List<Conversion>
   */
  public List<Conversion>  jobsJobIdConversionsGet (String jobId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdConversionsGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/conversions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
        return (List<Conversion>) ApiInvoker.deserialize(response, "array", Conversion.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Adds a new conversion to the given job.
   * 
   * @param body information for the conversion.
   * @param jobId ID of job that needs to be fetched
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return Conversion
   */
  public Conversion  jobsJobIdConversionsPost (Conversion body, String jobId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling jobsJobIdConversionsPost");
    }
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdConversionsPost");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/conversions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString()));

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
        return (Conversion) ApiInvoker.deserialize(response, "", Conversion.class);
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
   * @param conversionId Identifier for the job conversion.
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return Conversion
   */
  public Conversion  jobsJobIdConversionsConversionIdGet (String jobId, String conversionId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdConversionsConversionIdGet");
    }
    
    // verify the required parameter 'conversionId' is set
    if (conversionId == null) {
       throw new ApiException(400, "Missing the required parameter 'conversionId' when calling jobsJobIdConversionsConversionIdGet");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/conversions/{conversion_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString())).replaceAll("\\{" + "conversion_id" + "\\}", apiInvoker.escapeString(conversionId.toString()));

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
        return (Conversion) ApiInvoker.deserialize(response, "", Conversion.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Removes the conversion for a job.
   * 
   * @param jobId ID of job that needs to be fetched
   * @param conversionId Identifier for the job conversion.
   * @param xOcToken Token for authentication for the current job
   * @param xOcApiKey Api key for the user to filter.
   * @return Conversion
   */
  public Conversion  jobsJobIdConversionsConversionIdDelete (String jobId, String conversionId, String xOcToken, String xOcApiKey) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'jobId' is set
    if (jobId == null) {
       throw new ApiException(400, "Missing the required parameter 'jobId' when calling jobsJobIdConversionsConversionIdDelete");
    }
    
    // verify the required parameter 'conversionId' is set
    if (conversionId == null) {
       throw new ApiException(400, "Missing the required parameter 'conversionId' when calling jobsJobIdConversionsConversionIdDelete");
    }
    

    // create path and map variables
    String path = "/jobs/{job_id}/conversions/{conversion_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "job_id" + "\\}", apiInvoker.escapeString(jobId.toString())).replaceAll("\\{" + "conversion_id" + "\\}", apiInvoker.escapeString(conversionId.toString()));

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
        return (Conversion) ApiInvoker.deserialize(response, "", Conversion.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

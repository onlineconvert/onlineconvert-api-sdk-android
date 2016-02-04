package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Conversion;
import java.math.BigDecimal;
import io.swagger.client.model.Status;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class InformationApi {
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
   * Get a list of the valid conversions.
   * Gets a list of the valid conversions that can be made with the API. For each conversion is also shown the available options for that specific type of conversion.\n\nThis conversions can be added to a Job through the specific endpoint or in the information given to create the new Job.
   * @param category Category for the conversion.
   * @param target Target for for the conversion.
   * @param page Pagination for list of elements.
   * @return List<Conversion>
   */
  public List<Conversion>  conversionsGet (String category, String target, BigDecimal page) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/conversions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "category", category));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "target", target));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    

    

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
   * Get a list of the valid statuses.
   * The endpoint provide a list of all available status that the Job may have during the process as a description of the status.
   * @return List<Status>
   */
  public List<Status>  statusesGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/statuses".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

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
        return (List<Status>) ApiInvoker.deserialize(response, "array", Status.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Job".equalsIgnoreCase(className)) {
      return new TypeToken<List<Job>>(){}.getType();
    }
    
    if ("InputFile".equalsIgnoreCase(className)) {
      return new TypeToken<List<InputFile>>(){}.getType();
    }
    
    if ("OutputFile".equalsIgnoreCase(className)) {
      return new TypeToken<List<OutputFile>>(){}.getType();
    }
    
    if ("Conversion".equalsIgnoreCase(className)) {
      return new TypeToken<List<Conversion>>(){}.getType();
    }
    
    if ("Thread".equalsIgnoreCase(className)) {
      return new TypeToken<List<io.swagger.client.model.Thread>>(){}.getType();
    }
    
    if ("History".equalsIgnoreCase(className)) {
      return new TypeToken<List<History>>(){}.getType();
    }
    
    if ("Status".equalsIgnoreCase(className)) {
      return new TypeToken<List<Status>>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<List<io.swagger.client.model.Error>>(){}.getType();
    }
    
    if ("OutputFileSource".equalsIgnoreCase(className)) {
      return new TypeToken<List<OutputFileSource>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Job".equalsIgnoreCase(className)) {
      return new TypeToken<Job>(){}.getType();
    }
    
    if ("InputFile".equalsIgnoreCase(className)) {
      return new TypeToken<InputFile>(){}.getType();
    }
    
    if ("OutputFile".equalsIgnoreCase(className)) {
      return new TypeToken<OutputFile>(){}.getType();
    }
    
    if ("Conversion".equalsIgnoreCase(className)) {
      return new TypeToken<Conversion>(){}.getType();
    }
    
    if ("Thread".equalsIgnoreCase(className)) {
      return new TypeToken<io.swagger.client.model.Thread>(){}.getType();
    }
    
    if ("History".equalsIgnoreCase(className)) {
      return new TypeToken<History>(){}.getType();
    }
    
    if ("Status".equalsIgnoreCase(className)) {
      return new TypeToken<Status>(){}.getType();
    }
    
    if ("Error".equalsIgnoreCase(className)) {
      return new TypeToken<io.swagger.client.model.Error>(){}.getType();
    }
    
    if ("OutputFileSource".equalsIgnoreCase(className)) {
      return new TypeToken<OutputFileSource>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};

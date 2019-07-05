package pl.karoll.homebudgetapp.application.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
  public static final String PROJECT_TITLE = "Quest-service";
  public static final String PROJECT_DESCRIPTION = "Microservice responsible for Quest management";
  public static final String PROJECT_VERSION = "0.0.1-SNAPSHOT";
  public static final String BASE_URL = "api/v1/";
  public static final String AZURE_BLOB_CONTAINER_PREFIX = "blob://test/";
  public static final String AZURE_BLOB_IMAGE_FORMAT_SUFFIX = ".jpg";
  public static final String AZURE_BLOB_CONTENT_IN_DB = "Image was saved in blob storage";

  public static final String VALIDATION_RESULT_OK = "OK";
  public static final String VALIDATION_RESULT_ERRORS = "Validation errors";

  public static final String EMPTY_STRING = "";
  public static final double ZERO_POINTS = 0.0;
  public static final int ZERO = 0;
  public static final double DOUBLE_ONE = 1.0;
  public static final int INTEGER_TEN = 10;
  public static final double DOUBLE_THOUSAND = 1000;
  public static final int TWENTY_HOURS_IN_MILIS = 1000*60*60*20;
  public static final String GAME_MASTER_ROLE_NAME = "GAME_MASTER";
}

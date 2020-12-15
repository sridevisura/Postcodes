package io.postcodes.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.annotation.Nullable;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableCodes.class)
@JsonDeserialize(as = ImmutableCodes.class)
public interface
Codes {

 /* @Nullable
  @JsonProperty("admin_district")
  String adminDistrict();

  @Nullable
  @JsonProperty("admin_county")
  String adminCounty();

  @Nullable
  @JsonProperty("admin_ward")
  String adminWard();

  @Nullable
  String parish();

  @Nullable
  @JsonProperty("parliamentary_constituency")
  String parliamentaryConstituency();

  @Nullable
  String ccg();

  @Nullable
  @JsonProperty("ccg_id")
  String ccgId();

  @Nullable
  String ced();

  @Nullable
  String nuts();

  @Nullable
  String lsoa();

  @Nullable
  String msoa();

  @Nullable
  String lau2();*/
}

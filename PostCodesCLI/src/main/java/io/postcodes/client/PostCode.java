package io.postcodes.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.annotation.Nullable;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePostCode.class)
@JsonDeserialize(as = ImmutablePostCode.class)
public interface PostCode {

  String postcode();

  int quality();

 /* @Nullable
  Integer eastings();

  @Nullable
  Integer northings();*/

  String country();

  /*@Nullable
  @JsonProperty("nhs_ha")
  String nhsHa();

  @Nullable
  Double longitude();

  @Nullable
  Double latitude();

  @Nullable
  @JsonProperty("european_electoral_region")
  String europeanElectoralRegion();

  @Nullable
  @JsonProperty("primary_care_trust")
  String primaryCareTrust();*/

  @Nullable
  String region();

 /* @Nullable
  String lsoa();

  @Nullable
  String msoa();

  String incode();

  String outcode();

  @Nullable
  @JsonProperty("parliamentary_constituency")
  String parliamentaryConstituency();

  @Nullable
  @JsonProperty("admin_district")
  String adminDistrict();

  @Nullable
  String parish();

  @Nullable
  @JsonProperty("admin_county")
  String adminCounty();

  @Nullable
  @JsonProperty("admin_ward")
  String adminWard();

  @Nullable
  String ced();

  @Nullable
  String ccg();

  @Nullable
  String nuts();*/

  Codes codes();
}

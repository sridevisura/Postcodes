package io.postcodes.client;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PostCodeWithDistance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePostCodeWithDistance.builder()}.
 */
@Generated(from = "PostCodeWithDistance", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePostCodeWithDistance implements PostCodeWithDistance {
  private final String postcode;
  private final int quality;
  private final @Nullable Integer eastings;
  private final @Nullable Integer northings;
  private final String country;
  private final @Nullable String nhsHa;
  private final @Nullable Double longitude;
  private final @Nullable Double latitude;
  private final @Nullable String europeanElectoralRegion;
  private final @Nullable String primaryCareTrust;
  private final @Nullable String region;
  private final @Nullable String lsoa;
  private final @Nullable String msoa;
  private final String incode;
  private final String outcode;
  private final @Nullable String parliamentaryConstituency;
  private final @Nullable String adminDistrict;
  private final @Nullable String parish;
  private final @Nullable String adminCounty;
  private final @Nullable String adminWard;
  private final @Nullable String ced;
  private final @Nullable String ccg;
  private final @Nullable String nuts;
  private final Codes codes;
  private final Double distance;

  private ImmutablePostCodeWithDistance(
      String postcode,
      int quality,
      @Nullable Integer eastings,
      @Nullable Integer northings,
      String country,
      @Nullable String nhsHa,
      @Nullable Double longitude,
      @Nullable Double latitude,
      @Nullable String europeanElectoralRegion,
      @Nullable String primaryCareTrust,
      @Nullable String region,
      @Nullable String lsoa,
      @Nullable String msoa,
      String incode,
      String outcode,
      @Nullable String parliamentaryConstituency,
      @Nullable String adminDistrict,
      @Nullable String parish,
      @Nullable String adminCounty,
      @Nullable String adminWard,
      @Nullable String ced,
      @Nullable String ccg,
      @Nullable String nuts,
      Codes codes,
      Double distance) {
    this.postcode = postcode;
    this.quality = quality;
    this.eastings = eastings;
    this.northings = northings;
    this.country = country;
    this.nhsHa = nhsHa;
    this.longitude = longitude;
    this.latitude = latitude;
    this.europeanElectoralRegion = europeanElectoralRegion;
    this.primaryCareTrust = primaryCareTrust;
    this.region = region;
    this.lsoa = lsoa;
    this.msoa = msoa;
    this.incode = incode;
    this.outcode = outcode;
    this.parliamentaryConstituency = parliamentaryConstituency;
    this.adminDistrict = adminDistrict;
    this.parish = parish;
    this.adminCounty = adminCounty;
    this.adminWard = adminWard;
    this.ced = ced;
    this.ccg = ccg;
    this.nuts = nuts;
    this.codes = codes;
    this.distance = distance;
  }

  /**
   * @return The value of the {@code postcode} attribute
   */
  @JsonProperty("postcode")
  @Override
  public String postcode() {
    return postcode;
  }

  /**
   * @return The value of the {@code quality} attribute
   */
  @JsonProperty("quality")
  @Override
  public int quality() {
    return quality;
  }

  /**
   * @return The value of the {@code eastings} attribute
   */
  @JsonProperty("eastings")
  @Override
  public @Nullable Integer eastings() {
    return eastings;
  }

  /**
   * @return The value of the {@code northings} attribute
   */
  @JsonProperty("northings")
  @Override
  public @Nullable Integer northings() {
    return northings;
  }

  /**
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public String country() {
    return country;
  }

  /**
   * @return The value of the {@code nhsHa} attribute
   */
  @JsonProperty("nhs_ha")
  @Override
  public @Nullable String nhsHa() {
    return nhsHa;
  }

  /**
   * @return The value of the {@code longitude} attribute
   */
  @JsonProperty("longitude")
  @Override
  public @Nullable Double longitude() {
    return longitude;
  }

  /**
   * @return The value of the {@code latitude} attribute
   */
  @JsonProperty("latitude")
  @Override
  public @Nullable Double latitude() {
    return latitude;
  }

  /**
   * @return The value of the {@code europeanElectoralRegion} attribute
   */
  @JsonProperty("european_electoral_region")
  @Override
  public @Nullable String europeanElectoralRegion() {
    return europeanElectoralRegion;
  }

  /**
   * @return The value of the {@code primaryCareTrust} attribute
   */
  @JsonProperty("primary_care_trust")
  @Override
  public @Nullable String primaryCareTrust() {
    return primaryCareTrust;
  }

  /**
   * @return The value of the {@code region} attribute
   */
  @JsonProperty("region")
  @Override
  public @Nullable String region() {
    return region;
  }

  /**
   * @return The value of the {@code lsoa} attribute
   */
  @JsonProperty("lsoa")
  @Override
  public @Nullable String lsoa() {
    return lsoa;
  }

  /**
   * @return The value of the {@code msoa} attribute
   */
  @JsonProperty("msoa")
  @Override
  public @Nullable String msoa() {
    return msoa;
  }

  /**
   * @return The value of the {@code incode} attribute
   */
  @JsonProperty("incode")
  @Override
  public String incode() {
    return incode;
  }

  /**
   * @return The value of the {@code outcode} attribute
   */
  @JsonProperty("outcode")
  @Override
  public String outcode() {
    return outcode;
  }

  /**
   * @return The value of the {@code parliamentaryConstituency} attribute
   */
  @JsonProperty("parliamentary_constituency")
  @Override
  public @Nullable String parliamentaryConstituency() {
    return parliamentaryConstituency;
  }

  /**
   * @return The value of the {@code adminDistrict} attribute
   */
  @JsonProperty("admin_district")
  @Override
  public @Nullable String adminDistrict() {
    return adminDistrict;
  }

  /**
   * @return The value of the {@code parish} attribute
   */
  @JsonProperty("parish")
  @Override
  public @Nullable String parish() {
    return parish;
  }

  /**
   * @return The value of the {@code adminCounty} attribute
   */
  @JsonProperty("admin_county")
  @Override
  public @Nullable String adminCounty() {
    return adminCounty;
  }

  /**
   * @return The value of the {@code adminWard} attribute
   */
  @JsonProperty("admin_ward")
  @Override
  public @Nullable String adminWard() {
    return adminWard;
  }

  /**
   * @return The value of the {@code ced} attribute
   */
  @JsonProperty("ced")
  @Override
  public @Nullable String ced() {
    return ced;
  }

  /**
   * @return The value of the {@code ccg} attribute
   */
  @JsonProperty("ccg")
  @Override
  public @Nullable String ccg() {
    return ccg;
  }

  /**
   * @return The value of the {@code nuts} attribute
   */
  @JsonProperty("nuts")
  @Override
  public @Nullable String nuts() {
    return nuts;
  }

  /**
   * @return The value of the {@code codes} attribute
   */
  @JsonProperty("codes")
  @Override
  public Codes codes() {
    return codes;
  }

  /**
   * @return The value of the {@code distance} attribute
   */
  @JsonProperty("distance")
  @Override
  public Double distance() {
    return distance;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#postcode() postcode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for postcode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withPostcode(String value) {
    String newValue = Objects.requireNonNull(value, "postcode");
    if (this.postcode.equals(newValue)) return this;
    return new ImmutablePostCodeWithDistance(
        newValue,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#quality() quality} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withQuality(int value) {
    if (this.quality == value) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        value,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#eastings() eastings} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for eastings (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withEastings(@Nullable Integer value) {
    if (Objects.equals(this.eastings, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        value,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#northings() northings} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for northings (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withNorthings(@Nullable Integer value) {
    if (Objects.equals(this.northings, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        value,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#country() country} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for country
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withCountry(String value) {
    String newValue = Objects.requireNonNull(value, "country");
    if (this.country.equals(newValue)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        newValue,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#nhsHa() nhsHa} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nhsHa (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withNhsHa(@Nullable String value) {
    if (Objects.equals(this.nhsHa, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        value,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#longitude() longitude} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for longitude (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withLongitude(@Nullable Double value) {
    if (Objects.equals(this.longitude, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        value,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#latitude() latitude} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for latitude (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withLatitude(@Nullable Double value) {
    if (Objects.equals(this.latitude, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        value,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#europeanElectoralRegion() europeanElectoralRegion} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for europeanElectoralRegion (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withEuropeanElectoralRegion(@Nullable String value) {
    if (Objects.equals(this.europeanElectoralRegion, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        value,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#primaryCareTrust() primaryCareTrust} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for primaryCareTrust (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withPrimaryCareTrust(@Nullable String value) {
    if (Objects.equals(this.primaryCareTrust, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        value,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#region() region} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for region (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withRegion(@Nullable String value) {
    if (Objects.equals(this.region, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        value,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#lsoa() lsoa} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lsoa (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withLsoa(@Nullable String value) {
    if (Objects.equals(this.lsoa, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        value,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#msoa() msoa} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for msoa (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withMsoa(@Nullable String value) {
    if (Objects.equals(this.msoa, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        value,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#incode() incode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for incode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withIncode(String value) {
    String newValue = Objects.requireNonNull(value, "incode");
    if (this.incode.equals(newValue)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        newValue,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#outcode() outcode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withOutcode(String value) {
    String newValue = Objects.requireNonNull(value, "outcode");
    if (this.outcode.equals(newValue)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        newValue,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#parliamentaryConstituency() parliamentaryConstituency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for parliamentaryConstituency (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withParliamentaryConstituency(@Nullable String value) {
    if (Objects.equals(this.parliamentaryConstituency, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        value,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#adminDistrict() adminDistrict} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for adminDistrict (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withAdminDistrict(@Nullable String value) {
    if (Objects.equals(this.adminDistrict, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        value,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#parish() parish} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for parish (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withParish(@Nullable String value) {
    if (Objects.equals(this.parish, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        value,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#adminCounty() adminCounty} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for adminCounty (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withAdminCounty(@Nullable String value) {
    if (Objects.equals(this.adminCounty, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        value,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#adminWard() adminWard} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for adminWard (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withAdminWard(@Nullable String value) {
    if (Objects.equals(this.adminWard, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        value,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#ced() ced} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ced (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withCed(@Nullable String value) {
    if (Objects.equals(this.ced, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        value,
        this.ccg,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#ccg() ccg} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ccg (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withCcg(@Nullable String value) {
    if (Objects.equals(this.ccg, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        value,
        this.nuts,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#nuts() nuts} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nuts (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withNuts(@Nullable String value) {
    if (Objects.equals(this.nuts, value)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        value,
        this.codes,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#codes() codes} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for codes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withCodes(Codes value) {
    if (this.codes == value) return this;
    Codes newValue = Objects.requireNonNull(value, "codes");
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        newValue,
        this.distance);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCodeWithDistance#distance() distance} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for distance
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCodeWithDistance withDistance(Double value) {
    Double newValue = Objects.requireNonNull(value, "distance");
    if (this.distance.equals(newValue)) return this;
    return new ImmutablePostCodeWithDistance(
        this.postcode,
        this.quality,
        this.eastings,
        this.northings,
        this.country,
        this.nhsHa,
        this.longitude,
        this.latitude,
        this.europeanElectoralRegion,
        this.primaryCareTrust,
        this.region,
        this.lsoa,
        this.msoa,
        this.incode,
        this.outcode,
        this.parliamentaryConstituency,
        this.adminDistrict,
        this.parish,
        this.adminCounty,
        this.adminWard,
        this.ced,
        this.ccg,
        this.nuts,
        this.codes,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePostCodeWithDistance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePostCodeWithDistance
        && equalTo((ImmutablePostCodeWithDistance) another);
  }

  private boolean equalTo(ImmutablePostCodeWithDistance another) {
    return postcode.equals(another.postcode)
        && quality == another.quality
        && Objects.equals(eastings, another.eastings)
        && Objects.equals(northings, another.northings)
        && country.equals(another.country)
        && Objects.equals(nhsHa, another.nhsHa)
        && Objects.equals(longitude, another.longitude)
        && Objects.equals(latitude, another.latitude)
        && Objects.equals(europeanElectoralRegion, another.europeanElectoralRegion)
        && Objects.equals(primaryCareTrust, another.primaryCareTrust)
        && Objects.equals(region, another.region)
        && Objects.equals(lsoa, another.lsoa)
        && Objects.equals(msoa, another.msoa)
        && incode.equals(another.incode)
        && outcode.equals(another.outcode)
        && Objects.equals(parliamentaryConstituency, another.parliamentaryConstituency)
        && Objects.equals(adminDistrict, another.adminDistrict)
        && Objects.equals(parish, another.parish)
        && Objects.equals(adminCounty, another.adminCounty)
        && Objects.equals(adminWard, another.adminWard)
        && Objects.equals(ced, another.ced)
        && Objects.equals(ccg, another.ccg)
        && Objects.equals(nuts, another.nuts)
        && codes.equals(another.codes)
        && distance.equals(another.distance);
  }

  /**
   * Computes a hash code from attributes: {@code postcode}, {@code quality}, {@code eastings}, {@code northings}, {@code country}, {@code nhsHa}, {@code longitude}, {@code latitude}, {@code europeanElectoralRegion}, {@code primaryCareTrust}, {@code region}, {@code lsoa}, {@code msoa}, {@code incode}, {@code outcode}, {@code parliamentaryConstituency}, {@code adminDistrict}, {@code parish}, {@code adminCounty}, {@code adminWard}, {@code ced}, {@code ccg}, {@code nuts}, {@code codes}, {@code distance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + postcode.hashCode();
    h += (h << 5) + quality;
    h += (h << 5) + Objects.hashCode(eastings);
    h += (h << 5) + Objects.hashCode(northings);
    h += (h << 5) + country.hashCode();
    h += (h << 5) + Objects.hashCode(nhsHa);
    h += (h << 5) + Objects.hashCode(longitude);
    h += (h << 5) + Objects.hashCode(latitude);
    h += (h << 5) + Objects.hashCode(europeanElectoralRegion);
    h += (h << 5) + Objects.hashCode(primaryCareTrust);
    h += (h << 5) + Objects.hashCode(region);
    h += (h << 5) + Objects.hashCode(lsoa);
    h += (h << 5) + Objects.hashCode(msoa);
    h += (h << 5) + incode.hashCode();
    h += (h << 5) + outcode.hashCode();
    h += (h << 5) + Objects.hashCode(parliamentaryConstituency);
    h += (h << 5) + Objects.hashCode(adminDistrict);
    h += (h << 5) + Objects.hashCode(parish);
    h += (h << 5) + Objects.hashCode(adminCounty);
    h += (h << 5) + Objects.hashCode(adminWard);
    h += (h << 5) + Objects.hashCode(ced);
    h += (h << 5) + Objects.hashCode(ccg);
    h += (h << 5) + Objects.hashCode(nuts);
    h += (h << 5) + codes.hashCode();
    h += (h << 5) + distance.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PostCodeWithDistance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PostCodeWithDistance")
        .omitNullValues()
        .add("postcode", postcode)
        .add("quality", quality)
        .add("eastings", eastings)
        .add("northings", northings)
        .add("country", country)
        .add("nhsHa", nhsHa)
        .add("longitude", longitude)
        .add("latitude", latitude)
        .add("europeanElectoralRegion", europeanElectoralRegion)
        .add("primaryCareTrust", primaryCareTrust)
        .add("region", region)
        .add("lsoa", lsoa)
        .add("msoa", msoa)
        .add("incode", incode)
        .add("outcode", outcode)
        .add("parliamentaryConstituency", parliamentaryConstituency)
        .add("adminDistrict", adminDistrict)
        .add("parish", parish)
        .add("adminCounty", adminCounty)
        .add("adminWard", adminWard)
        .add("ced", ced)
        .add("ccg", ccg)
        .add("nuts", nuts)
        .add("codes", codes)
        .add("distance", distance)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PostCodeWithDistance", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PostCodeWithDistance {
    @Nullable String postcode;
    int quality;
    boolean qualityIsSet;
    @Nullable Integer eastings;
    @Nullable Integer northings;
    @Nullable String country;
    @Nullable String nhsHa;
    @Nullable Double longitude;
    @Nullable Double latitude;
    @Nullable String europeanElectoralRegion;
    @Nullable String primaryCareTrust;
    @Nullable String region;
    @Nullable String lsoa;
    @Nullable String msoa;
    @Nullable String incode;
    @Nullable String outcode;
    @Nullable String parliamentaryConstituency;
    @Nullable String adminDistrict;
    @Nullable String parish;
    @Nullable String adminCounty;
    @Nullable String adminWard;
    @Nullable String ced;
    @Nullable String ccg;
    @Nullable String nuts;
    @Nullable Codes codes;
    @Nullable Double distance;
    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
      this.postcode = postcode;
    }
    @JsonProperty("quality")
    public void setQuality(int quality) {
      this.quality = quality;
      this.qualityIsSet = true;
    }
    @JsonProperty("eastings")
    public void setEastings(@Nullable Integer eastings) {
      this.eastings = eastings;
    }
    @JsonProperty("northings")
    public void setNorthings(@Nullable Integer northings) {
      this.northings = northings;
    }
    @JsonProperty("country")
    public void setCountry(String country) {
      this.country = country;
    }
    @JsonProperty("nhs_ha")
    public void setNhsHa(@Nullable String nhsHa) {
      this.nhsHa = nhsHa;
    }
    @JsonProperty("longitude")
    public void setLongitude(@Nullable Double longitude) {
      this.longitude = longitude;
    }
    @JsonProperty("latitude")
    public void setLatitude(@Nullable Double latitude) {
      this.latitude = latitude;
    }
    @JsonProperty("european_electoral_region")
    public void setEuropeanElectoralRegion(@Nullable String europeanElectoralRegion) {
      this.europeanElectoralRegion = europeanElectoralRegion;
    }
    @JsonProperty("primary_care_trust")
    public void setPrimaryCareTrust(@Nullable String primaryCareTrust) {
      this.primaryCareTrust = primaryCareTrust;
    }
    @JsonProperty("region")
    public void setRegion(@Nullable String region) {
      this.region = region;
    }
    @JsonProperty("lsoa")
    public void setLsoa(@Nullable String lsoa) {
      this.lsoa = lsoa;
    }
    @JsonProperty("msoa")
    public void setMsoa(@Nullable String msoa) {
      this.msoa = msoa;
    }
    @JsonProperty("incode")
    public void setIncode(String incode) {
      this.incode = incode;
    }
    @JsonProperty("outcode")
    public void setOutcode(String outcode) {
      this.outcode = outcode;
    }
    @JsonProperty("parliamentary_constituency")
    public void setParliamentaryConstituency(@Nullable String parliamentaryConstituency) {
      this.parliamentaryConstituency = parliamentaryConstituency;
    }
    @JsonProperty("admin_district")
    public void setAdminDistrict(@Nullable String adminDistrict) {
      this.adminDistrict = adminDistrict;
    }
    @JsonProperty("parish")
    public void setParish(@Nullable String parish) {
      this.parish = parish;
    }
    @JsonProperty("admin_county")
    public void setAdminCounty(@Nullable String adminCounty) {
      this.adminCounty = adminCounty;
    }
    @JsonProperty("admin_ward")
    public void setAdminWard(@Nullable String adminWard) {
      this.adminWard = adminWard;
    }
    @JsonProperty("ced")
    public void setCed(@Nullable String ced) {
      this.ced = ced;
    }
    @JsonProperty("ccg")
    public void setCcg(@Nullable String ccg) {
      this.ccg = ccg;
    }
    @JsonProperty("nuts")
    public void setNuts(@Nullable String nuts) {
      this.nuts = nuts;
    }
    @JsonProperty("codes")
    public void setCodes(Codes codes) {
      this.codes = codes;
    }
    @JsonProperty("distance")
    public void setDistance(Double distance) {
      this.distance = distance;
    }
    @Override
    public String postcode() { throw new UnsupportedOperationException(); }
    @Override
    public int quality() { throw new UnsupportedOperationException(); }
    @Override
    public Integer eastings() { throw new UnsupportedOperationException(); }
    @Override
    public Integer northings() { throw new UnsupportedOperationException(); }
    @Override
    public String country() { throw new UnsupportedOperationException(); }
    @Override
    public String nhsHa() { throw new UnsupportedOperationException(); }
    @Override
    public Double longitude() { throw new UnsupportedOperationException(); }
    @Override
    public Double latitude() { throw new UnsupportedOperationException(); }
    @Override
    public String europeanElectoralRegion() { throw new UnsupportedOperationException(); }
    @Override
    public String primaryCareTrust() { throw new UnsupportedOperationException(); }
    @Override
    public String region() { throw new UnsupportedOperationException(); }
    @Override
    public String lsoa() { throw new UnsupportedOperationException(); }
    @Override
    public String msoa() { throw new UnsupportedOperationException(); }
    @Override
    public String incode() { throw new UnsupportedOperationException(); }
    @Override
    public String outcode() { throw new UnsupportedOperationException(); }
    @Override
    public String parliamentaryConstituency() { throw new UnsupportedOperationException(); }
    @Override
    public String adminDistrict() { throw new UnsupportedOperationException(); }
    @Override
    public String parish() { throw new UnsupportedOperationException(); }
    @Override
    public String adminCounty() { throw new UnsupportedOperationException(); }
    @Override
    public String adminWard() { throw new UnsupportedOperationException(); }
    @Override
    public String ced() { throw new UnsupportedOperationException(); }
    @Override
    public String ccg() { throw new UnsupportedOperationException(); }
    @Override
    public String nuts() { throw new UnsupportedOperationException(); }
    @Override
    public Codes codes() { throw new UnsupportedOperationException(); }
    @Override
    public Double distance() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePostCodeWithDistance fromJson(Json json) {
    ImmutablePostCodeWithDistance.Builder builder = ImmutablePostCodeWithDistance.builder();
    if (json.postcode != null) {
      builder.postcode(json.postcode);
    }
    if (json.qualityIsSet) {
      builder.quality(json.quality);
    }
    if (json.eastings != null) {
      builder.eastings(json.eastings);
    }
    if (json.northings != null) {
      builder.northings(json.northings);
    }
    if (json.country != null) {
      builder.country(json.country);
    }
    if (json.nhsHa != null) {
      builder.nhsHa(json.nhsHa);
    }
    if (json.longitude != null) {
      builder.longitude(json.longitude);
    }
    if (json.latitude != null) {
      builder.latitude(json.latitude);
    }
    if (json.europeanElectoralRegion != null) {
      builder.europeanElectoralRegion(json.europeanElectoralRegion);
    }
    if (json.primaryCareTrust != null) {
      builder.primaryCareTrust(json.primaryCareTrust);
    }
    if (json.region != null) {
      builder.region(json.region);
    }
    if (json.lsoa != null) {
      builder.lsoa(json.lsoa);
    }
    if (json.msoa != null) {
      builder.msoa(json.msoa);
    }
    if (json.incode != null) {
      builder.incode(json.incode);
    }
    if (json.outcode != null) {
      builder.outcode(json.outcode);
    }
    if (json.parliamentaryConstituency != null) {
      builder.parliamentaryConstituency(json.parliamentaryConstituency);
    }
    if (json.adminDistrict != null) {
      builder.adminDistrict(json.adminDistrict);
    }
    if (json.parish != null) {
      builder.parish(json.parish);
    }
    if (json.adminCounty != null) {
      builder.adminCounty(json.adminCounty);
    }
    if (json.adminWard != null) {
      builder.adminWard(json.adminWard);
    }
    if (json.ced != null) {
      builder.ced(json.ced);
    }
    if (json.ccg != null) {
      builder.ccg(json.ccg);
    }
    if (json.nuts != null) {
      builder.nuts(json.nuts);
    }
    if (json.codes != null) {
      builder.codes(json.codes);
    }
    if (json.distance != null) {
      builder.distance(json.distance);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PostCodeWithDistance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PostCodeWithDistance instance
   */
  public static ImmutablePostCodeWithDistance copyOf(PostCodeWithDistance instance) {
    if (instance instanceof ImmutablePostCodeWithDistance) {
      return (ImmutablePostCodeWithDistance) instance;
    }
    return ImmutablePostCodeWithDistance.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePostCodeWithDistance ImmutablePostCodeWithDistance}.
   * <pre>
   * ImmutablePostCodeWithDistance.builder()
   *    .postcode(String) // required {@link PostCodeWithDistance#postcode() postcode}
   *    .quality(int) // required {@link PostCodeWithDistance#quality() quality}
   *    .eastings(Integer | null) // nullable {@link PostCodeWithDistance#eastings() eastings}
   *    .northings(Integer | null) // nullable {@link PostCodeWithDistance#northings() northings}
   *    .country(String) // required {@link PostCodeWithDistance#country() country}
   *    .nhsHa(String | null) // nullable {@link PostCodeWithDistance#nhsHa() nhsHa}
   *    .longitude(Double | null) // nullable {@link PostCodeWithDistance#longitude() longitude}
   *    .latitude(Double | null) // nullable {@link PostCodeWithDistance#latitude() latitude}
   *    .europeanElectoralRegion(String | null) // nullable {@link PostCodeWithDistance#europeanElectoralRegion() europeanElectoralRegion}
   *    .primaryCareTrust(String | null) // nullable {@link PostCodeWithDistance#primaryCareTrust() primaryCareTrust}
   *    .region(String | null) // nullable {@link PostCodeWithDistance#region() region}
   *    .lsoa(String | null) // nullable {@link PostCodeWithDistance#lsoa() lsoa}
   *    .msoa(String | null) // nullable {@link PostCodeWithDistance#msoa() msoa}
   *    .incode(String) // required {@link PostCodeWithDistance#incode() incode}
   *    .outcode(String) // required {@link PostCodeWithDistance#outcode() outcode}
   *    .parliamentaryConstituency(String | null) // nullable {@link PostCodeWithDistance#parliamentaryConstituency() parliamentaryConstituency}
   *    .adminDistrict(String | null) // nullable {@link PostCodeWithDistance#adminDistrict() adminDistrict}
   *    .parish(String | null) // nullable {@link PostCodeWithDistance#parish() parish}
   *    .adminCounty(String | null) // nullable {@link PostCodeWithDistance#adminCounty() adminCounty}
   *    .adminWard(String | null) // nullable {@link PostCodeWithDistance#adminWard() adminWard}
   *    .ced(String | null) // nullable {@link PostCodeWithDistance#ced() ced}
   *    .ccg(String | null) // nullable {@link PostCodeWithDistance#ccg() ccg}
   *    .nuts(String | null) // nullable {@link PostCodeWithDistance#nuts() nuts}
   *    .codes(io.postcodes.client.Codes) // required {@link PostCodeWithDistance#codes() codes}
   *    .distance(Double) // required {@link PostCodeWithDistance#distance() distance}
   *    .build();
   * </pre>
   * @return A new ImmutablePostCodeWithDistance builder
   */
  public static ImmutablePostCodeWithDistance.Builder builder() {
    return new ImmutablePostCodeWithDistance.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePostCodeWithDistance ImmutablePostCodeWithDistance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PostCodeWithDistance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_POSTCODE = 0x1L;
    private static final long INIT_BIT_QUALITY = 0x2L;
    private static final long INIT_BIT_COUNTRY = 0x4L;
    private static final long INIT_BIT_INCODE = 0x8L;
    private static final long INIT_BIT_OUTCODE = 0x10L;
    private static final long INIT_BIT_CODES = 0x20L;
    private static final long INIT_BIT_DISTANCE = 0x40L;
    private long initBits = 0x7fL;

    private @Nullable String postcode;
    private int quality;
    private @Nullable Integer eastings;
    private @Nullable Integer northings;
    private @Nullable String country;
    private @Nullable String nhsHa;
    private @Nullable Double longitude;
    private @Nullable Double latitude;
    private @Nullable String europeanElectoralRegion;
    private @Nullable String primaryCareTrust;
    private @Nullable String region;
    private @Nullable String lsoa;
    private @Nullable String msoa;
    private @Nullable String incode;
    private @Nullable String outcode;
    private @Nullable String parliamentaryConstituency;
    private @Nullable String adminDistrict;
    private @Nullable String parish;
    private @Nullable String adminCounty;
    private @Nullable String adminWard;
    private @Nullable String ced;
    private @Nullable String ccg;
    private @Nullable String nuts;
    private @Nullable Codes codes;
    private @Nullable Double distance;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PostCodeWithDistance} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PostCodeWithDistance instance) {
      Objects.requireNonNull(instance, "instance");
      postcode(instance.postcode());
      quality(instance.quality());
      @Nullable Integer eastingsValue = instance.eastings();
      if (eastingsValue != null) {
        eastings(eastingsValue);
      }
      @Nullable Integer northingsValue = instance.northings();
      if (northingsValue != null) {
        northings(northingsValue);
      }
      country(instance.country());
      @Nullable String nhsHaValue = instance.nhsHa();
      if (nhsHaValue != null) {
        nhsHa(nhsHaValue);
      }
      @Nullable Double longitudeValue = instance.longitude();
      if (longitudeValue != null) {
        longitude(longitudeValue);
      }
      @Nullable Double latitudeValue = instance.latitude();
      if (latitudeValue != null) {
        latitude(latitudeValue);
      }
      @Nullable String europeanElectoralRegionValue = instance.europeanElectoralRegion();
      if (europeanElectoralRegionValue != null) {
        europeanElectoralRegion(europeanElectoralRegionValue);
      }
      @Nullable String primaryCareTrustValue = instance.primaryCareTrust();
      if (primaryCareTrustValue != null) {
        primaryCareTrust(primaryCareTrustValue);
      }
      @Nullable String regionValue = instance.region();
      if (regionValue != null) {
        region(regionValue);
      }
      @Nullable String lsoaValue = instance.lsoa();
      if (lsoaValue != null) {
        lsoa(lsoaValue);
      }
      @Nullable String msoaValue = instance.msoa();
      if (msoaValue != null) {
        msoa(msoaValue);
      }
      incode(instance.incode());
      outcode(instance.outcode());
      @Nullable String parliamentaryConstituencyValue = instance.parliamentaryConstituency();
      if (parliamentaryConstituencyValue != null) {
        parliamentaryConstituency(parliamentaryConstituencyValue);
      }
      @Nullable String adminDistrictValue = instance.adminDistrict();
      if (adminDistrictValue != null) {
        adminDistrict(adminDistrictValue);
      }
      @Nullable String parishValue = instance.parish();
      if (parishValue != null) {
        parish(parishValue);
      }
      @Nullable String adminCountyValue = instance.adminCounty();
      if (adminCountyValue != null) {
        adminCounty(adminCountyValue);
      }
      @Nullable String adminWardValue = instance.adminWard();
      if (adminWardValue != null) {
        adminWard(adminWardValue);
      }
      @Nullable String cedValue = instance.ced();
      if (cedValue != null) {
        ced(cedValue);
      }
      @Nullable String ccgValue = instance.ccg();
      if (ccgValue != null) {
        ccg(ccgValue);
      }
      @Nullable String nutsValue = instance.nuts();
      if (nutsValue != null) {
        nuts(nutsValue);
      }
      codes(instance.codes());
      distance(instance.distance());
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#postcode() postcode} attribute.
     * @param postcode The value for postcode 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("postcode")
    public final Builder postcode(String postcode) {
      this.postcode = Objects.requireNonNull(postcode, "postcode");
      initBits &= ~INIT_BIT_POSTCODE;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#quality() quality} attribute.
     * @param quality The value for quality 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("quality")
    public final Builder quality(int quality) {
      this.quality = quality;
      initBits &= ~INIT_BIT_QUALITY;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#eastings() eastings} attribute.
     * @param eastings The value for eastings (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("eastings")
    public final Builder eastings(@Nullable Integer eastings) {
      this.eastings = eastings;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#northings() northings} attribute.
     * @param northings The value for northings (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("northings")
    public final Builder northings(@Nullable Integer northings) {
      this.northings = northings;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#country() country} attribute.
     * @param country The value for country 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("country")
    public final Builder country(String country) {
      this.country = Objects.requireNonNull(country, "country");
      initBits &= ~INIT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#nhsHa() nhsHa} attribute.
     * @param nhsHa The value for nhsHa (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("nhs_ha")
    public final Builder nhsHa(@Nullable String nhsHa) {
      this.nhsHa = nhsHa;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#longitude() longitude} attribute.
     * @param longitude The value for longitude (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("longitude")
    public final Builder longitude(@Nullable Double longitude) {
      this.longitude = longitude;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#latitude() latitude} attribute.
     * @param latitude The value for latitude (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("latitude")
    public final Builder latitude(@Nullable Double latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#europeanElectoralRegion() europeanElectoralRegion} attribute.
     * @param europeanElectoralRegion The value for europeanElectoralRegion (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("european_electoral_region")
    public final Builder europeanElectoralRegion(@Nullable String europeanElectoralRegion) {
      this.europeanElectoralRegion = europeanElectoralRegion;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#primaryCareTrust() primaryCareTrust} attribute.
     * @param primaryCareTrust The value for primaryCareTrust (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("primary_care_trust")
    public final Builder primaryCareTrust(@Nullable String primaryCareTrust) {
      this.primaryCareTrust = primaryCareTrust;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#region() region} attribute.
     * @param region The value for region (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("region")
    public final Builder region(@Nullable String region) {
      this.region = region;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#lsoa() lsoa} attribute.
     * @param lsoa The value for lsoa (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("lsoa")
    public final Builder lsoa(@Nullable String lsoa) {
      this.lsoa = lsoa;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#msoa() msoa} attribute.
     * @param msoa The value for msoa (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("msoa")
    public final Builder msoa(@Nullable String msoa) {
      this.msoa = msoa;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#incode() incode} attribute.
     * @param incode The value for incode 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("incode")
    public final Builder incode(String incode) {
      this.incode = Objects.requireNonNull(incode, "incode");
      initBits &= ~INIT_BIT_INCODE;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#outcode() outcode} attribute.
     * @param outcode The value for outcode 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("outcode")
    public final Builder outcode(String outcode) {
      this.outcode = Objects.requireNonNull(outcode, "outcode");
      initBits &= ~INIT_BIT_OUTCODE;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#parliamentaryConstituency() parliamentaryConstituency} attribute.
     * @param parliamentaryConstituency The value for parliamentaryConstituency (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("parliamentary_constituency")
    public final Builder parliamentaryConstituency(@Nullable String parliamentaryConstituency) {
      this.parliamentaryConstituency = parliamentaryConstituency;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#adminDistrict() adminDistrict} attribute.
     * @param adminDistrict The value for adminDistrict (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("admin_district")
    public final Builder adminDistrict(@Nullable String adminDistrict) {
      this.adminDistrict = adminDistrict;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#parish() parish} attribute.
     * @param parish The value for parish (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("parish")
    public final Builder parish(@Nullable String parish) {
      this.parish = parish;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#adminCounty() adminCounty} attribute.
     * @param adminCounty The value for adminCounty (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("admin_county")
    public final Builder adminCounty(@Nullable String adminCounty) {
      this.adminCounty = adminCounty;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#adminWard() adminWard} attribute.
     * @param adminWard The value for adminWard (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("admin_ward")
    public final Builder adminWard(@Nullable String adminWard) {
      this.adminWard = adminWard;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#ced() ced} attribute.
     * @param ced The value for ced (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("ced")
    public final Builder ced(@Nullable String ced) {
      this.ced = ced;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#ccg() ccg} attribute.
     * @param ccg The value for ccg (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("ccg")
    public final Builder ccg(@Nullable String ccg) {
      this.ccg = ccg;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#nuts() nuts} attribute.
     * @param nuts The value for nuts (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("nuts")
    public final Builder nuts(@Nullable String nuts) {
      this.nuts = nuts;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#codes() codes} attribute.
     * @param codes The value for codes 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("codes")
    public final Builder codes(Codes codes) {
      this.codes = Objects.requireNonNull(codes, "codes");
      initBits &= ~INIT_BIT_CODES;
      return this;
    }

    /**
     * Initializes the value for the {@link PostCodeWithDistance#distance() distance} attribute.
     * @param distance The value for distance 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("distance")
    public final Builder distance(Double distance) {
      this.distance = Objects.requireNonNull(distance, "distance");
      initBits &= ~INIT_BIT_DISTANCE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePostCodeWithDistance ImmutablePostCodeWithDistance}.
     * @return An immutable instance of PostCodeWithDistance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePostCodeWithDistance build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePostCodeWithDistance(
          postcode,
          quality,
          eastings,
          northings,
          country,
          nhsHa,
          longitude,
          latitude,
          europeanElectoralRegion,
          primaryCareTrust,
          region,
          lsoa,
          msoa,
          incode,
          outcode,
          parliamentaryConstituency,
          adminDistrict,
          parish,
          adminCounty,
          adminWard,
          ced,
          ccg,
          nuts,
          codes,
          distance);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_POSTCODE) != 0) attributes.add("postcode");
      if ((initBits & INIT_BIT_QUALITY) != 0) attributes.add("quality");
      if ((initBits & INIT_BIT_COUNTRY) != 0) attributes.add("country");
      if ((initBits & INIT_BIT_INCODE) != 0) attributes.add("incode");
      if ((initBits & INIT_BIT_OUTCODE) != 0) attributes.add("outcode");
      if ((initBits & INIT_BIT_CODES) != 0) attributes.add("codes");
      if ((initBits & INIT_BIT_DISTANCE) != 0) attributes.add("distance");
      return "Cannot build PostCodeWithDistance, some of required attributes are not set " + attributes;
    }
  }
}

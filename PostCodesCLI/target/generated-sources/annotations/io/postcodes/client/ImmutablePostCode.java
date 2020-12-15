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
 * Immutable implementation of {@link PostCode}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePostCode.builder()}.
 */
@Generated(from = "PostCode", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePostCode implements PostCode {
  private final String postcode;
  private final int quality;
  private final String country;
  private final @Nullable String region;
  private final Codes codes;

  private ImmutablePostCode(
      String postcode,
      int quality,
      String country,
      @Nullable String region,
      Codes codes) {
    this.postcode = postcode;
    this.quality = quality;
    this.country = country;
    this.region = region;
    this.codes = codes;
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
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public String country() {
    return country;
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
   * @return The value of the {@code codes} attribute
   */
  @JsonProperty("codes")
  @Override
  public Codes codes() {
    return codes;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCode#postcode() postcode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for postcode
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCode withPostcode(String value) {
    String newValue = Objects.requireNonNull(value, "postcode");
    if (this.postcode.equals(newValue)) return this;
    return new ImmutablePostCode(newValue, this.quality, this.country, this.region, this.codes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCode#quality() quality} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for quality
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCode withQuality(int value) {
    if (this.quality == value) return this;
    return new ImmutablePostCode(this.postcode, value, this.country, this.region, this.codes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCode#country() country} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for country
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCode withCountry(String value) {
    String newValue = Objects.requireNonNull(value, "country");
    if (this.country.equals(newValue)) return this;
    return new ImmutablePostCode(this.postcode, this.quality, newValue, this.region, this.codes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCode#region() region} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for region (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCode withRegion(@Nullable String value) {
    if (Objects.equals(this.region, value)) return this;
    return new ImmutablePostCode(this.postcode, this.quality, this.country, value, this.codes);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PostCode#codes() codes} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for codes
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePostCode withCodes(Codes value) {
    if (this.codes == value) return this;
    Codes newValue = Objects.requireNonNull(value, "codes");
    return new ImmutablePostCode(this.postcode, this.quality, this.country, this.region, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePostCode} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePostCode
        && equalTo((ImmutablePostCode) another);
  }

  private boolean equalTo(ImmutablePostCode another) {
    return postcode.equals(another.postcode)
        && quality == another.quality
        && country.equals(another.country)
        && Objects.equals(region, another.region)
        && codes.equals(another.codes);
  }

  /**
   * Computes a hash code from attributes: {@code postcode}, {@code quality}, {@code country}, {@code region}, {@code codes}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + postcode.hashCode();
    h += (h << 5) + quality;
    h += (h << 5) + country.hashCode();
    h += (h << 5) + Objects.hashCode(region);
    h += (h << 5) + codes.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PostCode} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PostCode")
        .omitNullValues()
        .add("postcode", postcode)
        .add("quality", quality)
        .add("country", country)
        .add("region", region)
        .add("codes", codes)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PostCode", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PostCode {
    @Nullable String postcode;
    int quality;
    boolean qualityIsSet;
    @Nullable String country;
    @Nullable String region;
    @Nullable Codes codes;
    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
      this.postcode = postcode;
    }
    @JsonProperty("quality")
    public void setQuality(int quality) {
      this.quality = quality;
      this.qualityIsSet = true;
    }
    @JsonProperty("country")
    public void setCountry(String country) {
      this.country = country;
    }
    @JsonProperty("region")
    public void setRegion(@Nullable String region) {
      this.region = region;
    }
    @JsonProperty("codes")
    public void setCodes(Codes codes) {
      this.codes = codes;
    }
    @Override
    public String postcode() { throw new UnsupportedOperationException(); }
    @Override
    public int quality() { throw new UnsupportedOperationException(); }
    @Override
    public String country() { throw new UnsupportedOperationException(); }
    @Override
    public String region() { throw new UnsupportedOperationException(); }
    @Override
    public Codes codes() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePostCode fromJson(Json json) {
    ImmutablePostCode.Builder builder = ImmutablePostCode.builder();
    if (json.postcode != null) {
      builder.postcode(json.postcode);
    }
    if (json.qualityIsSet) {
      builder.quality(json.quality);
    }
    if (json.country != null) {
      builder.country(json.country);
    }
    if (json.region != null) {
      builder.region(json.region);
    }
    if (json.codes != null) {
      builder.codes(json.codes);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PostCode} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PostCode instance
   */
  public static ImmutablePostCode copyOf(PostCode instance) {
    if (instance instanceof ImmutablePostCode) {
      return (ImmutablePostCode) instance;
    }
    return ImmutablePostCode.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePostCode ImmutablePostCode}.
   * <pre>
   * ImmutablePostCode.builder()
   *    .postcode(String) // required {@link PostCode#postcode() postcode}
   *    .quality(int) // required {@link PostCode#quality() quality}
   *    .country(String) // required {@link PostCode#country() country}
   *    .region(String | null) // nullable {@link PostCode#region() region}
   *    .codes(io.postcodes.client.Codes) // required {@link PostCode#codes() codes}
   *    .build();
   * </pre>
   * @return A new ImmutablePostCode builder
   */
  public static ImmutablePostCode.Builder builder() {
    return new ImmutablePostCode.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePostCode ImmutablePostCode}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PostCode", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_POSTCODE = 0x1L;
    private static final long INIT_BIT_QUALITY = 0x2L;
    private static final long INIT_BIT_COUNTRY = 0x4L;
    private static final long INIT_BIT_CODES = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String postcode;
    private int quality;
    private @Nullable String country;
    private @Nullable String region;
    private @Nullable Codes codes;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PostCode} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PostCode instance) {
      Objects.requireNonNull(instance, "instance");
      postcode(instance.postcode());
      quality(instance.quality());
      country(instance.country());
      @Nullable String regionValue = instance.region();
      if (regionValue != null) {
        region(regionValue);
      }
      codes(instance.codes());
      return this;
    }

    /**
     * Initializes the value for the {@link PostCode#postcode() postcode} attribute.
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
     * Initializes the value for the {@link PostCode#quality() quality} attribute.
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
     * Initializes the value for the {@link PostCode#country() country} attribute.
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
     * Initializes the value for the {@link PostCode#region() region} attribute.
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
     * Initializes the value for the {@link PostCode#codes() codes} attribute.
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
     * Builds a new {@link ImmutablePostCode ImmutablePostCode}.
     * @return An immutable instance of PostCode
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePostCode build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePostCode(postcode, quality, country, region, codes);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_POSTCODE) != 0) attributes.add("postcode");
      if ((initBits & INIT_BIT_QUALITY) != 0) attributes.add("quality");
      if ((initBits & INIT_BIT_COUNTRY) != 0) attributes.add("country");
      if ((initBits & INIT_BIT_CODES) != 0) attributes.add("codes");
      return "Cannot build PostCode, some of required attributes are not set " + attributes;
    }
  }
}

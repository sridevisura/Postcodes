package io.postcodes.client;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.primitives.Booleans;
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
 * Immutable implementation of {@link ValidateResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValidateResponse.builder()}.
 */
@Generated(from = "ValidateResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
final class ImmutableValidateResponse implements ValidateResponse {
  private final int status;
  private final boolean result;

  private ImmutableValidateResponse(int status, boolean result) {
    this.status = status;
    this.result = result;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public int status() {
    return status;
  }

  /**
   * @return The value of the {@code result} attribute
   */
  @JsonProperty("result")
  @Override
  public boolean result() {
    return result;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValidateResponse#status() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableValidateResponse withStatus(int value) {
    if (this.status == value) return this;
    return new ImmutableValidateResponse(value, this.result);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ValidateResponse#result() result} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for result
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableValidateResponse withResult(boolean value) {
    if (this.result == value) return this;
    return new ImmutableValidateResponse(this.status, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValidateResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValidateResponse
        && equalTo((ImmutableValidateResponse) another);
  }

  private boolean equalTo(ImmutableValidateResponse another) {
    return status == another.status
        && result == another.result;
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code result}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + status;
    h += (h << 5) + Booleans.hashCode(result);
    return h;
  }

  /**
   * Prints the immutable value {@code ValidateResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ValidateResponse")
        .omitNullValues()
        .add("status", status)
        .add("result", result)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValidateResponse", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValidateResponse {
    int status;
    boolean statusIsSet;
    boolean result;
    boolean resultIsSet;
    @JsonProperty("status")
    public void setStatus(int status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("result")
    public void setResult(boolean result) {
      this.result = result;
      this.resultIsSet = true;
    }
    @Override
    public int status() { throw new UnsupportedOperationException(); }
    @Override
    public boolean result() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableValidateResponse fromJson(Json json) {
    ImmutableValidateResponse.Builder builder = ImmutableValidateResponse.builder();
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValidateResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValidateResponse instance
   */
  public static ImmutableValidateResponse copyOf(ValidateResponse instance) {
    if (instance instanceof ImmutableValidateResponse) {
      return (ImmutableValidateResponse) instance;
    }
    return ImmutableValidateResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableValidateResponse ImmutableValidateResponse}.
   * <pre>
   * ImmutableValidateResponse.builder()
   *    .status(int) // required {@link ValidateResponse#status() status}
   *    .result(boolean) // required {@link ValidateResponse#result() result}
   *    .build();
   * </pre>
   * @return A new ImmutableValidateResponse builder
   */
  public static ImmutableValidateResponse.Builder builder() {
    return new ImmutableValidateResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableValidateResponse ImmutableValidateResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValidateResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_STATUS = 0x1L;
    private static final long INIT_BIT_RESULT = 0x2L;
    private long initBits = 0x3L;

    private int status;
    private boolean result;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ValidateResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(ValidateResponse instance) {
      Objects.requireNonNull(instance, "instance");
      status(instance.status());
      result(instance.result());
      return this;
    }

    /**
     * Initializes the value for the {@link ValidateResponse#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("status")
    public final Builder status(int status) {
      this.status = status;
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link ValidateResponse#result() result} attribute.
     * @param result The value for result 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    @JsonProperty("result")
    public final Builder result(boolean result) {
      this.result = result;
      initBits &= ~INIT_BIT_RESULT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableValidateResponse ImmutableValidateResponse}.
     * @return An immutable instance of ValidateResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableValidateResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableValidateResponse(status, result);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_RESULT) != 0) attributes.add("result");
      return "Cannot build ValidateResponse, some of required attributes are not set " + attributes;
    }
  }
}

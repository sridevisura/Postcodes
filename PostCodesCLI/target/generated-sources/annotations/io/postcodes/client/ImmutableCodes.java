package io.postcodes.client;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Codes}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCodes.builder()}.
 */
@Generated(from = "Codes", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableCodes implements Codes {

  private ImmutableCodes(ImmutableCodes.Builder builder) {
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCodes} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCodes
        && equalTo((ImmutableCodes) another);
  }

  @SuppressWarnings("MethodCanBeStatic")
  private boolean equalTo(ImmutableCodes another) {
    return true;
  }

  /**
   * Returns a constant hash code value.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return 0;
  }

  /**
   * Prints the immutable value {@code Codes}.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Codes{}";
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Codes", generator = "Immutables")
  @Deprecated
  @SuppressWarnings("Immutable")
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Codes {
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCodes fromJson(Json json) {
    ImmutableCodes.Builder builder = ImmutableCodes.builder();
    return builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Codes} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Codes instance
   */
  public static ImmutableCodes copyOf(Codes instance) {
    if (instance instanceof ImmutableCodes) {
      return (ImmutableCodes) instance;
    }
    return ImmutableCodes.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCodes ImmutableCodes}.
   * <pre>
   * ImmutableCodes.builder()
   *    .build();
   * </pre>
   * @return A new ImmutableCodes builder
   */
  public static ImmutableCodes.Builder builder() {
    return new ImmutableCodes.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCodes ImmutableCodes}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Codes", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Codes} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Codes instance) {
      Objects.requireNonNull(instance, "instance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableCodes ImmutableCodes}.
     * @return An immutable instance of Codes
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCodes build() {
      return new ImmutableCodes(this);
    }
  }
}

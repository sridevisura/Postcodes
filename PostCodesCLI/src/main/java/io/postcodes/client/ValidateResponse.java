package io.postcodes.client;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableValidateResponse.class)
@JsonDeserialize(as = ImmutableValidateResponse.class)
interface ValidateResponse {

  int status();

  boolean result();
}

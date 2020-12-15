package io.postcodes.client;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePostCodeResponse.class)
@JsonDeserialize(as = ImmutablePostCodeResponse.class)
interface PostCodeResponse {

  int status();

  PostCode result();
}

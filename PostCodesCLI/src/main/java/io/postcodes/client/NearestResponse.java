package io.postcodes.client;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableNearestResponse.class)
@JsonDeserialize(as = ImmutableNearestResponse.class)
interface NearestResponse {

  int status();

  Iterable<PostCodeWithDistance> result();
}

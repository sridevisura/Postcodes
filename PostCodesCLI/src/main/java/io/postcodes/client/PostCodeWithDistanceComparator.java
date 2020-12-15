package io.postcodes.client;

import java.util.Comparator;

public class PostCodeWithDistanceComparator implements Comparator<PostCodeWithDistance> {

  @Override
  public int compare(PostCodeWithDistance o1, PostCodeWithDistance o2) {
    if (o1.distance() < o2.distance()) return -1;
    if (o1.distance() > o2.distance()) return 1;
    return 0;
  }
}

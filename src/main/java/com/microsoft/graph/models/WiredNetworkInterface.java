package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum WiredNetworkInterface implements ValuedEnum {
    /** Any Ethernet. */
    AnyEthernet("anyEthernet"),
    /** First active Ethernet. */
    FirstActiveEthernet("firstActiveEthernet"),
    /** Second active Ethernet. */
    SecondActiveEthernet("secondActiveEthernet"),
    /** Third active Ethernet. */
    ThirdActiveEthernet("thirdActiveEthernet"),
    /** First Ethernet. */
    FirstEthernet("firstEthernet"),
    /** Second Ethernet. */
    SecondEthernet("secondEthernet"),
    /** Third Ethernet. */
    ThirdEthernet("thirdEthernet");
    public final String value;
    WiredNetworkInterface(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WiredNetworkInterface forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "anyEthernet": return AnyEthernet;
            case "firstActiveEthernet": return FirstActiveEthernet;
            case "secondActiveEthernet": return SecondActiveEthernet;
            case "thirdActiveEthernet": return ThirdActiveEthernet;
            case "firstEthernet": return FirstEthernet;
            case "secondEthernet": return SecondEthernet;
            case "thirdEthernet": return ThirdEthernet;
            default: return null;
        }
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Apple network interface type.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WiredNetworkInterface forValue(@jakarta.annotation.Nonnull final String searchValue) {
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

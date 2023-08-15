package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Diffie Hellman Group values for Windows10 VPN policies with IKEv2 connection type.
 */
public enum DiffieHellmanGroup implements ValuedEnum {
    /** Group1 */
    Group1("group1"),
    /** Group2 */
    Group2("group2"),
    /** Group14 */
    Group14("group14"),
    /** ECP256 */
    Ecp256("ecp256"),
    /** ECP384 */
    Ecp384("ecp384"),
    /** Group24 */
    Group24("group24");
    public final String value;
    DiffieHellmanGroup(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DiffieHellmanGroup forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "group1": return Group1;
            case "group2": return Group2;
            case "group14": return Group14;
            case "ecp256": return Ecp256;
            case "ecp384": return Ecp384;
            case "group24": return Group24;
            default: return null;
        }
    }
}

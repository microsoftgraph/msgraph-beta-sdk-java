package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Forward Secrecy Group values for Windows10 VPN policies with IKEv2 connection type. */
public enum PerfectForwardSecrecyGroup implements ValuedEnum {
    /** PFS1 */
    Pfs1("pfs1"),
    /** PFS2 */
    Pfs2("pfs2"),
    /** PFS2048 */
    Pfs2048("pfs2048"),
    /** ECP256 */
    Ecp256("ecp256"),
    /** ECP384 */
    Ecp384("ecp384"),
    /** PFSMM */
    PfsMM("pfsMM"),
    /** PFS24 */
    Pfs24("pfs24");
    public final String value;
    PerfectForwardSecrecyGroup(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PerfectForwardSecrecyGroup forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "pfs1": return Pfs1;
            case "pfs2": return Pfs2;
            case "pfs2048": return Pfs2048;
            case "ecp256": return Ecp256;
            case "ecp384": return Ecp384;
            case "pfsMM": return PfsMM;
            case "pfs24": return Pfs24;
            default: return null;
        }
    }
}

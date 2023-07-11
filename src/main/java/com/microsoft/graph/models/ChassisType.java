package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Chassis type.
 */
public enum ChassisType implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Desktop. */
    Desktop("desktop"),
    /** Laptop. */
    Laptop("laptop"),
    /** Workstation. */
    WorksWorkstation("worksWorkstation"),
    /** Enterprise server. */
    EnterpriseServer("enterpriseServer"),
    /** Phone. */
    Phone("phone"),
    /** Mobile tablet. */
    Tablet("tablet"),
    /** Other mobile. */
    MobileOther("mobileOther"),
    /** Unknown mobile. */
    MobileUnknown("mobileUnknown");
    public final String value;
    ChassisType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChassisType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "desktop": return Desktop;
            case "laptop": return Laptop;
            case "worksWorkstation": return WorksWorkstation;
            case "enterpriseServer": return EnterpriseServer;
            case "phone": return Phone;
            case "tablet": return Tablet;
            case "mobileOther": return MobileOther;
            case "mobileUnknown": return MobileUnknown;
            default: return null;
        }
    }
}

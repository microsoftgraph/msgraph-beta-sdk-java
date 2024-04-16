package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Profile Type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProfileType implements ValuedEnum {
    /** Settings catalog profile type */
    SettingsCatalog("settingsCatalog"),
    /** Administrative Templates Profile Type */
    AdministrativeTemplates("administrativeTemplates"),
    /** Imported Administrative Templates Profile Type */
    ImportedADMXTemplates("importedADMXTemplates"),
    /** OEM Device related App Config Profile Type */
    OemAppConfig("oemAppConfig"),
    /** Hardware Configuration Profile Type */
    HardwareConfig("hardwareConfig"),
    /** DCV1 Endpoint Protection Profile Type */
    DcV1EndpointProtection("dcV1EndpointProtection"),
    /** DCV1 Device Restrictions Profile Type */
    DcV1DeviceRestrictions("dcV1DeviceRestrictions");
    public final String value;
    ProfileType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProfileType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "settingsCatalog": return SettingsCatalog;
            case "administrativeTemplates": return AdministrativeTemplates;
            case "importedADMXTemplates": return ImportedADMXTemplates;
            case "oemAppConfig": return OemAppConfig;
            case "hardwareConfig": return HardwareConfig;
            case "dcV1EndpointProtection": return DcV1EndpointProtection;
            case "dcV1DeviceRestrictions": return DcV1DeviceRestrictions;
            default: return null;
        }
    }
}

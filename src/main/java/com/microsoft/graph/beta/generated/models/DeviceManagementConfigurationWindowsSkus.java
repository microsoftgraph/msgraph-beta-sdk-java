package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationWindowsSkus implements ValuedEnum {
    /** Indicates the Device Management Configuration Windows SKU is &apos;unknown&apos;  */
    Unknown("unknown"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;windowsHome&apos;  */
    WindowsHome("windowsHome"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;windowsProfessional&apos;  */
    WindowsProfessional("windowsProfessional"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;windowsEnterprise&apos;  */
    WindowsEnterprise("windowsEnterprise"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;windowsEducation&apos;  */
    WindowsEducation("windowsEducation"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;windowsMobile&apos;  */
    WindowsMobile("windowsMobile"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;windowsMobileEnterprise&apos;  */
    WindowsMobileEnterprise("windowsMobileEnterprise"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;windowsTeamSurface&apos;  */
    WindowsTeamSurface("windowsTeamSurface"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;iot&apos;  */
    Iot("iot"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;iotEnterprise&apos;  */
    IotEnterprise("iotEnterprise"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;holoLens&apos;  */
    HoloLens("holoLens"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;holoLensEnterprise&apos;  */
    HoloLensEnterprise("holoLensEnterprise"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;holographicForBusiness&apos;  */
    HolographicForBusiness("holographicForBusiness"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;windowsMultiSession&apos;  */
    WindowsMultiSession("windowsMultiSession"),
    /** Indicates the Device Management Configuration Windows SKU is &apos;surfaceHub&apos;  */
    SurfaceHub("surfaceHub");
    public final String value;
    DeviceManagementConfigurationWindowsSkus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationWindowsSkus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "windowsHome": return WindowsHome;
            case "windowsProfessional": return WindowsProfessional;
            case "windowsEnterprise": return WindowsEnterprise;
            case "windowsEducation": return WindowsEducation;
            case "windowsMobile": return WindowsMobile;
            case "windowsMobileEnterprise": return WindowsMobileEnterprise;
            case "windowsTeamSurface": return WindowsTeamSurface;
            case "iot": return Iot;
            case "iotEnterprise": return IotEnterprise;
            case "holoLens": return HoloLens;
            case "holoLensEnterprise": return HoloLensEnterprise;
            case "holographicForBusiness": return HolographicForBusiness;
            case "windowsMultiSession": return WindowsMultiSession;
            case "surfaceHub": return SurfaceHub;
            default: return null;
        }
    }
}

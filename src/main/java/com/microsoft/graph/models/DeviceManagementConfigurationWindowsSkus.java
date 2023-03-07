package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum DeviceManagementConfigurationWindowsSkus implements ValuedEnum {
    Unknown("unknown"),
    WindowsHome("windowsHome"),
    WindowsProfessional("windowsProfessional"),
    WindowsEnterprise("windowsEnterprise"),
    WindowsEducation("windowsEducation"),
    WindowsMobile("windowsMobile"),
    WindowsMobileEnterprise("windowsMobileEnterprise"),
    WindowsTeamSurface("windowsTeamSurface"),
    Iot("iot"),
    IotEnterprise("iotEnterprise"),
    HoloLens("holoLens"),
    HoloLensEnterprise("holoLensEnterprise"),
    HolographicForBusiness("holographicForBusiness"),
    WindowsMultiSession("windowsMultiSession"),
    SurfaceHub("surfaceHub");
    public final String value;
    DeviceManagementConfigurationWindowsSkus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationWindowsSkus forValue(@javax.annotation.Nonnull final String searchValue) {
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

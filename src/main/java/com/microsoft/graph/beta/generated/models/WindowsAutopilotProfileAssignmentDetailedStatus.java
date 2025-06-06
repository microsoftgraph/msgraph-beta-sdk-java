package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsAutopilotProfileAssignmentDetailedStatus implements ValuedEnum {
    /** No assignment detailed status */
    None("none"),
    /** Hardware requirements are not met. This can happen if a self-deploying AutoPilot Profile is assigned to a device without TPM 2.0. */
    HardwareRequirementsNotMet("hardwareRequirementsNotMet"),
    /** Indicates that a Surface Hub AutoPilot Profile is assigned to a device that is not Surface Hub(Aruba). */
    SurfaceHubProfileNotSupported("surfaceHubProfileNotSupported"),
    /** Indicates that a HoloLens AutoPilot Profile is assigned to a device that is not HoloLens. */
    HoloLensProfileNotSupported("holoLensProfileNotSupported"),
    /** Indicates that a Windows PC AutoPilot Profile is assigned to a device that is not Windows PC. */
    WindowsPcProfileNotSupported("windowsPcProfileNotSupported"),
    /** Indicates that a surface Hub 2S  AutoPilot Profile is assigned to a device that is not surface Hub 2S. */
    SurfaceHub2SProfileNotSupported("surfaceHub2SProfileNotSupported"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsAutopilotProfileAssignmentDetailedStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsAutopilotProfileAssignmentDetailedStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "hardwareRequirementsNotMet": return HardwareRequirementsNotMet;
            case "surfaceHubProfileNotSupported": return SurfaceHubProfileNotSupported;
            case "holoLensProfileNotSupported": return HoloLensProfileNotSupported;
            case "windowsPcProfileNotSupported": return WindowsPcProfileNotSupported;
            case "surfaceHub2SProfileNotSupported": return SurfaceHub2SProfileNotSupported;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

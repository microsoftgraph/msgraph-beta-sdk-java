package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
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
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shouldn't be necessary. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WindowsAutopilotProfileAssignmentDetailedStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsAutopilotProfileAssignmentDetailedStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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

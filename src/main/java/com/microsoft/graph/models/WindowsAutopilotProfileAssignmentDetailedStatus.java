package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum WindowsAutopilotProfileAssignmentDetailedStatus implements ValuedEnum {
    None("none"),
    HardwareRequirementsNotMet("hardwareRequirementsNotMet"),
    SurfaceHubProfileNotSupported("surfaceHubProfileNotSupported"),
    HoloLensProfileNotSupported("holoLensProfileNotSupported"),
    WindowsPcProfileNotSupported("windowsPcProfileNotSupported"),
    SurfaceHub2SProfileNotSupported("surfaceHub2SProfileNotSupported"),
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

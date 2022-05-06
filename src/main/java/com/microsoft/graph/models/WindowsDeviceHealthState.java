package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum WindowsDeviceHealthState implements ValuedEnum {
    Clean("clean"),
    FullScanPending("fullScanPending"),
    RebootPending("rebootPending"),
    ManualStepsPending("manualStepsPending"),
    OfflineScanPending("offlineScanPending"),
    Critical("critical");
    public final String value;
    WindowsDeviceHealthState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDeviceHealthState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clean": return Clean;
            case "fullScanPending": return FullScanPending;
            case "rebootPending": return RebootPending;
            case "manualStepsPending": return ManualStepsPending;
            case "offlineScanPending": return OfflineScanPending;
            case "critical": return Critical;
            default: return null;
        }
    }
}

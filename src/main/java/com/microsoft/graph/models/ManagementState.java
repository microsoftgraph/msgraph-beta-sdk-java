package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum ManagementState implements ValuedEnum {
    Managed("managed"),
    RetirePending("retirePending"),
    RetireFailed("retireFailed"),
    WipePending("wipePending"),
    WipeFailed("wipeFailed"),
    Unhealthy("unhealthy"),
    DeletePending("deletePending"),
    RetireIssued("retireIssued"),
    WipeIssued("wipeIssued"),
    WipeCanceled("wipeCanceled"),
    RetireCanceled("retireCanceled"),
    Discovered("discovered");
    public final String value;
    ManagementState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagementState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "managed": return Managed;
            case "retirePending": return RetirePending;
            case "retireFailed": return RetireFailed;
            case "wipePending": return WipePending;
            case "wipeFailed": return WipeFailed;
            case "unhealthy": return Unhealthy;
            case "deletePending": return DeletePending;
            case "retireIssued": return RetireIssued;
            case "wipeIssued": return WipeIssued;
            case "wipeCanceled": return WipeCanceled;
            case "retireCanceled": return RetireCanceled;
            case "discovered": return Discovered;
            default: return null;
        }
    }
}

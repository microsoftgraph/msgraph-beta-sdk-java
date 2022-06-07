package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Casts the previous resource to group. */
public enum CloudPcStatus implements ValuedEnum {
    NotProvisioned("notProvisioned"),
    Provisioning("provisioning"),
    Provisioned("provisioned"),
    InGracePeriod("inGracePeriod"),
    Deprovisioning("deprovisioning"),
    Failed("failed"),
    ProvisionedWithWarnings("provisionedWithWarnings"),
    Resizing("resizing"),
    Restoring("restoring"),
    PendingProvision("pendingProvision"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notProvisioned": return NotProvisioned;
            case "provisioning": return Provisioning;
            case "provisioned": return Provisioned;
            case "inGracePeriod": return InGracePeriod;
            case "deprovisioning": return Deprovisioning;
            case "failed": return Failed;
            case "provisionedWithWarnings": return ProvisionedWithWarnings;
            case "resizing": return Resizing;
            case "restoring": return Restoring;
            case "pendingProvision": return PendingProvision;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

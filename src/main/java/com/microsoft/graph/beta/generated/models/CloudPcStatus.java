package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    UnknownFutureValue("unknownFutureValue"),
    MovingRegion("movingRegion"),
    ResizePendingLicense("resizePendingLicense"),
    UpdatingSingleSignOn("updatingSingleSignOn"),
    ModifyingSingleSignOn("modifyingSingleSignOn"),
    Preparing("preparing");
    public final String value;
    CloudPcStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
            case "movingRegion": return MovingRegion;
            case "resizePendingLicense": return ResizePendingLicense;
            case "updatingSingleSignOn": return UpdatingSingleSignOn;
            case "modifyingSingleSignOn": return ModifyingSingleSignOn;
            case "preparing": return Preparing;
            default: return null;
        }
    }
}

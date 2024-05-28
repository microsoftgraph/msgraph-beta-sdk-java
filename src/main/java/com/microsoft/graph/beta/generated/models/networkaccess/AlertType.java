package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AlertType implements ValuedEnum {
    UnhealthyRemoteNetworks("unhealthyRemoteNetworks"),
    UnhealthyConnectors("unhealthyConnectors"),
    DeviceTokenInconsistency("deviceTokenInconsistency"),
    CrossTenantAnomaly("crossTenantAnomaly"),
    SuspiciousProcess("suspiciousProcess"),
    ThreatIntelligenceTransactions("threatIntelligenceTransactions"),
    UnknownFutureValue("unknownFutureValue"),
    WebContentBlocked("webContentBlocked"),
    Malware("malware");
    public final String value;
    AlertType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AlertType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unhealthyRemoteNetworks": return UnhealthyRemoteNetworks;
            case "unhealthyConnectors": return UnhealthyConnectors;
            case "deviceTokenInconsistency": return DeviceTokenInconsistency;
            case "crossTenantAnomaly": return CrossTenantAnomaly;
            case "suspiciousProcess": return SuspiciousProcess;
            case "threatIntelligenceTransactions": return ThreatIntelligenceTransactions;
            case "unknownFutureValue": return UnknownFutureValue;
            case "webContentBlocked": return WebContentBlocked;
            case "malware": return Malware;
            default: return null;
        }
    }
}

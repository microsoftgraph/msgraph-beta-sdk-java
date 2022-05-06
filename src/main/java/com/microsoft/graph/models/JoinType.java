package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum JoinType implements ValuedEnum {
    Unknown("unknown"),
    AzureADJoined("azureADJoined"),
    AzureADRegistered("azureADRegistered"),
    HybridAzureADJoined("hybridAzureADJoined");
    public final String value;
    JoinType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static JoinType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "azureADJoined": return AzureADJoined;
            case "azureADRegistered": return AzureADRegistered;
            case "hybridAzureADJoined": return HybridAzureADJoined;
            default: return null;
        }
    }
}

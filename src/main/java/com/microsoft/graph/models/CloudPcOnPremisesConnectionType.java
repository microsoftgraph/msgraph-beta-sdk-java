package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum CloudPcOnPremisesConnectionType implements ValuedEnum {
    HybridAzureADJoin("hybridAzureADJoin"),
    AzureADJoin("azureADJoin"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcOnPremisesConnectionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcOnPremisesConnectionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "hybridAzureADJoin": return HybridAzureADJoin;
            case "azureADJoin": return AzureADJoin;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

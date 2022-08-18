package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum CloudPcDomainJoinType implements ValuedEnum {
    AzureADJoin("azureADJoin"),
    HybridAzureADJoin("hybridAzureADJoin"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcDomainJoinType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcDomainJoinType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azureADJoin": return AzureADJoin;
            case "hybridAzureADJoin": return HybridAzureADJoin;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

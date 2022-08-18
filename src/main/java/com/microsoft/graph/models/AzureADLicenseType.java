package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum AzureADLicenseType implements ValuedEnum {
    None("none"),
    Free("free"),
    Basic("basic"),
    PremiumP1("premiumP1"),
    PremiumP2("premiumP2"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AzureADLicenseType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AzureADLicenseType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "free": return Free;
            case "basic": return Basic;
            case "premiumP1": return PremiumP1;
            case "premiumP2": return PremiumP2;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum EducationSynchronizationProfileState implements ValuedEnum {
    Deleting("deleting"),
    DeletionFailed("deletionFailed"),
    ProvisioningFailed("provisioningFailed"),
    Provisioned("provisioned"),
    Provisioning("provisioning"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EducationSynchronizationProfileState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EducationSynchronizationProfileState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deleting": return Deleting;
            case "deletionFailed": return DeletionFailed;
            case "provisioningFailed": return ProvisioningFailed;
            case "provisioned": return Provisioned;
            case "provisioning": return Provisioning;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

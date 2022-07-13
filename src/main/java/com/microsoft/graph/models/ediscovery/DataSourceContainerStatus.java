package microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DataSourceContainerStatus implements ValuedEnum {
    Active("Active"),
    Released("Released"),
    UnknownFutureValue("UnknownFutureValue");
    public final String value;
    DataSourceContainerStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DataSourceContainerStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Active": return Active;
            case "Released": return Released;
            case "UnknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum WellKnownListName_v2 implements ValuedEnum {
    None("none"),
    DefaultList("defaultList"),
    FlaggedEmails("flaggedEmails"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WellKnownListName_v2(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WellKnownListName_v2 forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "defaultList": return DefaultList;
            case "flaggedEmails": return FlaggedEmails;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

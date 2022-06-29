package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the commsApplication singleton. */
public enum MeetingRegistrantStatus implements ValuedEnum {
    Registered("registered"),
    Canceled("canceled"),
    Processing("processing"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MeetingRegistrantStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MeetingRegistrantStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "registered": return Registered;
            case "canceled": return Canceled;
            case "processing": return Processing;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

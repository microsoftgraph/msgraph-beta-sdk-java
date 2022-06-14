package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of administrativeUnit entities. */
public enum MediaSourceContentCategory implements ValuedEnum {
    Meeting("meeting"),
    LiveStream("liveStream"),
    Presentation("presentation"),
    ScreenRecording("screenRecording"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MediaSourceContentCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MediaSourceContentCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "meeting": return Meeting;
            case "liveStream": return LiveStream;
            case "presentation": return Presentation;
            case "screenRecording": return ScreenRecording;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

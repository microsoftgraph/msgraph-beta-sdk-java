package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the compliance singleton. */
public enum PrintMediaType implements ValuedEnum {
    Stationery("stationery"),
    Transparency("transparency"),
    Envelope("envelope"),
    EnvelopePlain("envelopePlain"),
    Continuous("continuous"),
    Screen("screen"),
    ScreenPaged("screenPaged"),
    ContinuousLong("continuousLong"),
    ContinuousShort("continuousShort"),
    EnvelopeWindow("envelopeWindow"),
    MultiPartForm("multiPartForm"),
    MultiLayer("multiLayer"),
    Labels("labels");
    public final String value;
    PrintMediaType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PrintMediaType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "stationery": return Stationery;
            case "transparency": return Transparency;
            case "envelope": return Envelope;
            case "envelopePlain": return EnvelopePlain;
            case "continuous": return Continuous;
            case "screen": return Screen;
            case "screenPaged": return ScreenPaged;
            case "continuousLong": return ContinuousLong;
            case "continuousShort": return ContinuousShort;
            case "envelopeWindow": return EnvelopeWindow;
            case "multiPartForm": return MultiPartForm;
            case "multiLayer": return MultiLayer;
            case "labels": return Labels;
            default: return null;
        }
    }
}

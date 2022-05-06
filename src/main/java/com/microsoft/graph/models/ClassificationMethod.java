package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the dataClassificationService singleton.  */
public enum ClassificationMethod implements ValuedEnum {
    PatternMatch("patternMatch"),
    ExactDataMatch("exactDataMatch"),
    Fingerprint("fingerprint"),
    MachineLearning("machineLearning");
    public final String value;
    ClassificationMethod(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ClassificationMethod forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "patternMatch": return PatternMatch;
            case "exactDataMatch": return ExactDataMatch;
            case "fingerprint": return Fingerprint;
            case "machineLearning": return MachineLearning;
            default: return null;
        }
    }
}

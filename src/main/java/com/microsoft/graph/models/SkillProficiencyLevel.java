package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum SkillProficiencyLevel implements ValuedEnum {
    Elementary("elementary"),
    LimitedWorking("limitedWorking"),
    GeneralProfessional("generalProfessional"),
    AdvancedProfessional("advancedProfessional"),
    Expert("expert"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SkillProficiencyLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SkillProficiencyLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "elementary": return Elementary;
            case "limitedWorking": return LimitedWorking;
            case "generalProfessional": return GeneralProfessional;
            case "advancedProfessional": return AdvancedProfessional;
            case "expert": return Expert;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

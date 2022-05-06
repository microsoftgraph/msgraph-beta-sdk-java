package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to call the validateComplianceScript method.  */
public enum Code implements ValuedEnum {
    None("none"),
    JsonFileInvalid("jsonFileInvalid"),
    JsonFileMissing("jsonFileMissing"),
    JsonFileTooLarge("jsonFileTooLarge"),
    RulesMissing("rulesMissing"),
    DuplicateRules("duplicateRules"),
    TooManyRulesSpecified("tooManyRulesSpecified"),
    OperatorMissing("operatorMissing"),
    OperatorNotSupported("operatorNotSupported"),
    DatatypeMissing("datatypeMissing"),
    DatatypeNotSupported("datatypeNotSupported"),
    OperatorDataTypeCombinationNotSupported("operatorDataTypeCombinationNotSupported"),
    MoreInfoUriMissing("moreInfoUriMissing"),
    MoreInfoUriInvalid("moreInfoUriInvalid"),
    MoreInfoUriTooLarge("moreInfoUriTooLarge"),
    DescriptionMissing("descriptionMissing"),
    DescriptionInvalid("descriptionInvalid"),
    DescriptionTooLarge("descriptionTooLarge"),
    TitleMissing("titleMissing"),
    TitleInvalid("titleInvalid"),
    TitleTooLarge("titleTooLarge"),
    OperandMissing("operandMissing"),
    OperandInvalid("operandInvalid"),
    OperandTooLarge("operandTooLarge"),
    SettingNameMissing("settingNameMissing"),
    SettingNameInvalid("settingNameInvalid"),
    SettingNameTooLarge("settingNameTooLarge"),
    EnglishLocaleMissing("englishLocaleMissing"),
    DuplicateLocales("duplicateLocales"),
    UnrecognizedLocale("unrecognizedLocale"),
    Unknown("unknown"),
    RemediationStringsMissing("remediationStringsMissing");
    public final String value;
    Code(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static Code forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "jsonFileInvalid": return JsonFileInvalid;
            case "jsonFileMissing": return JsonFileMissing;
            case "jsonFileTooLarge": return JsonFileTooLarge;
            case "rulesMissing": return RulesMissing;
            case "duplicateRules": return DuplicateRules;
            case "tooManyRulesSpecified": return TooManyRulesSpecified;
            case "operatorMissing": return OperatorMissing;
            case "operatorNotSupported": return OperatorNotSupported;
            case "datatypeMissing": return DatatypeMissing;
            case "datatypeNotSupported": return DatatypeNotSupported;
            case "operatorDataTypeCombinationNotSupported": return OperatorDataTypeCombinationNotSupported;
            case "moreInfoUriMissing": return MoreInfoUriMissing;
            case "moreInfoUriInvalid": return MoreInfoUriInvalid;
            case "moreInfoUriTooLarge": return MoreInfoUriTooLarge;
            case "descriptionMissing": return DescriptionMissing;
            case "descriptionInvalid": return DescriptionInvalid;
            case "descriptionTooLarge": return DescriptionTooLarge;
            case "titleMissing": return TitleMissing;
            case "titleInvalid": return TitleInvalid;
            case "titleTooLarge": return TitleTooLarge;
            case "operandMissing": return OperandMissing;
            case "operandInvalid": return OperandInvalid;
            case "operandTooLarge": return OperandTooLarge;
            case "settingNameMissing": return SettingNameMissing;
            case "settingNameInvalid": return SettingNameInvalid;
            case "settingNameTooLarge": return SettingNameTooLarge;
            case "englishLocaleMissing": return EnglishLocaleMissing;
            case "duplicateLocales": return DuplicateLocales;
            case "unrecognizedLocale": return UnrecognizedLocale;
            case "unknown": return Unknown;
            case "remediationStringsMissing": return RemediationStringsMissing;
            default: return null;
        }
    }
}

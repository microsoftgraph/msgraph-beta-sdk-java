package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Error code for rule validation.
 */
public enum DeviceComplianceScriptRulesValidationError implements ValuedEnum {
    /** None error. */
    None("none"),
    /** Json file invalid error. */
    JsonFileInvalid("jsonFileInvalid"),
    /** Json file missing error. */
    JsonFileMissing("jsonFileMissing"),
    /** Json file too large error. */
    JsonFileTooLarge("jsonFileTooLarge"),
    /** Rules missing error. */
    RulesMissing("rulesMissing"),
    /** Duplicate rules error. */
    DuplicateRules("duplicateRules"),
    /** Too many rules specified error. */
    TooManyRulesSpecified("tooManyRulesSpecified"),
    /** Operator missing error. */
    OperatorMissing("operatorMissing"),
    /** Operator not supported error. */
    OperatorNotSupported("operatorNotSupported"),
    /** Data type missing error. */
    DatatypeMissing("datatypeMissing"),
    /** Data type not supported error. */
    DatatypeNotSupported("datatypeNotSupported"),
    /** Operator data type combination not supported error. */
    OperatorDataTypeCombinationNotSupported("operatorDataTypeCombinationNotSupported"),
    /** More info urlmissing error. */
    MoreInfoUriMissing("moreInfoUriMissing"),
    /** More info url invalid error. */
    MoreInfoUriInvalid("moreInfoUriInvalid"),
    /** More info ur ltoo large error. */
    MoreInfoUriTooLarge("moreInfoUriTooLarge"),
    /** Description missing error. */
    DescriptionMissing("descriptionMissing"),
    /** Description invalid error. */
    DescriptionInvalid("descriptionInvalid"),
    /** Description too large error. */
    DescriptionTooLarge("descriptionTooLarge"),
    /** Title missing error. */
    TitleMissing("titleMissing"),
    /** Title invalid error. */
    TitleInvalid("titleInvalid"),
    /** Title too large error. */
    TitleTooLarge("titleTooLarge"),
    /** Operand missing error. */
    OperandMissing("operandMissing"),
    /** Operand invalid error. */
    OperandInvalid("operandInvalid"),
    /** Operand too large error. */
    OperandTooLarge("operandTooLarge"),
    /** Setting name missing error. */
    SettingNameMissing("settingNameMissing"),
    /** Setting name invalid error. */
    SettingNameInvalid("settingNameInvalid"),
    /** Setting name too large error. */
    SettingNameTooLarge("settingNameTooLarge"),
    /** English locale missing error. */
    EnglishLocaleMissing("englishLocaleMissing"),
    /** Duplicate locales error. */
    DuplicateLocales("duplicateLocales"),
    /** Unrecognized locale error. */
    UnrecognizedLocale("unrecognizedLocale"),
    /** Unknown error. */
    Unknown("unknown"),
    /** Remediation strings missing error. */
    RemediationStringsMissing("remediationStringsMissing");
    public final String value;
    DeviceComplianceScriptRulesValidationError(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceComplianceScriptRulesValidationError forValue(@jakarta.annotation.Nonnull final String searchValue) {
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

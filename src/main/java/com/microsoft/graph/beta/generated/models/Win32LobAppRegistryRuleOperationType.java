package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * A list of possible operations for rules used to make determinations about an application based on registry keys or values. Unless noted, the values can be used with either detection or requirement rules.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Win32LobAppRegistryRuleOperationType implements ValuedEnum {
    /** Default. Indicates that the rule does not have the operation type configured. */
    NotConfigured("notConfigured"),
    /** Indicates that the rule evaluates whether the specified registry key or value exists. */
    Exists("exists"),
    /** Indicates that the rule evaluates whether the specified registry key or value does not exist. It is the functional inverse of an equivalent rule that uses operation type `exists`. */
    DoesNotExist("doesNotExist"),
    /** Indicates that the rule compares the value read at the given registry value against a provided comparison value by string comparison. */
    String("string"),
    /** Indicates that the rule compares the value read at the given registry value against a provided comparison value by integer comparison. */
    Integer("integer"),
    /** Indicates that the rule compares the value read at the given registry value against a provided comparison value via version semantics (both operand values will be parsed as versions and directly compared). If the value read at the given registry value is not discovered to be in version-compatible format, a string comparison will be used instead. */
    Version("version"),
    /** Indicates that the rule compares the data read at the given registry value against a provided comparison value via version semantics (both operand values will be parsed as versions and directly compared). If the data read at the given registry value is not discovered to be in a version-compatible format, a string comparison will be used instead. The rule will be resolved as not detected if the given registry value does not exist. This is similar to a rule with operation type `version`, but it also collects and reports the detected version value to report as the discovered version of the app installed on the device when the rule evaluates to `true`. Only one rule with this type may be specified. */
    AppVersion("appVersion"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    Win32LobAppRegistryRuleOperationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Win32LobAppRegistryRuleOperationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "exists": return Exists;
            case "doesNotExist": return DoesNotExist;
            case "string": return String;
            case "integer": return Integer;
            case "version": return Version;
            case "appVersion": return AppVersion;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

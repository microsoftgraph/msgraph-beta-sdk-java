package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PersonRelationship implements ValuedEnum {
    Manager("manager"),
    Colleague("colleague"),
    DirectReport("directReport"),
    DotLineReport("dotLineReport"),
    Assistant("assistant"),
    DotLineManager("dotLineManager"),
    AlternateContact("alternateContact"),
    Friend("friend"),
    Spouse("spouse"),
    Sibling("sibling"),
    Child("child"),
    Parent("parent"),
    Sponsor("sponsor"),
    EmergencyContact("emergencyContact"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PersonRelationship(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PersonRelationship forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manager": return Manager;
            case "colleague": return Colleague;
            case "directReport": return DirectReport;
            case "dotLineReport": return DotLineReport;
            case "assistant": return Assistant;
            case "dotLineManager": return DotLineManager;
            case "alternateContact": return AlternateContact;
            case "friend": return Friend;
            case "spouse": return Spouse;
            case "sibling": return Sibling;
            case "child": return Child;
            case "parent": return Parent;
            case "sponsor": return Sponsor;
            case "emergencyContact": return EmergencyContact;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

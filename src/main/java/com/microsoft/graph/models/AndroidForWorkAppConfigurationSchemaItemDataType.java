package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum AndroidForWorkAppConfigurationSchemaItemDataType implements ValuedEnum {
    Bool("bool"),
    Integer("integer"),
    String("string"),
    Choice("choice"),
    Multiselect("multiselect"),
    Bundle("bundle"),
    BundleArray("bundleArray"),
    Hidden("hidden");
    public final String value;
    AndroidForWorkAppConfigurationSchemaItemDataType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidForWorkAppConfigurationSchemaItemDataType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "bool": return Bool;
            case "integer": return Integer;
            case "string": return String;
            case "choice": return Choice;
            case "multiselect": return Multiselect;
            case "bundle": return Bundle;
            case "bundleArray": return BundleArray;
            case "hidden": return Hidden;
            default: return null;
        }
    }
}

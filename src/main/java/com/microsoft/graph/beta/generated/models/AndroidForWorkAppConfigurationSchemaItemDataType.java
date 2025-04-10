package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Data type for a configuration item inside an Android for Work application&apos;s custom configuration schema
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidForWorkAppConfigurationSchemaItemDataType forValue(@jakarta.annotation.Nonnull final String searchValue) {
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

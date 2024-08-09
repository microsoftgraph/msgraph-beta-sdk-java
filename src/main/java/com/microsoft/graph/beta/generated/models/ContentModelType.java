package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentModelType implements ValuedEnum {
    TeachingMethod("teachingMethod"),
    LayoutMethod("layoutMethod"),
    FreeformSelectionMethod("freeformSelectionMethod"),
    PrebuiltContractModel("prebuiltContractModel"),
    PrebuiltInvoiceModel("prebuiltInvoiceModel"),
    PrebuiltReceiptModel("prebuiltReceiptModel"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentModelType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentModelType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "teachingMethod": return TeachingMethod;
            case "layoutMethod": return LayoutMethod;
            case "freeformSelectionMethod": return FreeformSelectionMethod;
            case "prebuiltContractModel": return PrebuiltContractModel;
            case "prebuiltInvoiceModel": return PrebuiltInvoiceModel;
            case "prebuiltReceiptModel": return PrebuiltReceiptModel;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

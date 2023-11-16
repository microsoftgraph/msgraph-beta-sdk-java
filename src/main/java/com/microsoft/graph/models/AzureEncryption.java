package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AzureEncryption implements ValuedEnum {
    MicrosoftStorage("microsoftStorage"),
    MicrosoftKeyVault("microsoftKeyVault"),
    Customer("customer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AzureEncryption(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AzureEncryption forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftStorage": return MicrosoftStorage;
            case "microsoftKeyVault": return MicrosoftKeyVault;
            case "customer": return Customer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BookingInvoiceStatus implements ValuedEnum {
    Draft("draft"),
    Reviewing("reviewing"),
    Open("open"),
    Canceled("canceled"),
    Paid("paid"),
    Corrective("corrective");
    public final String value;
    BookingInvoiceStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BookingInvoiceStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "draft": return Draft;
            case "reviewing": return Reviewing;
            case "open": return Open;
            case "canceled": return Canceled;
            case "paid": return Paid;
            case "corrective": return Corrective;
            default: return null;
        }
    }
}

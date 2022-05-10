package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of bookingBusiness entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BookingInvoiceStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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

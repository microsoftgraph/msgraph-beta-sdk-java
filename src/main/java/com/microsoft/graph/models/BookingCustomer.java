package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class BookingCustomer extends BookingPerson implements Parsable {
    /** Addresses associated with the customer, including home, business and other addresses. */
    private java.util.List<PhysicalAddress> _addresses;
    /** Phone numbers associated with the customer, including home, business and mobile numbers. */
    private java.util.List<Phone> _phones;
    /**
     * Instantiates a new BookingCustomer and sets the default values.
     * @return a void
     */
    public BookingCustomer() {
        super();
        this.setOdataType("#microsoft.graph.bookingCustomer");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BookingCustomer
     */
    @javax.annotation.Nonnull
    public static BookingCustomer createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCustomer();
    }
    /**
     * Gets the addresses property value. Addresses associated with the customer, including home, business and other addresses.
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public java.util.List<PhysicalAddress> getAddresses() {
        return this._addresses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BookingCustomer currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("addresses", (n) -> { currentObject.setAddresses(n.getCollectionOfObjectValues(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("phones", (n) -> { currentObject.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the phones property value. Phone numbers associated with the customer, including home, business and mobile numbers.
     * @return a phone
     */
    @javax.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this._phones;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("addresses", this.getAddresses());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
    }
    /**
     * Sets the addresses property value. Addresses associated with the customer, including home, business and other addresses.
     * @param value Value to set for the addresses property.
     * @return a void
     */
    public void setAddresses(@javax.annotation.Nullable final java.util.List<PhysicalAddress> value) {
        this._addresses = value;
    }
    /**
     * Sets the phones property value. Phone numbers associated with the customer, including home, business and mobile numbers.
     * @param value Value to set for the phones property.
     * @return a void
     */
    public void setPhones(@javax.annotation.Nullable final java.util.List<Phone> value) {
        this._phones = value;
    }
}

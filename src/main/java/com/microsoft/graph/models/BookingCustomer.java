package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a customer of the business.
 */
public class BookingCustomer extends BookingPerson implements Parsable {
    /**
     * Addresses associated with the customer, including home, business and other addresses.
     */
    private java.util.List<PhysicalAddress> addresses;
    /**
     * Phone numbers associated with the customer, including home, business and mobile numbers.
     */
    private java.util.List<Phone> phones;
    /**
     * Instantiates a new bookingCustomer and sets the default values.
     */
    public BookingCustomer() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a bookingCustomer
     */
    @jakarta.annotation.Nonnull
    public static BookingCustomer createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BookingCustomer();
    }
    /**
     * Gets the addresses property value. Addresses associated with the customer, including home, business and other addresses.
     * @return a physicalAddress
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhysicalAddress> getAddresses() {
        return this.addresses;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("addresses", (n) -> { this.setAddresses(n.getCollectionOfObjectValues(PhysicalAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("phones", (n) -> { this.setPhones(n.getCollectionOfObjectValues(Phone::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the phones property value. Phone numbers associated with the customer, including home, business and mobile numbers.
     * @return a phone
     */
    @jakarta.annotation.Nullable
    public java.util.List<Phone> getPhones() {
        return this.phones;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("addresses", this.getAddresses());
        writer.writeCollectionOfObjectValues("phones", this.getPhones());
    }
    /**
     * Sets the addresses property value. Addresses associated with the customer, including home, business and other addresses.
     * @param value Value to set for the addresses property.
     */
    public void setAddresses(@jakarta.annotation.Nullable final java.util.List<PhysicalAddress> value) {
        this.addresses = value;
    }
    /**
     * Sets the phones property value. Phone numbers associated with the customer, including home, business and mobile numbers.
     * @param value Value to set for the phones property.
     */
    public void setPhones(@jakarta.annotation.Nullable final java.util.List<Phone> value) {
        this.phones = value;
    }
}

package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ForwardingOptions extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ForwardingOptions} and sets the default values.
     */
    public ForwardingOptions() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ForwardingOptions}
     */
    @jakarta.annotation.Nonnull
    public static ForwardingOptions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForwardingOptions();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("skipDnsLookupState", (n) -> { this.setSkipDnsLookupState(n.getEnumValue(Status::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the skipDnsLookupState property value. The skipDnsLookupState property
     * @return a {@link Status}
     */
    @jakarta.annotation.Nullable
    public Status getSkipDnsLookupState() {
        return this.backingStore.get("skipDnsLookupState");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("skipDnsLookupState", this.getSkipDnsLookupState());
    }
    /**
     * Sets the skipDnsLookupState property value. The skipDnsLookupState property
     * @param value Value to set for the skipDnsLookupState property.
     */
    public void setSkipDnsLookupState(@jakarta.annotation.Nullable final Status value) {
        this.backingStore.set("skipDnsLookupState", value);
    }
}

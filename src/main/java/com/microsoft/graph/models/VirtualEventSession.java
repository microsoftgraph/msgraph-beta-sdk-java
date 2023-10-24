package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEventSession extends OnlineMeeting implements Parsable {
    /**
     * Registration records of this virtual event session.
     */
    private java.util.List<VirtualEventRegistration> registrations;
    /**
     * Instantiates a new VirtualEventSession and sets the default values.
     */
    public VirtualEventSession() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEventSession
     */
    @jakarta.annotation.Nonnull
    public static VirtualEventSession createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventSession();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("registrations", (n) -> { this.setRegistrations(n.getCollectionOfObjectValues(VirtualEventRegistration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the registrations property value. Registration records of this virtual event session.
     * @return a java.util.List<VirtualEventRegistration>
     */
    @jakarta.annotation.Nullable
    public java.util.List<VirtualEventRegistration> getRegistrations() {
        return this.registrations;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("registrations", this.getRegistrations());
    }
    /**
     * Sets the registrations property value. Registration records of this virtual event session.
     * @param value Value to set for the registrations property.
     */
    public void setRegistrations(@jakarta.annotation.Nullable final java.util.List<VirtualEventRegistration> value) {
        this.registrations = value;
    }
}

package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ForwardingOptions extends Entity implements Parsable {
    /**
     * The skipDnsLookupState property
     */
    private Status skipDnsLookupState;
    /**
     * Instantiates a new forwardingOptions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ForwardingOptions() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a forwardingOptions
     */
    @javax.annotation.Nonnull
    public static ForwardingOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ForwardingOptions();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("skipDnsLookupState", (n) -> { this.setSkipDnsLookupState(n.getEnumValue(Status.class)); });
        return deserializerMap;
    }
    /**
     * Gets the skipDnsLookupState property value. The skipDnsLookupState property
     * @return a status
     */
    @javax.annotation.Nullable
    public Status getSkipDnsLookupState() {
        return this.skipDnsLookupState;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("skipDnsLookupState", this.getSkipDnsLookupState());
    }
    /**
     * Sets the skipDnsLookupState property value. The skipDnsLookupState property
     * @param value Value to set for the skipDnsLookupState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkipDnsLookupState(@javax.annotation.Nullable final Status value) {
        this.skipDnsLookupState = value;
    }
}

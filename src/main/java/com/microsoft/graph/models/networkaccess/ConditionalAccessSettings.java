package com.microsoft.graph.models.networkaccess;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConditionalAccessSettings extends Entity implements Parsable {
    /**
     * The signalingStatus property
     */
    private Status signalingStatus;
    /**
     * Instantiates a new conditionalAccessSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConditionalAccessSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a conditionalAccessSettings
     */
    @javax.annotation.Nonnull
    public static ConditionalAccessSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("signalingStatus", (n) -> { this.setSignalingStatus(n.getEnumValue(Status.class)); });
        return deserializerMap;
    }
    /**
     * Gets the signalingStatus property value. The signalingStatus property
     * @return a Status
     */
    @javax.annotation.Nullable
    public Status getSignalingStatus() {
        return this.signalingStatus;
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
        writer.writeEnumValue("signalingStatus", this.getSignalingStatus());
    }
    /**
     * Sets the signalingStatus property value. The signalingStatus property
     * @param value Value to set for the signalingStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSignalingStatus(@javax.annotation.Nullable final Status value) {
        this.signalingStatus = value;
    }
}

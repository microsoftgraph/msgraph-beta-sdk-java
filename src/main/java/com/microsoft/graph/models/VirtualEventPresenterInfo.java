package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEventPresenterInfo extends MeetingParticipantInfo implements Parsable {
    /**
     * The presenterDetails property
     */
    private VirtualEventPresenterDetails presenterDetails;
    /**
     * Instantiates a new VirtualEventPresenterInfo and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEventPresenterInfo() {
        super();
        this.setOdataType("#microsoft.graph.virtualEventPresenterInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEventPresenterInfo
     */
    @javax.annotation.Nonnull
    public static VirtualEventPresenterInfo createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEventPresenterInfo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("presenterDetails", (n) -> { this.setPresenterDetails(n.getObjectValue(VirtualEventPresenterDetails::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the presenterDetails property value. The presenterDetails property
     * @return a virtualEventPresenterDetails
     */
    @javax.annotation.Nullable
    public VirtualEventPresenterDetails getPresenterDetails() {
        return this.presenterDetails;
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
        writer.writeObjectValue("presenterDetails", this.getPresenterDetails());
    }
    /**
     * Sets the presenterDetails property value. The presenterDetails property
     * @param value Value to set for the presenterDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPresenterDetails(@javax.annotation.Nullable final VirtualEventPresenterDetails value) {
        this.presenterDetails = value;
    }
}

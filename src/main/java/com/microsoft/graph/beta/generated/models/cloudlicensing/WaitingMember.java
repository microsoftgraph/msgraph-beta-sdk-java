package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.graph.beta.models.DirectoryObject;
import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WaitingMember extends Entity implements Parsable {
    /**
     * Instantiates a new {@link WaitingMember} and sets the default values.
     */
    public WaitingMember() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WaitingMember}
     */
    @jakarta.annotation.Nonnull
    public static WaitingMember createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WaitingMember();
    }
    /**
     * Gets the allotment property value. The allotment property
     * @return a {@link Allotment}
     */
    @jakarta.annotation.Nullable
    public Allotment getAllotment() {
        return this.backingStore.get("allotment");
    }
    /**
     * Gets the assignedTo property value. The assignedTo property
     * @return a {@link DirectoryObject}
     */
    @jakarta.annotation.Nullable
    public DirectoryObject getAssignedTo() {
        return this.backingStore.get("assignedTo");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allotment", (n) -> { this.setAllotment(n.getObjectValue(Allotment::createFromDiscriminatorValue)); });
        deserializerMap.put("assignedTo", (n) -> { this.setAssignedTo(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("waitingSinceDateTime", (n) -> { this.setWaitingSinceDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the waitingSinceDateTime property value. Indicates the moment when the user or device first waited for this license. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getWaitingSinceDateTime() {
        return this.backingStore.get("waitingSinceDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("allotment", this.getAllotment());
        writer.writeObjectValue("assignedTo", this.getAssignedTo());
        writer.writeOffsetDateTimeValue("waitingSinceDateTime", this.getWaitingSinceDateTime());
    }
    /**
     * Sets the allotment property value. The allotment property
     * @param value Value to set for the allotment property.
     */
    public void setAllotment(@jakarta.annotation.Nullable final Allotment value) {
        this.backingStore.set("allotment", value);
    }
    /**
     * Sets the assignedTo property value. The assignedTo property
     * @param value Value to set for the assignedTo property.
     */
    public void setAssignedTo(@jakarta.annotation.Nullable final DirectoryObject value) {
        this.backingStore.set("assignedTo", value);
    }
    /**
     * Sets the waitingSinceDateTime property value. Indicates the moment when the user or device first waited for this license. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the waitingSinceDateTime property.
     */
    public void setWaitingSinceDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("waitingSinceDateTime", value);
    }
}

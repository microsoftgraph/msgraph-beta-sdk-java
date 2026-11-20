package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerHistoryItem extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link PlannerHistoryItem} and sets the default values.
     */
    public PlannerHistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlannerHistoryItem}
     */
    @jakarta.annotation.Nonnull
    public static PlannerHistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.taskHistoryItem": return new TaskHistoryItem();
            }
        }
        return new PlannerHistoryItem();
    }
    /**
     * Gets the actor property value. The identity of the user or application that performed the change.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getActor() {
        return this.backingStore.get("actor");
    }
    /**
     * Gets the entityId property value. The ID of the entity that was changed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEntityId() {
        return this.backingStore.get("entityId");
    }
    /**
     * Gets the entityType property value. The entityType property
     * @return a {@link HistoryEntityType}
     */
    @jakarta.annotation.Nullable
    public HistoryEntityType getEntityType() {
        return this.backingStore.get("entityType");
    }
    /**
     * Gets the eventType property value. The eventType property
     * @return a {@link HistoryEventType}
     */
    @jakarta.annotation.Nullable
    public HistoryEventType getEventType() {
        return this.backingStore.get("eventType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("entityId", (n) -> { this.setEntityId(n.getStringValue()); });
        deserializerMap.put("entityType", (n) -> { this.setEntityType(n.getEnumValue(HistoryEntityType::forValue)); });
        deserializerMap.put("eventType", (n) -> { this.setEventType(n.getEnumValue(HistoryEventType::forValue)); });
        deserializerMap.put("occurredDateTime", (n) -> { this.setOccurredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the occurredDateTime property value. The date and time when the change occurred. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOccurredDateTime() {
        return this.backingStore.get("occurredDateTime");
    }
    /**
     * Gets the planId property value. The ID of the plan that contains the changed entity.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlanId() {
        return this.backingStore.get("planId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("actor", this.getActor());
        writer.writeStringValue("entityId", this.getEntityId());
        writer.writeEnumValue("entityType", this.getEntityType());
        writer.writeEnumValue("eventType", this.getEventType());
        writer.writeOffsetDateTimeValue("occurredDateTime", this.getOccurredDateTime());
        writer.writeStringValue("planId", this.getPlanId());
    }
    /**
     * Sets the actor property value. The identity of the user or application that performed the change.
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("actor", value);
    }
    /**
     * Sets the entityId property value. The ID of the entity that was changed.
     * @param value Value to set for the entityId property.
     */
    public void setEntityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("entityId", value);
    }
    /**
     * Sets the entityType property value. The entityType property
     * @param value Value to set for the entityType property.
     */
    public void setEntityType(@jakarta.annotation.Nullable final HistoryEntityType value) {
        this.backingStore.set("entityType", value);
    }
    /**
     * Sets the eventType property value. The eventType property
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final HistoryEventType value) {
        this.backingStore.set("eventType", value);
    }
    /**
     * Sets the occurredDateTime property value. The date and time when the change occurred. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2024, is 2024-01-01T00:00:00Z.
     * @param value Value to set for the occurredDateTime property.
     */
    public void setOccurredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("occurredDateTime", value);
    }
    /**
     * Sets the planId property value. The ID of the plan that contains the changed entity.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planId", value);
    }
}

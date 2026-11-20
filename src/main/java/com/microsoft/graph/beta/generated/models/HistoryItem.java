package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class HistoryItem extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link HistoryItem} and sets the default values.
     */
    public HistoryItem() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link HistoryItem}
     */
    @jakarta.annotation.Nonnull
    public static HistoryItem createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new HistoryItem();
    }
    /**
     * Gets the actor property value. Identity of the user (or application) that performed the change.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getActor() {
        return this.backingStore.get("actor");
    }
    /**
     * Gets the entityId property value. ID of the entity the history item describes.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEntityId() {
        return this.backingStore.get("entityId");
    }
    /**
     * Gets the entityType property value. Type of the entity the history item describes. The possible values are: task, unknownFutureValue.
     * @return a {@link HistoryEntityType}
     */
    @jakarta.annotation.Nullable
    public HistoryEntityType getEntityType() {
        return this.backingStore.get("entityType");
    }
    /**
     * Gets the eventType property value. Type of the change event that occurred. The possible values are: created, updated, deleted, undeleted, moved, unknownFutureValue.
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
        deserializerMap.put("newData", (n) -> { this.setNewData(n.getStringValue()); });
        deserializerMap.put("occurredDateTime", (n) -> { this.setOccurredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("oldData", (n) -> { this.setOldData(n.getStringValue()); });
        deserializerMap.put("planId", (n) -> { this.setPlanId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newData property value. Serialized representation of the entity state after the change.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNewData() {
        return this.backingStore.get("newData");
    }
    /**
     * Gets the occurredDateTime property value. Date and time the change occurred. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOccurredDateTime() {
        return this.backingStore.get("occurredDateTime");
    }
    /**
     * Gets the oldData property value. Serialized representation of the entity state before the change.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOldData() {
        return this.backingStore.get("oldData");
    }
    /**
     * Gets the planId property value. ID of the plan the change occurred in.
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
        writer.writeStringValue("newData", this.getNewData());
        writer.writeStringValue("oldData", this.getOldData());
        writer.writeStringValue("planId", this.getPlanId());
    }
    /**
     * Sets the actor property value. Identity of the user (or application) that performed the change.
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("actor", value);
    }
    /**
     * Sets the entityId property value. ID of the entity the history item describes.
     * @param value Value to set for the entityId property.
     */
    public void setEntityId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("entityId", value);
    }
    /**
     * Sets the entityType property value. Type of the entity the history item describes. The possible values are: task, unknownFutureValue.
     * @param value Value to set for the entityType property.
     */
    public void setEntityType(@jakarta.annotation.Nullable final HistoryEntityType value) {
        this.backingStore.set("entityType", value);
    }
    /**
     * Sets the eventType property value. Type of the change event that occurred. The possible values are: created, updated, deleted, undeleted, moved, unknownFutureValue.
     * @param value Value to set for the eventType property.
     */
    public void setEventType(@jakarta.annotation.Nullable final HistoryEventType value) {
        this.backingStore.set("eventType", value);
    }
    /**
     * Sets the newData property value. Serialized representation of the entity state after the change.
     * @param value Value to set for the newData property.
     */
    public void setNewData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("newData", value);
    }
    /**
     * Sets the occurredDateTime property value. Date and time the change occurred. Read-only.
     * @param value Value to set for the occurredDateTime property.
     */
    public void setOccurredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("occurredDateTime", value);
    }
    /**
     * Sets the oldData property value. Serialized representation of the entity state before the change.
     * @param value Value to set for the oldData property.
     */
    public void setOldData(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("oldData", value);
    }
    /**
     * Sets the planId property value. ID of the plan the change occurred in.
     * @param value Value to set for the planId property.
     */
    public void setPlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("planId", value);
    }
}

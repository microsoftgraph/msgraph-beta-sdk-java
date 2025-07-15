package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IncidentTask extends Entity implements Parsable {
    /**
     * Instantiates a new {@link IncidentTask} and sets the default values.
     */
    public IncidentTask() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IncidentTask}
     */
    @jakarta.annotation.Nonnull
    public static IncidentTask createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IncidentTask();
    }
    /**
     * Gets the actionStatus property value. The actionStatus property
     * @return a {@link IncidentTaskActionStatus}
     */
    @jakarta.annotation.Nullable
    public IncidentTaskActionStatus getActionStatus() {
        return this.backingStore.get("actionStatus");
    }
    /**
     * Gets the actionType property value. The actionType property
     * @return a {@link IncidentTaskActionType}
     */
    @jakarta.annotation.Nullable
    public IncidentTaskActionType getActionType() {
        return this.backingStore.get("actionType");
    }
    /**
     * Gets the createdByDisplayName property value. The createdByDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedByDisplayName() {
        return this.backingStore.get("createdByDisplayName");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionStatus", (n) -> { this.setActionStatus(n.getEnumValue(IncidentTaskActionStatus::forValue)); });
        deserializerMap.put("actionType", (n) -> { this.setActionType(n.getEnumValue(IncidentTaskActionType::forValue)); });
        deserializerMap.put("createdByDisplayName", (n) -> { this.setCreatedByDisplayName(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("incident", (n) -> { this.setIncident(n.getObjectValue(Incident::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedByDisplayName", (n) -> { this.setLastModifiedByDisplayName(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("responseAction", (n) -> { this.setResponseAction(n.getObjectValue(IncidentTaskResponseAction::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getEnumValue(IncidentTaskSource::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(IncidentTaskStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the incident property value. The incident property
     * @return a {@link Incident}
     */
    @jakarta.annotation.Nullable
    public Incident getIncident() {
        return this.backingStore.get("incident");
    }
    /**
     * Gets the lastModifiedByDisplayName property value. The lastModifiedByDisplayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLastModifiedByDisplayName() {
        return this.backingStore.get("lastModifiedByDisplayName");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the responseAction property value. The responseAction property
     * @return a {@link IncidentTaskResponseAction}
     */
    @jakarta.annotation.Nullable
    public IncidentTaskResponseAction getResponseAction() {
        return this.backingStore.get("responseAction");
    }
    /**
     * Gets the source property value. The source property
     * @return a {@link IncidentTaskSource}
     */
    @jakarta.annotation.Nullable
    public IncidentTaskSource getSource() {
        return this.backingStore.get("source");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link IncidentTaskStatus}
     */
    @jakarta.annotation.Nullable
    public IncidentTaskStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionStatus", this.getActionStatus());
        writer.writeEnumValue("actionType", this.getActionType());
        writer.writeStringValue("createdByDisplayName", this.getCreatedByDisplayName());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("incident", this.getIncident());
        writer.writeStringValue("lastModifiedByDisplayName", this.getLastModifiedByDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("responseAction", this.getResponseAction());
        writer.writeEnumValue("source", this.getSource());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the actionStatus property value. The actionStatus property
     * @param value Value to set for the actionStatus property.
     */
    public void setActionStatus(@jakarta.annotation.Nullable final IncidentTaskActionStatus value) {
        this.backingStore.set("actionStatus", value);
    }
    /**
     * Sets the actionType property value. The actionType property
     * @param value Value to set for the actionType property.
     */
    public void setActionType(@jakarta.annotation.Nullable final IncidentTaskActionType value) {
        this.backingStore.set("actionType", value);
    }
    /**
     * Sets the createdByDisplayName property value. The createdByDisplayName property
     * @param value Value to set for the createdByDisplayName property.
     */
    public void setCreatedByDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdByDisplayName", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the incident property value. The incident property
     * @param value Value to set for the incident property.
     */
    public void setIncident(@jakarta.annotation.Nullable final Incident value) {
        this.backingStore.set("incident", value);
    }
    /**
     * Sets the lastModifiedByDisplayName property value. The lastModifiedByDisplayName property
     * @param value Value to set for the lastModifiedByDisplayName property.
     */
    public void setLastModifiedByDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("lastModifiedByDisplayName", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the responseAction property value. The responseAction property
     * @param value Value to set for the responseAction property.
     */
    public void setResponseAction(@jakarta.annotation.Nullable final IncidentTaskResponseAction value) {
        this.backingStore.set("responseAction", value);
    }
    /**
     * Sets the source property value. The source property
     * @param value Value to set for the source property.
     */
    public void setSource(@jakarta.annotation.Nullable final IncidentTaskSource value) {
        this.backingStore.set("source", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final IncidentTaskStatus value) {
        this.backingStore.set("status", value);
    }
}

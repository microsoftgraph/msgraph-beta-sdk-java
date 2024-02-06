package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Alert extends Entity implements Parsable {
    /**
     * Instantiates a new Alert and sets the default values.
     */
    public Alert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Alert
     */
    @jakarta.annotation.Nonnull
    public static Alert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Alert();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a java.util.List<AlertAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertAction> getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * Gets the alertType property value. The alertType property
     * @return a AlertType
     */
    @jakarta.annotation.Nullable
    public AlertType getAlertType() {
        return this.backingStore.get("alertType");
    }
    /**
     * Gets the creationDateTime property value. The creationDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.backingStore.get("creationDateTime");
    }
    /**
     * Gets the description property value. The description property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AlertAction::createFromDiscriminatorValue)); });
        deserializerMap.put("alertType", (n) -> { this.setAlertType(n.getEnumValue(AlertType::forValue)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("firstImpactedDateTime", (n) -> { this.setFirstImpactedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstImpactedDateTime property value. The firstImpactedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstImpactedDateTime() {
        return this.backingStore.get("firstImpactedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("actions", this.getActions());
        writer.writeEnumValue("alertType", this.getAlertType());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("firstImpactedDateTime", this.getFirstImpactedDateTime());
    }
    /**
     * Sets the actions property value. The actions property
     * @param value Value to set for the actions property.
     */
    public void setActions(@jakarta.annotation.Nullable final java.util.List<AlertAction> value) {
        this.backingStore.set("actions", value);
    }
    /**
     * Sets the alertType property value. The alertType property
     * @param value Value to set for the alertType property.
     */
    public void setAlertType(@jakarta.annotation.Nullable final AlertType value) {
        this.backingStore.set("alertType", value);
    }
    /**
     * Sets the creationDateTime property value. The creationDateTime property
     * @param value Value to set for the creationDateTime property.
     */
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("creationDateTime", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the firstImpactedDateTime property value. The firstImpactedDateTime property
     * @param value Value to set for the firstImpactedDateTime property.
     */
    public void setFirstImpactedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstImpactedDateTime", value);
    }
}

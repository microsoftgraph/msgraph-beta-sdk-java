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
     * Instantiates a new {@link Alert} and sets the default values.
     */
    public Alert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Alert}
     */
    @jakarta.annotation.Nonnull
    public static Alert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Alert();
    }
    /**
     * Gets the actions property value. The actions property
     * @return a {@link java.util.List<AlertAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AlertAction> getActions() {
        return this.backingStore.get("actions");
    }
    /**
     * Gets the alertType property value. The alertType property
     * @return a {@link AlertType}
     */
    @jakarta.annotation.Nullable
    public AlertType getAlertType() {
        return this.backingStore.get("alertType");
    }
    /**
     * Gets the creationDateTime property value. The creationDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.backingStore.get("creationDateTime");
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
     * Gets the detectionTechnology property value. The detectionTechnology property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetectionTechnology() {
        return this.backingStore.get("detectionTechnology");
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
        deserializerMap.put("actions", (n) -> { this.setActions(n.getCollectionOfObjectValues(AlertAction::createFromDiscriminatorValue)); });
        deserializerMap.put("alertType", (n) -> { this.setAlertType(n.getEnumValue(AlertType::forValue)); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionTechnology", (n) -> { this.setDetectionTechnology(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(FilteringPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("relatedResources", (n) -> { this.setRelatedResources(n.getCollectionOfObjectValues(RelatedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(ThreatSeverity::forValue)); });
        deserializerMap.put("vendorName", (n) -> { this.setVendorName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the policy property value. The policy property
     * @return a {@link FilteringPolicy}
     */
    @jakarta.annotation.Nullable
    public FilteringPolicy getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Gets the relatedResources property value. The relatedResources property
     * @return a {@link java.util.List<RelatedResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RelatedResource> getRelatedResources() {
        return this.backingStore.get("relatedResources");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link ThreatSeverity}
     */
    @jakarta.annotation.Nullable
    public ThreatSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the vendorName property value. The vendorName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVendorName() {
        return this.backingStore.get("vendorName");
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
        writer.writeStringValue("detectionTechnology", this.getDetectionTechnology());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeCollectionOfObjectValues("relatedResources", this.getRelatedResources());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeStringValue("vendorName", this.getVendorName());
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
     * Sets the detectionTechnology property value. The detectionTechnology property
     * @param value Value to set for the detectionTechnology property.
     */
    public void setDetectionTechnology(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detectionTechnology", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final FilteringPolicy value) {
        this.backingStore.set("policy", value);
    }
    /**
     * Sets the relatedResources property value. The relatedResources property
     * @param value Value to set for the relatedResources property.
     */
    public void setRelatedResources(@jakarta.annotation.Nullable final java.util.List<RelatedResource> value) {
        this.backingStore.set("relatedResources", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final ThreatSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the vendorName property value. The vendorName property
     * @param value Value to set for the vendorName property.
     */
    public void setVendorName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vendorName", value);
    }
}

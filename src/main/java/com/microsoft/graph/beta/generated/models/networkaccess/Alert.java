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
     * Gets the actions property value. List of possible action items to take based on the alert (if applicable).
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
     * Gets the categories property value. Categories associated with the alert.
     * @return a {@link java.util.List<IntentCategory>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IntentCategory> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the componentName property value. Component name related to the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getComponentName() {
        return this.backingStore.get("componentName");
    }
    /**
     * Gets the creationDateTime property value. The time the alert was created in the system. Required.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreationDateTime() {
        return this.backingStore.get("creationDateTime");
    }
    /**
     * Gets the description property value. Text description explaining the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the detectionTechnology property value. Alert detection technology.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDetectionTechnology() {
        return this.backingStore.get("detectionTechnology");
    }
    /**
     * Gets the displayName property value. The display name of the alert. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the extendedProperties property value. Extended properties for the alert.
     * @return a {@link ExtendedProperties}
     */
    @jakarta.annotation.Nullable
    public ExtendedProperties getExtendedProperties() {
        return this.backingStore.get("extendedProperties");
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
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfEnumValues(IntentCategory::forValue)); });
        deserializerMap.put("componentName", (n) -> { this.setComponentName(n.getStringValue()); });
        deserializerMap.put("creationDateTime", (n) -> { this.setCreationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectionTechnology", (n) -> { this.setDetectionTechnology(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extendedProperties", (n) -> { this.setExtendedProperties(n.getObjectValue(ExtendedProperties::createFromDiscriminatorValue)); });
        deserializerMap.put("firstActivityDateTime", (n) -> { this.setFirstActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isPreview", (n) -> { this.setIsPreview(n.getBooleanValue()); });
        deserializerMap.put("lastActivityDateTime", (n) -> { this.setLastActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("policy", (n) -> { this.setPolicy(n.getObjectValue(FilteringPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("relatedResources", (n) -> { this.setRelatedResources(n.getCollectionOfObjectValues(RelatedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(AlertSeverity::forValue)); });
        deserializerMap.put("subTechniques", (n) -> { this.setSubTechniques(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("techniques", (n) -> { this.setTechniques(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("vendorName", (n) -> { this.setVendorName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstActivityDateTime property value. The time of the first activity related to the alert.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstActivityDateTime() {
        return this.backingStore.get("firstActivityDateTime");
    }
    /**
     * Gets the isPreview property value. Indicates if the alert is a preview.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPreview() {
        return this.backingStore.get("isPreview");
    }
    /**
     * Gets the lastActivityDateTime property value. The time of the last activity related to the alert.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActivityDateTime() {
        return this.backingStore.get("lastActivityDateTime");
    }
    /**
     * Gets the policy property value. The filtering policy associated with the alert. This relationship allows you to retrieve or manage the filtering policy that triggered or is related to the alert instance.
     * @return a {@link FilteringPolicy}
     */
    @jakarta.annotation.Nullable
    public FilteringPolicy getPolicy() {
        return this.backingStore.get("policy");
    }
    /**
     * Gets the productName property value. The name of the product that raised the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProductName() {
        return this.backingStore.get("productName");
    }
    /**
     * Gets the relatedResources property value. List of related resources to the alert (if applicable).
     * @return a {@link java.util.List<RelatedResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<RelatedResource> getRelatedResources() {
        return this.backingStore.get("relatedResources");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link AlertSeverity}
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the subTechniques property value. Sub-techniques associated with the alert.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSubTechniques() {
        return this.backingStore.get("subTechniques");
    }
    /**
     * Gets the techniques property value. Techniques associated with the alert.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTechniques() {
        return this.backingStore.get("techniques");
    }
    /**
     * Gets the vendorName property value. The name of the vendor that raised the alert.
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
        writer.writeCollectionOfEnumValues("categories", this.getCategories());
        writer.writeStringValue("componentName", this.getComponentName());
        writer.writeOffsetDateTimeValue("creationDateTime", this.getCreationDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("detectionTechnology", this.getDetectionTechnology());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("extendedProperties", this.getExtendedProperties());
        writer.writeOffsetDateTimeValue("firstActivityDateTime", this.getFirstActivityDateTime());
        writer.writeBooleanValue("isPreview", this.getIsPreview());
        writer.writeOffsetDateTimeValue("lastActivityDateTime", this.getLastActivityDateTime());
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeCollectionOfObjectValues("relatedResources", this.getRelatedResources());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeCollectionOfPrimitiveValues("subTechniques", this.getSubTechniques());
        writer.writeCollectionOfPrimitiveValues("techniques", this.getTechniques());
        writer.writeStringValue("vendorName", this.getVendorName());
    }
    /**
     * Sets the actions property value. List of possible action items to take based on the alert (if applicable).
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
     * Sets the categories property value. Categories associated with the alert.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<IntentCategory> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the componentName property value. Component name related to the alert.
     * @param value Value to set for the componentName property.
     */
    public void setComponentName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("componentName", value);
    }
    /**
     * Sets the creationDateTime property value. The time the alert was created in the system. Required.
     * @param value Value to set for the creationDateTime property.
     */
    public void setCreationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("creationDateTime", value);
    }
    /**
     * Sets the description property value. Text description explaining the alert.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the detectionTechnology property value. Alert detection technology.
     * @param value Value to set for the detectionTechnology property.
     */
    public void setDetectionTechnology(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("detectionTechnology", value);
    }
    /**
     * Sets the displayName property value. The display name of the alert. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the extendedProperties property value. Extended properties for the alert.
     * @param value Value to set for the extendedProperties property.
     */
    public void setExtendedProperties(@jakarta.annotation.Nullable final ExtendedProperties value) {
        this.backingStore.set("extendedProperties", value);
    }
    /**
     * Sets the firstActivityDateTime property value. The time of the first activity related to the alert.
     * @param value Value to set for the firstActivityDateTime property.
     */
    public void setFirstActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstActivityDateTime", value);
    }
    /**
     * Sets the isPreview property value. Indicates if the alert is a preview.
     * @param value Value to set for the isPreview property.
     */
    public void setIsPreview(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPreview", value);
    }
    /**
     * Sets the lastActivityDateTime property value. The time of the last activity related to the alert.
     * @param value Value to set for the lastActivityDateTime property.
     */
    public void setLastActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActivityDateTime", value);
    }
    /**
     * Sets the policy property value. The filtering policy associated with the alert. This relationship allows you to retrieve or manage the filtering policy that triggered or is related to the alert instance.
     * @param value Value to set for the policy property.
     */
    public void setPolicy(@jakarta.annotation.Nullable final FilteringPolicy value) {
        this.backingStore.set("policy", value);
    }
    /**
     * Sets the productName property value. The name of the product that raised the alert.
     * @param value Value to set for the productName property.
     */
    public void setProductName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("productName", value);
    }
    /**
     * Sets the relatedResources property value. List of related resources to the alert (if applicable).
     * @param value Value to set for the relatedResources property.
     */
    public void setRelatedResources(@jakarta.annotation.Nullable final java.util.List<RelatedResource> value) {
        this.backingStore.set("relatedResources", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the subTechniques property value. Sub-techniques associated with the alert.
     * @param value Value to set for the subTechniques property.
     */
    public void setSubTechniques(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("subTechniques", value);
    }
    /**
     * Sets the techniques property value. Techniques associated with the alert.
     * @param value Value to set for the techniques property.
     */
    public void setTechniques(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("techniques", value);
    }
    /**
     * Sets the vendorName property value. The name of the vendor that raised the alert.
     * @param value Value to set for the vendorName property.
     */
    public void setVendorName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vendorName", value);
    }
}

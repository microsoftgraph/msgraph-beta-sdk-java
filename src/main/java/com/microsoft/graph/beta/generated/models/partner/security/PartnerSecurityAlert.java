package com.microsoft.graph.beta.models.partner.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PartnerSecurityAlert extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PartnerSecurityAlert} and sets the default values.
     */
    public PartnerSecurityAlert() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PartnerSecurityAlert}
     */
    @jakarta.annotation.Nonnull
    public static PartnerSecurityAlert createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PartnerSecurityAlert();
    }
    /**
     * Gets the activityLogs property value. The activityLogs property
     * @return a {@link java.util.List<ActivityLog>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ActivityLog> getActivityLogs() {
        return this.backingStore.get("activityLogs");
    }
    /**
     * Gets the additionalDetails property value. The additionalDetails property
     * @return a {@link AdditionalDataDictionary}
     */
    @jakarta.annotation.Nullable
    public AdditionalDataDictionary getAdditionalDetails() {
        return this.backingStore.get("additionalDetails");
    }
    /**
     * Gets the affectedResources property value. The affectedResources property
     * @return a {@link java.util.List<AffectedResource>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AffectedResource> getAffectedResources() {
        return this.backingStore.get("affectedResources");
    }
    /**
     * Gets the alertType property value. The alertType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlertType() {
        return this.backingStore.get("alertType");
    }
    /**
     * Gets the catalogOfferId property value. The catalogOfferId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCatalogOfferId() {
        return this.backingStore.get("catalogOfferId");
    }
    /**
     * Gets the confidenceLevel property value. The confidenceLevel property
     * @return a {@link SecurityAlertConfidence}
     */
    @jakarta.annotation.Nullable
    public SecurityAlertConfidence getConfidenceLevel() {
        return this.backingStore.get("confidenceLevel");
    }
    /**
     * Gets the customerTenantId property value. The customerTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomerTenantId() {
        return this.backingStore.get("customerTenantId");
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
     * Gets the detectedDateTime property value. The detectedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDetectedDateTime() {
        return this.backingStore.get("detectedDateTime");
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
        deserializerMap.put("activityLogs", (n) -> { this.setActivityLogs(n.getCollectionOfObjectValues(ActivityLog::createFromDiscriminatorValue)); });
        deserializerMap.put("additionalDetails", (n) -> { this.setAdditionalDetails(n.getObjectValue(AdditionalDataDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("affectedResources", (n) -> { this.setAffectedResources(n.getCollectionOfObjectValues(AffectedResource::createFromDiscriminatorValue)); });
        deserializerMap.put("alertType", (n) -> { this.setAlertType(n.getStringValue()); });
        deserializerMap.put("catalogOfferId", (n) -> { this.setCatalogOfferId(n.getStringValue()); });
        deserializerMap.put("confidenceLevel", (n) -> { this.setConfidenceLevel(n.getEnumValue(SecurityAlertConfidence::forValue)); });
        deserializerMap.put("customerTenantId", (n) -> { this.setCustomerTenantId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("detectedDateTime", (n) -> { this.setDetectedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("firstObservedDateTime", (n) -> { this.setFirstObservedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isTest", (n) -> { this.setIsTest(n.getBooleanValue()); });
        deserializerMap.put("lastObservedDateTime", (n) -> { this.setLastObservedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resolvedBy", (n) -> { this.setResolvedBy(n.getStringValue()); });
        deserializerMap.put("resolvedOnDateTime", (n) -> { this.setResolvedOnDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("resolvedReason", (n) -> { this.setResolvedReason(n.getEnumValue(SecurityAlertResolvedReason::forValue)); });
        deserializerMap.put("severity", (n) -> { this.setSeverity(n.getEnumValue(SecurityAlertSeverity::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SecurityAlertStatus::forValue)); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        deserializerMap.put("valueAddedResellerTenantId", (n) -> { this.setValueAddedResellerTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstObservedDateTime property value. The firstObservedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstObservedDateTime() {
        return this.backingStore.get("firstObservedDateTime");
    }
    /**
     * Gets the isTest property value. The isTest property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTest() {
        return this.backingStore.get("isTest");
    }
    /**
     * Gets the lastObservedDateTime property value. The lastObservedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastObservedDateTime() {
        return this.backingStore.get("lastObservedDateTime");
    }
    /**
     * Gets the resolvedBy property value. The resolvedBy property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResolvedBy() {
        return this.backingStore.get("resolvedBy");
    }
    /**
     * Gets the resolvedOnDateTime property value. The resolvedOnDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getResolvedOnDateTime() {
        return this.backingStore.get("resolvedOnDateTime");
    }
    /**
     * Gets the resolvedReason property value. The resolvedReason property
     * @return a {@link SecurityAlertResolvedReason}
     */
    @jakarta.annotation.Nullable
    public SecurityAlertResolvedReason getResolvedReason() {
        return this.backingStore.get("resolvedReason");
    }
    /**
     * Gets the severity property value. The severity property
     * @return a {@link SecurityAlertSeverity}
     */
    @jakarta.annotation.Nullable
    public SecurityAlertSeverity getSeverity() {
        return this.backingStore.get("severity");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link SecurityAlertStatus}
     */
    @jakarta.annotation.Nullable
    public SecurityAlertStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the subscriptionId property value. The subscriptionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Gets the valueAddedResellerTenantId property value. The valueAddedResellerTenantId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getValueAddedResellerTenantId() {
        return this.backingStore.get("valueAddedResellerTenantId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("activityLogs", this.getActivityLogs());
        writer.writeObjectValue("additionalDetails", this.getAdditionalDetails());
        writer.writeCollectionOfObjectValues("affectedResources", this.getAffectedResources());
        writer.writeStringValue("alertType", this.getAlertType());
        writer.writeStringValue("catalogOfferId", this.getCatalogOfferId());
        writer.writeEnumValue("confidenceLevel", this.getConfidenceLevel());
        writer.writeStringValue("customerTenantId", this.getCustomerTenantId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeOffsetDateTimeValue("detectedDateTime", this.getDetectedDateTime());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("firstObservedDateTime", this.getFirstObservedDateTime());
        writer.writeBooleanValue("isTest", this.getIsTest());
        writer.writeOffsetDateTimeValue("lastObservedDateTime", this.getLastObservedDateTime());
        writer.writeStringValue("resolvedBy", this.getResolvedBy());
        writer.writeOffsetDateTimeValue("resolvedOnDateTime", this.getResolvedOnDateTime());
        writer.writeEnumValue("resolvedReason", this.getResolvedReason());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
        writer.writeStringValue("valueAddedResellerTenantId", this.getValueAddedResellerTenantId());
    }
    /**
     * Sets the activityLogs property value. The activityLogs property
     * @param value Value to set for the activityLogs property.
     */
    public void setActivityLogs(@jakarta.annotation.Nullable final java.util.List<ActivityLog> value) {
        this.backingStore.set("activityLogs", value);
    }
    /**
     * Sets the additionalDetails property value. The additionalDetails property
     * @param value Value to set for the additionalDetails property.
     */
    public void setAdditionalDetails(@jakarta.annotation.Nullable final AdditionalDataDictionary value) {
        this.backingStore.set("additionalDetails", value);
    }
    /**
     * Sets the affectedResources property value. The affectedResources property
     * @param value Value to set for the affectedResources property.
     */
    public void setAffectedResources(@jakarta.annotation.Nullable final java.util.List<AffectedResource> value) {
        this.backingStore.set("affectedResources", value);
    }
    /**
     * Sets the alertType property value. The alertType property
     * @param value Value to set for the alertType property.
     */
    public void setAlertType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alertType", value);
    }
    /**
     * Sets the catalogOfferId property value. The catalogOfferId property
     * @param value Value to set for the catalogOfferId property.
     */
    public void setCatalogOfferId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("catalogOfferId", value);
    }
    /**
     * Sets the confidenceLevel property value. The confidenceLevel property
     * @param value Value to set for the confidenceLevel property.
     */
    public void setConfidenceLevel(@jakarta.annotation.Nullable final SecurityAlertConfidence value) {
        this.backingStore.set("confidenceLevel", value);
    }
    /**
     * Sets the customerTenantId property value. The customerTenantId property
     * @param value Value to set for the customerTenantId property.
     */
    public void setCustomerTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customerTenantId", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the detectedDateTime property value. The detectedDateTime property
     * @param value Value to set for the detectedDateTime property.
     */
    public void setDetectedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("detectedDateTime", value);
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the firstObservedDateTime property value. The firstObservedDateTime property
     * @param value Value to set for the firstObservedDateTime property.
     */
    public void setFirstObservedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstObservedDateTime", value);
    }
    /**
     * Sets the isTest property value. The isTest property
     * @param value Value to set for the isTest property.
     */
    public void setIsTest(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTest", value);
    }
    /**
     * Sets the lastObservedDateTime property value. The lastObservedDateTime property
     * @param value Value to set for the lastObservedDateTime property.
     */
    public void setLastObservedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastObservedDateTime", value);
    }
    /**
     * Sets the resolvedBy property value. The resolvedBy property
     * @param value Value to set for the resolvedBy property.
     */
    public void setResolvedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resolvedBy", value);
    }
    /**
     * Sets the resolvedOnDateTime property value. The resolvedOnDateTime property
     * @param value Value to set for the resolvedOnDateTime property.
     */
    public void setResolvedOnDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("resolvedOnDateTime", value);
    }
    /**
     * Sets the resolvedReason property value. The resolvedReason property
     * @param value Value to set for the resolvedReason property.
     */
    public void setResolvedReason(@jakarta.annotation.Nullable final SecurityAlertResolvedReason value) {
        this.backingStore.set("resolvedReason", value);
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     */
    public void setSeverity(@jakarta.annotation.Nullable final SecurityAlertSeverity value) {
        this.backingStore.set("severity", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SecurityAlertStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the subscriptionId property value. The subscriptionId property
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
    /**
     * Sets the valueAddedResellerTenantId property value. The valueAddedResellerTenantId property
     * @param value Value to set for the valueAddedResellerTenantId property.
     */
    public void setValueAddedResellerTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("valueAddedResellerTenantId", value);
    }
}

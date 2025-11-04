package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcManagedLicense extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcManagedLicense} and sets the default values.
     */
    public CloudPcManagedLicense() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcManagedLicense}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcManagedLicense createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcManagedLicense();
    }
    /**
     * Gets the activeDateTime property value. The date and time when the license becomes active. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getActiveDateTime() {
        return this.backingStore.get("activeDateTime");
    }
    /**
     * Gets the allotmentLicensesCount property value. The number of licenses that are allocated to assignments. The total number of allotted licenses can&apos;t be greater than the total license count. The allowed range is from 0 to the value of licensesCount. Supports $filter (eq, ne, gt, ge, lt, le). Read-only. Nullable.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAllotmentLicensesCount() {
        return this.backingStore.get("allotmentLicensesCount");
    }
    /**
     * Gets the assignedCount property value. The number of licenses currently assigned to users. The allowed range is from 0 to the value of licensesCount. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAssignedCount() {
        return this.backingStore.get("assignedCount");
    }
    /**
     * Gets the displayName property value. The display name of the license. For example, Cloud PC Enterprise 4vCPU/16GB/256GB. Supports $filter (eq, ne, in, startsWith). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the expirationDateTime property value. The date and time when the license expires. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeDateTime", (n) -> { this.setActiveDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("allotmentLicensesCount", (n) -> { this.setAllotmentLicensesCount(n.getIntegerValue()); });
        deserializerMap.put("assignedCount", (n) -> { this.setAssignedCount(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("latestLicenseStartDateTime", (n) -> { this.setLatestLicenseStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("licensesCount", (n) -> { this.setLicensesCount(n.getIntegerValue()); });
        deserializerMap.put("licenseType", (n) -> { this.setLicenseType(n.getEnumValue(CloudPcManagedLicenseType::forValue)); });
        deserializerMap.put("nextBillingDateTime", (n) -> { this.setNextBillingDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("servicePlanId", (n) -> { this.setServicePlanId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(CloudPcManagedLicenseStatus::forValue)); });
        deserializerMap.put("subscriptionId", (n) -> { this.setSubscriptionId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latestLicenseStartDateTime property value. The start date of the current license term. This date is the date of the initial purchase or the most recent renewal. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLatestLicenseStartDateTime() {
        return this.backingStore.get("latestLicenseStartDateTime");
    }
    /**
     * Gets the licensesCount property value. The total number of licenses purchased. The allowed range is fropm 0 to 2,147,483,647. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getLicensesCount() {
        return this.backingStore.get("licensesCount");
    }
    /**
     * Gets the licenseType property value. The licenseType property
     * @return a {@link CloudPcManagedLicenseType}
     */
    @jakarta.annotation.Nullable
    public CloudPcManagedLicenseType getLicenseType() {
        return this.backingStore.get("licenseType");
    }
    /**
     * Gets the nextBillingDateTime property value. The date and time of the next billing cycle. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getNextBillingDateTime() {
        return this.backingStore.get("nextBillingDateTime");
    }
    /**
     * Gets the servicePlanId property value. The unique identifier for the service plan that defines the specific stock keeping unit (SKU) of the license. For example, this ID maps to a specific offering like Cloud PC Enterprise 4vCPU/16GB/256GB. For example, 3a94476b-504b-41a4-9f6a-18c5199a55e9. Supports $filter (eq). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getServicePlanId() {
        return this.backingStore.get("servicePlanId");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link CloudPcManagedLicenseStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcManagedLicenseStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Gets the subscriptionId property value. The ID of the Azure commercial subscription to which the license belongs. This unique identifier specifies the subscription where the organization purchased and manages the license. For example, 0d5b1a2b-4d6e-4b8e-88e2-3e7a5b9d0f1a. Supports $filter (eq). Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSubscriptionId() {
        return this.backingStore.get("subscriptionId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("activeDateTime", this.getActiveDateTime());
        writer.writeIntegerValue("allotmentLicensesCount", this.getAllotmentLicensesCount());
        writer.writeIntegerValue("assignedCount", this.getAssignedCount());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeOffsetDateTimeValue("latestLicenseStartDateTime", this.getLatestLicenseStartDateTime());
        writer.writeIntegerValue("licensesCount", this.getLicensesCount());
        writer.writeEnumValue("licenseType", this.getLicenseType());
        writer.writeOffsetDateTimeValue("nextBillingDateTime", this.getNextBillingDateTime());
        writer.writeStringValue("servicePlanId", this.getServicePlanId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("subscriptionId", this.getSubscriptionId());
    }
    /**
     * Sets the activeDateTime property value. The date and time when the license becomes active. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @param value Value to set for the activeDateTime property.
     */
    public void setActiveDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("activeDateTime", value);
    }
    /**
     * Sets the allotmentLicensesCount property value. The number of licenses that are allocated to assignments. The total number of allotted licenses can&apos;t be greater than the total license count. The allowed range is from 0 to the value of licensesCount. Supports $filter (eq, ne, gt, ge, lt, le). Read-only. Nullable.
     * @param value Value to set for the allotmentLicensesCount property.
     */
    public void setAllotmentLicensesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("allotmentLicensesCount", value);
    }
    /**
     * Sets the assignedCount property value. The number of licenses currently assigned to users. The allowed range is from 0 to the value of licensesCount. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @param value Value to set for the assignedCount property.
     */
    public void setAssignedCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("assignedCount", value);
    }
    /**
     * Sets the displayName property value. The display name of the license. For example, Cloud PC Enterprise 4vCPU/16GB/256GB. Supports $filter (eq, ne, in, startsWith). Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the expirationDateTime property value. The date and time when the license expires. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the latestLicenseStartDateTime property value. The start date of the current license term. This date is the date of the initial purchase or the most recent renewal. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @param value Value to set for the latestLicenseStartDateTime property.
     */
    public void setLatestLicenseStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("latestLicenseStartDateTime", value);
    }
    /**
     * Sets the licensesCount property value. The total number of licenses purchased. The allowed range is fropm 0 to 2,147,483,647. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @param value Value to set for the licensesCount property.
     */
    public void setLicensesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("licensesCount", value);
    }
    /**
     * Sets the licenseType property value. The licenseType property
     * @param value Value to set for the licenseType property.
     */
    public void setLicenseType(@jakarta.annotation.Nullable final CloudPcManagedLicenseType value) {
        this.backingStore.set("licenseType", value);
    }
    /**
     * Sets the nextBillingDateTime property value. The date and time of the next billing cycle. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Supports $filter (eq, ne, gt, ge, lt, le). Read-only.
     * @param value Value to set for the nextBillingDateTime property.
     */
    public void setNextBillingDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("nextBillingDateTime", value);
    }
    /**
     * Sets the servicePlanId property value. The unique identifier for the service plan that defines the specific stock keeping unit (SKU) of the license. For example, this ID maps to a specific offering like Cloud PC Enterprise 4vCPU/16GB/256GB. For example, 3a94476b-504b-41a4-9f6a-18c5199a55e9. Supports $filter (eq). Read-only.
     * @param value Value to set for the servicePlanId property.
     */
    public void setServicePlanId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("servicePlanId", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final CloudPcManagedLicenseStatus value) {
        this.backingStore.set("status", value);
    }
    /**
     * Sets the subscriptionId property value. The ID of the Azure commercial subscription to which the license belongs. This unique identifier specifies the subscription where the organization purchased and manages the license. For example, 0d5b1a2b-4d6e-4b8e-88e2-3e7a5b9d0f1a. Supports $filter (eq). Read-only.
     * @param value Value to set for the subscriptionId property.
     */
    public void setSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subscriptionId", value);
    }
}

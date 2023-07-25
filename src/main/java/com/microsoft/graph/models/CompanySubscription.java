package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CompanySubscription extends Entity implements Parsable {
    /**
     * The ID of this subscription in the commerce system. Alternate key.
     */
    private String commerceSubscriptionId;
    /**
     * The date and time when this subscription was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime createdDateTime;
    /**
     * Whether the subscription is a free trial or purchased.
     */
    private Boolean isTrial;
    /**
     * The date and time when the subscription will move to the next state (as defined by the status property) if not renewed by the tenant. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime nextLifecycleDateTime;
    /**
     * The ocpSubscriptionId property
     */
    private String ocpSubscriptionId;
    /**
     * The object ID of the account admin.
     */
    private String ownerId;
    /**
     * The unique identifier for the Microsoft partner tenant that created the subscription on a customer tenant.
     */
    private String ownerTenantId;
    /**
     * Indicates the entity that ownerId belongs to, for example, 'User'.
     */
    private String ownerType;
    /**
     * The provisioning status of each service that's included in this subscription.
     */
    private java.util.List<ServicePlanInfo> serviceStatus;
    /**
     * The object ID of the SKU associated with this subscription.
     */
    private String skuId;
    /**
     * The SKU associated with this subscription.
     */
    private String skuPartNumber;
    /**
     * The status of this subscription. Possible values are: Enabled, Expired, Suspended, Warning, LockedOut.
     */
    private String status;
    /**
     * The number of seats included in this subscription.
     */
    private Integer totalLicenses;
    /**
     * Instantiates a new companySubscription and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CompanySubscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a companySubscription
     */
    @javax.annotation.Nonnull
    public static CompanySubscription createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompanySubscription();
    }
    /**
     * Gets the commerceSubscriptionId property value. The ID of this subscription in the commerce system. Alternate key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCommerceSubscriptionId() {
        return this.commerceSubscriptionId;
    }
    /**
     * Gets the createdDateTime property value. The date and time when this subscription was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("commerceSubscriptionId", (n) -> { this.setCommerceSubscriptionId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isTrial", (n) -> { this.setIsTrial(n.getBooleanValue()); });
        deserializerMap.put("nextLifecycleDateTime", (n) -> { this.setNextLifecycleDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ocpSubscriptionId", (n) -> { this.setOcpSubscriptionId(n.getStringValue()); });
        deserializerMap.put("ownerId", (n) -> { this.setOwnerId(n.getStringValue()); });
        deserializerMap.put("ownerTenantId", (n) -> { this.setOwnerTenantId(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getStringValue()); });
        deserializerMap.put("serviceStatus", (n) -> { this.setServiceStatus(n.getCollectionOfObjectValues(ServicePlanInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getStringValue()); });
        deserializerMap.put("skuPartNumber", (n) -> { this.setSkuPartNumber(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("totalLicenses", (n) -> { this.setTotalLicenses(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTrial property value. Whether the subscription is a free trial or purchased.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTrial() {
        return this.isTrial;
    }
    /**
     * Gets the nextLifecycleDateTime property value. The date and time when the subscription will move to the next state (as defined by the status property) if not renewed by the tenant. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getNextLifecycleDateTime() {
        return this.nextLifecycleDateTime;
    }
    /**
     * Gets the ocpSubscriptionId property value. The ocpSubscriptionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOcpSubscriptionId() {
        return this.ocpSubscriptionId;
    }
    /**
     * Gets the ownerId property value. The object ID of the account admin.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * Gets the ownerTenantId property value. The unique identifier for the Microsoft partner tenant that created the subscription on a customer tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerTenantId() {
        return this.ownerTenantId;
    }
    /**
     * Gets the ownerType property value. Indicates the entity that ownerId belongs to, for example, 'User'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerType() {
        return this.ownerType;
    }
    /**
     * Gets the serviceStatus property value. The provisioning status of each service that's included in this subscription.
     * @return a servicePlanInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePlanInfo> getServiceStatus() {
        return this.serviceStatus;
    }
    /**
     * Gets the skuId property value. The object ID of the SKU associated with this subscription.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuId() {
        return this.skuId;
    }
    /**
     * Gets the skuPartNumber property value. The SKU associated with this subscription.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuPartNumber() {
        return this.skuPartNumber;
    }
    /**
     * Gets the status property value. The status of this subscription. Possible values are: Enabled, Expired, Suspended, Warning, LockedOut.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the totalLicenses property value. The number of seats included in this subscription.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicenses() {
        return this.totalLicenses;
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
        writer.writeStringValue("commerceSubscriptionId", this.getCommerceSubscriptionId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isTrial", this.getIsTrial());
        writer.writeOffsetDateTimeValue("nextLifecycleDateTime", this.getNextLifecycleDateTime());
        writer.writeStringValue("ocpSubscriptionId", this.getOcpSubscriptionId());
        writer.writeStringValue("ownerId", this.getOwnerId());
        writer.writeStringValue("ownerTenantId", this.getOwnerTenantId());
        writer.writeStringValue("ownerType", this.getOwnerType());
        writer.writeCollectionOfObjectValues("serviceStatus", this.getServiceStatus());
        writer.writeStringValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
        writer.writeStringValue("status", this.getStatus());
        writer.writeIntegerValue("totalLicenses", this.getTotalLicenses());
    }
    /**
     * Sets the commerceSubscriptionId property value. The ID of this subscription in the commerce system. Alternate key.
     * @param value Value to set for the commerceSubscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommerceSubscriptionId(@javax.annotation.Nullable final String value) {
        this.commerceSubscriptionId = value;
    }
    /**
     * Sets the createdDateTime property value. The date and time when this subscription was created. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the isTrial property value. Whether the subscription is a free trial or purchased.
     * @param value Value to set for the isTrial property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsTrial(@javax.annotation.Nullable final Boolean value) {
        this.isTrial = value;
    }
    /**
     * Sets the nextLifecycleDateTime property value. The date and time when the subscription will move to the next state (as defined by the status property) if not renewed by the tenant. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the nextLifecycleDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextLifecycleDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.nextLifecycleDateTime = value;
    }
    /**
     * Sets the ocpSubscriptionId property value. The ocpSubscriptionId property
     * @param value Value to set for the ocpSubscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOcpSubscriptionId(@javax.annotation.Nullable final String value) {
        this.ocpSubscriptionId = value;
    }
    /**
     * Sets the ownerId property value. The object ID of the account admin.
     * @param value Value to set for the ownerId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerId(@javax.annotation.Nullable final String value) {
        this.ownerId = value;
    }
    /**
     * Sets the ownerTenantId property value. The unique identifier for the Microsoft partner tenant that created the subscription on a customer tenant.
     * @param value Value to set for the ownerTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerTenantId(@javax.annotation.Nullable final String value) {
        this.ownerTenantId = value;
    }
    /**
     * Sets the ownerType property value. Indicates the entity that ownerId belongs to, for example, 'User'.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerType(@javax.annotation.Nullable final String value) {
        this.ownerType = value;
    }
    /**
     * Sets the serviceStatus property value. The provisioning status of each service that's included in this subscription.
     * @param value Value to set for the serviceStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceStatus(@javax.annotation.Nullable final java.util.List<ServicePlanInfo> value) {
        this.serviceStatus = value;
    }
    /**
     * Sets the skuId property value. The object ID of the SKU associated with this subscription.
     * @param value Value to set for the skuId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuId(@javax.annotation.Nullable final String value) {
        this.skuId = value;
    }
    /**
     * Sets the skuPartNumber property value. The SKU associated with this subscription.
     * @param value Value to set for the skuPartNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuPartNumber(@javax.annotation.Nullable final String value) {
        this.skuPartNumber = value;
    }
    /**
     * Sets the status property value. The status of this subscription. Possible values are: Enabled, Expired, Suspended, Warning, LockedOut.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the totalLicenses property value. The number of seats included in this subscription.
     * @param value Value to set for the totalLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalLicenses(@javax.annotation.Nullable final Integer value) {
        this.totalLicenses = value;
    }
}

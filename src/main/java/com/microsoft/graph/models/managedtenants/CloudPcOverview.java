package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcOverview extends Entity implements Parsable {
    /**
     * Instantiates a new CloudPcOverview and sets the default values.
     */
    public CloudPcOverview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcOverview
     */
    @jakarta.annotation.Nonnull
    public static CloudPcOverview createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOverview();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusFailed", (n) -> { this.setNumberOfCloudPcConnectionStatusFailed(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusPassed", (n) -> { this.setNumberOfCloudPcConnectionStatusPassed(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusPending", (n) -> { this.setNumberOfCloudPcConnectionStatusPending(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusRunning", (n) -> { this.setNumberOfCloudPcConnectionStatusRunning(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusUnkownFutureValue", (n) -> { this.setNumberOfCloudPcConnectionStatusUnkownFutureValue(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusDeprovisioning", (n) -> { this.setNumberOfCloudPcStatusDeprovisioning(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusFailed", (n) -> { this.setNumberOfCloudPcStatusFailed(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusInGracePeriod", (n) -> { this.setNumberOfCloudPcStatusInGracePeriod(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusNotProvisioned", (n) -> { this.setNumberOfCloudPcStatusNotProvisioned(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusProvisioned", (n) -> { this.setNumberOfCloudPcStatusProvisioned(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusProvisioning", (n) -> { this.setNumberOfCloudPcStatusProvisioning(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusUnknown", (n) -> { this.setNumberOfCloudPcStatusUnknown(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusUpgrading", (n) -> { this.setNumberOfCloudPcStatusUpgrading(n.getIntegerValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        deserializerMap.put("totalBusinessLicenses", (n) -> { this.setTotalBusinessLicenses(n.getIntegerValue()); });
        deserializerMap.put("totalCloudPcConnectionStatus", (n) -> { this.setTotalCloudPcConnectionStatus(n.getIntegerValue()); });
        deserializerMap.put("totalCloudPcStatus", (n) -> { this.setTotalCloudPcStatus(n.getIntegerValue()); });
        deserializerMap.put("totalEnterpriseLicenses", (n) -> { this.setTotalEnterpriseLicenses(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this.backingStore.get("lastRefreshedDateTime");
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusFailed property value. The number of cloud PC connections that have a status of failed. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusFailed() {
        return this.backingStore.get("numberOfCloudPcConnectionStatusFailed");
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusPassed property value. The number of cloud PC connections that have a status of passed. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusPassed() {
        return this.backingStore.get("numberOfCloudPcConnectionStatusPassed");
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusPending property value. The number of cloud PC connections that have a status of pending. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusPending() {
        return this.backingStore.get("numberOfCloudPcConnectionStatusPending");
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusRunning property value. The number of cloud PC connections that have a status of running. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusRunning() {
        return this.backingStore.get("numberOfCloudPcConnectionStatusRunning");
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusUnkownFutureValue property value. The number of cloud PC connections that have a status of unknownFutureValue. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusUnkownFutureValue() {
        return this.backingStore.get("numberOfCloudPcConnectionStatusUnkownFutureValue");
    }
    /**
     * Gets the numberOfCloudPcStatusDeprovisioning property value. The number of cloud PCs that have a status of deprovisioning. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusDeprovisioning() {
        return this.backingStore.get("numberOfCloudPcStatusDeprovisioning");
    }
    /**
     * Gets the numberOfCloudPcStatusFailed property value. The number of cloud PCs that have a status of failed. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusFailed() {
        return this.backingStore.get("numberOfCloudPcStatusFailed");
    }
    /**
     * Gets the numberOfCloudPcStatusInGracePeriod property value. The number of cloud PCs that have a status of inGracePeriod. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusInGracePeriod() {
        return this.backingStore.get("numberOfCloudPcStatusInGracePeriod");
    }
    /**
     * Gets the numberOfCloudPcStatusNotProvisioned property value. The number of cloud PCs that have a status of notProvisioned. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusNotProvisioned() {
        return this.backingStore.get("numberOfCloudPcStatusNotProvisioned");
    }
    /**
     * Gets the numberOfCloudPcStatusProvisioned property value. The number of cloud PCs that have a status of provisioned. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusProvisioned() {
        return this.backingStore.get("numberOfCloudPcStatusProvisioned");
    }
    /**
     * Gets the numberOfCloudPcStatusProvisioning property value. The number of cloud PCs that have a status of provisioning. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusProvisioning() {
        return this.backingStore.get("numberOfCloudPcStatusProvisioning");
    }
    /**
     * Gets the numberOfCloudPcStatusUnknown property value. The number of cloud PCs that have a status of unknown. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusUnknown() {
        return this.backingStore.get("numberOfCloudPcStatusUnknown");
    }
    /**
     * Gets the numberOfCloudPcStatusUpgrading property value. The number of cloud PCs that have a status of upgrading. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusUpgrading() {
        return this.backingStore.get("numberOfCloudPcStatusUpgrading");
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.backingStore.get("tenantDisplayName");
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.backingStore.get("tenantId");
    }
    /**
     * Gets the totalBusinessLicenses property value. The total number of cloud PC devices that have the Business SKU. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalBusinessLicenses() {
        return this.backingStore.get("totalBusinessLicenses");
    }
    /**
     * Gets the totalCloudPcConnectionStatus property value. The total number of cloud PC connection statuses for the given managed tenant. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCloudPcConnectionStatus() {
        return this.backingStore.get("totalCloudPcConnectionStatus");
    }
    /**
     * Gets the totalCloudPcStatus property value. The total number of cloud PC statues for the given managed tenant. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCloudPcStatus() {
        return this.backingStore.get("totalCloudPcStatus");
    }
    /**
     * Gets the totalEnterpriseLicenses property value. The total number of cloud PC devices that have the Enterprise SKU. Optional. Read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalEnterpriseLicenses() {
        return this.backingStore.get("totalEnterpriseLicenses");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeIntegerValue("numberOfCloudPcConnectionStatusFailed", this.getNumberOfCloudPcConnectionStatusFailed());
        writer.writeIntegerValue("numberOfCloudPcConnectionStatusPassed", this.getNumberOfCloudPcConnectionStatusPassed());
        writer.writeIntegerValue("numberOfCloudPcConnectionStatusPending", this.getNumberOfCloudPcConnectionStatusPending());
        writer.writeIntegerValue("numberOfCloudPcConnectionStatusRunning", this.getNumberOfCloudPcConnectionStatusRunning());
        writer.writeIntegerValue("numberOfCloudPcConnectionStatusUnkownFutureValue", this.getNumberOfCloudPcConnectionStatusUnkownFutureValue());
        writer.writeIntegerValue("numberOfCloudPcStatusDeprovisioning", this.getNumberOfCloudPcStatusDeprovisioning());
        writer.writeIntegerValue("numberOfCloudPcStatusFailed", this.getNumberOfCloudPcStatusFailed());
        writer.writeIntegerValue("numberOfCloudPcStatusInGracePeriod", this.getNumberOfCloudPcStatusInGracePeriod());
        writer.writeIntegerValue("numberOfCloudPcStatusNotProvisioned", this.getNumberOfCloudPcStatusNotProvisioned());
        writer.writeIntegerValue("numberOfCloudPcStatusProvisioned", this.getNumberOfCloudPcStatusProvisioned());
        writer.writeIntegerValue("numberOfCloudPcStatusProvisioning", this.getNumberOfCloudPcStatusProvisioning());
        writer.writeIntegerValue("numberOfCloudPcStatusUnknown", this.getNumberOfCloudPcStatusUnknown());
        writer.writeIntegerValue("numberOfCloudPcStatusUpgrading", this.getNumberOfCloudPcStatusUpgrading());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeIntegerValue("totalBusinessLicenses", this.getTotalBusinessLicenses());
        writer.writeIntegerValue("totalCloudPcConnectionStatus", this.getTotalCloudPcConnectionStatus());
        writer.writeIntegerValue("totalCloudPcStatus", this.getTotalCloudPcStatus());
        writer.writeIntegerValue("totalEnterpriseLicenses", this.getTotalEnterpriseLicenses());
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastRefreshedDateTime", value);
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusFailed property value. The number of cloud PC connections that have a status of failed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusFailed property.
     */
    public void setNumberOfCloudPcConnectionStatusFailed(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcConnectionStatusFailed", value);
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusPassed property value. The number of cloud PC connections that have a status of passed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusPassed property.
     */
    public void setNumberOfCloudPcConnectionStatusPassed(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcConnectionStatusPassed", value);
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusPending property value. The number of cloud PC connections that have a status of pending. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusPending property.
     */
    public void setNumberOfCloudPcConnectionStatusPending(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcConnectionStatusPending", value);
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusRunning property value. The number of cloud PC connections that have a status of running. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusRunning property.
     */
    public void setNumberOfCloudPcConnectionStatusRunning(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcConnectionStatusRunning", value);
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusUnkownFutureValue property value. The number of cloud PC connections that have a status of unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusUnkownFutureValue property.
     */
    public void setNumberOfCloudPcConnectionStatusUnkownFutureValue(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcConnectionStatusUnkownFutureValue", value);
    }
    /**
     * Sets the numberOfCloudPcStatusDeprovisioning property value. The number of cloud PCs that have a status of deprovisioning. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusDeprovisioning property.
     */
    public void setNumberOfCloudPcStatusDeprovisioning(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcStatusDeprovisioning", value);
    }
    /**
     * Sets the numberOfCloudPcStatusFailed property value. The number of cloud PCs that have a status of failed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusFailed property.
     */
    public void setNumberOfCloudPcStatusFailed(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcStatusFailed", value);
    }
    /**
     * Sets the numberOfCloudPcStatusInGracePeriod property value. The number of cloud PCs that have a status of inGracePeriod. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusInGracePeriod property.
     */
    public void setNumberOfCloudPcStatusInGracePeriod(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcStatusInGracePeriod", value);
    }
    /**
     * Sets the numberOfCloudPcStatusNotProvisioned property value. The number of cloud PCs that have a status of notProvisioned. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusNotProvisioned property.
     */
    public void setNumberOfCloudPcStatusNotProvisioned(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcStatusNotProvisioned", value);
    }
    /**
     * Sets the numberOfCloudPcStatusProvisioned property value. The number of cloud PCs that have a status of provisioned. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusProvisioned property.
     */
    public void setNumberOfCloudPcStatusProvisioned(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcStatusProvisioned", value);
    }
    /**
     * Sets the numberOfCloudPcStatusProvisioning property value. The number of cloud PCs that have a status of provisioning. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusProvisioning property.
     */
    public void setNumberOfCloudPcStatusProvisioning(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcStatusProvisioning", value);
    }
    /**
     * Sets the numberOfCloudPcStatusUnknown property value. The number of cloud PCs that have a status of unknown. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusUnknown property.
     */
    public void setNumberOfCloudPcStatusUnknown(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcStatusUnknown", value);
    }
    /**
     * Sets the numberOfCloudPcStatusUpgrading property value. The number of cloud PCs that have a status of upgrading. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusUpgrading property.
     */
    public void setNumberOfCloudPcStatusUpgrading(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfCloudPcStatusUpgrading", value);
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantDisplayName", value);
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tenantId", value);
    }
    /**
     * Sets the totalBusinessLicenses property value. The total number of cloud PC devices that have the Business SKU. Optional. Read-only.
     * @param value Value to set for the totalBusinessLicenses property.
     */
    public void setTotalBusinessLicenses(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalBusinessLicenses", value);
    }
    /**
     * Sets the totalCloudPcConnectionStatus property value. The total number of cloud PC connection statuses for the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalCloudPcConnectionStatus property.
     */
    public void setTotalCloudPcConnectionStatus(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalCloudPcConnectionStatus", value);
    }
    /**
     * Sets the totalCloudPcStatus property value. The total number of cloud PC statues for the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalCloudPcStatus property.
     */
    public void setTotalCloudPcStatus(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalCloudPcStatus", value);
    }
    /**
     * Sets the totalEnterpriseLicenses property value. The total number of cloud PC devices that have the Enterprise SKU. Optional. Read-only.
     * @param value Value to set for the totalEnterpriseLicenses property.
     */
    public void setTotalEnterpriseLicenses(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalEnterpriseLicenses", value);
    }
}

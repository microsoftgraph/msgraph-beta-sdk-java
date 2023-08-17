package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcOverview extends Entity implements Parsable {
    /**
     * Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     */
    private OffsetDateTime lastRefreshedDateTime;
    /**
     * The number of cloud PC connections that have a status of failed. Optional. Read-only.
     */
    private Integer numberOfCloudPcConnectionStatusFailed;
    /**
     * The number of cloud PC connections that have a status of passed. Optional. Read-only.
     */
    private Integer numberOfCloudPcConnectionStatusPassed;
    /**
     * The number of cloud PC connections that have a status of pending. Optional. Read-only.
     */
    private Integer numberOfCloudPcConnectionStatusPending;
    /**
     * The number of cloud PC connections that have a status of running. Optional. Read-only.
     */
    private Integer numberOfCloudPcConnectionStatusRunning;
    /**
     * The number of cloud PC connections that have a status of unknownFutureValue. Optional. Read-only.
     */
    private Integer numberOfCloudPcConnectionStatusUnkownFutureValue;
    /**
     * The number of cloud PCs that have a status of deprovisioning. Optional. Read-only.
     */
    private Integer numberOfCloudPcStatusDeprovisioning;
    /**
     * The number of cloud PCs that have a status of failed. Optional. Read-only.
     */
    private Integer numberOfCloudPcStatusFailed;
    /**
     * The number of cloud PCs that have a status of inGracePeriod. Optional. Read-only.
     */
    private Integer numberOfCloudPcStatusInGracePeriod;
    /**
     * The number of cloud PCs that have a status of notProvisioned. Optional. Read-only.
     */
    private Integer numberOfCloudPcStatusNotProvisioned;
    /**
     * The number of cloud PCs that have a status of provisioned. Optional. Read-only.
     */
    private Integer numberOfCloudPcStatusProvisioned;
    /**
     * The number of cloud PCs that have a status of provisioning. Optional. Read-only.
     */
    private Integer numberOfCloudPcStatusProvisioning;
    /**
     * The number of cloud PCs that have a status of unknown. Optional. Read-only.
     */
    private Integer numberOfCloudPcStatusUnknown;
    /**
     * The number of cloud PCs that have a status of upgrading. Optional. Read-only.
     */
    private Integer numberOfCloudPcStatusUpgrading;
    /**
     * The display name for the managed tenant. Optional. Read-only.
     */
    private String tenantDisplayName;
    /**
     * The tenantId property
     */
    private String tenantId;
    /**
     * The total number of cloud PC devices that have the Business SKU. Optional. Read-only.
     */
    private Integer totalBusinessLicenses;
    /**
     * The total number of cloud PC connection statuses for the given managed tenant. Optional. Read-only.
     */
    private Integer totalCloudPcConnectionStatus;
    /**
     * The total number of cloud PC statues for the given managed tenant. Optional. Read-only.
     */
    private Integer totalCloudPcStatus;
    /**
     * The total number of cloud PC devices that have the Enterprise SKU. Optional. Read-only.
     */
    private Integer totalEnterpriseLicenses;
    /**
     * Instantiates a new cloudPcOverview and sets the default values.
     */
    public CloudPcOverview() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcOverview
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
        return this.lastRefreshedDateTime;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusFailed property value. The number of cloud PC connections that have a status of failed. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusFailed() {
        return this.numberOfCloudPcConnectionStatusFailed;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusPassed property value. The number of cloud PC connections that have a status of passed. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusPassed() {
        return this.numberOfCloudPcConnectionStatusPassed;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusPending property value. The number of cloud PC connections that have a status of pending. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusPending() {
        return this.numberOfCloudPcConnectionStatusPending;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusRunning property value. The number of cloud PC connections that have a status of running. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusRunning() {
        return this.numberOfCloudPcConnectionStatusRunning;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusUnkownFutureValue property value. The number of cloud PC connections that have a status of unknownFutureValue. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusUnkownFutureValue() {
        return this.numberOfCloudPcConnectionStatusUnkownFutureValue;
    }
    /**
     * Gets the numberOfCloudPcStatusDeprovisioning property value. The number of cloud PCs that have a status of deprovisioning. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusDeprovisioning() {
        return this.numberOfCloudPcStatusDeprovisioning;
    }
    /**
     * Gets the numberOfCloudPcStatusFailed property value. The number of cloud PCs that have a status of failed. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusFailed() {
        return this.numberOfCloudPcStatusFailed;
    }
    /**
     * Gets the numberOfCloudPcStatusInGracePeriod property value. The number of cloud PCs that have a status of inGracePeriod. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusInGracePeriod() {
        return this.numberOfCloudPcStatusInGracePeriod;
    }
    /**
     * Gets the numberOfCloudPcStatusNotProvisioned property value. The number of cloud PCs that have a status of notProvisioned. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusNotProvisioned() {
        return this.numberOfCloudPcStatusNotProvisioned;
    }
    /**
     * Gets the numberOfCloudPcStatusProvisioned property value. The number of cloud PCs that have a status of provisioned. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusProvisioned() {
        return this.numberOfCloudPcStatusProvisioned;
    }
    /**
     * Gets the numberOfCloudPcStatusProvisioning property value. The number of cloud PCs that have a status of provisioning. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusProvisioning() {
        return this.numberOfCloudPcStatusProvisioning;
    }
    /**
     * Gets the numberOfCloudPcStatusUnknown property value. The number of cloud PCs that have a status of unknown. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusUnknown() {
        return this.numberOfCloudPcStatusUnknown;
    }
    /**
     * Gets the numberOfCloudPcStatusUpgrading property value. The number of cloud PCs that have a status of upgrading. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfCloudPcStatusUpgrading() {
        return this.numberOfCloudPcStatusUpgrading;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Gets the totalBusinessLicenses property value. The total number of cloud PC devices that have the Business SKU. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalBusinessLicenses() {
        return this.totalBusinessLicenses;
    }
    /**
     * Gets the totalCloudPcConnectionStatus property value. The total number of cloud PC connection statuses for the given managed tenant. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCloudPcConnectionStatus() {
        return this.totalCloudPcConnectionStatus;
    }
    /**
     * Gets the totalCloudPcStatus property value. The total number of cloud PC statues for the given managed tenant. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalCloudPcStatus() {
        return this.totalCloudPcStatus;
    }
    /**
     * Gets the totalEnterpriseLicenses property value. The total number of cloud PC devices that have the Enterprise SKU. Optional. Read-only.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalEnterpriseLicenses() {
        return this.totalEnterpriseLicenses;
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
        this.lastRefreshedDateTime = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusFailed property value. The number of cloud PC connections that have a status of failed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusFailed property.
     */
    public void setNumberOfCloudPcConnectionStatusFailed(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcConnectionStatusFailed = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusPassed property value. The number of cloud PC connections that have a status of passed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusPassed property.
     */
    public void setNumberOfCloudPcConnectionStatusPassed(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcConnectionStatusPassed = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusPending property value. The number of cloud PC connections that have a status of pending. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusPending property.
     */
    public void setNumberOfCloudPcConnectionStatusPending(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcConnectionStatusPending = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusRunning property value. The number of cloud PC connections that have a status of running. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusRunning property.
     */
    public void setNumberOfCloudPcConnectionStatusRunning(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcConnectionStatusRunning = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusUnkownFutureValue property value. The number of cloud PC connections that have a status of unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusUnkownFutureValue property.
     */
    public void setNumberOfCloudPcConnectionStatusUnkownFutureValue(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcConnectionStatusUnkownFutureValue = value;
    }
    /**
     * Sets the numberOfCloudPcStatusDeprovisioning property value. The number of cloud PCs that have a status of deprovisioning. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusDeprovisioning property.
     */
    public void setNumberOfCloudPcStatusDeprovisioning(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcStatusDeprovisioning = value;
    }
    /**
     * Sets the numberOfCloudPcStatusFailed property value. The number of cloud PCs that have a status of failed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusFailed property.
     */
    public void setNumberOfCloudPcStatusFailed(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcStatusFailed = value;
    }
    /**
     * Sets the numberOfCloudPcStatusInGracePeriod property value. The number of cloud PCs that have a status of inGracePeriod. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusInGracePeriod property.
     */
    public void setNumberOfCloudPcStatusInGracePeriod(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcStatusInGracePeriod = value;
    }
    /**
     * Sets the numberOfCloudPcStatusNotProvisioned property value. The number of cloud PCs that have a status of notProvisioned. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusNotProvisioned property.
     */
    public void setNumberOfCloudPcStatusNotProvisioned(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcStatusNotProvisioned = value;
    }
    /**
     * Sets the numberOfCloudPcStatusProvisioned property value. The number of cloud PCs that have a status of provisioned. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusProvisioned property.
     */
    public void setNumberOfCloudPcStatusProvisioned(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcStatusProvisioned = value;
    }
    /**
     * Sets the numberOfCloudPcStatusProvisioning property value. The number of cloud PCs that have a status of provisioning. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusProvisioning property.
     */
    public void setNumberOfCloudPcStatusProvisioning(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcStatusProvisioning = value;
    }
    /**
     * Sets the numberOfCloudPcStatusUnknown property value. The number of cloud PCs that have a status of unknown. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusUnknown property.
     */
    public void setNumberOfCloudPcStatusUnknown(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcStatusUnknown = value;
    }
    /**
     * Sets the numberOfCloudPcStatusUpgrading property value. The number of cloud PCs that have a status of upgrading. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusUpgrading property.
     */
    public void setNumberOfCloudPcStatusUpgrading(@jakarta.annotation.Nullable final Integer value) {
        this.numberOfCloudPcStatusUpgrading = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
    /**
     * Sets the totalBusinessLicenses property value. The total number of cloud PC devices that have the Business SKU. Optional. Read-only.
     * @param value Value to set for the totalBusinessLicenses property.
     */
    public void setTotalBusinessLicenses(@jakarta.annotation.Nullable final Integer value) {
        this.totalBusinessLicenses = value;
    }
    /**
     * Sets the totalCloudPcConnectionStatus property value. The total number of cloud PC connection statuses for the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalCloudPcConnectionStatus property.
     */
    public void setTotalCloudPcConnectionStatus(@jakarta.annotation.Nullable final Integer value) {
        this.totalCloudPcConnectionStatus = value;
    }
    /**
     * Sets the totalCloudPcStatus property value. The total number of cloud PC statues for the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalCloudPcStatus property.
     */
    public void setTotalCloudPcStatus(@jakarta.annotation.Nullable final Integer value) {
        this.totalCloudPcStatus = value;
    }
    /**
     * Sets the totalEnterpriseLicenses property value. The total number of cloud PC devices that have the Enterprise SKU. Optional. Read-only.
     * @param value Value to set for the totalEnterpriseLicenses property.
     */
    public void setTotalEnterpriseLicenses(@jakarta.annotation.Nullable final Integer value) {
        this.totalEnterpriseLicenses = value;
    }
}

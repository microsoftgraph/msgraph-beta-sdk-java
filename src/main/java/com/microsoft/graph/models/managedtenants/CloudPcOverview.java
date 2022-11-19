package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class CloudPcOverview extends Entity implements Parsable {
    /** Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime _lastRefreshedDateTime;
    /** The number of cloud PC connections that have a status of failed. Optional. Read-only. */
    private Integer _numberOfCloudPcConnectionStatusFailed;
    /** The number of cloud PC connections that have a status of passed. Optional. Read-only. */
    private Integer _numberOfCloudPcConnectionStatusPassed;
    /** The number of cloud PC connections that have a status of pending. Optional. Read-only. */
    private Integer _numberOfCloudPcConnectionStatusPending;
    /** The number of cloud PC connections that have a status of running. Optional. Read-only. */
    private Integer _numberOfCloudPcConnectionStatusRunning;
    /** The number of cloud PC connections that have a status of unknownFutureValue. Optional. Read-only. */
    private Integer _numberOfCloudPcConnectionStatusUnkownFutureValue;
    /** The number of cloud PCs that have a status of deprovisioning. Optional. Read-only. */
    private Integer _numberOfCloudPcStatusDeprovisioning;
    /** The number of cloud PCs that have a status of failed. Optional. Read-only. */
    private Integer _numberOfCloudPcStatusFailed;
    /** The number of cloud PCs that have a status of inGracePeriod. Optional. Read-only. */
    private Integer _numberOfCloudPcStatusInGracePeriod;
    /** The number of cloud PCs that have a status of notProvisioned. Optional. Read-only. */
    private Integer _numberOfCloudPcStatusNotProvisioned;
    /** The number of cloud PCs that have a status of provisioned. Optional. Read-only. */
    private Integer _numberOfCloudPcStatusProvisioned;
    /** The number of cloud PCs that have a status of provisioning. Optional. Read-only. */
    private Integer _numberOfCloudPcStatusProvisioning;
    /** The number of cloud PCs that have a status of unknown. Optional. Read-only. */
    private Integer _numberOfCloudPcStatusUnknown;
    /** The number of cloud PCs that have a status of upgrading. Optional. Read-only. */
    private Integer _numberOfCloudPcStatusUpgrading;
    /** The display name for the managed tenant. Optional. Read-only. */
    private String _tenantDisplayName;
    /** The tenantId property */
    private String _tenantId;
    /** The total number of cloud PC devices that have the Business SKU. Optional. Read-only. */
    private Integer _totalBusinessLicenses;
    /** The total number of cloud PC connection statuses for the given managed tenant. Optional. Read-only. */
    private Integer _totalCloudPcConnectionStatus;
    /** The total number of cloud PC statues for the given managed tenant. Optional. Read-only. */
    private Integer _totalCloudPcStatus;
    /** The total number of cloud PC devices that have the Enterprise SKU. Optional. Read-only. */
    private Integer _totalEnterpriseLicenses;
    /**
     * Instantiates a new cloudPcOverview and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcOverview() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.cloudPcOverview");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcOverview
     */
    @javax.annotation.Nonnull
    public static CloudPcOverview createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcOverview();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcOverview currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("lastRefreshedDateTime", (n) -> { currentObject.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusFailed", (n) -> { currentObject.setNumberOfCloudPcConnectionStatusFailed(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusPassed", (n) -> { currentObject.setNumberOfCloudPcConnectionStatusPassed(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusPending", (n) -> { currentObject.setNumberOfCloudPcConnectionStatusPending(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusRunning", (n) -> { currentObject.setNumberOfCloudPcConnectionStatusRunning(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcConnectionStatusUnkownFutureValue", (n) -> { currentObject.setNumberOfCloudPcConnectionStatusUnkownFutureValue(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusDeprovisioning", (n) -> { currentObject.setNumberOfCloudPcStatusDeprovisioning(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusFailed", (n) -> { currentObject.setNumberOfCloudPcStatusFailed(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusInGracePeriod", (n) -> { currentObject.setNumberOfCloudPcStatusInGracePeriod(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusNotProvisioned", (n) -> { currentObject.setNumberOfCloudPcStatusNotProvisioned(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusProvisioned", (n) -> { currentObject.setNumberOfCloudPcStatusProvisioned(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusProvisioning", (n) -> { currentObject.setNumberOfCloudPcStatusProvisioning(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusUnknown", (n) -> { currentObject.setNumberOfCloudPcStatusUnknown(n.getIntegerValue()); });
        deserializerMap.put("numberOfCloudPcStatusUpgrading", (n) -> { currentObject.setNumberOfCloudPcStatusUpgrading(n.getIntegerValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        deserializerMap.put("totalBusinessLicenses", (n) -> { currentObject.setTotalBusinessLicenses(n.getIntegerValue()); });
        deserializerMap.put("totalCloudPcConnectionStatus", (n) -> { currentObject.setTotalCloudPcConnectionStatus(n.getIntegerValue()); });
        deserializerMap.put("totalCloudPcStatus", (n) -> { currentObject.setTotalCloudPcStatus(n.getIntegerValue()); });
        deserializerMap.put("totalEnterpriseLicenses", (n) -> { currentObject.setTotalEnterpriseLicenses(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastRefreshedDateTime() {
        return this._lastRefreshedDateTime;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusFailed property value. The number of cloud PC connections that have a status of failed. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusFailed() {
        return this._numberOfCloudPcConnectionStatusFailed;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusPassed property value. The number of cloud PC connections that have a status of passed. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusPassed() {
        return this._numberOfCloudPcConnectionStatusPassed;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusPending property value. The number of cloud PC connections that have a status of pending. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusPending() {
        return this._numberOfCloudPcConnectionStatusPending;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusRunning property value. The number of cloud PC connections that have a status of running. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusRunning() {
        return this._numberOfCloudPcConnectionStatusRunning;
    }
    /**
     * Gets the numberOfCloudPcConnectionStatusUnkownFutureValue property value. The number of cloud PC connections that have a status of unknownFutureValue. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcConnectionStatusUnkownFutureValue() {
        return this._numberOfCloudPcConnectionStatusUnkownFutureValue;
    }
    /**
     * Gets the numberOfCloudPcStatusDeprovisioning property value. The number of cloud PCs that have a status of deprovisioning. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcStatusDeprovisioning() {
        return this._numberOfCloudPcStatusDeprovisioning;
    }
    /**
     * Gets the numberOfCloudPcStatusFailed property value. The number of cloud PCs that have a status of failed. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcStatusFailed() {
        return this._numberOfCloudPcStatusFailed;
    }
    /**
     * Gets the numberOfCloudPcStatusInGracePeriod property value. The number of cloud PCs that have a status of inGracePeriod. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcStatusInGracePeriod() {
        return this._numberOfCloudPcStatusInGracePeriod;
    }
    /**
     * Gets the numberOfCloudPcStatusNotProvisioned property value. The number of cloud PCs that have a status of notProvisioned. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcStatusNotProvisioned() {
        return this._numberOfCloudPcStatusNotProvisioned;
    }
    /**
     * Gets the numberOfCloudPcStatusProvisioned property value. The number of cloud PCs that have a status of provisioned. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcStatusProvisioned() {
        return this._numberOfCloudPcStatusProvisioned;
    }
    /**
     * Gets the numberOfCloudPcStatusProvisioning property value. The number of cloud PCs that have a status of provisioning. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcStatusProvisioning() {
        return this._numberOfCloudPcStatusProvisioning;
    }
    /**
     * Gets the numberOfCloudPcStatusUnknown property value. The number of cloud PCs that have a status of unknown. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcStatusUnknown() {
        return this._numberOfCloudPcStatusUnknown;
    }
    /**
     * Gets the numberOfCloudPcStatusUpgrading property value. The number of cloud PCs that have a status of upgrading. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfCloudPcStatusUpgrading() {
        return this._numberOfCloudPcStatusUpgrading;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantDisplayName() {
        return this._tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The tenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
    }
    /**
     * Gets the totalBusinessLicenses property value. The total number of cloud PC devices that have the Business SKU. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalBusinessLicenses() {
        return this._totalBusinessLicenses;
    }
    /**
     * Gets the totalCloudPcConnectionStatus property value. The total number of cloud PC connection statuses for the given managed tenant. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalCloudPcConnectionStatus() {
        return this._totalCloudPcConnectionStatus;
    }
    /**
     * Gets the totalCloudPcStatus property value. The total number of cloud PC statues for the given managed tenant. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalCloudPcStatus() {
        return this._totalCloudPcStatus;
    }
    /**
     * Gets the totalEnterpriseLicenses property value. The total number of cloud PC devices that have the Enterprise SKU. Optional. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalEnterpriseLicenses() {
        return this._totalEnterpriseLicenses;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastRefreshedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastRefreshedDateTime = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusFailed property value. The number of cloud PC connections that have a status of failed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcConnectionStatusFailed(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcConnectionStatusFailed = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusPassed property value. The number of cloud PC connections that have a status of passed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusPassed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcConnectionStatusPassed(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcConnectionStatusPassed = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusPending property value. The number of cloud PC connections that have a status of pending. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusPending property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcConnectionStatusPending(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcConnectionStatusPending = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusRunning property value. The number of cloud PC connections that have a status of running. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusRunning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcConnectionStatusRunning(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcConnectionStatusRunning = value;
    }
    /**
     * Sets the numberOfCloudPcConnectionStatusUnkownFutureValue property value. The number of cloud PC connections that have a status of unknownFutureValue. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcConnectionStatusUnkownFutureValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcConnectionStatusUnkownFutureValue(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcConnectionStatusUnkownFutureValue = value;
    }
    /**
     * Sets the numberOfCloudPcStatusDeprovisioning property value. The number of cloud PCs that have a status of deprovisioning. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusDeprovisioning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcStatusDeprovisioning(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcStatusDeprovisioning = value;
    }
    /**
     * Sets the numberOfCloudPcStatusFailed property value. The number of cloud PCs that have a status of failed. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusFailed property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcStatusFailed(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcStatusFailed = value;
    }
    /**
     * Sets the numberOfCloudPcStatusInGracePeriod property value. The number of cloud PCs that have a status of inGracePeriod. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusInGracePeriod property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcStatusInGracePeriod(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcStatusInGracePeriod = value;
    }
    /**
     * Sets the numberOfCloudPcStatusNotProvisioned property value. The number of cloud PCs that have a status of notProvisioned. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusNotProvisioned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcStatusNotProvisioned(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcStatusNotProvisioned = value;
    }
    /**
     * Sets the numberOfCloudPcStatusProvisioned property value. The number of cloud PCs that have a status of provisioned. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusProvisioned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcStatusProvisioned(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcStatusProvisioned = value;
    }
    /**
     * Sets the numberOfCloudPcStatusProvisioning property value. The number of cloud PCs that have a status of provisioning. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusProvisioning property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcStatusProvisioning(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcStatusProvisioning = value;
    }
    /**
     * Sets the numberOfCloudPcStatusUnknown property value. The number of cloud PCs that have a status of unknown. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusUnknown property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcStatusUnknown(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcStatusUnknown = value;
    }
    /**
     * Sets the numberOfCloudPcStatusUpgrading property value. The number of cloud PCs that have a status of upgrading. Optional. Read-only.
     * @param value Value to set for the numberOfCloudPcStatusUpgrading property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfCloudPcStatusUpgrading(@javax.annotation.Nullable final Integer value) {
        this._numberOfCloudPcStatusUpgrading = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this._tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The tenantId property
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the totalBusinessLicenses property value. The total number of cloud PC devices that have the Business SKU. Optional. Read-only.
     * @param value Value to set for the totalBusinessLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalBusinessLicenses(@javax.annotation.Nullable final Integer value) {
        this._totalBusinessLicenses = value;
    }
    /**
     * Sets the totalCloudPcConnectionStatus property value. The total number of cloud PC connection statuses for the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalCloudPcConnectionStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCloudPcConnectionStatus(@javax.annotation.Nullable final Integer value) {
        this._totalCloudPcConnectionStatus = value;
    }
    /**
     * Sets the totalCloudPcStatus property value. The total number of cloud PC statues for the given managed tenant. Optional. Read-only.
     * @param value Value to set for the totalCloudPcStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalCloudPcStatus(@javax.annotation.Nullable final Integer value) {
        this._totalCloudPcStatus = value;
    }
    /**
     * Sets the totalEnterpriseLicenses property value. The total number of cloud PC devices that have the Enterprise SKU. Optional. Read-only.
     * @param value Value to set for the totalEnterpriseLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalEnterpriseLicenses(@javax.annotation.Nullable final Integer value) {
        this._totalEnterpriseLicenses = value;
    }
}

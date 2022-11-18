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
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class ManagedDeviceCompliance extends Entity implements Parsable {
    /** Compliance state of the device. This property is read-only. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager. Optional. Read-only. */
    private String _complianceStatus;
    /** Platform of the device. This property is read-only. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, chromeOS, linux, blackberry, palm, unknown, cloudPC.  Optional. Read-only. */
    private String _deviceType;
    /** The date and time when the grace period will expire. Optional. Read-only. */
    private OffsetDateTime _inGracePeriodUntilDateTime;
    /** Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only. */
    private OffsetDateTime _lastRefreshedDateTime;
    /** The date and time that the device last completed a successful sync with Microsoft Endpoint Manager. Optional. Read-only. */
    private OffsetDateTime _lastSyncDateTime;
    /** The identifier for the managed device in Microsoft Endpoint Manager. Optional. Read-only. */
    private String _managedDeviceId;
    /** The display name for the managed device. Optional. Read-only. */
    private String _managedDeviceName;
    /** The manufacture for the device. Optional. Read-only. */
    private String _manufacturer;
    /** The model for the device. Optional. Read-only. */
    private String _model;
    /** The description of the operating system for the managed device. Optional. Read-only. */
    private String _osDescription;
    /** The version of the operating system for the managed device. Optional. Read-only. */
    private String _osVersion;
    /** The type of owner for the managed device. Optional. Read-only. */
    private String _ownerType;
    /** The display name for the managed tenant. Optional. Read-only. */
    private String _tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only. */
    private String _tenantId;
    /**
     * Instantiates a new managedDeviceCompliance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceCompliance() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managedDeviceCompliance");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceCompliance
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceCompliance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceCompliance();
    }
    /**
     * Gets the complianceStatus property value. Compliance state of the device. This property is read-only. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getComplianceStatus() {
        return this._complianceStatus;
    }
    /**
     * Gets the deviceType property value. Platform of the device. This property is read-only. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, chromeOS, linux, blackberry, palm, unknown, cloudPC.  Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceType() {
        return this._deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceCompliance currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("complianceStatus", (n) -> { currentObject.setComplianceStatus(n.getStringValue()); });
            this.put("deviceType", (n) -> { currentObject.setDeviceType(n.getStringValue()); });
            this.put("inGracePeriodUntilDateTime", (n) -> { currentObject.setInGracePeriodUntilDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastRefreshedDateTime", (n) -> { currentObject.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastSyncDateTime", (n) -> { currentObject.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("managedDeviceId", (n) -> { currentObject.setManagedDeviceId(n.getStringValue()); });
            this.put("managedDeviceName", (n) -> { currentObject.setManagedDeviceName(n.getStringValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("model", (n) -> { currentObject.setModel(n.getStringValue()); });
            this.put("osDescription", (n) -> { currentObject.setOsDescription(n.getStringValue()); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("ownerType", (n) -> { currentObject.setOwnerType(n.getStringValue()); });
            this.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the inGracePeriodUntilDateTime property value. The date and time when the grace period will expire. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getInGracePeriodUntilDateTime() {
        return this._inGracePeriodUntilDateTime;
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
     * Gets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Microsoft Endpoint Manager. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this._lastSyncDateTime;
    }
    /**
     * Gets the managedDeviceId property value. The identifier for the managed device in Microsoft Endpoint Manager. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceId() {
        return this._managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagedDeviceName() {
        return this._managedDeviceName;
    }
    /**
     * Gets the manufacturer property value. The manufacture for the device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the model property value. The model for the device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the osDescription property value. The description of the operating system for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsDescription() {
        return this._osDescription;
    }
    /**
     * Gets the osVersion property value. The version of the operating system for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the ownerType property value. The type of owner for the managed device. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOwnerType() {
        return this._ownerType;
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
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTenantId() {
        return this._tenantId;
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
        writer.writeStringValue("complianceStatus", this.getComplianceStatus());
        writer.writeStringValue("deviceType", this.getDeviceType());
        writer.writeOffsetDateTimeValue("inGracePeriodUntilDateTime", this.getInGracePeriodUntilDateTime());
        writer.writeOffsetDateTimeValue("lastRefreshedDateTime", this.getLastRefreshedDateTime());
        writer.writeOffsetDateTimeValue("lastSyncDateTime", this.getLastSyncDateTime());
        writer.writeStringValue("managedDeviceId", this.getManagedDeviceId());
        writer.writeStringValue("managedDeviceName", this.getManagedDeviceName());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("osDescription", this.getOsDescription());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeStringValue("ownerType", this.getOwnerType());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
    }
    /**
     * Sets the complianceStatus property value. Compliance state of the device. This property is read-only. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager. Optional. Read-only.
     * @param value Value to set for the complianceStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceStatus(@javax.annotation.Nullable final String value) {
        this._complianceStatus = value;
    }
    /**
     * Sets the deviceType property value. Platform of the device. This property is read-only. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, chromeOS, linux, blackberry, palm, unknown, cloudPC.  Optional. Read-only.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final String value) {
        this._deviceType = value;
    }
    /**
     * Sets the inGracePeriodUntilDateTime property value. The date and time when the grace period will expire. Optional. Read-only.
     * @param value Value to set for the inGracePeriodUntilDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInGracePeriodUntilDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._inGracePeriodUntilDateTime = value;
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
     * Sets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Microsoft Endpoint Manager. Optional. Read-only.
     * @param value Value to set for the lastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastSyncDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. The identifier for the managed device in Microsoft Endpoint Manager. Optional. Read-only.
     * @param value Value to set for the managedDeviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceId(@javax.annotation.Nullable final String value) {
        this._managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedDeviceName(@javax.annotation.Nullable final String value) {
        this._managedDeviceName = value;
    }
    /**
     * Sets the manufacturer property value. The manufacture for the device. Optional. Read-only.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the model property value. The model for the device. Optional. Read-only.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the osDescription property value. The description of the operating system for the managed device. Optional. Read-only.
     * @param value Value to set for the osDescription property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsDescription(@javax.annotation.Nullable final String value) {
        this._osDescription = value;
    }
    /**
     * Sets the osVersion property value. The version of the operating system for the managed device. Optional. Read-only.
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the ownerType property value. The type of owner for the managed device. Optional. Read-only.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOwnerType(@javax.annotation.Nullable final String value) {
        this._ownerType = value;
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
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
}

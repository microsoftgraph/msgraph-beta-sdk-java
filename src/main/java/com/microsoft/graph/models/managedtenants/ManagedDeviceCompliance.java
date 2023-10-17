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
public class ManagedDeviceCompliance extends Entity implements Parsable {
    /**
     * Compliance state of the device. This property is read-only. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager. Optional. Read-only.
     */
    private String complianceStatus;
    /**
     * Platform of the device. This property is read-only. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, chromeOS, linux, blackberry, palm, unknown, cloudPC.  Optional. Read-only.
     */
    private String deviceType;
    /**
     * The date and time when the grace period will expire. Optional. Read-only.
     */
    private OffsetDateTime inGracePeriodUntilDateTime;
    /**
     * Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     */
    private OffsetDateTime lastRefreshedDateTime;
    /**
     * The date and time that the device last completed a successful sync with Microsoft Endpoint Manager. Optional. Read-only.
     */
    private OffsetDateTime lastSyncDateTime;
    /**
     * The identifier for the managed device in Microsoft Endpoint Manager. Optional. Read-only.
     */
    private String managedDeviceId;
    /**
     * The display name for the managed device. Optional. Read-only.
     */
    private String managedDeviceName;
    /**
     * The manufacture for the device. Optional. Read-only.
     */
    private String manufacturer;
    /**
     * The model for the device. Optional. Read-only.
     */
    private String model;
    /**
     * The description of the operating system for the managed device. Optional. Read-only.
     */
    private String osDescription;
    /**
     * The version of the operating system for the managed device. Optional. Read-only.
     */
    private String osVersion;
    /**
     * The type of owner for the managed device. Optional. Read-only.
     */
    private String ownerType;
    /**
     * The display name for the managed tenant. Optional. Read-only.
     */
    private String tenantDisplayName;
    /**
     * The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     */
    private String tenantId;
    /**
     * Instantiates a new ManagedDeviceCompliance and sets the default values.
     */
    public ManagedDeviceCompliance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedDeviceCompliance
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceCompliance createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceCompliance();
    }
    /**
     * Gets the complianceStatus property value. Compliance state of the device. This property is read-only. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getComplianceStatus() {
        return this.complianceStatus;
    }
    /**
     * Gets the deviceType property value. Platform of the device. This property is read-only. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, chromeOS, linux, blackberry, palm, unknown, cloudPC.  Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceType() {
        return this.deviceType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("complianceStatus", (n) -> { this.setComplianceStatus(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getStringValue()); });
        deserializerMap.put("inGracePeriodUntilDateTime", (n) -> { this.setInGracePeriodUntilDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastRefreshedDateTime", (n) -> { this.setLastRefreshedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSyncDateTime", (n) -> { this.setLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedDeviceId", (n) -> { this.setManagedDeviceId(n.getStringValue()); });
        deserializerMap.put("managedDeviceName", (n) -> { this.setManagedDeviceName(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("osDescription", (n) -> { this.setOsDescription(n.getStringValue()); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("ownerType", (n) -> { this.setOwnerType(n.getStringValue()); });
        deserializerMap.put("tenantDisplayName", (n) -> { this.setTenantDisplayName(n.getStringValue()); });
        deserializerMap.put("tenantId", (n) -> { this.setTenantId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inGracePeriodUntilDateTime property value. The date and time when the grace period will expire. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getInGracePeriodUntilDateTime() {
        return this.inGracePeriodUntilDateTime;
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
     * Gets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Microsoft Endpoint Manager. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSyncDateTime() {
        return this.lastSyncDateTime;
    }
    /**
     * Gets the managedDeviceId property value. The identifier for the managed device in Microsoft Endpoint Manager. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceId() {
        return this.managedDeviceId;
    }
    /**
     * Gets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManagedDeviceName() {
        return this.managedDeviceName;
    }
    /**
     * Gets the manufacturer property value. The manufacture for the device. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the model property value. The model for the device. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the osDescription property value. The description of the operating system for the managed device. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsDescription() {
        return this.osDescription;
    }
    /**
     * Gets the osVersion property value. The version of the operating system for the managed device. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the ownerType property value. The type of owner for the managed device. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnerType() {
        return this.ownerType;
    }
    /**
     * Gets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }
    /**
     * Gets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setComplianceStatus(@jakarta.annotation.Nullable final String value) {
        this.complianceStatus = value;
    }
    /**
     * Sets the deviceType property value. Platform of the device. This property is read-only. Possible values are: desktop, windowsRT, winMO6, nokia, windowsPhone, mac, winCE, winEmbedded, iPhone, iPad, iPod, android, iSocConsumer, unix, macMDM, holoLens, surfaceHub, androidForWork, androidEnterprise, windows10x, androidnGMS, chromeOS, linux, blackberry, palm, unknown, cloudPC.  Optional. Read-only.
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final String value) {
        this.deviceType = value;
    }
    /**
     * Sets the inGracePeriodUntilDateTime property value. The date and time when the grace period will expire. Optional. Read-only.
     * @param value Value to set for the inGracePeriodUntilDateTime property.
     */
    public void setInGracePeriodUntilDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.inGracePeriodUntilDateTime = value;
    }
    /**
     * Sets the lastRefreshedDateTime property value. Date and time the entity was last updated in the multi-tenant management platform. Optional. Read-only.
     * @param value Value to set for the lastRefreshedDateTime property.
     */
    public void setLastRefreshedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRefreshedDateTime = value;
    }
    /**
     * Sets the lastSyncDateTime property value. The date and time that the device last completed a successful sync with Microsoft Endpoint Manager. Optional. Read-only.
     * @param value Value to set for the lastSyncDateTime property.
     */
    public void setLastSyncDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSyncDateTime = value;
    }
    /**
     * Sets the managedDeviceId property value. The identifier for the managed device in Microsoft Endpoint Manager. Optional. Read-only.
     * @param value Value to set for the managedDeviceId property.
     */
    public void setManagedDeviceId(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceId = value;
    }
    /**
     * Sets the managedDeviceName property value. The display name for the managed device. Optional. Read-only.
     * @param value Value to set for the managedDeviceName property.
     */
    public void setManagedDeviceName(@jakarta.annotation.Nullable final String value) {
        this.managedDeviceName = value;
    }
    /**
     * Sets the manufacturer property value. The manufacture for the device. Optional. Read-only.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the model property value. The model for the device. Optional. Read-only.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the osDescription property value. The description of the operating system for the managed device. Optional. Read-only.
     * @param value Value to set for the osDescription property.
     */
    public void setOsDescription(@jakarta.annotation.Nullable final String value) {
        this.osDescription = value;
    }
    /**
     * Sets the osVersion property value. The version of the operating system for the managed device. Optional. Read-only.
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the ownerType property value. The type of owner for the managed device. Optional. Read-only.
     * @param value Value to set for the ownerType property.
     */
    public void setOwnerType(@jakarta.annotation.Nullable final String value) {
        this.ownerType = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     */
    public void setTenantDisplayName(@jakarta.annotation.Nullable final String value) {
        this.tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     */
    public void setTenantId(@jakarta.annotation.Nullable final String value) {
        this.tenantId = value;
    }
}

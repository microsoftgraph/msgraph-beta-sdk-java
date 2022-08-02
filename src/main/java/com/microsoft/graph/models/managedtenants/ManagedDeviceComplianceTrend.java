package microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
/** Provides operations to manage the collection of activityStatistics entities. */
public class ManagedDeviceComplianceTrend extends Entity implements Parsable {
    /** The number of devices with a compliant status. Required. Read-only. */
    private Integer _compliantDeviceCount;
    /** The number of devices manged by Configuration Manager. Required. Read-only. */
    private Integer _configManagerDeviceCount;
    /** The date and time compliance snapshot was performed. Required. Read-only. */
    private String _countDateTime;
    /** The number of devices with an error status. Required. Read-only. */
    private Integer _errorDeviceCount;
    /** The number of devices that are in a grace period status. Required. Read-only. */
    private Integer _inGracePeriodDeviceCount;
    /** The number of devices that are in a non-compliant status. Required. Read-only. */
    private Integer _noncompliantDeviceCount;
    /** The display name for the managed tenant. Optional. Read-only. */
    private String _tenantDisplayName;
    /** The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only. */
    private String _tenantId;
    /** The number of devices in an unknown status. Required. Read-only. */
    private Integer _unknownDeviceCount;
    /**
     * Instantiates a new managedDeviceComplianceTrend and sets the default values.
     * @return a void
     */
    public ManagedDeviceComplianceTrend() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managedDeviceComplianceTrend");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceComplianceTrend
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceComplianceTrend createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceComplianceTrend();
    }
    /**
     * Gets the compliantDeviceCount property value. The number of devices with a compliant status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this._compliantDeviceCount;
    }
    /**
     * Gets the configManagerDeviceCount property value. The number of devices manged by Configuration Manager. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfigManagerDeviceCount() {
        return this._configManagerDeviceCount;
    }
    /**
     * Gets the countDateTime property value. The date and time compliance snapshot was performed. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountDateTime() {
        return this._countDateTime;
    }
    /**
     * Gets the errorDeviceCount property value. The number of devices with an error status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorDeviceCount() {
        return this._errorDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceComplianceTrend currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("compliantDeviceCount", (n) -> { currentObject.setCompliantDeviceCount(n.getIntegerValue()); });
            this.put("configManagerDeviceCount", (n) -> { currentObject.setConfigManagerDeviceCount(n.getIntegerValue()); });
            this.put("countDateTime", (n) -> { currentObject.setCountDateTime(n.getStringValue()); });
            this.put("errorDeviceCount", (n) -> { currentObject.setErrorDeviceCount(n.getIntegerValue()); });
            this.put("inGracePeriodDeviceCount", (n) -> { currentObject.setInGracePeriodDeviceCount(n.getIntegerValue()); });
            this.put("noncompliantDeviceCount", (n) -> { currentObject.setNoncompliantDeviceCount(n.getIntegerValue()); });
            this.put("tenantDisplayName", (n) -> { currentObject.setTenantDisplayName(n.getStringValue()); });
            this.put("tenantId", (n) -> { currentObject.setTenantId(n.getStringValue()); });
            this.put("unknownDeviceCount", (n) -> { currentObject.setUnknownDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the inGracePeriodDeviceCount property value. The number of devices that are in a grace period status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInGracePeriodDeviceCount() {
        return this._inGracePeriodDeviceCount;
    }
    /**
     * Gets the noncompliantDeviceCount property value. The number of devices that are in a non-compliant status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNoncompliantDeviceCount() {
        return this._noncompliantDeviceCount;
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
     * Gets the unknownDeviceCount property value. The number of devices in an unknown status. Required. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnknownDeviceCount() {
        return this._unknownDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("compliantDeviceCount", this.getCompliantDeviceCount());
        writer.writeIntegerValue("configManagerDeviceCount", this.getConfigManagerDeviceCount());
        writer.writeStringValue("countDateTime", this.getCountDateTime());
        writer.writeIntegerValue("errorDeviceCount", this.getErrorDeviceCount());
        writer.writeIntegerValue("inGracePeriodDeviceCount", this.getInGracePeriodDeviceCount());
        writer.writeIntegerValue("noncompliantDeviceCount", this.getNoncompliantDeviceCount());
        writer.writeStringValue("tenantDisplayName", this.getTenantDisplayName());
        writer.writeStringValue("tenantId", this.getTenantId());
        writer.writeIntegerValue("unknownDeviceCount", this.getUnknownDeviceCount());
    }
    /**
     * Sets the compliantDeviceCount property value. The number of devices with a compliant status. Required. Read-only.
     * @param value Value to set for the compliantDeviceCount property.
     * @return a void
     */
    public void setCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._compliantDeviceCount = value;
    }
    /**
     * Sets the configManagerDeviceCount property value. The number of devices manged by Configuration Manager. Required. Read-only.
     * @param value Value to set for the configManagerDeviceCount property.
     * @return a void
     */
    public void setConfigManagerDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._configManagerDeviceCount = value;
    }
    /**
     * Sets the countDateTime property value. The date and time compliance snapshot was performed. Required. Read-only.
     * @param value Value to set for the countDateTime property.
     * @return a void
     */
    public void setCountDateTime(@javax.annotation.Nullable final String value) {
        this._countDateTime = value;
    }
    /**
     * Sets the errorDeviceCount property value. The number of devices with an error status. Required. Read-only.
     * @param value Value to set for the errorDeviceCount property.
     * @return a void
     */
    public void setErrorDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._errorDeviceCount = value;
    }
    /**
     * Sets the inGracePeriodDeviceCount property value. The number of devices that are in a grace period status. Required. Read-only.
     * @param value Value to set for the inGracePeriodDeviceCount property.
     * @return a void
     */
    public void setInGracePeriodDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._inGracePeriodDeviceCount = value;
    }
    /**
     * Sets the noncompliantDeviceCount property value. The number of devices that are in a non-compliant status. Required. Read-only.
     * @param value Value to set for the noncompliantDeviceCount property.
     * @return a void
     */
    public void setNoncompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._noncompliantDeviceCount = value;
    }
    /**
     * Sets the tenantDisplayName property value. The display name for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantDisplayName property.
     * @return a void
     */
    public void setTenantDisplayName(@javax.annotation.Nullable final String value) {
        this._tenantDisplayName = value;
    }
    /**
     * Sets the tenantId property value. The Azure Active Directory tenant identifier for the managed tenant. Optional. Read-only.
     * @param value Value to set for the tenantId property.
     * @return a void
     */
    public void setTenantId(@javax.annotation.Nullable final String value) {
        this._tenantId = value;
    }
    /**
     * Sets the unknownDeviceCount property value. The number of devices in an unknown status. Required. Read-only.
     * @param value Value to set for the unknownDeviceCount property.
     * @return a void
     */
    public void setUnknownDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._unknownDeviceCount = value;
    }
}

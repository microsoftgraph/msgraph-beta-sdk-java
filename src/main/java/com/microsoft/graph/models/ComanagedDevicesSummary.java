package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Summary data for co managed devices */
public class ComanagedDevicesSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Number of devices with CompliancePolicy swung-over. This property is read-only. */
    private Integer _compliancePolicyCount;
    /** Number of devices with ConfigurationSettings swung-over. This property is read-only. */
    private Integer _configurationSettingsCount;
    /** Number of devices with EndpointProtection swung-over. This property is read-only. */
    private Integer _endpointProtectionCount;
    /** Number of devices with Inventory swung-over. This property is read-only. */
    private Integer _inventoryCount;
    /** Number of devices with ModernApps swung-over. This property is read-only. */
    private Integer _modernAppsCount;
    /** The OdataType property */
    private String _odataType;
    /** Number of devices with OfficeApps swung-over. This property is read-only. */
    private Integer _officeAppsCount;
    /** Number of devices with ResourceAccess swung-over. This property is read-only. */
    private Integer _resourceAccessCount;
    /** Number of Co-Managed Devices. This property is read-only. */
    private Integer _totalComanagedCount;
    /** Number of devices with WindowsUpdateForBusiness swung-over. This property is read-only. */
    private Integer _windowsUpdateForBusinessCount;
    /**
     * Instantiates a new comanagedDevicesSummary and sets the default values.
     * @return a void
     */
    public ComanagedDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.comanagedDevicesSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a comanagedDevicesSummary
     */
    @javax.annotation.Nonnull
    public static ComanagedDevicesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComanagedDevicesSummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the compliancePolicyCount property value. Number of devices with CompliancePolicy swung-over. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliancePolicyCount() {
        return this._compliancePolicyCount;
    }
    /**
     * Gets the configurationSettingsCount property value. Number of devices with ConfigurationSettings swung-over. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getConfigurationSettingsCount() {
        return this._configurationSettingsCount;
    }
    /**
     * Gets the endpointProtectionCount property value. Number of devices with EndpointProtection swung-over. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEndpointProtectionCount() {
        return this._endpointProtectionCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ComanagedDevicesSummary currentObject = this;
        return new HashMap<>(10) {{
            this.put("compliancePolicyCount", (n) -> { currentObject.setCompliancePolicyCount(n.getIntegerValue()); });
            this.put("configurationSettingsCount", (n) -> { currentObject.setConfigurationSettingsCount(n.getIntegerValue()); });
            this.put("endpointProtectionCount", (n) -> { currentObject.setEndpointProtectionCount(n.getIntegerValue()); });
            this.put("inventoryCount", (n) -> { currentObject.setInventoryCount(n.getIntegerValue()); });
            this.put("modernAppsCount", (n) -> { currentObject.setModernAppsCount(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("officeAppsCount", (n) -> { currentObject.setOfficeAppsCount(n.getIntegerValue()); });
            this.put("resourceAccessCount", (n) -> { currentObject.setResourceAccessCount(n.getIntegerValue()); });
            this.put("totalComanagedCount", (n) -> { currentObject.setTotalComanagedCount(n.getIntegerValue()); });
            this.put("windowsUpdateForBusinessCount", (n) -> { currentObject.setWindowsUpdateForBusinessCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the inventoryCount property value. Number of devices with Inventory swung-over. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInventoryCount() {
        return this._inventoryCount;
    }
    /**
     * Gets the modernAppsCount property value. Number of devices with ModernApps swung-over. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getModernAppsCount() {
        return this._modernAppsCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the officeAppsCount property value. Number of devices with OfficeApps swung-over. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOfficeAppsCount() {
        return this._officeAppsCount;
    }
    /**
     * Gets the resourceAccessCount property value. Number of devices with ResourceAccess swung-over. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getResourceAccessCount() {
        return this._resourceAccessCount;
    }
    /**
     * Gets the totalComanagedCount property value. Number of Co-Managed Devices. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalComanagedCount() {
        return this._totalComanagedCount;
    }
    /**
     * Gets the windowsUpdateForBusinessCount property value. Number of devices with WindowsUpdateForBusiness swung-over. This property is read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getWindowsUpdateForBusinessCount() {
        return this._windowsUpdateForBusinessCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("compliancePolicyCount", this.getCompliancePolicyCount());
        writer.writeIntegerValue("configurationSettingsCount", this.getConfigurationSettingsCount());
        writer.writeIntegerValue("endpointProtectionCount", this.getEndpointProtectionCount());
        writer.writeIntegerValue("inventoryCount", this.getInventoryCount());
        writer.writeIntegerValue("modernAppsCount", this.getModernAppsCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("officeAppsCount", this.getOfficeAppsCount());
        writer.writeIntegerValue("resourceAccessCount", this.getResourceAccessCount());
        writer.writeIntegerValue("totalComanagedCount", this.getTotalComanagedCount());
        writer.writeIntegerValue("windowsUpdateForBusinessCount", this.getWindowsUpdateForBusinessCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the compliancePolicyCount property value. Number of devices with CompliancePolicy swung-over. This property is read-only.
     * @param value Value to set for the compliancePolicyCount property.
     * @return a void
     */
    public void setCompliancePolicyCount(@javax.annotation.Nullable final Integer value) {
        this._compliancePolicyCount = value;
    }
    /**
     * Sets the configurationSettingsCount property value. Number of devices with ConfigurationSettings swung-over. This property is read-only.
     * @param value Value to set for the configurationSettingsCount property.
     * @return a void
     */
    public void setConfigurationSettingsCount(@javax.annotation.Nullable final Integer value) {
        this._configurationSettingsCount = value;
    }
    /**
     * Sets the endpointProtectionCount property value. Number of devices with EndpointProtection swung-over. This property is read-only.
     * @param value Value to set for the endpointProtectionCount property.
     * @return a void
     */
    public void setEndpointProtectionCount(@javax.annotation.Nullable final Integer value) {
        this._endpointProtectionCount = value;
    }
    /**
     * Sets the inventoryCount property value. Number of devices with Inventory swung-over. This property is read-only.
     * @param value Value to set for the inventoryCount property.
     * @return a void
     */
    public void setInventoryCount(@javax.annotation.Nullable final Integer value) {
        this._inventoryCount = value;
    }
    /**
     * Sets the modernAppsCount property value. Number of devices with ModernApps swung-over. This property is read-only.
     * @param value Value to set for the modernAppsCount property.
     * @return a void
     */
    public void setModernAppsCount(@javax.annotation.Nullable final Integer value) {
        this._modernAppsCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the officeAppsCount property value. Number of devices with OfficeApps swung-over. This property is read-only.
     * @param value Value to set for the officeAppsCount property.
     * @return a void
     */
    public void setOfficeAppsCount(@javax.annotation.Nullable final Integer value) {
        this._officeAppsCount = value;
    }
    /**
     * Sets the resourceAccessCount property value. Number of devices with ResourceAccess swung-over. This property is read-only.
     * @param value Value to set for the resourceAccessCount property.
     * @return a void
     */
    public void setResourceAccessCount(@javax.annotation.Nullable final Integer value) {
        this._resourceAccessCount = value;
    }
    /**
     * Sets the totalComanagedCount property value. Number of Co-Managed Devices. This property is read-only.
     * @param value Value to set for the totalComanagedCount property.
     * @return a void
     */
    public void setTotalComanagedCount(@javax.annotation.Nullable final Integer value) {
        this._totalComanagedCount = value;
    }
    /**
     * Sets the windowsUpdateForBusinessCount property value. Number of devices with WindowsUpdateForBusiness swung-over. This property is read-only.
     * @param value Value to set for the windowsUpdateForBusinessCount property.
     * @return a void
     */
    public void setWindowsUpdateForBusinessCount(@javax.annotation.Nullable final Integer value) {
        this._windowsUpdateForBusinessCount = value;
    }
}

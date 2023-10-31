package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Summary data for co managed devices
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComanagedDevicesSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of devices with CompliancePolicy swung-over. This property is read-only.
     */
    private Integer compliancePolicyCount;
    /**
     * Number of devices with ConfigurationSettings swung-over. This property is read-only.
     */
    private Integer configurationSettingsCount;
    /**
     * Number of devices with EndpointProtection swung-over. This property is read-only.
     */
    private Integer endpointProtectionCount;
    /**
     * Number of devices with Inventory swung-over. This property is read-only.
     */
    private Integer inventoryCount;
    /**
     * Number of devices with ModernApps swung-over. This property is read-only.
     */
    private Integer modernAppsCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Number of devices with OfficeApps swung-over. This property is read-only.
     */
    private Integer officeAppsCount;
    /**
     * Number of devices with ResourceAccess swung-over. This property is read-only.
     */
    private Integer resourceAccessCount;
    /**
     * Number of Co-Managed Devices. This property is read-only.
     */
    private Integer totalComanagedCount;
    /**
     * Number of devices with WindowsUpdateForBusiness swung-over. This property is read-only.
     */
    private Integer windowsUpdateForBusinessCount;
    /**
     * Instantiates a new ComanagedDevicesSummary and sets the default values.
     */
    public ComanagedDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ComanagedDevicesSummary
     */
    @jakarta.annotation.Nonnull
    public static ComanagedDevicesSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComanagedDevicesSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the compliancePolicyCount property value. Number of devices with CompliancePolicy swung-over. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompliancePolicyCount() {
        return this.compliancePolicyCount;
    }
    /**
     * Gets the configurationSettingsCount property value. Number of devices with ConfigurationSettings swung-over. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getConfigurationSettingsCount() {
        return this.configurationSettingsCount;
    }
    /**
     * Gets the endpointProtectionCount property value. Number of devices with EndpointProtection swung-over. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEndpointProtectionCount() {
        return this.endpointProtectionCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("compliancePolicyCount", (n) -> { this.setCompliancePolicyCount(n.getIntegerValue()); });
        deserializerMap.put("configurationSettingsCount", (n) -> { this.setConfigurationSettingsCount(n.getIntegerValue()); });
        deserializerMap.put("endpointProtectionCount", (n) -> { this.setEndpointProtectionCount(n.getIntegerValue()); });
        deserializerMap.put("inventoryCount", (n) -> { this.setInventoryCount(n.getIntegerValue()); });
        deserializerMap.put("modernAppsCount", (n) -> { this.setModernAppsCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("officeAppsCount", (n) -> { this.setOfficeAppsCount(n.getIntegerValue()); });
        deserializerMap.put("resourceAccessCount", (n) -> { this.setResourceAccessCount(n.getIntegerValue()); });
        deserializerMap.put("totalComanagedCount", (n) -> { this.setTotalComanagedCount(n.getIntegerValue()); });
        deserializerMap.put("windowsUpdateForBusinessCount", (n) -> { this.setWindowsUpdateForBusinessCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventoryCount property value. Number of devices with Inventory swung-over. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getInventoryCount() {
        return this.inventoryCount;
    }
    /**
     * Gets the modernAppsCount property value. Number of devices with ModernApps swung-over. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getModernAppsCount() {
        return this.modernAppsCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the officeAppsCount property value. Number of devices with OfficeApps swung-over. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOfficeAppsCount() {
        return this.officeAppsCount;
    }
    /**
     * Gets the resourceAccessCount property value. Number of devices with ResourceAccess swung-over. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getResourceAccessCount() {
        return this.resourceAccessCount;
    }
    /**
     * Gets the totalComanagedCount property value. Number of Co-Managed Devices. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalComanagedCount() {
        return this.totalComanagedCount;
    }
    /**
     * Gets the windowsUpdateForBusinessCount property value. Number of devices with WindowsUpdateForBusiness swung-over. This property is read-only.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getWindowsUpdateForBusinessCount() {
        return this.windowsUpdateForBusinessCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the compliancePolicyCount property value. Number of devices with CompliancePolicy swung-over. This property is read-only.
     * @param value Value to set for the compliancePolicyCount property.
     */
    public void setCompliancePolicyCount(@jakarta.annotation.Nullable final Integer value) {
        this.compliancePolicyCount = value;
    }
    /**
     * Sets the configurationSettingsCount property value. Number of devices with ConfigurationSettings swung-over. This property is read-only.
     * @param value Value to set for the configurationSettingsCount property.
     */
    public void setConfigurationSettingsCount(@jakarta.annotation.Nullable final Integer value) {
        this.configurationSettingsCount = value;
    }
    /**
     * Sets the endpointProtectionCount property value. Number of devices with EndpointProtection swung-over. This property is read-only.
     * @param value Value to set for the endpointProtectionCount property.
     */
    public void setEndpointProtectionCount(@jakarta.annotation.Nullable final Integer value) {
        this.endpointProtectionCount = value;
    }
    /**
     * Sets the inventoryCount property value. Number of devices with Inventory swung-over. This property is read-only.
     * @param value Value to set for the inventoryCount property.
     */
    public void setInventoryCount(@jakarta.annotation.Nullable final Integer value) {
        this.inventoryCount = value;
    }
    /**
     * Sets the modernAppsCount property value. Number of devices with ModernApps swung-over. This property is read-only.
     * @param value Value to set for the modernAppsCount property.
     */
    public void setModernAppsCount(@jakarta.annotation.Nullable final Integer value) {
        this.modernAppsCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the officeAppsCount property value. Number of devices with OfficeApps swung-over. This property is read-only.
     * @param value Value to set for the officeAppsCount property.
     */
    public void setOfficeAppsCount(@jakarta.annotation.Nullable final Integer value) {
        this.officeAppsCount = value;
    }
    /**
     * Sets the resourceAccessCount property value. Number of devices with ResourceAccess swung-over. This property is read-only.
     * @param value Value to set for the resourceAccessCount property.
     */
    public void setResourceAccessCount(@jakarta.annotation.Nullable final Integer value) {
        this.resourceAccessCount = value;
    }
    /**
     * Sets the totalComanagedCount property value. Number of Co-Managed Devices. This property is read-only.
     * @param value Value to set for the totalComanagedCount property.
     */
    public void setTotalComanagedCount(@jakarta.annotation.Nullable final Integer value) {
        this.totalComanagedCount = value;
    }
    /**
     * Sets the windowsUpdateForBusinessCount property value. Number of devices with WindowsUpdateForBusiness swung-over. This property is read-only.
     * @param value Value to set for the windowsUpdateForBusinessCount property.
     */
    public void setWindowsUpdateForBusinessCount(@jakarta.annotation.Nullable final Integer value) {
        this.windowsUpdateForBusinessCount = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * configuration Manager client enabled features
 */
public class ConfigurationManagerClientEnabledFeatures implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Whether compliance policy is managed by Intune
     */
    private Boolean compliancePolicy;
    /**
     * Whether device configuration is managed by Intune
     */
    private Boolean deviceConfiguration;
    /**
     * Whether Endpoint Protection is managed by Intune
     */
    private Boolean endpointProtection;
    /**
     * Whether inventory is managed by Intune
     */
    private Boolean inventory;
    /**
     * Whether modern application is managed by Intune
     */
    private Boolean modernApps;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Whether Office application is managed by Intune
     */
    private Boolean officeApps;
    /**
     * Whether resource access is managed by Intune
     */
    private Boolean resourceAccess;
    /**
     * Whether Windows Update for Business is managed by Intune
     */
    private Boolean windowsUpdateForBusiness;
    /**
     * Instantiates a new configurationManagerClientEnabledFeatures and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigurationManagerClientEnabledFeatures() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a configurationManagerClientEnabledFeatures
     */
    @javax.annotation.Nonnull
    public static ConfigurationManagerClientEnabledFeatures createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigurationManagerClientEnabledFeatures();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the compliancePolicy property value. Whether compliance policy is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCompliancePolicy() {
        return this.compliancePolicy;
    }
    /**
     * Gets the deviceConfiguration property value. Whether device configuration is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDeviceConfiguration() {
        return this.deviceConfiguration;
    }
    /**
     * Gets the endpointProtection property value. Whether Endpoint Protection is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEndpointProtection() {
        return this.endpointProtection;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("compliancePolicy", (n) -> { this.setCompliancePolicy(n.getBooleanValue()); });
        deserializerMap.put("deviceConfiguration", (n) -> { this.setDeviceConfiguration(n.getBooleanValue()); });
        deserializerMap.put("endpointProtection", (n) -> { this.setEndpointProtection(n.getBooleanValue()); });
        deserializerMap.put("inventory", (n) -> { this.setInventory(n.getBooleanValue()); });
        deserializerMap.put("modernApps", (n) -> { this.setModernApps(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("officeApps", (n) -> { this.setOfficeApps(n.getBooleanValue()); });
        deserializerMap.put("resourceAccess", (n) -> { this.setResourceAccess(n.getBooleanValue()); });
        deserializerMap.put("windowsUpdateForBusiness", (n) -> { this.setWindowsUpdateForBusiness(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inventory property value. Whether inventory is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getInventory() {
        return this.inventory;
    }
    /**
     * Gets the modernApps property value. Whether modern application is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getModernApps() {
        return this.modernApps;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the officeApps property value. Whether Office application is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOfficeApps() {
        return this.officeApps;
    }
    /**
     * Gets the resourceAccess property value. Whether resource access is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getResourceAccess() {
        return this.resourceAccess;
    }
    /**
     * Gets the windowsUpdateForBusiness property value. Whether Windows Update for Business is managed by Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsUpdateForBusiness() {
        return this.windowsUpdateForBusiness;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("compliancePolicy", this.getCompliancePolicy());
        writer.writeBooleanValue("deviceConfiguration", this.getDeviceConfiguration());
        writer.writeBooleanValue("endpointProtection", this.getEndpointProtection());
        writer.writeBooleanValue("inventory", this.getInventory());
        writer.writeBooleanValue("modernApps", this.getModernApps());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeBooleanValue("officeApps", this.getOfficeApps());
        writer.writeBooleanValue("resourceAccess", this.getResourceAccess());
        writer.writeBooleanValue("windowsUpdateForBusiness", this.getWindowsUpdateForBusiness());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the compliancePolicy property value. Whether compliance policy is managed by Intune
     * @param value Value to set for the compliancePolicy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliancePolicy(@javax.annotation.Nullable final Boolean value) {
        this.compliancePolicy = value;
    }
    /**
     * Sets the deviceConfiguration property value. Whether device configuration is managed by Intune
     * @param value Value to set for the deviceConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceConfiguration(@javax.annotation.Nullable final Boolean value) {
        this.deviceConfiguration = value;
    }
    /**
     * Sets the endpointProtection property value. Whether Endpoint Protection is managed by Intune
     * @param value Value to set for the endpointProtection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndpointProtection(@javax.annotation.Nullable final Boolean value) {
        this.endpointProtection = value;
    }
    /**
     * Sets the inventory property value. Whether inventory is managed by Intune
     * @param value Value to set for the inventory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInventory(@javax.annotation.Nullable final Boolean value) {
        this.inventory = value;
    }
    /**
     * Sets the modernApps property value. Whether modern application is managed by Intune
     * @param value Value to set for the modernApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModernApps(@javax.annotation.Nullable final Boolean value) {
        this.modernApps = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the officeApps property value. Whether Office application is managed by Intune
     * @param value Value to set for the officeApps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOfficeApps(@javax.annotation.Nullable final Boolean value) {
        this.officeApps = value;
    }
    /**
     * Sets the resourceAccess property value. Whether resource access is managed by Intune
     * @param value Value to set for the resourceAccess property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResourceAccess(@javax.annotation.Nullable final Boolean value) {
        this.resourceAccess = value;
    }
    /**
     * Sets the windowsUpdateForBusiness property value. Whether Windows Update for Business is managed by Intune
     * @param value Value to set for the windowsUpdateForBusiness property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsUpdateForBusiness(@javax.annotation.Nullable final Boolean value) {
        this.windowsUpdateForBusiness = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TeamworkNetworkConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new TeamworkNetworkConfiguration and sets the default values.
     */
    public TeamworkNetworkConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TeamworkNetworkConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TeamworkNetworkConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkNetworkConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the defaultGateway property value. The default gateway is the path used to pass information when the destination is unknown to the device.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefaultGateway() {
        return this.backingStore.get("defaultGateway");
    }
    /**
     * Gets the domainName property value. The network domain of the device, for example, contoso.com.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDomainName() {
        return this.backingStore.get("domainName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("defaultGateway", (n) -> { this.setDefaultGateway(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("hostName", (n) -> { this.setHostName(n.getStringValue()); });
        deserializerMap.put("ipAddress", (n) -> { this.setIpAddress(n.getStringValue()); });
        deserializerMap.put("isDhcpEnabled", (n) -> { this.setIsDhcpEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPCPortEnabled", (n) -> { this.setIsPCPortEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryDns", (n) -> { this.setPrimaryDns(n.getStringValue()); });
        deserializerMap.put("secondaryDns", (n) -> { this.setSecondaryDns(n.getStringValue()); });
        deserializerMap.put("subnetMask", (n) -> { this.setSubnetMask(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hostName property value. The device name on a network.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHostName() {
        return this.backingStore.get("hostName");
    }
    /**
     * Gets the ipAddress property value. The IP address is a numerical label that uniquely identifies every device connected to the internet.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return this.backingStore.get("ipAddress");
    }
    /**
     * Gets the isDhcpEnabled property value. True if DHCP is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDhcpEnabled() {
        return this.backingStore.get("isDhcpEnabled");
    }
    /**
     * Gets the isPCPortEnabled property value. True if the PC port is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPCPortEnabled() {
        return this.backingStore.get("isPCPortEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the primaryDns property value. A primary DNS is the first point of contact for a device that translates the hostname into an IP address.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryDns() {
        return this.backingStore.get("primaryDns");
    }
    /**
     * Gets the secondaryDns property value. A secondary DNS is used when the primary DNS is not available.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSecondaryDns() {
        return this.backingStore.get("secondaryDns");
    }
    /**
     * Gets the subnetMask property value. A subnet mask is a number that distinguishes the network address and the host address within an IP address.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubnetMask() {
        return this.backingStore.get("subnetMask");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("defaultGateway", this.getDefaultGateway());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("hostName", this.getHostName());
        writer.writeStringValue("ipAddress", this.getIpAddress());
        writer.writeBooleanValue("isDhcpEnabled", this.getIsDhcpEnabled());
        writer.writeBooleanValue("isPCPortEnabled", this.getIsPCPortEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("primaryDns", this.getPrimaryDns());
        writer.writeStringValue("secondaryDns", this.getSecondaryDns());
        writer.writeStringValue("subnetMask", this.getSubnetMask());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the defaultGateway property value. The default gateway is the path used to pass information when the destination is unknown to the device.
     * @param value Value to set for the defaultGateway property.
     */
    public void setDefaultGateway(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultGateway", value);
    }
    /**
     * Sets the domainName property value. The network domain of the device, for example, contoso.com.
     * @param value Value to set for the domainName property.
     */
    public void setDomainName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainName", value);
    }
    /**
     * Sets the hostName property value. The device name on a network.
     * @param value Value to set for the hostName property.
     */
    public void setHostName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("hostName", value);
    }
    /**
     * Sets the ipAddress property value. The IP address is a numerical label that uniquely identifies every device connected to the internet.
     * @param value Value to set for the ipAddress property.
     */
    public void setIpAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("ipAddress", value);
    }
    /**
     * Sets the isDhcpEnabled property value. True if DHCP is enabled.
     * @param value Value to set for the isDhcpEnabled property.
     */
    public void setIsDhcpEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDhcpEnabled", value);
    }
    /**
     * Sets the isPCPortEnabled property value. True if the PC port is enabled.
     * @param value Value to set for the isPCPortEnabled property.
     */
    public void setIsPCPortEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPCPortEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the primaryDns property value. A primary DNS is the first point of contact for a device that translates the hostname into an IP address.
     * @param value Value to set for the primaryDns property.
     */
    public void setPrimaryDns(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryDns", value);
    }
    /**
     * Sets the secondaryDns property value. A secondary DNS is used when the primary DNS is not available.
     * @param value Value to set for the secondaryDns property.
     */
    public void setSecondaryDns(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secondaryDns", value);
    }
    /**
     * Sets the subnetMask property value. A subnet mask is a number that distinguishes the network address and the host address within an IP address.
     * @param value Value to set for the subnetMask property.
     */
    public void setSubnetMask(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("subnetMask", value);
    }
}

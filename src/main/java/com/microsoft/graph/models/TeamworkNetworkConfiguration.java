package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkNetworkConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The default gateway is the path used to pass information when the destination is unknown to the device.
     */
    private String defaultGateway;
    /**
     * The network domain of the device, for example, contoso.com.
     */
    private String domainName;
    /**
     * The device name on a network.
     */
    private String hostName;
    /**
     * The IP address is a numerical label that uniquely identifies every device connected to the internet.
     */
    private String ipAddress;
    /**
     * True if DHCP is enabled.
     */
    private Boolean isDhcpEnabled;
    /**
     * True if the PC port is enabled.
     */
    private Boolean isPCPortEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * A primary DNS is the first point of contact for a device that translates the hostname into an IP address.
     */
    private String primaryDns;
    /**
     * A secondary DNS is used when the primary DNS is not available.
     */
    private String secondaryDns;
    /**
     * A subnet mask is a number that distinguishes the network address and the host address within an IP address.
     */
    private String subnetMask;
    /**
     * Instantiates a new teamworkNetworkConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TeamworkNetworkConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkNetworkConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkNetworkConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkNetworkConfiguration();
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
     * Gets the defaultGateway property value. The default gateway is the path used to pass information when the destination is unknown to the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultGateway() {
        return this.defaultGateway;
    }
    /**
     * Gets the domainName property value. The network domain of the device, for example, contoso.com.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Gets the ipAddress property value. The IP address is a numerical label that uniquely identifies every device connected to the internet.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Gets the isDhcpEnabled property value. True if DHCP is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDhcpEnabled() {
        return this.isDhcpEnabled;
    }
    /**
     * Gets the isPCPortEnabled property value. True if the PC port is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPCPortEnabled() {
        return this.isPCPortEnabled;
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
     * Gets the primaryDns property value. A primary DNS is the first point of contact for a device that translates the hostname into an IP address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPrimaryDns() {
        return this.primaryDns;
    }
    /**
     * Gets the secondaryDns property value. A secondary DNS is used when the primary DNS is not available.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecondaryDns() {
        return this.secondaryDns;
    }
    /**
     * Gets the subnetMask property value. A subnet mask is a number that distinguishes the network address and the host address within an IP address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSubnetMask() {
        return this.subnetMask;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the defaultGateway property value. The default gateway is the path used to pass information when the destination is unknown to the device.
     * @param value Value to set for the defaultGateway property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultGateway(@javax.annotation.Nullable final String value) {
        this.defaultGateway = value;
    }
    /**
     * Sets the domainName property value. The network domain of the device, for example, contoso.com.
     * @param value Value to set for the domainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this.domainName = value;
    }
    /**
     * Sets the hostName property value. The device name on a network.
     * @param value Value to set for the hostName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostName(@javax.annotation.Nullable final String value) {
        this.hostName = value;
    }
    /**
     * Sets the ipAddress property value. The IP address is a numerical label that uniquely identifies every device connected to the internet.
     * @param value Value to set for the ipAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpAddress(@javax.annotation.Nullable final String value) {
        this.ipAddress = value;
    }
    /**
     * Sets the isDhcpEnabled property value. True if DHCP is enabled.
     * @param value Value to set for the isDhcpEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDhcpEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isDhcpEnabled = value;
    }
    /**
     * Sets the isPCPortEnabled property value. True if the PC port is enabled.
     * @param value Value to set for the isPCPortEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPCPortEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isPCPortEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the primaryDns property value. A primary DNS is the first point of contact for a device that translates the hostname into an IP address.
     * @param value Value to set for the primaryDns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrimaryDns(@javax.annotation.Nullable final String value) {
        this.primaryDns = value;
    }
    /**
     * Sets the secondaryDns property value. A secondary DNS is used when the primary DNS is not available.
     * @param value Value to set for the secondaryDns property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecondaryDns(@javax.annotation.Nullable final String value) {
        this.secondaryDns = value;
    }
    /**
     * Sets the subnetMask property value. A subnet mask is a number that distinguishes the network address and the host address within an IP address.
     * @param value Value to set for the subnetMask property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSubnetMask(@javax.annotation.Nullable final String value) {
        this.subnetMask = value;
    }
}

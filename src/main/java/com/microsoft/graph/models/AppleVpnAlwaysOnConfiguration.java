package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Always On VPN configuration for MacOS and iOS IKEv2
 */
public class AppleVpnAlwaysOnConfiguration implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Determine whether AirPrint service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     */
    private VpnServiceExceptionAction airPrintExceptionAction;
    /**
     * Specifies whether traffic from all captive network plugins should be allowed outside the vpn
     */
    private Boolean allowAllCaptiveNetworkPlugins;
    /**
     * Determines whether traffic from the Websheet app is allowed outside of the VPN
     */
    private Boolean allowCaptiveWebSheet;
    /**
     * Determines whether all, some, or no non-native captive networking apps are allowed
     */
    private SpecifiedCaptiveNetworkPlugins allowedCaptiveNetworkPlugins;
    /**
     * Determine whether Cellular service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     */
    private VpnServiceExceptionAction cellularExceptionAction;
    /**
     * Specifies how often in seconds to send a network address translation keepalive package through the VPN
     */
    private Integer natKeepAliveIntervalInSeconds;
    /**
     * Enable hardware offloading of NAT keepalive signals when the device is asleep
     */
    private Boolean natKeepAliveOffloadEnable;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The type of tunnels that will be present to the VPN client for configuration
     */
    private VpnTunnelConfigurationType tunnelConfiguration;
    /**
     * Allow the user to toggle the VPN configuration using the UI
     */
    private Boolean userToggleEnabled;
    /**
     * Determine whether voicemail service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     */
    private VpnServiceExceptionAction voicemailExceptionAction;
    /**
     * Instantiates a new appleVpnAlwaysOnConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AppleVpnAlwaysOnConfiguration() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appleVpnAlwaysOnConfiguration
     */
    @javax.annotation.Nonnull
    public static AppleVpnAlwaysOnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleVpnAlwaysOnConfiguration();
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
     * Gets the airPrintExceptionAction property value. Determine whether AirPrint service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a vpnServiceExceptionAction
     */
    @javax.annotation.Nullable
    public VpnServiceExceptionAction getAirPrintExceptionAction() {
        return this.airPrintExceptionAction;
    }
    /**
     * Gets the allowAllCaptiveNetworkPlugins property value. Specifies whether traffic from all captive network plugins should be allowed outside the vpn
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAllCaptiveNetworkPlugins() {
        return this.allowAllCaptiveNetworkPlugins;
    }
    /**
     * Gets the allowCaptiveWebSheet property value. Determines whether traffic from the Websheet app is allowed outside of the VPN
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCaptiveWebSheet() {
        return this.allowCaptiveWebSheet;
    }
    /**
     * Gets the allowedCaptiveNetworkPlugins property value. Determines whether all, some, or no non-native captive networking apps are allowed
     * @return a specifiedCaptiveNetworkPlugins
     */
    @javax.annotation.Nullable
    public SpecifiedCaptiveNetworkPlugins getAllowedCaptiveNetworkPlugins() {
        return this.allowedCaptiveNetworkPlugins;
    }
    /**
     * Gets the cellularExceptionAction property value. Determine whether Cellular service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a vpnServiceExceptionAction
     */
    @javax.annotation.Nullable
    public VpnServiceExceptionAction getCellularExceptionAction() {
        return this.cellularExceptionAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("airPrintExceptionAction", (n) -> { this.setAirPrintExceptionAction(n.getEnumValue(VpnServiceExceptionAction.class)); });
        deserializerMap.put("allowAllCaptiveNetworkPlugins", (n) -> { this.setAllowAllCaptiveNetworkPlugins(n.getBooleanValue()); });
        deserializerMap.put("allowCaptiveWebSheet", (n) -> { this.setAllowCaptiveWebSheet(n.getBooleanValue()); });
        deserializerMap.put("allowedCaptiveNetworkPlugins", (n) -> { this.setAllowedCaptiveNetworkPlugins(n.getObjectValue(SpecifiedCaptiveNetworkPlugins::createFromDiscriminatorValue)); });
        deserializerMap.put("cellularExceptionAction", (n) -> { this.setCellularExceptionAction(n.getEnumValue(VpnServiceExceptionAction.class)); });
        deserializerMap.put("natKeepAliveIntervalInSeconds", (n) -> { this.setNatKeepAliveIntervalInSeconds(n.getIntegerValue()); });
        deserializerMap.put("natKeepAliveOffloadEnable", (n) -> { this.setNatKeepAliveOffloadEnable(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tunnelConfiguration", (n) -> { this.setTunnelConfiguration(n.getEnumValue(VpnTunnelConfigurationType.class)); });
        deserializerMap.put("userToggleEnabled", (n) -> { this.setUserToggleEnabled(n.getBooleanValue()); });
        deserializerMap.put("voicemailExceptionAction", (n) -> { this.setVoicemailExceptionAction(n.getEnumValue(VpnServiceExceptionAction.class)); });
        return deserializerMap;
    }
    /**
     * Gets the natKeepAliveIntervalInSeconds property value. Specifies how often in seconds to send a network address translation keepalive package through the VPN
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNatKeepAliveIntervalInSeconds() {
        return this.natKeepAliveIntervalInSeconds;
    }
    /**
     * Gets the natKeepAliveOffloadEnable property value. Enable hardware offloading of NAT keepalive signals when the device is asleep
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNatKeepAliveOffloadEnable() {
        return this.natKeepAliveOffloadEnable;
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
     * Gets the tunnelConfiguration property value. The type of tunnels that will be present to the VPN client for configuration
     * @return a vpnTunnelConfigurationType
     */
    @javax.annotation.Nullable
    public VpnTunnelConfigurationType getTunnelConfiguration() {
        return this.tunnelConfiguration;
    }
    /**
     * Gets the userToggleEnabled property value. Allow the user to toggle the VPN configuration using the UI
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserToggleEnabled() {
        return this.userToggleEnabled;
    }
    /**
     * Gets the voicemailExceptionAction property value. Determine whether voicemail service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a vpnServiceExceptionAction
     */
    @javax.annotation.Nullable
    public VpnServiceExceptionAction getVoicemailExceptionAction() {
        return this.voicemailExceptionAction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("airPrintExceptionAction", this.getAirPrintExceptionAction());
        writer.writeBooleanValue("allowAllCaptiveNetworkPlugins", this.getAllowAllCaptiveNetworkPlugins());
        writer.writeBooleanValue("allowCaptiveWebSheet", this.getAllowCaptiveWebSheet());
        writer.writeObjectValue("allowedCaptiveNetworkPlugins", this.getAllowedCaptiveNetworkPlugins());
        writer.writeEnumValue("cellularExceptionAction", this.getCellularExceptionAction());
        writer.writeIntegerValue("natKeepAliveIntervalInSeconds", this.getNatKeepAliveIntervalInSeconds());
        writer.writeBooleanValue("natKeepAliveOffloadEnable", this.getNatKeepAliveOffloadEnable());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("tunnelConfiguration", this.getTunnelConfiguration());
        writer.writeBooleanValue("userToggleEnabled", this.getUserToggleEnabled());
        writer.writeEnumValue("voicemailExceptionAction", this.getVoicemailExceptionAction());
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
     * Sets the airPrintExceptionAction property value. Determine whether AirPrint service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the airPrintExceptionAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAirPrintExceptionAction(@javax.annotation.Nullable final VpnServiceExceptionAction value) {
        this.airPrintExceptionAction = value;
    }
    /**
     * Sets the allowAllCaptiveNetworkPlugins property value. Specifies whether traffic from all captive network plugins should be allowed outside the vpn
     * @param value Value to set for the allowAllCaptiveNetworkPlugins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowAllCaptiveNetworkPlugins(@javax.annotation.Nullable final Boolean value) {
        this.allowAllCaptiveNetworkPlugins = value;
    }
    /**
     * Sets the allowCaptiveWebSheet property value. Determines whether traffic from the Websheet app is allowed outside of the VPN
     * @param value Value to set for the allowCaptiveWebSheet property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowCaptiveWebSheet(@javax.annotation.Nullable final Boolean value) {
        this.allowCaptiveWebSheet = value;
    }
    /**
     * Sets the allowedCaptiveNetworkPlugins property value. Determines whether all, some, or no non-native captive networking apps are allowed
     * @param value Value to set for the allowedCaptiveNetworkPlugins property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowedCaptiveNetworkPlugins(@javax.annotation.Nullable final SpecifiedCaptiveNetworkPlugins value) {
        this.allowedCaptiveNetworkPlugins = value;
    }
    /**
     * Sets the cellularExceptionAction property value. Determine whether Cellular service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the cellularExceptionAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCellularExceptionAction(@javax.annotation.Nullable final VpnServiceExceptionAction value) {
        this.cellularExceptionAction = value;
    }
    /**
     * Sets the natKeepAliveIntervalInSeconds property value. Specifies how often in seconds to send a network address translation keepalive package through the VPN
     * @param value Value to set for the natKeepAliveIntervalInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNatKeepAliveIntervalInSeconds(@javax.annotation.Nullable final Integer value) {
        this.natKeepAliveIntervalInSeconds = value;
    }
    /**
     * Sets the natKeepAliveOffloadEnable property value. Enable hardware offloading of NAT keepalive signals when the device is asleep
     * @param value Value to set for the natKeepAliveOffloadEnable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNatKeepAliveOffloadEnable(@javax.annotation.Nullable final Boolean value) {
        this.natKeepAliveOffloadEnable = value;
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
     * Sets the tunnelConfiguration property value. The type of tunnels that will be present to the VPN client for configuration
     * @param value Value to set for the tunnelConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTunnelConfiguration(@javax.annotation.Nullable final VpnTunnelConfigurationType value) {
        this.tunnelConfiguration = value;
    }
    /**
     * Sets the userToggleEnabled property value. Allow the user to toggle the VPN configuration using the UI
     * @param value Value to set for the userToggleEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserToggleEnabled(@javax.annotation.Nullable final Boolean value) {
        this.userToggleEnabled = value;
    }
    /**
     * Sets the voicemailExceptionAction property value. Determine whether voicemail service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the voicemailExceptionAction property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVoicemailExceptionAction(@javax.annotation.Nullable final VpnServiceExceptionAction value) {
        this.voicemailExceptionAction = value;
    }
}

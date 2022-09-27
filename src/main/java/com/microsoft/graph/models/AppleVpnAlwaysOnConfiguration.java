package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Always On VPN configuration for MacOS and iOS IKEv2 */
public class AppleVpnAlwaysOnConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Determine whether AirPrint service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic. */
    private VpnServiceExceptionAction _airPrintExceptionAction;
    /** Specifies whether traffic from all captive network plugins should be allowed outside the vpn */
    private Boolean _allowAllCaptiveNetworkPlugins;
    /** Determines whether traffic from the Websheet app is allowed outside of the VPN */
    private Boolean _allowCaptiveWebSheet;
    /** Determines whether all, some, or no non-native captive networking apps are allowed */
    private SpecifiedCaptiveNetworkPlugins _allowedCaptiveNetworkPlugins;
    /** Determine whether Cellular service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic. */
    private VpnServiceExceptionAction _cellularExceptionAction;
    /** Specifies how often in seconds to send a network address translation keepalive package through the VPN */
    private Integer _natKeepAliveIntervalInSeconds;
    /** Enable hardware offloading of NAT keepalive signals when the device is asleep */
    private Boolean _natKeepAliveOffloadEnable;
    /** The OdataType property */
    private String _odataType;
    /** The type of tunnels that will be present to the VPN client for configuration */
    private VpnTunnelConfigurationType _tunnelConfiguration;
    /** Allow the user to toggle the VPN configuration using the UI */
    private Boolean _userToggleEnabled;
    /** Determine whether voicemail service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic. */
    private VpnServiceExceptionAction _voicemailExceptionAction;
    /**
     * Instantiates a new appleVpnAlwaysOnConfiguration and sets the default values.
     * @return a void
     */
    public AppleVpnAlwaysOnConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.appleVpnAlwaysOnConfiguration");
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
        return this._additionalData;
    }
    /**
     * Gets the airPrintExceptionAction property value. Determine whether AirPrint service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a vpnServiceExceptionAction
     */
    @javax.annotation.Nullable
    public VpnServiceExceptionAction getAirPrintExceptionAction() {
        return this._airPrintExceptionAction;
    }
    /**
     * Gets the allowAllCaptiveNetworkPlugins property value. Specifies whether traffic from all captive network plugins should be allowed outside the vpn
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowAllCaptiveNetworkPlugins() {
        return this._allowAllCaptiveNetworkPlugins;
    }
    /**
     * Gets the allowCaptiveWebSheet property value. Determines whether traffic from the Websheet app is allowed outside of the VPN
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowCaptiveWebSheet() {
        return this._allowCaptiveWebSheet;
    }
    /**
     * Gets the allowedCaptiveNetworkPlugins property value. Determines whether all, some, or no non-native captive networking apps are allowed
     * @return a specifiedCaptiveNetworkPlugins
     */
    @javax.annotation.Nullable
    public SpecifiedCaptiveNetworkPlugins getAllowedCaptiveNetworkPlugins() {
        return this._allowedCaptiveNetworkPlugins;
    }
    /**
     * Gets the cellularExceptionAction property value. Determine whether Cellular service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a vpnServiceExceptionAction
     */
    @javax.annotation.Nullable
    public VpnServiceExceptionAction getCellularExceptionAction() {
        return this._cellularExceptionAction;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppleVpnAlwaysOnConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(11) {{
            this.put("airPrintExceptionAction", (n) -> { currentObject.setAirPrintExceptionAction(n.getEnumValue(VpnServiceExceptionAction.class)); });
            this.put("allowAllCaptiveNetworkPlugins", (n) -> { currentObject.setAllowAllCaptiveNetworkPlugins(n.getBooleanValue()); });
            this.put("allowCaptiveWebSheet", (n) -> { currentObject.setAllowCaptiveWebSheet(n.getBooleanValue()); });
            this.put("allowedCaptiveNetworkPlugins", (n) -> { currentObject.setAllowedCaptiveNetworkPlugins(n.getObjectValue(SpecifiedCaptiveNetworkPlugins::createFromDiscriminatorValue)); });
            this.put("cellularExceptionAction", (n) -> { currentObject.setCellularExceptionAction(n.getEnumValue(VpnServiceExceptionAction.class)); });
            this.put("natKeepAliveIntervalInSeconds", (n) -> { currentObject.setNatKeepAliveIntervalInSeconds(n.getIntegerValue()); });
            this.put("natKeepAliveOffloadEnable", (n) -> { currentObject.setNatKeepAliveOffloadEnable(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("tunnelConfiguration", (n) -> { currentObject.setTunnelConfiguration(n.getEnumValue(VpnTunnelConfigurationType.class)); });
            this.put("userToggleEnabled", (n) -> { currentObject.setUserToggleEnabled(n.getBooleanValue()); });
            this.put("voicemailExceptionAction", (n) -> { currentObject.setVoicemailExceptionAction(n.getEnumValue(VpnServiceExceptionAction.class)); });
        }};
    }
    /**
     * Gets the natKeepAliveIntervalInSeconds property value. Specifies how often in seconds to send a network address translation keepalive package through the VPN
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNatKeepAliveIntervalInSeconds() {
        return this._natKeepAliveIntervalInSeconds;
    }
    /**
     * Gets the natKeepAliveOffloadEnable property value. Enable hardware offloading of NAT keepalive signals when the device is asleep
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getNatKeepAliveOffloadEnable() {
        return this._natKeepAliveOffloadEnable;
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
     * Gets the tunnelConfiguration property value. The type of tunnels that will be present to the VPN client for configuration
     * @return a vpnTunnelConfigurationType
     */
    @javax.annotation.Nullable
    public VpnTunnelConfigurationType getTunnelConfiguration() {
        return this._tunnelConfiguration;
    }
    /**
     * Gets the userToggleEnabled property value. Allow the user to toggle the VPN configuration using the UI
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUserToggleEnabled() {
        return this._userToggleEnabled;
    }
    /**
     * Gets the voicemailExceptionAction property value. Determine whether voicemail service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a vpnServiceExceptionAction
     */
    @javax.annotation.Nullable
    public VpnServiceExceptionAction getVoicemailExceptionAction() {
        return this._voicemailExceptionAction;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the airPrintExceptionAction property value. Determine whether AirPrint service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the airPrintExceptionAction property.
     * @return a void
     */
    public void setAirPrintExceptionAction(@javax.annotation.Nullable final VpnServiceExceptionAction value) {
        this._airPrintExceptionAction = value;
    }
    /**
     * Sets the allowAllCaptiveNetworkPlugins property value. Specifies whether traffic from all captive network plugins should be allowed outside the vpn
     * @param value Value to set for the allowAllCaptiveNetworkPlugins property.
     * @return a void
     */
    public void setAllowAllCaptiveNetworkPlugins(@javax.annotation.Nullable final Boolean value) {
        this._allowAllCaptiveNetworkPlugins = value;
    }
    /**
     * Sets the allowCaptiveWebSheet property value. Determines whether traffic from the Websheet app is allowed outside of the VPN
     * @param value Value to set for the allowCaptiveWebSheet property.
     * @return a void
     */
    public void setAllowCaptiveWebSheet(@javax.annotation.Nullable final Boolean value) {
        this._allowCaptiveWebSheet = value;
    }
    /**
     * Sets the allowedCaptiveNetworkPlugins property value. Determines whether all, some, or no non-native captive networking apps are allowed
     * @param value Value to set for the allowedCaptiveNetworkPlugins property.
     * @return a void
     */
    public void setAllowedCaptiveNetworkPlugins(@javax.annotation.Nullable final SpecifiedCaptiveNetworkPlugins value) {
        this._allowedCaptiveNetworkPlugins = value;
    }
    /**
     * Sets the cellularExceptionAction property value. Determine whether Cellular service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the cellularExceptionAction property.
     * @return a void
     */
    public void setCellularExceptionAction(@javax.annotation.Nullable final VpnServiceExceptionAction value) {
        this._cellularExceptionAction = value;
    }
    /**
     * Sets the natKeepAliveIntervalInSeconds property value. Specifies how often in seconds to send a network address translation keepalive package through the VPN
     * @param value Value to set for the natKeepAliveIntervalInSeconds property.
     * @return a void
     */
    public void setNatKeepAliveIntervalInSeconds(@javax.annotation.Nullable final Integer value) {
        this._natKeepAliveIntervalInSeconds = value;
    }
    /**
     * Sets the natKeepAliveOffloadEnable property value. Enable hardware offloading of NAT keepalive signals when the device is asleep
     * @param value Value to set for the natKeepAliveOffloadEnable property.
     * @return a void
     */
    public void setNatKeepAliveOffloadEnable(@javax.annotation.Nullable final Boolean value) {
        this._natKeepAliveOffloadEnable = value;
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
     * Sets the tunnelConfiguration property value. The type of tunnels that will be present to the VPN client for configuration
     * @param value Value to set for the tunnelConfiguration property.
     * @return a void
     */
    public void setTunnelConfiguration(@javax.annotation.Nullable final VpnTunnelConfigurationType value) {
        this._tunnelConfiguration = value;
    }
    /**
     * Sets the userToggleEnabled property value. Allow the user to toggle the VPN configuration using the UI
     * @param value Value to set for the userToggleEnabled property.
     * @return a void
     */
    public void setUserToggleEnabled(@javax.annotation.Nullable final Boolean value) {
        this._userToggleEnabled = value;
    }
    /**
     * Sets the voicemailExceptionAction property value. Determine whether voicemail service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the voicemailExceptionAction property.
     * @return a void
     */
    public void setVoicemailExceptionAction(@javax.annotation.Nullable final VpnServiceExceptionAction value) {
        this._voicemailExceptionAction = value;
    }
}

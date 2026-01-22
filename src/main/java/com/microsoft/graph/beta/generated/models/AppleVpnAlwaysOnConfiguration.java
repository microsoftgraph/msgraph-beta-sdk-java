package com.microsoft.graph.beta.models;

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
/**
 * Always On VPN configuration for MacOS and iOS IKEv2
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AppleVpnAlwaysOnConfiguration implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link AppleVpnAlwaysOnConfiguration} and sets the default values.
     */
    public AppleVpnAlwaysOnConfiguration() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AppleVpnAlwaysOnConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static AppleVpnAlwaysOnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleVpnAlwaysOnConfiguration();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
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
     * Gets the airPrintExceptionAction property value. Determine whether AirPrint service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a {@link VpnServiceExceptionAction}
     */
    @jakarta.annotation.Nullable
    public VpnServiceExceptionAction getAirPrintExceptionAction() {
        return this.backingStore.get("airPrintExceptionAction");
    }
    /**
     * Gets the allowAllCaptiveNetworkPlugins property value. Specifies whether traffic from all captive network plugins should be allowed outside the vpn
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowAllCaptiveNetworkPlugins() {
        return this.backingStore.get("allowAllCaptiveNetworkPlugins");
    }
    /**
     * Gets the allowCaptiveWebSheet property value. Determines whether traffic from the Websheet app is allowed outside of the VPN
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowCaptiveWebSheet() {
        return this.backingStore.get("allowCaptiveWebSheet");
    }
    /**
     * Gets the allowedCaptiveNetworkPlugins property value. Determines whether all, some, or no non-native captive networking apps are allowed
     * @return a {@link SpecifiedCaptiveNetworkPlugins}
     */
    @jakarta.annotation.Nullable
    public SpecifiedCaptiveNetworkPlugins getAllowedCaptiveNetworkPlugins() {
        return this.backingStore.get("allowedCaptiveNetworkPlugins");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cellularExceptionAction property value. Determine whether Cellular service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a {@link VpnServiceExceptionAction}
     */
    @jakarta.annotation.Nullable
    public VpnServiceExceptionAction getCellularExceptionAction() {
        return this.backingStore.get("cellularExceptionAction");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("airPrintExceptionAction", (n) -> { this.setAirPrintExceptionAction(n.getEnumValue(VpnServiceExceptionAction::forValue)); });
        deserializerMap.put("allowAllCaptiveNetworkPlugins", (n) -> { this.setAllowAllCaptiveNetworkPlugins(n.getBooleanValue()); });
        deserializerMap.put("allowCaptiveWebSheet", (n) -> { this.setAllowCaptiveWebSheet(n.getBooleanValue()); });
        deserializerMap.put("allowedCaptiveNetworkPlugins", (n) -> { this.setAllowedCaptiveNetworkPlugins(n.getObjectValue(SpecifiedCaptiveNetworkPlugins::createFromDiscriminatorValue)); });
        deserializerMap.put("cellularExceptionAction", (n) -> { this.setCellularExceptionAction(n.getEnumValue(VpnServiceExceptionAction::forValue)); });
        deserializerMap.put("natKeepAliveIntervalInSeconds", (n) -> { this.setNatKeepAliveIntervalInSeconds(n.getIntegerValue()); });
        deserializerMap.put("natKeepAliveOffloadEnable", (n) -> { this.setNatKeepAliveOffloadEnable(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tunnelConfiguration", (n) -> { this.setTunnelConfiguration(n.getEnumValue(VpnTunnelConfigurationType::forValue)); });
        deserializerMap.put("userToggleEnabled", (n) -> { this.setUserToggleEnabled(n.getBooleanValue()); });
        deserializerMap.put("voicemailExceptionAction", (n) -> { this.setVoicemailExceptionAction(n.getEnumValue(VpnServiceExceptionAction::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the natKeepAliveIntervalInSeconds property value. Specifies how often in seconds to send a network address translation keepalive package through the VPN
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNatKeepAliveIntervalInSeconds() {
        return this.backingStore.get("natKeepAliveIntervalInSeconds");
    }
    /**
     * Gets the natKeepAliveOffloadEnable property value. Enable hardware offloading of NAT keepalive signals when the device is asleep
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getNatKeepAliveOffloadEnable() {
        return this.backingStore.get("natKeepAliveOffloadEnable");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the tunnelConfiguration property value. The type of tunnels that will be present to the VPN client for configuration
     * @return a {@link VpnTunnelConfigurationType}
     */
    @jakarta.annotation.Nullable
    public VpnTunnelConfigurationType getTunnelConfiguration() {
        return this.backingStore.get("tunnelConfiguration");
    }
    /**
     * Gets the userToggleEnabled property value. Allow the user to toggle the VPN configuration using the UI
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUserToggleEnabled() {
        return this.backingStore.get("userToggleEnabled");
    }
    /**
     * Gets the voicemailExceptionAction property value. Determine whether voicemail service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @return a {@link VpnServiceExceptionAction}
     */
    @jakarta.annotation.Nullable
    public VpnServiceExceptionAction getVoicemailExceptionAction() {
        return this.backingStore.get("voicemailExceptionAction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the airPrintExceptionAction property value. Determine whether AirPrint service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the airPrintExceptionAction property.
     */
    public void setAirPrintExceptionAction(@jakarta.annotation.Nullable final VpnServiceExceptionAction value) {
        this.backingStore.set("airPrintExceptionAction", value);
    }
    /**
     * Sets the allowAllCaptiveNetworkPlugins property value. Specifies whether traffic from all captive network plugins should be allowed outside the vpn
     * @param value Value to set for the allowAllCaptiveNetworkPlugins property.
     */
    public void setAllowAllCaptiveNetworkPlugins(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowAllCaptiveNetworkPlugins", value);
    }
    /**
     * Sets the allowCaptiveWebSheet property value. Determines whether traffic from the Websheet app is allowed outside of the VPN
     * @param value Value to set for the allowCaptiveWebSheet property.
     */
    public void setAllowCaptiveWebSheet(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowCaptiveWebSheet", value);
    }
    /**
     * Sets the allowedCaptiveNetworkPlugins property value. Determines whether all, some, or no non-native captive networking apps are allowed
     * @param value Value to set for the allowedCaptiveNetworkPlugins property.
     */
    public void setAllowedCaptiveNetworkPlugins(@jakarta.annotation.Nullable final SpecifiedCaptiveNetworkPlugins value) {
        this.backingStore.set("allowedCaptiveNetworkPlugins", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cellularExceptionAction property value. Determine whether Cellular service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the cellularExceptionAction property.
     */
    public void setCellularExceptionAction(@jakarta.annotation.Nullable final VpnServiceExceptionAction value) {
        this.backingStore.set("cellularExceptionAction", value);
    }
    /**
     * Sets the natKeepAliveIntervalInSeconds property value. Specifies how often in seconds to send a network address translation keepalive package through the VPN
     * @param value Value to set for the natKeepAliveIntervalInSeconds property.
     */
    public void setNatKeepAliveIntervalInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("natKeepAliveIntervalInSeconds", value);
    }
    /**
     * Sets the natKeepAliveOffloadEnable property value. Enable hardware offloading of NAT keepalive signals when the device is asleep
     * @param value Value to set for the natKeepAliveOffloadEnable property.
     */
    public void setNatKeepAliveOffloadEnable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("natKeepAliveOffloadEnable", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the tunnelConfiguration property value. The type of tunnels that will be present to the VPN client for configuration
     * @param value Value to set for the tunnelConfiguration property.
     */
    public void setTunnelConfiguration(@jakarta.annotation.Nullable final VpnTunnelConfigurationType value) {
        this.backingStore.set("tunnelConfiguration", value);
    }
    /**
     * Sets the userToggleEnabled property value. Allow the user to toggle the VPN configuration using the UI
     * @param value Value to set for the userToggleEnabled property.
     */
    public void setUserToggleEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("userToggleEnabled", value);
    }
    /**
     * Sets the voicemailExceptionAction property value. Determine whether voicemail service will be exempt from the always-on VPN connection. Possible values are: forceTrafficViaVPN, allowTrafficOutside, dropTraffic.
     * @param value Value to set for the voicemailExceptionAction property.
     */
    public void setVoicemailExceptionAction(@jakarta.annotation.Nullable final VpnServiceExceptionAction value) {
        this.backingStore.set("voicemailExceptionAction", value);
    }
}

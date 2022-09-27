package com.microsoft.graph.models;

import com.microsoft.graph.models.WindowsWifiEnterpriseEAPConfiguration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsWifiConfiguration extends DeviceConfiguration implements Parsable {
    /** Specify whether the wifi connection should connect automatically when in range. */
    private Boolean _connectAutomatically;
    /** Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true. */
    private Boolean _connectToPreferredNetwork;
    /** Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting. */
    private Boolean _connectWhenNetworkNameIsHidden;
    /** Specify whether to force FIPS compliance. */
    private Boolean _forceFIPSCompliance;
    /** Specify the metered connection limit type for the wifi connection. Possible values are: unrestricted, fixed, variable. */
    private MeteredConnectionLimitType _meteredConnectionLimit;
    /** Specify the network configuration name. */
    private String _networkName;
    /** This is the pre-shared key for WPA Personal Wi-Fi network. */
    private String _preSharedKey;
    /** Specify the URL for the proxy server configuration script. */
    private String _proxyAutomaticConfigurationUrl;
    /** Specify the IP address for the proxy server. */
    private String _proxyManualAddress;
    /** Specify the port for the proxy server. */
    private Integer _proxyManualPort;
    /** Specify the proxy setting for Wi-Fi configuration. Possible values are: none, manual, automatic. */
    private WiFiProxySetting _proxySetting;
    /** Specify the SSID of the wifi connection. */
    private String _ssid;
    /** Specify the Wifi Security Type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise. */
    private WiFiSecurityType _wifiSecurityType;
    /**
     * Instantiates a new WindowsWifiConfiguration and sets the default values.
     * @return a void
     */
    public WindowsWifiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsWifiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsWifiConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsWifiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsWifiEnterpriseEAPConfiguration": return new WindowsWifiEnterpriseEAPConfiguration();
            }
        }
        return new WindowsWifiConfiguration();
    }
    /**
     * Gets the connectAutomatically property value. Specify whether the wifi connection should connect automatically when in range.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectAutomatically() {
        return this._connectAutomatically;
    }
    /**
     * Gets the connectToPreferredNetwork property value. Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectToPreferredNetwork() {
        return this._connectToPreferredNetwork;
    }
    /**
     * Gets the connectWhenNetworkNameIsHidden property value. Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getConnectWhenNetworkNameIsHidden() {
        return this._connectWhenNetworkNameIsHidden;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsWifiConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("connectAutomatically", (n) -> { currentObject.setConnectAutomatically(n.getBooleanValue()); });
            this.put("connectToPreferredNetwork", (n) -> { currentObject.setConnectToPreferredNetwork(n.getBooleanValue()); });
            this.put("connectWhenNetworkNameIsHidden", (n) -> { currentObject.setConnectWhenNetworkNameIsHidden(n.getBooleanValue()); });
            this.put("forceFIPSCompliance", (n) -> { currentObject.setForceFIPSCompliance(n.getBooleanValue()); });
            this.put("meteredConnectionLimit", (n) -> { currentObject.setMeteredConnectionLimit(n.getEnumValue(MeteredConnectionLimitType.class)); });
            this.put("networkName", (n) -> { currentObject.setNetworkName(n.getStringValue()); });
            this.put("preSharedKey", (n) -> { currentObject.setPreSharedKey(n.getStringValue()); });
            this.put("proxyAutomaticConfigurationUrl", (n) -> { currentObject.setProxyAutomaticConfigurationUrl(n.getStringValue()); });
            this.put("proxyManualAddress", (n) -> { currentObject.setProxyManualAddress(n.getStringValue()); });
            this.put("proxyManualPort", (n) -> { currentObject.setProxyManualPort(n.getIntegerValue()); });
            this.put("proxySetting", (n) -> { currentObject.setProxySetting(n.getEnumValue(WiFiProxySetting.class)); });
            this.put("ssid", (n) -> { currentObject.setSsid(n.getStringValue()); });
            this.put("wifiSecurityType", (n) -> { currentObject.setWifiSecurityType(n.getEnumValue(WiFiSecurityType.class)); });
        }};
    }
    /**
     * Gets the forceFIPSCompliance property value. Specify whether to force FIPS compliance.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getForceFIPSCompliance() {
        return this._forceFIPSCompliance;
    }
    /**
     * Gets the meteredConnectionLimit property value. Specify the metered connection limit type for the wifi connection. Possible values are: unrestricted, fixed, variable.
     * @return a meteredConnectionLimitType
     */
    @javax.annotation.Nullable
    public MeteredConnectionLimitType getMeteredConnectionLimit() {
        return this._meteredConnectionLimit;
    }
    /**
     * Gets the networkName property value. Specify the network configuration name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNetworkName() {
        return this._networkName;
    }
    /**
     * Gets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreSharedKey() {
        return this._preSharedKey;
    }
    /**
     * Gets the proxyAutomaticConfigurationUrl property value. Specify the URL for the proxy server configuration script.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyAutomaticConfigurationUrl() {
        return this._proxyAutomaticConfigurationUrl;
    }
    /**
     * Gets the proxyManualAddress property value. Specify the IP address for the proxy server.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProxyManualAddress() {
        return this._proxyManualAddress;
    }
    /**
     * Gets the proxyManualPort property value. Specify the port for the proxy server.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getProxyManualPort() {
        return this._proxyManualPort;
    }
    /**
     * Gets the proxySetting property value. Specify the proxy setting for Wi-Fi configuration. Possible values are: none, manual, automatic.
     * @return a wiFiProxySetting
     */
    @javax.annotation.Nullable
    public WiFiProxySetting getProxySetting() {
        return this._proxySetting;
    }
    /**
     * Gets the ssid property value. Specify the SSID of the wifi connection.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSsid() {
        return this._ssid;
    }
    /**
     * Gets the wifiSecurityType property value. Specify the Wifi Security Type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise.
     * @return a wiFiSecurityType
     */
    @javax.annotation.Nullable
    public WiFiSecurityType getWifiSecurityType() {
        return this._wifiSecurityType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("connectAutomatically", this.getConnectAutomatically());
        writer.writeBooleanValue("connectToPreferredNetwork", this.getConnectToPreferredNetwork());
        writer.writeBooleanValue("connectWhenNetworkNameIsHidden", this.getConnectWhenNetworkNameIsHidden());
        writer.writeBooleanValue("forceFIPSCompliance", this.getForceFIPSCompliance());
        writer.writeEnumValue("meteredConnectionLimit", this.getMeteredConnectionLimit());
        writer.writeStringValue("networkName", this.getNetworkName());
        writer.writeStringValue("preSharedKey", this.getPreSharedKey());
        writer.writeStringValue("proxyAutomaticConfigurationUrl", this.getProxyAutomaticConfigurationUrl());
        writer.writeStringValue("proxyManualAddress", this.getProxyManualAddress());
        writer.writeIntegerValue("proxyManualPort", this.getProxyManualPort());
        writer.writeEnumValue("proxySetting", this.getProxySetting());
        writer.writeStringValue("ssid", this.getSsid());
        writer.writeEnumValue("wifiSecurityType", this.getWifiSecurityType());
    }
    /**
     * Sets the connectAutomatically property value. Specify whether the wifi connection should connect automatically when in range.
     * @param value Value to set for the connectAutomatically property.
     * @return a void
     */
    public void setConnectAutomatically(@javax.annotation.Nullable final Boolean value) {
        this._connectAutomatically = value;
    }
    /**
     * Sets the connectToPreferredNetwork property value. Specify whether the wifi connection should connect to more preferred networks when already connected to this one.  Requires ConnectAutomatically to be true.
     * @param value Value to set for the connectToPreferredNetwork property.
     * @return a void
     */
    public void setConnectToPreferredNetwork(@javax.annotation.Nullable final Boolean value) {
        this._connectToPreferredNetwork = value;
    }
    /**
     * Sets the connectWhenNetworkNameIsHidden property value. Specify whether the wifi connection should connect automatically even when the SSID is not broadcasting.
     * @param value Value to set for the connectWhenNetworkNameIsHidden property.
     * @return a void
     */
    public void setConnectWhenNetworkNameIsHidden(@javax.annotation.Nullable final Boolean value) {
        this._connectWhenNetworkNameIsHidden = value;
    }
    /**
     * Sets the forceFIPSCompliance property value. Specify whether to force FIPS compliance.
     * @param value Value to set for the forceFIPSCompliance property.
     * @return a void
     */
    public void setForceFIPSCompliance(@javax.annotation.Nullable final Boolean value) {
        this._forceFIPSCompliance = value;
    }
    /**
     * Sets the meteredConnectionLimit property value. Specify the metered connection limit type for the wifi connection. Possible values are: unrestricted, fixed, variable.
     * @param value Value to set for the meteredConnectionLimit property.
     * @return a void
     */
    public void setMeteredConnectionLimit(@javax.annotation.Nullable final MeteredConnectionLimitType value) {
        this._meteredConnectionLimit = value;
    }
    /**
     * Sets the networkName property value. Specify the network configuration name.
     * @param value Value to set for the networkName property.
     * @return a void
     */
    public void setNetworkName(@javax.annotation.Nullable final String value) {
        this._networkName = value;
    }
    /**
     * Sets the preSharedKey property value. This is the pre-shared key for WPA Personal Wi-Fi network.
     * @param value Value to set for the preSharedKey property.
     * @return a void
     */
    public void setPreSharedKey(@javax.annotation.Nullable final String value) {
        this._preSharedKey = value;
    }
    /**
     * Sets the proxyAutomaticConfigurationUrl property value. Specify the URL for the proxy server configuration script.
     * @param value Value to set for the proxyAutomaticConfigurationUrl property.
     * @return a void
     */
    public void setProxyAutomaticConfigurationUrl(@javax.annotation.Nullable final String value) {
        this._proxyAutomaticConfigurationUrl = value;
    }
    /**
     * Sets the proxyManualAddress property value. Specify the IP address for the proxy server.
     * @param value Value to set for the proxyManualAddress property.
     * @return a void
     */
    public void setProxyManualAddress(@javax.annotation.Nullable final String value) {
        this._proxyManualAddress = value;
    }
    /**
     * Sets the proxyManualPort property value. Specify the port for the proxy server.
     * @param value Value to set for the proxyManualPort property.
     * @return a void
     */
    public void setProxyManualPort(@javax.annotation.Nullable final Integer value) {
        this._proxyManualPort = value;
    }
    /**
     * Sets the proxySetting property value. Specify the proxy setting for Wi-Fi configuration. Possible values are: none, manual, automatic.
     * @param value Value to set for the proxySetting property.
     * @return a void
     */
    public void setProxySetting(@javax.annotation.Nullable final WiFiProxySetting value) {
        this._proxySetting = value;
    }
    /**
     * Sets the ssid property value. Specify the SSID of the wifi connection.
     * @param value Value to set for the ssid property.
     * @return a void
     */
    public void setSsid(@javax.annotation.Nullable final String value) {
        this._ssid = value;
    }
    /**
     * Sets the wifiSecurityType property value. Specify the Wifi Security Type. Possible values are: open, wpaPersonal, wpaEnterprise, wep, wpa2Personal, wpa2Enterprise.
     * @param value Value to set for the wifiSecurityType property.
     * @return a void
     */
    public void setWifiSecurityType(@javax.annotation.Nullable final WiFiSecurityType value) {
        this._wifiSecurityType = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IosikEv2VpnConfiguration extends IosVpnConfiguration implements Parsable {
    /**
     * Allows the use of child security association parameters by setting all parameters to the device's default unless explicitly specified.
     */
    private Boolean allowDefaultChildSecurityAssociationParameters;
    /**
     * Allows the use of security association parameters by setting all parameters to the device's default unless explicitly specified.
     */
    private Boolean allowDefaultSecurityAssociationParameters;
    /**
     * AlwaysOn Configuration
     */
    private AppleVpnAlwaysOnConfiguration alwaysOnConfiguration;
    /**
     * Child Security Association Parameters
     */
    private IosVpnSecurityAssociationParameters childSecurityAssociationParameters;
    /**
     * The type of VPN client authentication type
     */
    private VpnClientAuthenticationType clientAuthenticationType;
    /**
     * Determine how often to check if a peer connection is still active. . Possible values are: medium, none, low, high.
     */
    private VpnDeadPeerDetectionRate deadPeerDetectionRate;
    /**
     * Disable MOBIKE
     */
    private Boolean disableMobilityAndMultihoming;
    /**
     * Disable Redirect
     */
    private Boolean disableRedirect;
    /**
     * Determines if Always on VPN is enabled
     */
    private Boolean enableAlwaysOnConfiguration;
    /**
     * Enables a best-effort revocation check; server response timeouts will not cause it to fail
     */
    private Boolean enableCertificateRevocationCheck;
    /**
     * Enables EAP only authentication
     */
    private Boolean enableEAP;
    /**
     * Enable Perfect Forward Secrecy (PFS).
     */
    private Boolean enablePerfectForwardSecrecy;
    /**
     * Enable Use Internal Subnet Attributes.
     */
    private Boolean enableUseInternalSubnetAttributes;
    /**
     * The type of VPN local identifier
     */
    private VpnLocalIdentifier localIdentifier;
    /**
     * Maximum transmission unit. Valid values 1280 to 1400
     */
    private Integer mtuSizeInBytes;
    /**
     * Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN
     */
    private String remoteIdentifier;
    /**
     * Security Association Parameters
     */
    private IosVpnSecurityAssociationParameters securityAssociationParameters;
    /**
     * Common name of the IKEv2 Server Certificate used in Server Authentication
     */
    private String serverCertificateCommonName;
    /**
     * Issuer Common name of the IKEv2 Server Certificate issuer used in Authentication
     */
    private String serverCertificateIssuerCommonName;
    /**
     * The type of certificate the VPN server will present to the VPN client for authentication. Possible values are: rsa, ecdsa256, ecdsa384, ecdsa521.
     */
    private VpnServerCertificateType serverCertificateType;
    /**
     * Used when Shared Secret Authentication is selected
     */
    private String sharedSecret;
    /**
     * The maximum TLS version to be used with EAP-TLS authentication
     */
    private String tlsMaximumVersion;
    /**
     * The minimum TLS version to be used with EAP-TLS authentication
     */
    private String tlsMinimumVersion;
    /**
     * Instantiates a new IosikEv2VpnConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IosikEv2VpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.iosikEv2VpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IosikEv2VpnConfiguration
     */
    @javax.annotation.Nonnull
    public static IosikEv2VpnConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosikEv2VpnConfiguration();
    }
    /**
     * Gets the allowDefaultChildSecurityAssociationParameters property value. Allows the use of child security association parameters by setting all parameters to the device's default unless explicitly specified.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDefaultChildSecurityAssociationParameters() {
        return this.allowDefaultChildSecurityAssociationParameters;
    }
    /**
     * Gets the allowDefaultSecurityAssociationParameters property value. Allows the use of security association parameters by setting all parameters to the device's default unless explicitly specified.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDefaultSecurityAssociationParameters() {
        return this.allowDefaultSecurityAssociationParameters;
    }
    /**
     * Gets the alwaysOnConfiguration property value. AlwaysOn Configuration
     * @return a appleVpnAlwaysOnConfiguration
     */
    @javax.annotation.Nullable
    public AppleVpnAlwaysOnConfiguration getAlwaysOnConfiguration() {
        return this.alwaysOnConfiguration;
    }
    /**
     * Gets the childSecurityAssociationParameters property value. Child Security Association Parameters
     * @return a iosVpnSecurityAssociationParameters
     */
    @javax.annotation.Nullable
    public IosVpnSecurityAssociationParameters getChildSecurityAssociationParameters() {
        return this.childSecurityAssociationParameters;
    }
    /**
     * Gets the clientAuthenticationType property value. The type of VPN client authentication type
     * @return a VpnClientAuthenticationType
     */
    @javax.annotation.Nullable
    public VpnClientAuthenticationType getClientAuthenticationType() {
        return this.clientAuthenticationType;
    }
    /**
     * Gets the deadPeerDetectionRate property value. Determine how often to check if a peer connection is still active. . Possible values are: medium, none, low, high.
     * @return a vpnDeadPeerDetectionRate
     */
    @javax.annotation.Nullable
    public VpnDeadPeerDetectionRate getDeadPeerDetectionRate() {
        return this.deadPeerDetectionRate;
    }
    /**
     * Gets the disableMobilityAndMultihoming property value. Disable MOBIKE
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableMobilityAndMultihoming() {
        return this.disableMobilityAndMultihoming;
    }
    /**
     * Gets the disableRedirect property value. Disable Redirect
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDisableRedirect() {
        return this.disableRedirect;
    }
    /**
     * Gets the enableAlwaysOnConfiguration property value. Determines if Always on VPN is enabled
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableAlwaysOnConfiguration() {
        return this.enableAlwaysOnConfiguration;
    }
    /**
     * Gets the enableCertificateRevocationCheck property value. Enables a best-effort revocation check; server response timeouts will not cause it to fail
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableCertificateRevocationCheck() {
        return this.enableCertificateRevocationCheck;
    }
    /**
     * Gets the enableEAP property value. Enables EAP only authentication
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableEAP() {
        return this.enableEAP;
    }
    /**
     * Gets the enablePerfectForwardSecrecy property value. Enable Perfect Forward Secrecy (PFS).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnablePerfectForwardSecrecy() {
        return this.enablePerfectForwardSecrecy;
    }
    /**
     * Gets the enableUseInternalSubnetAttributes property value. Enable Use Internal Subnet Attributes.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnableUseInternalSubnetAttributes() {
        return this.enableUseInternalSubnetAttributes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowDefaultChildSecurityAssociationParameters", (n) -> { this.setAllowDefaultChildSecurityAssociationParameters(n.getBooleanValue()); });
        deserializerMap.put("allowDefaultSecurityAssociationParameters", (n) -> { this.setAllowDefaultSecurityAssociationParameters(n.getBooleanValue()); });
        deserializerMap.put("alwaysOnConfiguration", (n) -> { this.setAlwaysOnConfiguration(n.getObjectValue(AppleVpnAlwaysOnConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("childSecurityAssociationParameters", (n) -> { this.setChildSecurityAssociationParameters(n.getObjectValue(IosVpnSecurityAssociationParameters::createFromDiscriminatorValue)); });
        deserializerMap.put("clientAuthenticationType", (n) -> { this.setClientAuthenticationType(n.getEnumValue(VpnClientAuthenticationType.class)); });
        deserializerMap.put("deadPeerDetectionRate", (n) -> { this.setDeadPeerDetectionRate(n.getEnumValue(VpnDeadPeerDetectionRate.class)); });
        deserializerMap.put("disableMobilityAndMultihoming", (n) -> { this.setDisableMobilityAndMultihoming(n.getBooleanValue()); });
        deserializerMap.put("disableRedirect", (n) -> { this.setDisableRedirect(n.getBooleanValue()); });
        deserializerMap.put("enableAlwaysOnConfiguration", (n) -> { this.setEnableAlwaysOnConfiguration(n.getBooleanValue()); });
        deserializerMap.put("enableCertificateRevocationCheck", (n) -> { this.setEnableCertificateRevocationCheck(n.getBooleanValue()); });
        deserializerMap.put("enableEAP", (n) -> { this.setEnableEAP(n.getBooleanValue()); });
        deserializerMap.put("enablePerfectForwardSecrecy", (n) -> { this.setEnablePerfectForwardSecrecy(n.getBooleanValue()); });
        deserializerMap.put("enableUseInternalSubnetAttributes", (n) -> { this.setEnableUseInternalSubnetAttributes(n.getBooleanValue()); });
        deserializerMap.put("localIdentifier", (n) -> { this.setLocalIdentifier(n.getEnumValue(VpnLocalIdentifier.class)); });
        deserializerMap.put("mtuSizeInBytes", (n) -> { this.setMtuSizeInBytes(n.getIntegerValue()); });
        deserializerMap.put("remoteIdentifier", (n) -> { this.setRemoteIdentifier(n.getStringValue()); });
        deserializerMap.put("securityAssociationParameters", (n) -> { this.setSecurityAssociationParameters(n.getObjectValue(IosVpnSecurityAssociationParameters::createFromDiscriminatorValue)); });
        deserializerMap.put("serverCertificateCommonName", (n) -> { this.setServerCertificateCommonName(n.getStringValue()); });
        deserializerMap.put("serverCertificateIssuerCommonName", (n) -> { this.setServerCertificateIssuerCommonName(n.getStringValue()); });
        deserializerMap.put("serverCertificateType", (n) -> { this.setServerCertificateType(n.getEnumValue(VpnServerCertificateType.class)); });
        deserializerMap.put("sharedSecret", (n) -> { this.setSharedSecret(n.getStringValue()); });
        deserializerMap.put("tlsMaximumVersion", (n) -> { this.setTlsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("tlsMinimumVersion", (n) -> { this.setTlsMinimumVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the localIdentifier property value. The type of VPN local identifier
     * @return a VpnLocalIdentifier
     */
    @javax.annotation.Nullable
    public VpnLocalIdentifier getLocalIdentifier() {
        return this.localIdentifier;
    }
    /**
     * Gets the mtuSizeInBytes property value. Maximum transmission unit. Valid values 1280 to 1400
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMtuSizeInBytes() {
        return this.mtuSizeInBytes;
    }
    /**
     * Gets the remoteIdentifier property value. Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemoteIdentifier() {
        return this.remoteIdentifier;
    }
    /**
     * Gets the securityAssociationParameters property value. Security Association Parameters
     * @return a iosVpnSecurityAssociationParameters
     */
    @javax.annotation.Nullable
    public IosVpnSecurityAssociationParameters getSecurityAssociationParameters() {
        return this.securityAssociationParameters;
    }
    /**
     * Gets the serverCertificateCommonName property value. Common name of the IKEv2 Server Certificate used in Server Authentication
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServerCertificateCommonName() {
        return this.serverCertificateCommonName;
    }
    /**
     * Gets the serverCertificateIssuerCommonName property value. Issuer Common name of the IKEv2 Server Certificate issuer used in Authentication
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServerCertificateIssuerCommonName() {
        return this.serverCertificateIssuerCommonName;
    }
    /**
     * Gets the serverCertificateType property value. The type of certificate the VPN server will present to the VPN client for authentication. Possible values are: rsa, ecdsa256, ecdsa384, ecdsa521.
     * @return a vpnServerCertificateType
     */
    @javax.annotation.Nullable
    public VpnServerCertificateType getServerCertificateType() {
        return this.serverCertificateType;
    }
    /**
     * Gets the sharedSecret property value. Used when Shared Secret Authentication is selected
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSharedSecret() {
        return this.sharedSecret;
    }
    /**
     * Gets the tlsMaximumVersion property value. The maximum TLS version to be used with EAP-TLS authentication
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTlsMaximumVersion() {
        return this.tlsMaximumVersion;
    }
    /**
     * Gets the tlsMinimumVersion property value. The minimum TLS version to be used with EAP-TLS authentication
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTlsMinimumVersion() {
        return this.tlsMinimumVersion;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowDefaultChildSecurityAssociationParameters", this.getAllowDefaultChildSecurityAssociationParameters());
        writer.writeBooleanValue("allowDefaultSecurityAssociationParameters", this.getAllowDefaultSecurityAssociationParameters());
        writer.writeObjectValue("alwaysOnConfiguration", this.getAlwaysOnConfiguration());
        writer.writeObjectValue("childSecurityAssociationParameters", this.getChildSecurityAssociationParameters());
        writer.writeEnumValue("clientAuthenticationType", this.getClientAuthenticationType());
        writer.writeEnumValue("deadPeerDetectionRate", this.getDeadPeerDetectionRate());
        writer.writeBooleanValue("disableMobilityAndMultihoming", this.getDisableMobilityAndMultihoming());
        writer.writeBooleanValue("disableRedirect", this.getDisableRedirect());
        writer.writeBooleanValue("enableAlwaysOnConfiguration", this.getEnableAlwaysOnConfiguration());
        writer.writeBooleanValue("enableCertificateRevocationCheck", this.getEnableCertificateRevocationCheck());
        writer.writeBooleanValue("enableEAP", this.getEnableEAP());
        writer.writeBooleanValue("enablePerfectForwardSecrecy", this.getEnablePerfectForwardSecrecy());
        writer.writeBooleanValue("enableUseInternalSubnetAttributes", this.getEnableUseInternalSubnetAttributes());
        writer.writeEnumValue("localIdentifier", this.getLocalIdentifier());
        writer.writeIntegerValue("mtuSizeInBytes", this.getMtuSizeInBytes());
        writer.writeStringValue("remoteIdentifier", this.getRemoteIdentifier());
        writer.writeObjectValue("securityAssociationParameters", this.getSecurityAssociationParameters());
        writer.writeStringValue("serverCertificateCommonName", this.getServerCertificateCommonName());
        writer.writeStringValue("serverCertificateIssuerCommonName", this.getServerCertificateIssuerCommonName());
        writer.writeEnumValue("serverCertificateType", this.getServerCertificateType());
        writer.writeStringValue("sharedSecret", this.getSharedSecret());
        writer.writeStringValue("tlsMaximumVersion", this.getTlsMaximumVersion());
        writer.writeStringValue("tlsMinimumVersion", this.getTlsMinimumVersion());
    }
    /**
     * Sets the allowDefaultChildSecurityAssociationParameters property value. Allows the use of child security association parameters by setting all parameters to the device's default unless explicitly specified.
     * @param value Value to set for the allowDefaultChildSecurityAssociationParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowDefaultChildSecurityAssociationParameters(@javax.annotation.Nullable final Boolean value) {
        this.allowDefaultChildSecurityAssociationParameters = value;
    }
    /**
     * Sets the allowDefaultSecurityAssociationParameters property value. Allows the use of security association parameters by setting all parameters to the device's default unless explicitly specified.
     * @param value Value to set for the allowDefaultSecurityAssociationParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowDefaultSecurityAssociationParameters(@javax.annotation.Nullable final Boolean value) {
        this.allowDefaultSecurityAssociationParameters = value;
    }
    /**
     * Sets the alwaysOnConfiguration property value. AlwaysOn Configuration
     * @param value Value to set for the alwaysOnConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlwaysOnConfiguration(@javax.annotation.Nullable final AppleVpnAlwaysOnConfiguration value) {
        this.alwaysOnConfiguration = value;
    }
    /**
     * Sets the childSecurityAssociationParameters property value. Child Security Association Parameters
     * @param value Value to set for the childSecurityAssociationParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setChildSecurityAssociationParameters(@javax.annotation.Nullable final IosVpnSecurityAssociationParameters value) {
        this.childSecurityAssociationParameters = value;
    }
    /**
     * Sets the clientAuthenticationType property value. The type of VPN client authentication type
     * @param value Value to set for the clientAuthenticationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientAuthenticationType(@javax.annotation.Nullable final VpnClientAuthenticationType value) {
        this.clientAuthenticationType = value;
    }
    /**
     * Sets the deadPeerDetectionRate property value. Determine how often to check if a peer connection is still active. . Possible values are: medium, none, low, high.
     * @param value Value to set for the deadPeerDetectionRate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeadPeerDetectionRate(@javax.annotation.Nullable final VpnDeadPeerDetectionRate value) {
        this.deadPeerDetectionRate = value;
    }
    /**
     * Sets the disableMobilityAndMultihoming property value. Disable MOBIKE
     * @param value Value to set for the disableMobilityAndMultihoming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableMobilityAndMultihoming(@javax.annotation.Nullable final Boolean value) {
        this.disableMobilityAndMultihoming = value;
    }
    /**
     * Sets the disableRedirect property value. Disable Redirect
     * @param value Value to set for the disableRedirect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisableRedirect(@javax.annotation.Nullable final Boolean value) {
        this.disableRedirect = value;
    }
    /**
     * Sets the enableAlwaysOnConfiguration property value. Determines if Always on VPN is enabled
     * @param value Value to set for the enableAlwaysOnConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableAlwaysOnConfiguration(@javax.annotation.Nullable final Boolean value) {
        this.enableAlwaysOnConfiguration = value;
    }
    /**
     * Sets the enableCertificateRevocationCheck property value. Enables a best-effort revocation check; server response timeouts will not cause it to fail
     * @param value Value to set for the enableCertificateRevocationCheck property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableCertificateRevocationCheck(@javax.annotation.Nullable final Boolean value) {
        this.enableCertificateRevocationCheck = value;
    }
    /**
     * Sets the enableEAP property value. Enables EAP only authentication
     * @param value Value to set for the enableEAP property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableEAP(@javax.annotation.Nullable final Boolean value) {
        this.enableEAP = value;
    }
    /**
     * Sets the enablePerfectForwardSecrecy property value. Enable Perfect Forward Secrecy (PFS).
     * @param value Value to set for the enablePerfectForwardSecrecy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnablePerfectForwardSecrecy(@javax.annotation.Nullable final Boolean value) {
        this.enablePerfectForwardSecrecy = value;
    }
    /**
     * Sets the enableUseInternalSubnetAttributes property value. Enable Use Internal Subnet Attributes.
     * @param value Value to set for the enableUseInternalSubnetAttributes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnableUseInternalSubnetAttributes(@javax.annotation.Nullable final Boolean value) {
        this.enableUseInternalSubnetAttributes = value;
    }
    /**
     * Sets the localIdentifier property value. The type of VPN local identifier
     * @param value Value to set for the localIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalIdentifier(@javax.annotation.Nullable final VpnLocalIdentifier value) {
        this.localIdentifier = value;
    }
    /**
     * Sets the mtuSizeInBytes property value. Maximum transmission unit. Valid values 1280 to 1400
     * @param value Value to set for the mtuSizeInBytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMtuSizeInBytes(@javax.annotation.Nullable final Integer value) {
        this.mtuSizeInBytes = value;
    }
    /**
     * Sets the remoteIdentifier property value. Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN
     * @param value Value to set for the remoteIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoteIdentifier(@javax.annotation.Nullable final String value) {
        this.remoteIdentifier = value;
    }
    /**
     * Sets the securityAssociationParameters property value. Security Association Parameters
     * @param value Value to set for the securityAssociationParameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityAssociationParameters(@javax.annotation.Nullable final IosVpnSecurityAssociationParameters value) {
        this.securityAssociationParameters = value;
    }
    /**
     * Sets the serverCertificateCommonName property value. Common name of the IKEv2 Server Certificate used in Server Authentication
     * @param value Value to set for the serverCertificateCommonName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerCertificateCommonName(@javax.annotation.Nullable final String value) {
        this.serverCertificateCommonName = value;
    }
    /**
     * Sets the serverCertificateIssuerCommonName property value. Issuer Common name of the IKEv2 Server Certificate issuer used in Authentication
     * @param value Value to set for the serverCertificateIssuerCommonName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerCertificateIssuerCommonName(@javax.annotation.Nullable final String value) {
        this.serverCertificateIssuerCommonName = value;
    }
    /**
     * Sets the serverCertificateType property value. The type of certificate the VPN server will present to the VPN client for authentication. Possible values are: rsa, ecdsa256, ecdsa384, ecdsa521.
     * @param value Value to set for the serverCertificateType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServerCertificateType(@javax.annotation.Nullable final VpnServerCertificateType value) {
        this.serverCertificateType = value;
    }
    /**
     * Sets the sharedSecret property value. Used when Shared Secret Authentication is selected
     * @param value Value to set for the sharedSecret property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedSecret(@javax.annotation.Nullable final String value) {
        this.sharedSecret = value;
    }
    /**
     * Sets the tlsMaximumVersion property value. The maximum TLS version to be used with EAP-TLS authentication
     * @param value Value to set for the tlsMaximumVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTlsMaximumVersion(@javax.annotation.Nullable final String value) {
        this.tlsMaximumVersion = value;
    }
    /**
     * Sets the tlsMinimumVersion property value. The minimum TLS version to be used with EAP-TLS authentication
     * @param value Value to set for the tlsMinimumVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTlsMinimumVersion(@javax.annotation.Nullable final String value) {
        this.tlsMinimumVersion = value;
    }
}

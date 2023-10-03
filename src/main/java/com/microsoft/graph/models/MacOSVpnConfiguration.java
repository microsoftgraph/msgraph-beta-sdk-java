package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * By providing the configurations in this profile you can instruct the Mac device to connect to desired VPN endpoint. By specifying the authentication method and security types expected by VPN endpoint you can make the VPN connection seamless for end user.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSVpnConfiguration extends AppleVpnConfiguration implements Parsable {
    /**
     * Identity certificate for client authentication when authentication method is certificate.
     */
    private MacOSCertificateProfileBase identityCertificate;
    /**
     * Instantiates a new MacOSVpnConfiguration and sets the default values.
     */
    public MacOSVpnConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSVpnConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSVpnConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MacOSVpnConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSVpnConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("identityCertificate", (n) -> { this.setIdentityCertificate(n.getObjectValue(MacOSCertificateProfileBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @return a MacOSCertificateProfileBase
     */
    @jakarta.annotation.Nullable
    public MacOSCertificateProfileBase getIdentityCertificate() {
        return this.identityCertificate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("identityCertificate", this.getIdentityCertificate());
    }
    /**
     * Sets the identityCertificate property value. Identity certificate for client authentication when authentication method is certificate.
     * @param value Value to set for the identityCertificate property.
     */
    public void setIdentityCertificate(@jakarta.annotation.Nullable final MacOSCertificateProfileBase value) {
        this.identityCertificate = value;
    }
}

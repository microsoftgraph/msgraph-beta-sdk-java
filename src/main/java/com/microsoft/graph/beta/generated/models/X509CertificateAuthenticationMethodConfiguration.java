package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class X509CertificateAuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements Parsable {
    /**
     * Instantiates a new {@link X509CertificateAuthenticationMethodConfiguration} and sets the default values.
     */
    public X509CertificateAuthenticationMethodConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.x509CertificateAuthenticationMethodConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link X509CertificateAuthenticationMethodConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static X509CertificateAuthenticationMethodConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new X509CertificateAuthenticationMethodConfiguration();
    }
    /**
     * Gets the authenticationModeConfiguration property value. Defines strong authentication configurations. This configuration includes the default authentication mode and the different rules for strong authentication bindings.
     * @return a {@link X509CertificateAuthenticationModeConfiguration}
     */
    @jakarta.annotation.Nullable
    public X509CertificateAuthenticationModeConfiguration getAuthenticationModeConfiguration() {
        return this.backingStore.get("authenticationModeConfiguration");
    }
    /**
     * Gets the certificateAuthorityScopes property value. Defines configuration to allow a group of users to use certificates from specific issuing certificate authorities to successfully authenticate.
     * @return a {@link java.util.List<X509CertificateAuthorityScope>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<X509CertificateAuthorityScope> getCertificateAuthorityScopes() {
        return this.backingStore.get("certificateAuthorityScopes");
    }
    /**
     * Gets the certificateUserBindings property value. Defines fields in the X.509 certificate that map to attributes of the Microsoft Entra user object in order to bind the certificate to the user. The priority of the object determines the order in which the binding is carried out. The first binding that matches will be used and the rest ignored.
     * @return a {@link java.util.List<X509CertificateUserBinding>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<X509CertificateUserBinding> getCertificateUserBindings() {
        return this.backingStore.get("certificateUserBindings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationModeConfiguration", (n) -> { this.setAuthenticationModeConfiguration(n.getObjectValue(X509CertificateAuthenticationModeConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("certificateAuthorityScopes", (n) -> { this.setCertificateAuthorityScopes(n.getCollectionOfObjectValues(X509CertificateAuthorityScope::createFromDiscriminatorValue)); });
        deserializerMap.put("certificateUserBindings", (n) -> { this.setCertificateUserBindings(n.getCollectionOfObjectValues(X509CertificateUserBinding::createFromDiscriminatorValue)); });
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(AuthenticationMethodTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("issuerHintsConfiguration", (n) -> { this.setIssuerHintsConfiguration(n.getObjectValue(X509CertificateIssuerHintsConfiguration::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. A collection of groups that are enabled to use the authentication method.
     * @return a {@link java.util.List<AuthenticationMethodTarget>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AuthenticationMethodTarget> getIncludeTargets() {
        return this.backingStore.get("includeTargets");
    }
    /**
     * Gets the issuerHintsConfiguration property value. Determines whether issuer(CA) hints are sent back to the client side to filter the certificates shown in certificate picker.
     * @return a {@link X509CertificateIssuerHintsConfiguration}
     */
    @jakarta.annotation.Nullable
    public X509CertificateIssuerHintsConfiguration getIssuerHintsConfiguration() {
        return this.backingStore.get("issuerHintsConfiguration");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("authenticationModeConfiguration", this.getAuthenticationModeConfiguration());
        writer.writeCollectionOfObjectValues("certificateAuthorityScopes", this.getCertificateAuthorityScopes());
        writer.writeCollectionOfObjectValues("certificateUserBindings", this.getCertificateUserBindings());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeObjectValue("issuerHintsConfiguration", this.getIssuerHintsConfiguration());
    }
    /**
     * Sets the authenticationModeConfiguration property value. Defines strong authentication configurations. This configuration includes the default authentication mode and the different rules for strong authentication bindings.
     * @param value Value to set for the authenticationModeConfiguration property.
     */
    public void setAuthenticationModeConfiguration(@jakarta.annotation.Nullable final X509CertificateAuthenticationModeConfiguration value) {
        this.backingStore.set("authenticationModeConfiguration", value);
    }
    /**
     * Sets the certificateAuthorityScopes property value. Defines configuration to allow a group of users to use certificates from specific issuing certificate authorities to successfully authenticate.
     * @param value Value to set for the certificateAuthorityScopes property.
     */
    public void setCertificateAuthorityScopes(@jakarta.annotation.Nullable final java.util.List<X509CertificateAuthorityScope> value) {
        this.backingStore.set("certificateAuthorityScopes", value);
    }
    /**
     * Sets the certificateUserBindings property value. Defines fields in the X.509 certificate that map to attributes of the Microsoft Entra user object in order to bind the certificate to the user. The priority of the object determines the order in which the binding is carried out. The first binding that matches will be used and the rest ignored.
     * @param value Value to set for the certificateUserBindings property.
     */
    public void setCertificateUserBindings(@jakarta.annotation.Nullable final java.util.List<X509CertificateUserBinding> value) {
        this.backingStore.set("certificateUserBindings", value);
    }
    /**
     * Sets the includeTargets property value. A collection of groups that are enabled to use the authentication method.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<AuthenticationMethodTarget> value) {
        this.backingStore.set("includeTargets", value);
    }
    /**
     * Sets the issuerHintsConfiguration property value. Determines whether issuer(CA) hints are sent back to the client side to filter the certificates shown in certificate picker.
     * @param value Value to set for the issuerHintsConfiguration property.
     */
    public void setIssuerHintsConfiguration(@jakarta.annotation.Nullable final X509CertificateIssuerHintsConfiguration value) {
        this.backingStore.set("issuerHintsConfiguration", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InternalDomainFederation extends SamlOrWsFedProvider implements Parsable {
    /**
     * Instantiates a new {@link InternalDomainFederation} and sets the default values.
     */
    public InternalDomainFederation() {
        super();
        this.setOdataType("#microsoft.graph.internalDomainFederation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InternalDomainFederation}
     */
    @jakarta.annotation.Nonnull
    public static InternalDomainFederation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InternalDomainFederation();
    }
    /**
     * Gets the activeSignInUri property value. URL of the endpoint used by active clients when authenticating with federated domains set up for single sign-on in Microsoft Entra ID. Corresponds to the ActiveLogOnUri property of the Set-EntraDomainFederationSettings PowerShell cmdlet.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getActiveSignInUri() {
        return this.backingStore.get("activeSignInUri");
    }
    /**
     * Gets the defaultInteractiveAuthenticationMethod property value. The defaultInteractiveAuthenticationMethod property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultInteractiveAuthenticationMethod() {
        return this.backingStore.get("defaultInteractiveAuthenticationMethod");
    }
    /**
     * Gets the federatedIdpMfaBehavior property value. Determines whether Microsoft Entra ID accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values.
     * @return a {@link FederatedIdpMfaBehavior}
     */
    @jakarta.annotation.Nullable
    public FederatedIdpMfaBehavior getFederatedIdpMfaBehavior() {
        return this.backingStore.get("federatedIdpMfaBehavior");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeSignInUri", (n) -> { this.setActiveSignInUri(n.getStringValue()); });
        deserializerMap.put("defaultInteractiveAuthenticationMethod", (n) -> { this.setDefaultInteractiveAuthenticationMethod(n.getStringValue()); });
        deserializerMap.put("federatedIdpMfaBehavior", (n) -> { this.setFederatedIdpMfaBehavior(n.getEnumValue(FederatedIdpMfaBehavior::forValue)); });
        deserializerMap.put("isSignedAuthenticationRequestRequired", (n) -> { this.setIsSignedAuthenticationRequestRequired(n.getBooleanValue()); });
        deserializerMap.put("nextSigningCertificate", (n) -> { this.setNextSigningCertificate(n.getStringValue()); });
        deserializerMap.put("openIdConnectDiscoveryEndpoint", (n) -> { this.setOpenIdConnectDiscoveryEndpoint(n.getStringValue()); });
        deserializerMap.put("passwordChangeUri", (n) -> { this.setPasswordChangeUri(n.getStringValue()); });
        deserializerMap.put("passwordResetUri", (n) -> { this.setPasswordResetUri(n.getStringValue()); });
        deserializerMap.put("promptLoginBehavior", (n) -> { this.setPromptLoginBehavior(n.getEnumValue(PromptLoginBehavior::forValue)); });
        deserializerMap.put("signingCertificateUpdateStatus", (n) -> { this.setSigningCertificateUpdateStatus(n.getObjectValue(SigningCertificateUpdateStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("signOutUri", (n) -> { this.setSignOutUri(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSignedAuthenticationRequestRequired property value. If true, when SAML authentication requests are sent to the federated SAML IdP, Microsoft Entra ID will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP aren&apos;t signed.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSignedAuthenticationRequestRequired() {
        return this.backingStore.get("isSignedAuthenticationRequestRequired");
    }
    /**
     * Gets the nextSigningCertificate property value. Fallback token signing certificate that can also be used to sign tokens, for example when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP&apos;s token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate isn&apos;t present in the federation properties after the federation service certificate has been updated.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getNextSigningCertificate() {
        return this.backingStore.get("nextSigningCertificate");
    }
    /**
     * Gets the openIdConnectDiscoveryEndpoint property value. The openIdConnectDiscoveryEndpoint property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOpenIdConnectDiscoveryEndpoint() {
        return this.backingStore.get("openIdConnectDiscoveryEndpoint");
    }
    /**
     * Gets the passwordChangeUri property value. The passwordChangeUri property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPasswordChangeUri() {
        return this.backingStore.get("passwordChangeUri");
    }
    /**
     * Gets the passwordResetUri property value. URI that clients are redirected to for resetting their password.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPasswordResetUri() {
        return this.backingStore.get("passwordResetUri");
    }
    /**
     * Gets the promptLoginBehavior property value. Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue.
     * @return a {@link PromptLoginBehavior}
     */
    @jakarta.annotation.Nullable
    public PromptLoginBehavior getPromptLoginBehavior() {
        return this.backingStore.get("promptLoginBehavior");
    }
    /**
     * Gets the signingCertificateUpdateStatus property value. Provides status and timestamp of the last update of the signing certificate.
     * @return a {@link SigningCertificateUpdateStatus}
     */
    @jakarta.annotation.Nullable
    public SigningCertificateUpdateStatus getSigningCertificateUpdateStatus() {
        return this.backingStore.get("signingCertificateUpdateStatus");
    }
    /**
     * Gets the signOutUri property value. URI that clients are redirected to when they sign out of Microsoft Entra services. Corresponds to the LogOffUri property of the Set-EntraDomainFederationSettings PowerShell cmdlet.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSignOutUri() {
        return this.backingStore.get("signOutUri");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("activeSignInUri", this.getActiveSignInUri());
        writer.writeStringValue("defaultInteractiveAuthenticationMethod", this.getDefaultInteractiveAuthenticationMethod());
        writer.writeEnumValue("federatedIdpMfaBehavior", this.getFederatedIdpMfaBehavior());
        writer.writeBooleanValue("isSignedAuthenticationRequestRequired", this.getIsSignedAuthenticationRequestRequired());
        writer.writeStringValue("nextSigningCertificate", this.getNextSigningCertificate());
        writer.writeStringValue("openIdConnectDiscoveryEndpoint", this.getOpenIdConnectDiscoveryEndpoint());
        writer.writeStringValue("passwordChangeUri", this.getPasswordChangeUri());
        writer.writeStringValue("passwordResetUri", this.getPasswordResetUri());
        writer.writeEnumValue("promptLoginBehavior", this.getPromptLoginBehavior());
        writer.writeObjectValue("signingCertificateUpdateStatus", this.getSigningCertificateUpdateStatus());
        writer.writeStringValue("signOutUri", this.getSignOutUri());
    }
    /**
     * Sets the activeSignInUri property value. URL of the endpoint used by active clients when authenticating with federated domains set up for single sign-on in Microsoft Entra ID. Corresponds to the ActiveLogOnUri property of the Set-EntraDomainFederationSettings PowerShell cmdlet.
     * @param value Value to set for the activeSignInUri property.
     */
    public void setActiveSignInUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("activeSignInUri", value);
    }
    /**
     * Sets the defaultInteractiveAuthenticationMethod property value. The defaultInteractiveAuthenticationMethod property
     * @param value Value to set for the defaultInteractiveAuthenticationMethod property.
     */
    public void setDefaultInteractiveAuthenticationMethod(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultInteractiveAuthenticationMethod", value);
    }
    /**
     * Sets the federatedIdpMfaBehavior property value. Determines whether Microsoft Entra ID accepts the MFA performed by the federated IdP when a federated user accesses an application that is governed by a conditional access policy that requires MFA. The possible values are: acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more information, see federatedIdpMfaBehavior values.
     * @param value Value to set for the federatedIdpMfaBehavior property.
     */
    public void setFederatedIdpMfaBehavior(@jakarta.annotation.Nullable final FederatedIdpMfaBehavior value) {
        this.backingStore.set("federatedIdpMfaBehavior", value);
    }
    /**
     * Sets the isSignedAuthenticationRequestRequired property value. If true, when SAML authentication requests are sent to the federated SAML IdP, Microsoft Entra ID will sign those requests using the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP aren&apos;t signed.
     * @param value Value to set for the isSignedAuthenticationRequestRequired property.
     */
    public void setIsSignedAuthenticationRequestRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSignedAuthenticationRequestRequired", value);
    }
    /**
     * Sets the nextSigningCertificate property value. Fallback token signing certificate that can also be used to sign tokens, for example when the primary signing certificate expires. Formatted as Base64 encoded strings of the public portion of the federated IdP&apos;s token signing certificate. Needs to be compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the new token signing certificate isn&apos;t present in the federation properties after the federation service certificate has been updated.
     * @param value Value to set for the nextSigningCertificate property.
     */
    public void setNextSigningCertificate(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nextSigningCertificate", value);
    }
    /**
     * Sets the openIdConnectDiscoveryEndpoint property value. The openIdConnectDiscoveryEndpoint property
     * @param value Value to set for the openIdConnectDiscoveryEndpoint property.
     */
    public void setOpenIdConnectDiscoveryEndpoint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("openIdConnectDiscoveryEndpoint", value);
    }
    /**
     * Sets the passwordChangeUri property value. The passwordChangeUri property
     * @param value Value to set for the passwordChangeUri property.
     */
    public void setPasswordChangeUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passwordChangeUri", value);
    }
    /**
     * Sets the passwordResetUri property value. URI that clients are redirected to for resetting their password.
     * @param value Value to set for the passwordResetUri property.
     */
    public void setPasswordResetUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passwordResetUri", value);
    }
    /**
     * Sets the promptLoginBehavior property value. Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication, nativeSupport, disabled, unknownFutureValue.
     * @param value Value to set for the promptLoginBehavior property.
     */
    public void setPromptLoginBehavior(@jakarta.annotation.Nullable final PromptLoginBehavior value) {
        this.backingStore.set("promptLoginBehavior", value);
    }
    /**
     * Sets the signingCertificateUpdateStatus property value. Provides status and timestamp of the last update of the signing certificate.
     * @param value Value to set for the signingCertificateUpdateStatus property.
     */
    public void setSigningCertificateUpdateStatus(@jakarta.annotation.Nullable final SigningCertificateUpdateStatus value) {
        this.backingStore.set("signingCertificateUpdateStatus", value);
    }
    /**
     * Sets the signOutUri property value. URI that clients are redirected to when they sign out of Microsoft Entra services. Corresponds to the LogOffUri property of the Set-EntraDomainFederationSettings PowerShell cmdlet.
     * @param value Value to set for the signOutUri property.
     */
    public void setSignOutUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("signOutUri", value);
    }
}

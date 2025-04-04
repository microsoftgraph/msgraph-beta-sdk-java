package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OpenIdConnectIdentityProvider extends IdentityProviderBase implements Parsable {
    /**
     * Instantiates a new {@link OpenIdConnectIdentityProvider} and sets the default values.
     */
    public OpenIdConnectIdentityProvider() {
        super();
        this.setOdataType("#microsoft.graph.openIdConnectIdentityProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OpenIdConnectIdentityProvider}
     */
    @jakarta.annotation.Nonnull
    public static OpenIdConnectIdentityProvider createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenIdConnectIdentityProvider();
    }
    /**
     * Gets the claimsMapping property value. After the OIDC provider sends an ID token back to Microsoft Entra ID, Microsoft Entra ID needs to be able to map the claims from the received token to the claims that Microsoft Entra ID recognizes and uses. This complex type captures that mapping. Required.
     * @return a {@link ClaimsMapping}
     */
    @jakarta.annotation.Nullable
    public ClaimsMapping getClaimsMapping() {
        return this.backingStore.get("claimsMapping");
    }
    /**
     * Gets the clientId property value. The client identifier for the application obtained when registering the application with the identity provider. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.backingStore.get("clientId");
    }
    /**
     * Gets the clientSecret property value. The client secret for the application obtained when registering the application with the identity provider. The clientSecret has a dependency on responseType. When responseType is code, a secret is required for the auth code exchange.When responseType is idtoken, the secret isn&apos;t required because there&apos;s no code exchange. The idtoken is returned directly from the authorization response. This is write-only. A read operation returns .
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientSecret() {
        return this.backingStore.get("clientSecret");
    }
    /**
     * Gets the domainHint property value. The domain hint can be used to skip directly to the sign-in page of the specified identity provider instead of having the user make a selection among the list of available identity providers.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDomainHint() {
        return this.backingStore.get("domainHint");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("claimsMapping", (n) -> { this.setClaimsMapping(n.getObjectValue(ClaimsMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("clientSecret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("domainHint", (n) -> { this.setDomainHint(n.getStringValue()); });
        deserializerMap.put("metadataUrl", (n) -> { this.setMetadataUrl(n.getStringValue()); });
        deserializerMap.put("responseMode", (n) -> { this.setResponseMode(n.getEnumValue(OpenIdConnectResponseMode::forValue)); });
        deserializerMap.put("responseType", (n) -> { this.setResponseType(n.getEnumSetValue(OpenIdConnectResponseTypes::forValue)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metadataUrl property value. The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service&apos;s public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration. Provide the metadata URL for the OpenID Connect identity provider you add. Read-only. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMetadataUrl() {
        return this.backingStore.get("metadataUrl");
    }
    /**
     * Gets the responseMode property value. The responseMode property
     * @return a {@link OpenIdConnectResponseMode}
     */
    @jakarta.annotation.Nullable
    public OpenIdConnectResponseMode getResponseMode() {
        return this.backingStore.get("responseMode");
    }
    /**
     * Gets the responseType property value. The responseType property
     * @return a {@link EnumSet<OpenIdConnectResponseTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<OpenIdConnectResponseTypes> getResponseType() {
        return this.backingStore.get("responseType");
    }
    /**
     * Gets the scope property value. Scope defines the information and permissions you&apos;re looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users aren&apos;t able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended, separated by a space. For more information about the scope limitations, see RFC6749 Section 3.3. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("claimsMapping", this.getClaimsMapping());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("domainHint", this.getDomainHint());
        writer.writeStringValue("metadataUrl", this.getMetadataUrl());
        writer.writeEnumValue("responseMode", this.getResponseMode());
        writer.writeEnumSetValue("responseType", this.getResponseType());
        writer.writeStringValue("scope", this.getScope());
    }
    /**
     * Sets the claimsMapping property value. After the OIDC provider sends an ID token back to Microsoft Entra ID, Microsoft Entra ID needs to be able to map the claims from the received token to the claims that Microsoft Entra ID recognizes and uses. This complex type captures that mapping. Required.
     * @param value Value to set for the claimsMapping property.
     */
    public void setClaimsMapping(@jakarta.annotation.Nullable final ClaimsMapping value) {
        this.backingStore.set("claimsMapping", value);
    }
    /**
     * Sets the clientId property value. The client identifier for the application obtained when registering the application with the identity provider. Required.
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientId", value);
    }
    /**
     * Sets the clientSecret property value. The client secret for the application obtained when registering the application with the identity provider. The clientSecret has a dependency on responseType. When responseType is code, a secret is required for the auth code exchange.When responseType is idtoken, the secret isn&apos;t required because there&apos;s no code exchange. The idtoken is returned directly from the authorization response. This is write-only. A read operation returns .
     * @param value Value to set for the clientSecret property.
     */
    public void setClientSecret(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientSecret", value);
    }
    /**
     * Sets the domainHint property value. The domain hint can be used to skip directly to the sign-in page of the specified identity provider instead of having the user make a selection among the list of available identity providers.
     * @param value Value to set for the domainHint property.
     */
    public void setDomainHint(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("domainHint", value);
    }
    /**
     * Sets the metadataUrl property value. The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service&apos;s public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration. Provide the metadata URL for the OpenID Connect identity provider you add. Read-only. Required.
     * @param value Value to set for the metadataUrl property.
     */
    public void setMetadataUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("metadataUrl", value);
    }
    /**
     * Sets the responseMode property value. The responseMode property
     * @param value Value to set for the responseMode property.
     */
    public void setResponseMode(@jakarta.annotation.Nullable final OpenIdConnectResponseMode value) {
        this.backingStore.set("responseMode", value);
    }
    /**
     * Sets the responseType property value. The responseType property
     * @param value Value to set for the responseType property.
     */
    public void setResponseType(@jakarta.annotation.Nullable final EnumSet<OpenIdConnectResponseTypes> value) {
        this.backingStore.set("responseType", value);
    }
    /**
     * Sets the scope property value. Scope defines the information and permissions you&apos;re looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users aren&apos;t able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended, separated by a space. For more information about the scope limitations, see RFC6749 Section 3.3. Required.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scope", value);
    }
}

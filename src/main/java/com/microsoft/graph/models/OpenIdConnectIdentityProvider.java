package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OpenIdConnectIdentityProvider extends IdentityProviderBase implements Parsable {
    /**
     * After the OIDC provider sends an ID token back to Azure AD, Azure AD needs to be able to map the claims from the received token to the claims that Azure AD recognizes and uses. This complex type captures that mapping. Required.
     */
    private ClaimsMapping claimsMapping;
    /**
     * The client identifier for the application obtained when registering the application with the identity provider. Required.
     */
    private String clientId;
    /**
     * The client secret for the application obtained when registering the application with the identity provider. The clientSecret has a dependency on responseType. When responseType is code, a secret is required for the auth code exchange.When responseType is id_token the secret is not required because there is no code exchange. The id_token is returned directly from the authorization response. This is write-only. A read operation returns ****.
     */
    private String clientSecret;
    /**
     * The domain hint can be used to skip directly to the sign-in page of the specified identity provider, instead of having the user make a selection among the list of available identity providers.
     */
    private String domainHint;
    /**
     * The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service's public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration. Provide the metadata URL for the OpenID Connect identity provider you add. Read-only. Required.
     */
    private String metadataUrl;
    /**
     * The responseMode property
     */
    private OpenIdConnectResponseMode responseMode;
    /**
     * The responseType property
     */
    private OpenIdConnectResponseTypes responseType;
    /**
     * Scope defines the information and permissions you are looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users are not able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended, separated by a space. For more details about the scope limitations see RFC6749 Section 3.3. Required.
     */
    private String scope;
    /**
     * Instantiates a new OpenIdConnectIdentityProvider and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OpenIdConnectIdentityProvider() {
        super();
        this.setOdataType("#microsoft.graph.openIdConnectIdentityProvider");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenIdConnectIdentityProvider
     */
    @javax.annotation.Nonnull
    public static OpenIdConnectIdentityProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenIdConnectIdentityProvider();
    }
    /**
     * Gets the claimsMapping property value. After the OIDC provider sends an ID token back to Azure AD, Azure AD needs to be able to map the claims from the received token to the claims that Azure AD recognizes and uses. This complex type captures that mapping. Required.
     * @return a claimsMapping
     */
    @javax.annotation.Nullable
    public ClaimsMapping getClaimsMapping() {
        return this.claimsMapping;
    }
    /**
     * Gets the clientId property value. The client identifier for the application obtained when registering the application with the identity provider. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Gets the clientSecret property value. The client secret for the application obtained when registering the application with the identity provider. The clientSecret has a dependency on responseType. When responseType is code, a secret is required for the auth code exchange.When responseType is id_token the secret is not required because there is no code exchange. The id_token is returned directly from the authorization response. This is write-only. A read operation returns ****.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * Gets the domainHint property value. The domain hint can be used to skip directly to the sign-in page of the specified identity provider, instead of having the user make a selection among the list of available identity providers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainHint() {
        return this.domainHint;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("claimsMapping", (n) -> { this.setClaimsMapping(n.getObjectValue(ClaimsMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("clientSecret", (n) -> { this.setClientSecret(n.getStringValue()); });
        deserializerMap.put("domainHint", (n) -> { this.setDomainHint(n.getStringValue()); });
        deserializerMap.put("metadataUrl", (n) -> { this.setMetadataUrl(n.getStringValue()); });
        deserializerMap.put("responseMode", (n) -> { this.setResponseMode(n.getEnumValue(OpenIdConnectResponseMode.class)); });
        deserializerMap.put("responseType", (n) -> { this.setResponseType(n.getEnumValue(OpenIdConnectResponseTypes.class)); });
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the metadataUrl property value. The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service's public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration. Provide the metadata URL for the OpenID Connect identity provider you add. Read-only. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetadataUrl() {
        return this.metadataUrl;
    }
    /**
     * Gets the responseMode property value. The responseMode property
     * @return a OpenIdConnectResponseMode
     */
    @javax.annotation.Nullable
    public OpenIdConnectResponseMode getResponseMode() {
        return this.responseMode;
    }
    /**
     * Gets the responseType property value. The responseType property
     * @return a OpenIdConnectResponseTypes
     */
    @javax.annotation.Nullable
    public OpenIdConnectResponseTypes getResponseType() {
        return this.responseType;
    }
    /**
     * Gets the scope property value. Scope defines the information and permissions you are looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users are not able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended, separated by a space. For more details about the scope limitations see RFC6749 Section 3.3. Required.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScope() {
        return this.scope;
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
        writer.writeObjectValue("claimsMapping", this.getClaimsMapping());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("clientSecret", this.getClientSecret());
        writer.writeStringValue("domainHint", this.getDomainHint());
        writer.writeStringValue("metadataUrl", this.getMetadataUrl());
        writer.writeEnumValue("responseMode", this.getResponseMode());
        writer.writeEnumValue("responseType", this.getResponseType());
        writer.writeStringValue("scope", this.getScope());
    }
    /**
     * Sets the claimsMapping property value. After the OIDC provider sends an ID token back to Azure AD, Azure AD needs to be able to map the claims from the received token to the claims that Azure AD recognizes and uses. This complex type captures that mapping. Required.
     * @param value Value to set for the claimsMapping property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClaimsMapping(@javax.annotation.Nullable final ClaimsMapping value) {
        this.claimsMapping = value;
    }
    /**
     * Sets the clientId property value. The client identifier for the application obtained when registering the application with the identity provider. Required.
     * @param value Value to set for the clientId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientId(@javax.annotation.Nullable final String value) {
        this.clientId = value;
    }
    /**
     * Sets the clientSecret property value. The client secret for the application obtained when registering the application with the identity provider. The clientSecret has a dependency on responseType. When responseType is code, a secret is required for the auth code exchange.When responseType is id_token the secret is not required because there is no code exchange. The id_token is returned directly from the authorization response. This is write-only. A read operation returns ****.
     * @param value Value to set for the clientSecret property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setClientSecret(@javax.annotation.Nullable final String value) {
        this.clientSecret = value;
    }
    /**
     * Sets the domainHint property value. The domain hint can be used to skip directly to the sign-in page of the specified identity provider, instead of having the user make a selection among the list of available identity providers.
     * @param value Value to set for the domainHint property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainHint(@javax.annotation.Nullable final String value) {
        this.domainHint = value;
    }
    /**
     * Sets the metadataUrl property value. The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service's public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration. Provide the metadata URL for the OpenID Connect identity provider you add. Read-only. Required.
     * @param value Value to set for the metadataUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadataUrl(@javax.annotation.Nullable final String value) {
        this.metadataUrl = value;
    }
    /**
     * Sets the responseMode property value. The responseMode property
     * @param value Value to set for the responseMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponseMode(@javax.annotation.Nullable final OpenIdConnectResponseMode value) {
        this.responseMode = value;
    }
    /**
     * Sets the responseType property value. The responseType property
     * @param value Value to set for the responseType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResponseType(@javax.annotation.Nullable final OpenIdConnectResponseTypes value) {
        this.responseType = value;
    }
    /**
     * Sets the scope property value. Scope defines the information and permissions you are looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users are not able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended, separated by a space. For more details about the scope limitations see RFC6749 Section 3.3. Required.
     * @param value Value to set for the scope property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScope(@javax.annotation.Nullable final String value) {
        this.scope = value;
    }
}

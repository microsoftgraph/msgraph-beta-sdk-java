package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OpenIdConnectProvider extends IdentityProvider implements Parsable {
    /** After the OIDC provider sends an ID token back to Azure AD, Azure AD needs to be able to map the claims from the received token to the claims that Azure AD recognizes and uses. This complex type captures that mapping. It is a required property. */
    private ClaimsMapping _claimsMapping;
    /** The domain hint can be used to skip directly to the sign-in page of the specified identity provider, instead of having the user make a selection among the list of available identity providers. */
    private String _domainHint;
    /** The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service's public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration . For the OpenID Connect identity provider you are looking to add, you will need to provide the metadata URL. It is a required property and is read only after creation. */
    private String _metadataUrl;
    /** The responseMode property */
    private OpenIdConnectResponseMode _responseMode;
    /** The responseType property */
    private OpenIdConnectResponseTypes _responseType;
    /** Scope defines the information and permissions you are looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users are not able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended separated by space. For more details about the scope limitations see RFC6749 Section 3.3. It is a required property. */
    private String _scope;
    /**
     * Instantiates a new OpenIdConnectProvider and sets the default values.
     * @return a void
     */
    public OpenIdConnectProvider() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenIdConnectProvider
     */
    @javax.annotation.Nonnull
    public static OpenIdConnectProvider createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenIdConnectProvider();
    }
    /**
     * Gets the claimsMapping property value. After the OIDC provider sends an ID token back to Azure AD, Azure AD needs to be able to map the claims from the received token to the claims that Azure AD recognizes and uses. This complex type captures that mapping. It is a required property.
     * @return a claimsMapping
     */
    @javax.annotation.Nullable
    public ClaimsMapping getClaimsMapping() {
        return this._claimsMapping;
    }
    /**
     * Gets the domainHint property value. The domain hint can be used to skip directly to the sign-in page of the specified identity provider, instead of having the user make a selection among the list of available identity providers.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainHint() {
        return this._domainHint;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OpenIdConnectProvider currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("claimsMapping", (n) -> { currentObject.setClaimsMapping(n.getObjectValue(ClaimsMapping::createFromDiscriminatorValue)); });
            this.put("domainHint", (n) -> { currentObject.setDomainHint(n.getStringValue()); });
            this.put("metadataUrl", (n) -> { currentObject.setMetadataUrl(n.getStringValue()); });
            this.put("responseMode", (n) -> { currentObject.setResponseMode(n.getEnumValue(OpenIdConnectResponseMode.class)); });
            this.put("responseType", (n) -> { currentObject.setResponseType(n.getEnumValue(OpenIdConnectResponseTypes.class)); });
            this.put("scope", (n) -> { currentObject.setScope(n.getStringValue()); });
        }};
    }
    /**
     * Gets the metadataUrl property value. The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service's public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration . For the OpenID Connect identity provider you are looking to add, you will need to provide the metadata URL. It is a required property and is read only after creation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMetadataUrl() {
        return this._metadataUrl;
    }
    /**
     * Gets the responseMode property value. The responseMode property
     * @return a openIdConnectResponseMode
     */
    @javax.annotation.Nullable
    public OpenIdConnectResponseMode getResponseMode() {
        return this._responseMode;
    }
    /**
     * Gets the responseType property value. The responseType property
     * @return a openIdConnectResponseTypes
     */
    @javax.annotation.Nullable
    public OpenIdConnectResponseTypes getResponseType() {
        return this._responseType;
    }
    /**
     * Gets the scope property value. Scope defines the information and permissions you are looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users are not able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended separated by space. For more details about the scope limitations see RFC6749 Section 3.3. It is a required property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScope() {
        return this._scope;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("claimsMapping", this.getClaimsMapping());
        writer.writeStringValue("domainHint", this.getDomainHint());
        writer.writeStringValue("metadataUrl", this.getMetadataUrl());
        writer.writeEnumValue("responseMode", this.getResponseMode());
        writer.writeEnumValue("responseType", this.getResponseType());
        writer.writeStringValue("scope", this.getScope());
    }
    /**
     * Sets the claimsMapping property value. After the OIDC provider sends an ID token back to Azure AD, Azure AD needs to be able to map the claims from the received token to the claims that Azure AD recognizes and uses. This complex type captures that mapping. It is a required property.
     * @param value Value to set for the claimsMapping property.
     * @return a void
     */
    public void setClaimsMapping(@javax.annotation.Nullable final ClaimsMapping value) {
        this._claimsMapping = value;
    }
    /**
     * Sets the domainHint property value. The domain hint can be used to skip directly to the sign-in page of the specified identity provider, instead of having the user make a selection among the list of available identity providers.
     * @param value Value to set for the domainHint property.
     * @return a void
     */
    public void setDomainHint(@javax.annotation.Nullable final String value) {
        this._domainHint = value;
    }
    /**
     * Sets the metadataUrl property value. The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service's public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration . For the OpenID Connect identity provider you are looking to add, you will need to provide the metadata URL. It is a required property and is read only after creation.
     * @param value Value to set for the metadataUrl property.
     * @return a void
     */
    public void setMetadataUrl(@javax.annotation.Nullable final String value) {
        this._metadataUrl = value;
    }
    /**
     * Sets the responseMode property value. The responseMode property
     * @param value Value to set for the responseMode property.
     * @return a void
     */
    public void setResponseMode(@javax.annotation.Nullable final OpenIdConnectResponseMode value) {
        this._responseMode = value;
    }
    /**
     * Sets the responseType property value. The responseType property
     * @param value Value to set for the responseType property.
     * @return a void
     */
    public void setResponseType(@javax.annotation.Nullable final OpenIdConnectResponseTypes value) {
        this._responseType = value;
    }
    /**
     * Sets the scope property value. Scope defines the information and permissions you are looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users are not able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended separated by space. For more details about the scope limitations see RFC6749 Section 3.3. It is a required property.
     * @param value Value to set for the scope property.
     * @return a void
     */
    public void setScope(@javax.annotation.Nullable final String value) {
        this._scope = value;
    }
}

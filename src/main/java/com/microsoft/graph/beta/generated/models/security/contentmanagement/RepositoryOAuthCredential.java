package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * OAuth authorization-code credential.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RepositoryOAuthCredential extends RepositoryAccessCredential implements Parsable {
    /**
     * Instantiates a new {@link RepositoryOAuthCredential} and sets the default values.
     */
    public RepositoryOAuthCredential() {
        super();
        this.setOdataType("#microsoft.graph.security.contentManagement.repositoryOAuthCredential");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RepositoryOAuthCredential}
     */
    @jakarta.annotation.Nonnull
    public static RepositoryOAuthCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RepositoryOAuthCredential();
    }
    /**
     * Gets the clientId property value. OAuth client id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.backingStore.get("clientId");
    }
    /**
     * Gets the code property value. OAuth authorization code.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.backingStore.get("code");
    }
    /**
     * Gets the codeVerifier property value. PKCE code verifier.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCodeVerifier() {
        return this.backingStore.get("codeVerifier");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("codeVerifier", (n) -> { this.setCodeVerifier(n.getStringValue()); });
        deserializerMap.put("redirectUri", (n) -> { this.setRedirectUri(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the redirectUri property value. OAuth redirect URI.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRedirectUri() {
        return this.backingStore.get("redirectUri");
    }
    /**
     * Gets the state property value. OAuth state value.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("codeVerifier", this.getCodeVerifier());
        writer.writeStringValue("redirectUri", this.getRedirectUri());
        writer.writeStringValue("state", this.getState());
    }
    /**
     * Sets the clientId property value. OAuth client id.
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientId", value);
    }
    /**
     * Sets the code property value. OAuth authorization code.
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("code", value);
    }
    /**
     * Sets the codeVerifier property value. PKCE code verifier.
     * @param value Value to set for the codeVerifier property.
     */
    public void setCodeVerifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("codeVerifier", value);
    }
    /**
     * Sets the redirectUri property value. OAuth redirect URI.
     * @param value Value to set for the redirectUri property.
     */
    public void setRedirectUri(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("redirectUri", value);
    }
    /**
     * Sets the state property value. OAuth state value.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("state", value);
    }
}

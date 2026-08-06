package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClientCredentialAuthenticationInfo extends AuthenticationInfo implements Parsable {
    /**
     * Instantiates a new {@link ClientCredentialAuthenticationInfo} and sets the default values.
     */
    public ClientCredentialAuthenticationInfo() {
        super();
        this.setOdataType("#microsoft.graph.clientCredentialAuthenticationInfo");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClientCredentialAuthenticationInfo}
     */
    @jakarta.annotation.Nonnull
    public static ClientCredentialAuthenticationInfo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClientCredentialAuthenticationInfo();
    }
    /**
     * Gets the accessTokenUrl property value. The accessTokenUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAccessTokenUrl() {
        return this.backingStore.get("accessTokenUrl");
    }
    /**
     * Gets the clientId property value. The clientId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return this.backingStore.get("clientId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accessTokenUrl", (n) -> { this.setAccessTokenUrl(n.getStringValue()); });
        deserializerMap.put("clientId", (n) -> { this.setClientId(n.getStringValue()); });
        deserializerMap.put("secretName", (n) -> { this.setSecretName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the secretName property value. The secretName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecretName() {
        return this.backingStore.get("secretName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("accessTokenUrl", this.getAccessTokenUrl());
        writer.writeStringValue("clientId", this.getClientId());
        writer.writeStringValue("secretName", this.getSecretName());
    }
    /**
     * Sets the accessTokenUrl property value. The accessTokenUrl property
     * @param value Value to set for the accessTokenUrl property.
     */
    public void setAccessTokenUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("accessTokenUrl", value);
    }
    /**
     * Sets the clientId property value. The clientId property
     * @param value Value to set for the clientId property.
     */
    public void setClientId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("clientId", value);
    }
    /**
     * Sets the secretName property value. The secretName property
     * @param value Value to set for the secretName property.
     */
    public void setSecretName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("secretName", value);
    }
}

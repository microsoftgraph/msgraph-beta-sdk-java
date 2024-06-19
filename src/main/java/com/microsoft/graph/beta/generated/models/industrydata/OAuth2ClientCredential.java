package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OAuth2ClientCredential extends OAuthClientCredential implements Parsable {
    /**
     * Instantiates a new {@link OAuth2ClientCredential} and sets the default values.
     */
    public OAuth2ClientCredential() {
        super();
        this.setOdataType("#microsoft.graph.industryData.oAuth2ClientCredential");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OAuth2ClientCredential}
     */
    @jakarta.annotation.Nonnull
    public static OAuth2ClientCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OAuth2ClientCredential();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("scope", (n) -> { this.setScope(n.getStringValue()); });
        deserializerMap.put("tokenUrl", (n) -> { this.setTokenUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the scope property value. The OAuth scope that is provided to the authentication process.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the tokenUrl property value. The URL with which to retrieve the token after authentication happens.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTokenUrl() {
        return this.backingStore.get("tokenUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("scope", this.getScope());
        writer.writeStringValue("tokenUrl", this.getTokenUrl());
    }
    /**
     * Sets the scope property value. The OAuth scope that is provided to the authentication process.
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the tokenUrl property value. The URL with which to retrieve the token after authentication happens.
     * @param value Value to set for the tokenUrl property.
     */
    public void setTokenUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tokenUrl", value);
    }
}

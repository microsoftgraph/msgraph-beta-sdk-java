package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSynchronizationOAuth2ClientCredentialsConnectionSettings extends EducationSynchronizationConnectionSettings implements Parsable {
    /**
     * Instantiates a new {@link EducationSynchronizationOAuth2ClientCredentialsConnectionSettings} and sets the default values.
     */
    public EducationSynchronizationOAuth2ClientCredentialsConnectionSettings() {
        super();
        this.setOdataType("#microsoft.graph.educationSynchronizationOAuth2ClientCredentialsConnectionSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationSynchronizationOAuth2ClientCredentialsConnectionSettings}
     */
    @jakarta.annotation.Nonnull
    public static EducationSynchronizationOAuth2ClientCredentialsConnectionSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationOAuth2ClientCredentialsConnectionSettings();
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
     * Gets the scope property value. The scope of the access request (see RFC6749).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScope() {
        return this.backingStore.get("scope");
    }
    /**
     * Gets the tokenUrl property value. The URL to get access tokens for the data provider.
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
     * Sets the scope property value. The scope of the access request (see RFC6749).
     * @param value Value to set for the scope property.
     */
    public void setScope(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scope", value);
    }
    /**
     * Sets the tokenUrl property value. The URL to get access tokens for the data provider.
     * @param value Value to set for the tokenUrl property.
     */
    public void setTokenUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tokenUrl", value);
    }
}

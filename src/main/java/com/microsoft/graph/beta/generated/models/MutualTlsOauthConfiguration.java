package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MutualTlsOauthConfiguration extends TrustedCertificateAuthorityBase implements Parsable {
    /**
     * Instantiates a new {@link MutualTlsOauthConfiguration} and sets the default values.
     */
    public MutualTlsOauthConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.mutualTlsOauthConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MutualTlsOauthConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static MutualTlsOauthConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MutualTlsOauthConfiguration();
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("tlsClientAuthParameter", (n) -> { this.setTlsClientAuthParameter(n.getEnumValue(TlsClientRegistrationMetadata::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tlsClientAuthParameter property value. The tlsClientAuthParameter property
     * @return a {@link TlsClientRegistrationMetadata}
     */
    @jakarta.annotation.Nullable
    public TlsClientRegistrationMetadata getTlsClientAuthParameter() {
        return this.backingStore.get("tlsClientAuthParameter");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("tlsClientAuthParameter", this.getTlsClientAuthParameter());
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the tlsClientAuthParameter property value. The tlsClientAuthParameter property
     * @param value Value to set for the tlsClientAuthParameter property.
     */
    public void setTlsClientAuthParameter(@jakarta.annotation.Nullable final TlsClientRegistrationMetadata value) {
        this.backingStore.set("tlsClientAuthParameter", value);
    }
}

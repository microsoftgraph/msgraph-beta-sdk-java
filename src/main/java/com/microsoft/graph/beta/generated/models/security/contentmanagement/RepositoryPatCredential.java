package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Personal access token credential.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RepositoryPatCredential extends RepositoryAccessCredential implements Parsable {
    /**
     * Instantiates a new {@link RepositoryPatCredential} and sets the default values.
     */
    public RepositoryPatCredential() {
        super();
        this.setOdataType("#microsoft.graph.security.contentManagement.repositoryPatCredential");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RepositoryPatCredential}
     */
    @jakarta.annotation.Nonnull
    public static RepositoryPatCredential createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RepositoryPatCredential();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the token property value. Personal access token.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.backingStore.get("token");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("token", this.getToken());
    }
    /**
     * Sets the token property value. Personal access token.
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("token", value);
    }
}

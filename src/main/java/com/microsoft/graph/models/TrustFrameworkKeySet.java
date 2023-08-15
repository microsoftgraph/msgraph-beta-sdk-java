package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TrustFrameworkKeySet extends Entity implements Parsable {
    /**
     * A collection of the keys.
     */
    private java.util.List<TrustFrameworkKey> keys;
    /**
     * Instantiates a new trustFrameworkKeySet and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public TrustFrameworkKeySet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a trustFrameworkKeySet
     */
    @jakarta.annotation.Nonnull
    public static TrustFrameworkKeySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrustFrameworkKeySet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("keys", (n) -> { this.setKeys(n.getCollectionOfObjectValues(TrustFrameworkKey::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keys property value. A collection of the keys.
     * @return a trustFrameworkKey
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrustFrameworkKey> getKeys() {
        return this.keys;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("keys", this.getKeys());
    }
    /**
     * Sets the keys property value. A collection of the keys.
     * @param value Value to set for the keys property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setKeys(@jakarta.annotation.Nullable final java.util.List<TrustFrameworkKey> value) {
        this.keys = value;
    }
}

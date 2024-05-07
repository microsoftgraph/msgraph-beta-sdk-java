package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TrustFrameworkKeySet extends Entity implements Parsable {
    /**
     * Instantiates a new {@link TrustFrameworkKeySet} and sets the default values.
     */
    public TrustFrameworkKeySet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TrustFrameworkKeySet}
     */
    @jakarta.annotation.Nonnull
    public static TrustFrameworkKeySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrustFrameworkKeySet();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("keys", (n) -> { this.setKeys(n.getCollectionOfObjectValues(TrustFrameworkKey::createFromDiscriminatorValue)); });
        deserializerMap.put("keys_v2", (n) -> { this.setKeysV2(n.getCollectionOfObjectValues(TrustFrameworkKeyV2::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keys property value. A collection of the keys.
     * @return a {@link java.util.List<TrustFrameworkKey>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrustFrameworkKey> getKeys() {
        return this.backingStore.get("keys");
    }
    /**
     * Gets the keys_v2 property value. A collection of the keys.
     * @return a {@link java.util.List<TrustFrameworkKeyV2>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TrustFrameworkKeyV2> getKeysV2() {
        return this.backingStore.get("keysV2");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("keys", this.getKeys());
        writer.writeCollectionOfObjectValues("keys_v2", this.getKeysV2());
    }
    /**
     * Sets the keys property value. A collection of the keys.
     * @param value Value to set for the keys property.
     */
    public void setKeys(@jakarta.annotation.Nullable final java.util.List<TrustFrameworkKey> value) {
        this.backingStore.set("keys", value);
    }
    /**
     * Sets the keys_v2 property value. A collection of the keys.
     * @param value Value to set for the keys_v2 property.
     */
    public void setKeysV2(@jakarta.annotation.Nullable final java.util.List<TrustFrameworkKeyV2> value) {
        this.backingStore.set("keysV2", value);
    }
}

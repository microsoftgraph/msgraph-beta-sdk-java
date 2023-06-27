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
     * Instantiates a new TrustFrameworkKeySet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TrustFrameworkKeySet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TrustFrameworkKeySet
     */
    @javax.annotation.Nonnull
    public static TrustFrameworkKeySet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrustFrameworkKeySet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("keys", (n) -> { this.setKeys(n.getCollectionOfObjectValues(TrustFrameworkKey::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the keys property value. A collection of the keys.
     * @return a trustFrameworkKey
     */
    @javax.annotation.Nullable
    public java.util.List<TrustFrameworkKey> getKeys() {
        return this.keys;
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
        writer.writeCollectionOfObjectValues("keys", this.getKeys());
    }
    /**
     * Sets the keys property value. A collection of the keys.
     * @param value Value to set for the keys property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeys(@javax.annotation.Nullable final java.util.List<TrustFrameworkKey> value) {
        this.keys = value;
    }
}

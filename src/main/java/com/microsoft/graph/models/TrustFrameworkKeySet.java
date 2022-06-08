package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the trustFramework singleton. */
public class TrustFrameworkKeySet extends Entity implements Parsable {
    /** A collection of the keys. */
    private java.util.List<TrustFrameworkKey> _keys;
    /**
     * Instantiates a new trustFrameworkKeySet and sets the default values.
     * @return a void
     */
    public TrustFrameworkKeySet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a trustFrameworkKeySet
     */
    @javax.annotation.Nonnull
    public static TrustFrameworkKeySet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrustFrameworkKeySet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TrustFrameworkKeySet currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("keys", (n) -> { currentObject.setKeys(n.getCollectionOfObjectValues(TrustFrameworkKey::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the keys property value. A collection of the keys.
     * @return a trustFrameworkKey
     */
    @javax.annotation.Nullable
    public java.util.List<TrustFrameworkKey> getKeys() {
        return this._keys;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setKeys(@javax.annotation.Nullable final java.util.List<TrustFrameworkKey> value) {
        this._keys = value;
    }
}

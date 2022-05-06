package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TrustFramework implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** The keySets property  */
    private java.util.List<TrustFrameworkKeySet> _keySets;
    /** The policies property  */
    private java.util.List<TrustFrameworkPolicy> _policies;
    /**
     * Instantiates a new TrustFramework and sets the default values.
     * @return a void
     */
    public TrustFramework() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TrustFramework
     */
    @javax.annotation.Nonnull
    public static TrustFramework createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TrustFramework();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TrustFramework currentObject = this;
        return new HashMap<>(2) {{
            this.put("keySets", (n) -> { currentObject.setKeySets(n.getCollectionOfObjectValues(TrustFrameworkKeySet::createFromDiscriminatorValue)); });
            this.put("policies", (n) -> { currentObject.setPolicies(n.getCollectionOfObjectValues(TrustFrameworkPolicy::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the keySets property value. The keySets property
     * @return a trustFrameworkKeySet
     */
    @javax.annotation.Nullable
    public java.util.List<TrustFrameworkKeySet> getKeySets() {
        return this._keySets;
    }
    /**
     * Gets the policies property value. The policies property
     * @return a trustFrameworkPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<TrustFrameworkPolicy> getPolicies() {
        return this._policies;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("keySets", this.getKeySets());
        writer.writeCollectionOfObjectValues("policies", this.getPolicies());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the keySets property value. The keySets property
     * @param value Value to set for the keySets property.
     * @return a void
     */
    public void setKeySets(@javax.annotation.Nullable final java.util.List<TrustFrameworkKeySet> value) {
        this._keySets = value;
    }
    /**
     * Sets the policies property value. The policies property
     * @param value Value to set for the policies property.
     * @return a void
     */
    public void setPolicies(@javax.annotation.Nullable final java.util.List<TrustFrameworkPolicy> value) {
        this._policies = value;
    }
}

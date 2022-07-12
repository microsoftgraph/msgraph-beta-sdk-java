package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class TriggerTypesRoot extends Entity implements Parsable {
    /** The retentionEventTypes property */
    private java.util.List<RetentionEventType> _retentionEventTypes;
    /**
     * Instantiates a new triggerTypesRoot and sets the default values.
     * @return a void
     */
    public TriggerTypesRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a triggerTypesRoot
     */
    @javax.annotation.Nonnull
    public static TriggerTypesRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TriggerTypesRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TriggerTypesRoot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("retentionEventTypes", (n) -> { currentObject.setRetentionEventTypes(n.getCollectionOfObjectValues(RetentionEventType::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the retentionEventTypes property value. The retentionEventTypes property
     * @return a retentionEventType
     */
    @javax.annotation.Nullable
    public java.util.List<RetentionEventType> getRetentionEventTypes() {
        return this._retentionEventTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("retentionEventTypes", this.getRetentionEventTypes());
    }
    /**
     * Sets the retentionEventTypes property value. The retentionEventTypes property
     * @param value Value to set for the retentionEventTypes property.
     * @return a void
     */
    public void setRetentionEventTypes(@javax.annotation.Nullable final java.util.List<RetentionEventType> value) {
        this._retentionEventTypes = value;
    }
}

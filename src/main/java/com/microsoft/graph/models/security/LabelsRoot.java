package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class LabelsRoot extends Entity implements Parsable {
    /** The retentionLabels property */
    private java.util.List<RetentionLabel> _retentionLabels;
    /**
     * Instantiates a new labelsRoot and sets the default values.
     * @return a void
     */
    public LabelsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a labelsRoot
     */
    @javax.annotation.Nonnull
    public static LabelsRoot createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new LabelsRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final LabelsRoot currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("retentionLabels", (n) -> { currentObject.setRetentionLabels(n.getCollectionOfObjectValues(RetentionLabel::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the retentionLabels property value. The retentionLabels property
     * @return a retentionLabel
     */
    @javax.annotation.Nullable
    public java.util.List<RetentionLabel> getRetentionLabels() {
        return this._retentionLabels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("retentionLabels", this.getRetentionLabels());
    }
    /**
     * Sets the retentionLabels property value. The retentionLabels property
     * @param value Value to set for the retentionLabels property.
     * @return a void
     */
    public void setRetentionLabels(@javax.annotation.Nullable final java.util.List<RetentionLabel> value) {
        this._retentionLabels = value;
    }
}

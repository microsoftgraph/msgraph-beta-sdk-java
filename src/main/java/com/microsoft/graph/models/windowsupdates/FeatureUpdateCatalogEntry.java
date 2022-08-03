package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FeatureUpdateCatalogEntry extends SoftwareUpdateCatalogEntry implements Parsable {
    /** The version of the feature update. Read-only. */
    private String _version;
    /**
     * Instantiates a new FeatureUpdateCatalogEntry and sets the default values.
     * @return a void
     */
    public FeatureUpdateCatalogEntry() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.featureUpdateCatalogEntry");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FeatureUpdateCatalogEntry
     */
    @javax.annotation.Nonnull
    public static FeatureUpdateCatalogEntry createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FeatureUpdateCatalogEntry();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FeatureUpdateCatalogEntry currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the version property value. The version of the feature update. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the version property value. The version of the feature update. Read-only.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}

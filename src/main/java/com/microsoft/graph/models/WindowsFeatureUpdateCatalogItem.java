package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsFeatureUpdateCatalogItem extends WindowsUpdateCatalogItem implements Parsable {
    /** The feature update version */
    private String _version;
    /**
     * Instantiates a new WindowsFeatureUpdateCatalogItem and sets the default values.
     * @return a void
     */
    public WindowsFeatureUpdateCatalogItem() {
        super();
        this.setOdataType("#microsoft.graph.windowsFeatureUpdateCatalogItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsFeatureUpdateCatalogItem
     */
    @javax.annotation.Nonnull
    public static WindowsFeatureUpdateCatalogItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsFeatureUpdateCatalogItem();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsFeatureUpdateCatalogItem currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the version property value. The feature update version
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
     * Sets the version property value. The feature update version
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}

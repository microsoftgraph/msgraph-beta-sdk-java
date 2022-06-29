package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnsupportedDeviceConfiguration extends DeviceConfiguration implements Parsable {
    /** Details describing why the entity is unsupported. This collection can contain a maximum of 1000 elements. */
    private java.util.List<UnsupportedDeviceConfigurationDetail> _details;
    /** The type of entity that would be returned otherwise. */
    private String _originalEntityTypeName;
    /**
     * Instantiates a new UnsupportedDeviceConfiguration and sets the default values.
     * @return a void
     */
    public UnsupportedDeviceConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnsupportedDeviceConfiguration
     */
    @javax.annotation.Nonnull
    public static UnsupportedDeviceConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnsupportedDeviceConfiguration();
    }
    /**
     * Gets the details property value. Details describing why the entity is unsupported. This collection can contain a maximum of 1000 elements.
     * @return a unsupportedDeviceConfigurationDetail
     */
    @javax.annotation.Nullable
    public java.util.List<UnsupportedDeviceConfigurationDetail> getDetails() {
        return this._details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UnsupportedDeviceConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("details", (n) -> { currentObject.setDetails(n.getCollectionOfObjectValues(UnsupportedDeviceConfigurationDetail::createFromDiscriminatorValue)); });
            this.put("originalEntityTypeName", (n) -> { currentObject.setOriginalEntityTypeName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the originalEntityTypeName property value. The type of entity that would be returned otherwise.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOriginalEntityTypeName() {
        return this._originalEntityTypeName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeStringValue("originalEntityTypeName", this.getOriginalEntityTypeName());
    }
    /**
     * Sets the details property value. Details describing why the entity is unsupported. This collection can contain a maximum of 1000 elements.
     * @param value Value to set for the details property.
     * @return a void
     */
    public void setDetails(@javax.annotation.Nullable final java.util.List<UnsupportedDeviceConfigurationDetail> value) {
        this._details = value;
    }
    /**
     * Sets the originalEntityTypeName property value. The type of entity that would be returned otherwise.
     * @param value Value to set for the originalEntityTypeName property.
     * @return a void
     */
    public void setOriginalEntityTypeName(@javax.annotation.Nullable final String value) {
        this._originalEntityTypeName = value;
    }
}

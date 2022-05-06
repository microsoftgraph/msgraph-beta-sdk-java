package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemAddress extends ItemFacet implements Parsable {
    /** The detail property  */
    private PhysicalAddress _detail;
    /** Friendly name the user has assigned to this address.  */
    private String _displayName;
    /** The geocoordinates of the address.  */
    private GeoCoordinates _geoCoordinates;
    /**
     * Instantiates a new itemAddress and sets the default values.
     * @return a void
     */
    public ItemAddress() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemAddress
     */
    @javax.annotation.Nonnull
    public static ItemAddress createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemAddress();
    }
    /**
     * Gets the detail property value. The detail property
     * @return a physicalAddress
     */
    @javax.annotation.Nullable
    public PhysicalAddress getDetail() {
        return this._detail;
    }
    /**
     * Gets the displayName property value. Friendly name the user has assigned to this address.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ItemAddress currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("detail", (n) -> { currentObject.setDetail(n.getObjectValue(PhysicalAddress::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("geoCoordinates", (n) -> { currentObject.setGeoCoordinates(n.getObjectValue(GeoCoordinates::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the geoCoordinates property value. The geocoordinates of the address.
     * @return a geoCoordinates
     */
    @javax.annotation.Nullable
    public GeoCoordinates getGeoCoordinates() {
        return this._geoCoordinates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("detail", this.getDetail());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("geoCoordinates", this.getGeoCoordinates());
    }
    /**
     * Sets the detail property value. The detail property
     * @param value Value to set for the detail property.
     * @return a void
     */
    public void setDetail(@javax.annotation.Nullable final PhysicalAddress value) {
        this._detail = value;
    }
    /**
     * Sets the displayName property value. Friendly name the user has assigned to this address.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the geoCoordinates property value. The geocoordinates of the address.
     * @param value Value to set for the geoCoordinates property.
     * @return a void
     */
    public void setGeoCoordinates(@javax.annotation.Nullable final GeoCoordinates value) {
        this._geoCoordinates = value;
    }
}

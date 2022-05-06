package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkPeripheral extends Entity implements Parsable {
    /** Display name for the peripheral.  */
    private String _displayName;
    /** The product ID of the device. Each product from a vendor has its own ID.  */
    private String _productId;
    /** The unique identifier for the vendor of the device. Each vendor has a unique ID.  */
    private String _vendorId;
    /**
     * Instantiates a new teamworkPeripheral and sets the default values.
     * @return a void
     */
    public TeamworkPeripheral() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkPeripheral
     */
    @javax.annotation.Nonnull
    public static TeamworkPeripheral createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkPeripheral();
    }
    /**
     * Gets the displayName property value. Display name for the peripheral.
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
        final TeamworkPeripheral currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("productId", (n) -> { currentObject.setProductId(n.getStringValue()); });
            this.put("vendorId", (n) -> { currentObject.setVendorId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the productId property value. The product ID of the device. Each product from a vendor has its own ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductId() {
        return this._productId;
    }
    /**
     * Gets the vendorId property value. The unique identifier for the vendor of the device. Each vendor has a unique ID.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVendorId() {
        return this._vendorId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("productId", this.getProductId());
        writer.writeStringValue("vendorId", this.getVendorId());
    }
    /**
     * Sets the displayName property value. Display name for the peripheral.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the productId property value. The product ID of the device. Each product from a vendor has its own ID.
     * @param value Value to set for the productId property.
     * @return a void
     */
    public void setProductId(@javax.annotation.Nullable final String value) {
        this._productId = value;
    }
    /**
     * Sets the vendorId property value. The unique identifier for the vendor of the device. Each vendor has a unique ID.
     * @param value Value to set for the vendorId property.
     * @return a void
     */
    public void setVendorId(@javax.annotation.Nullable final String value) {
        this._vendorId = value;
    }
}

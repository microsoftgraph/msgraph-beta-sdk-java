package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** VPN Route definition. */
public class VpnRoute implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Destination prefix (IPv4/v6 address). */
    private String _destinationPrefix;
    /** Prefix size. (1-32). Valid values 1 to 32 */
    private Integer _prefixSize;
    /**
     * Instantiates a new vpnRoute and sets the default values.
     * @return a void
     */
    public VpnRoute() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a vpnRoute
     */
    @javax.annotation.Nonnull
    public static VpnRoute createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VpnRoute();
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
     * Gets the destinationPrefix property value. Destination prefix (IPv4/v6 address).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationPrefix() {
        return this._destinationPrefix;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final VpnRoute currentObject = this;
        return new HashMap<>(2) {{
            this.put("destinationPrefix", (n) -> { currentObject.setDestinationPrefix(n.getStringValue()); });
            this.put("prefixSize", (n) -> { currentObject.setPrefixSize(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the prefixSize property value. Prefix size. (1-32). Valid values 1 to 32
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPrefixSize() {
        return this._prefixSize;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("destinationPrefix", this.getDestinationPrefix());
        writer.writeIntegerValue("prefixSize", this.getPrefixSize());
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
     * Sets the destinationPrefix property value. Destination prefix (IPv4/v6 address).
     * @param value Value to set for the destinationPrefix property.
     * @return a void
     */
    public void setDestinationPrefix(@javax.annotation.Nullable final String value) {
        this._destinationPrefix = value;
    }
    /**
     * Sets the prefixSize property value. Prefix size. (1-32). Valid values 1 to 32
     * @param value Value to set for the prefixSize property.
     * @return a void
     */
    public void setPrefixSize(@javax.annotation.Nullable final Integer value) {
        this._prefixSize = value;
    }
}

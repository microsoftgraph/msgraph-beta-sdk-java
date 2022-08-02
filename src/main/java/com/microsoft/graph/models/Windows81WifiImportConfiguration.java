package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows81WifiImportConfiguration extends DeviceConfiguration implements Parsable {
    /** Payload. (UTF8 encoded byte array). This is the XML file saved on the device you used to connect to the Wi-Fi endpoint. */
    private byte[] _payload;
    /** Payload file name (.xml). */
    private String _payloadFileName;
    /** Profile name displayed in the UI. */
    private String _profileName;
    /**
     * Instantiates a new Windows81WifiImportConfiguration and sets the default values.
     * @return a void
     */
    public Windows81WifiImportConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows81WifiImportConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows81WifiImportConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows81WifiImportConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81WifiImportConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows81WifiImportConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("payload", (n) -> { currentObject.setPayload(n.getByteArrayValue()); });
            this.put("payloadFileName", (n) -> { currentObject.setPayloadFileName(n.getStringValue()); });
            this.put("profileName", (n) -> { currentObject.setProfileName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the payload property value. Payload. (UTF8 encoded byte array). This is the XML file saved on the device you used to connect to the Wi-Fi endpoint.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getPayload() {
        return this._payload;
    }
    /**
     * Gets the payloadFileName property value. Payload file name (.xml).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadFileName() {
        return this._payloadFileName;
    }
    /**
     * Gets the profileName property value. Profile name displayed in the UI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileName() {
        return this._profileName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("payload", this.getPayload());
        writer.writeStringValue("payloadFileName", this.getPayloadFileName());
        writer.writeStringValue("profileName", this.getProfileName());
    }
    /**
     * Sets the payload property value. Payload. (UTF8 encoded byte array). This is the XML file saved on the device you used to connect to the Wi-Fi endpoint.
     * @param value Value to set for the payload property.
     * @return a void
     */
    public void setPayload(@javax.annotation.Nullable final byte[] value) {
        this._payload = value;
    }
    /**
     * Sets the payloadFileName property value. Payload file name (.xml).
     * @param value Value to set for the payloadFileName property.
     * @return a void
     */
    public void setPayloadFileName(@javax.annotation.Nullable final String value) {
        this._payloadFileName = value;
    }
    /**
     * Sets the profileName property value. Profile name displayed in the UI.
     * @param value Value to set for the profileName property.
     * @return a void
     */
    public void setProfileName(@javax.annotation.Nullable final String value) {
        this._profileName = value;
    }
}

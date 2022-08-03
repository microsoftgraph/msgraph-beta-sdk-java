package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows10XWifiConfiguration extends DeviceManagementResourceAccessProfileBase implements Parsable {
    /** ID to the Authentication Certificate */
    private String _authenticationCertificateId;
    /** Custom XML commands that configures the VPN connection. (UTF8 byte encoding) */
    private byte[] _customXml;
    /** Custom Xml file name. */
    private String _customXmlFileName;
    /**
     * Instantiates a new Windows10XWifiConfiguration and sets the default values.
     * @return a void
     */
    public Windows10XWifiConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows10XWifiConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10XWifiConfiguration
     */
    @javax.annotation.Nonnull
    public static Windows10XWifiConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10XWifiConfiguration();
    }
    /**
     * Gets the authenticationCertificateId property value. ID to the Authentication Certificate
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAuthenticationCertificateId() {
        return this._authenticationCertificateId;
    }
    /**
     * Gets the customXml property value. Custom XML commands that configures the VPN connection. (UTF8 byte encoding)
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getCustomXml() {
        return this._customXml;
    }
    /**
     * Gets the customXmlFileName property value. Custom Xml file name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomXmlFileName() {
        return this._customXmlFileName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Windows10XWifiConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("authenticationCertificateId", (n) -> { currentObject.setAuthenticationCertificateId(n.getStringValue()); });
            this.put("customXml", (n) -> { currentObject.setCustomXml(n.getByteArrayValue()); });
            this.put("customXmlFileName", (n) -> { currentObject.setCustomXmlFileName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("authenticationCertificateId", this.getAuthenticationCertificateId());
        writer.writeByteArrayValue("customXml", this.getCustomXml());
        writer.writeStringValue("customXmlFileName", this.getCustomXmlFileName());
    }
    /**
     * Sets the authenticationCertificateId property value. ID to the Authentication Certificate
     * @param value Value to set for the authenticationCertificateId property.
     * @return a void
     */
    public void setAuthenticationCertificateId(@javax.annotation.Nullable final String value) {
        this._authenticationCertificateId = value;
    }
    /**
     * Sets the customXml property value. Custom XML commands that configures the VPN connection. (UTF8 byte encoding)
     * @param value Value to set for the customXml property.
     * @return a void
     */
    public void setCustomXml(@javax.annotation.Nullable final byte[] value) {
        this._customXml = value;
    }
    /**
     * Sets the customXmlFileName property value. Custom Xml file name.
     * @param value Value to set for the customXmlFileName property.
     * @return a void
     */
    public void setCustomXmlFileName(@javax.annotation.Nullable final String value) {
        this._customXmlFileName = value;
    }
}

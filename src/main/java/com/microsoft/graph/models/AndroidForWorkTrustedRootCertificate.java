package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidForWorkTrustedRootCertificate extends DeviceConfiguration implements Parsable {
    /** File name to display in UI. */
    private String _certFileName;
    /** Trusted Root Certificate */
    private byte[] _trustedRootCertificate;
    /**
     * Instantiates a new androidForWorkTrustedRootCertificate and sets the default values.
     * @return a void
     */
    public AndroidForWorkTrustedRootCertificate() {
        super();
        this.setOdataType("#microsoft.graph.androidForWorkTrustedRootCertificate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidForWorkTrustedRootCertificate
     */
    @javax.annotation.Nonnull
    public static AndroidForWorkTrustedRootCertificate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidForWorkTrustedRootCertificate();
    }
    /**
     * Gets the certFileName property value. File name to display in UI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCertFileName() {
        return this._certFileName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AndroidForWorkTrustedRootCertificate currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("certFileName", (n) -> { currentObject.setCertFileName(n.getStringValue()); });
            this.put("trustedRootCertificate", (n) -> { currentObject.setTrustedRootCertificate(n.getByteArrayValue()); });
        }};
    }
    /**
     * Gets the trustedRootCertificate property value. Trusted Root Certificate
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getTrustedRootCertificate() {
        return this._trustedRootCertificate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("certFileName", this.getCertFileName());
        writer.writeByteArrayValue("trustedRootCertificate", this.getTrustedRootCertificate());
    }
    /**
     * Sets the certFileName property value. File name to display in UI.
     * @param value Value to set for the certFileName property.
     * @return a void
     */
    public void setCertFileName(@javax.annotation.Nullable final String value) {
        this._certFileName = value;
    }
    /**
     * Sets the trustedRootCertificate property value. Trusted Root Certificate
     * @param value Value to set for the trustedRootCertificate property.
     * @return a void
     */
    public void setTrustedRootCertificate(@javax.annotation.Nullable final byte[] value) {
        this._trustedRootCertificate = value;
    }
}

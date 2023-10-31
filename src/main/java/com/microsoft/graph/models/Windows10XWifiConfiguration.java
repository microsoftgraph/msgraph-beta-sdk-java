package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/**
 * Windows X WifiXml configuration profile
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10XWifiConfiguration extends DeviceManagementResourceAccessProfileBase implements Parsable {
    /**
     * ID to the Authentication Certificate
     */
    private UUID authenticationCertificateId;
    /**
     * Custom XML commands that configures the VPN connection. (UTF8 byte encoding)
     */
    private byte[] customXml;
    /**
     * Custom Xml file name.
     */
    private String customXmlFileName;
    /**
     * Instantiates a new Windows10XWifiConfiguration and sets the default values.
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
    @jakarta.annotation.Nonnull
    public static Windows10XWifiConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10XWifiConfiguration();
    }
    /**
     * Gets the authenticationCertificateId property value. ID to the Authentication Certificate
     * @return a UUID
     */
    @jakarta.annotation.Nullable
    public UUID getAuthenticationCertificateId() {
        return this.authenticationCertificateId;
    }
    /**
     * Gets the customXml property value. Custom XML commands that configures the VPN connection. (UTF8 byte encoding)
     * @return a byte[]
     */
    @jakarta.annotation.Nullable
    public byte[] getCustomXml() {
        return this.customXml;
    }
    /**
     * Gets the customXmlFileName property value. Custom Xml file name.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCustomXmlFileName() {
        return this.customXmlFileName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authenticationCertificateId", (n) -> { this.setAuthenticationCertificateId(n.getUUIDValue()); });
        deserializerMap.put("customXml", (n) -> { this.setCustomXml(n.getByteArrayValue()); });
        deserializerMap.put("customXmlFileName", (n) -> { this.setCustomXmlFileName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeUUIDValue("authenticationCertificateId", this.getAuthenticationCertificateId());
        writer.writeByteArrayValue("customXml", this.getCustomXml());
        writer.writeStringValue("customXmlFileName", this.getCustomXmlFileName());
    }
    /**
     * Sets the authenticationCertificateId property value. ID to the Authentication Certificate
     * @param value Value to set for the authenticationCertificateId property.
     */
    public void setAuthenticationCertificateId(@jakarta.annotation.Nullable final UUID value) {
        this.authenticationCertificateId = value;
    }
    /**
     * Sets the customXml property value. Custom XML commands that configures the VPN connection. (UTF8 byte encoding)
     * @param value Value to set for the customXml property.
     */
    public void setCustomXml(@jakarta.annotation.Nullable final byte[] value) {
        this.customXml = value;
    }
    /**
     * Sets the customXmlFileName property value. Custom Xml file name.
     * @param value Value to set for the customXmlFileName property.
     */
    public void setCustomXmlFileName(@jakarta.annotation.Nullable final String value) {
        this.customXmlFileName = value;
    }
}

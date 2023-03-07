package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Windows81WifiImportConfiguration extends DeviceConfiguration implements Parsable {
    /** Payload. (UTF8 encoded byte array). This is the XML file saved on the device you used to connect to the Wi-Fi endpoint. */
    private byte[] payload;
    /** Payload file name (.xml). */
    private String payloadFileName;
    /** Profile name displayed in the UI. */
    private String profileName;
    /**
     * Instantiates a new Windows81WifiImportConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getByteArrayValue()); });
        deserializerMap.put("payloadFileName", (n) -> { this.setPayloadFileName(n.getStringValue()); });
        deserializerMap.put("profileName", (n) -> { this.setProfileName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payload property value. Payload. (UTF8 encoded byte array). This is the XML file saved on the device you used to connect to the Wi-Fi endpoint.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getPayload() {
        return this.payload;
    }
    /**
     * Gets the payloadFileName property value. Payload file name (.xml).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPayloadFileName() {
        return this.payloadFileName;
    }
    /**
     * Gets the profileName property value. Profile name displayed in the UI.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileName() {
        return this.profileName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
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
    @javax.annotation.Nonnull
    public void setPayload(@javax.annotation.Nullable final byte[] value) {
        this.payload = value;
    }
    /**
     * Sets the payloadFileName property value. Payload file name (.xml).
     * @param value Value to set for the payloadFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPayloadFileName(@javax.annotation.Nullable final String value) {
        this.payloadFileName = value;
    }
    /**
     * Sets the profileName property value. Profile name displayed in the UI.
     * @param value Value to set for the profileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileName(@javax.annotation.Nullable final String value) {
        this.profileName = value;
    }
}

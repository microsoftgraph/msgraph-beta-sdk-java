package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows 8.1+ Wi-Fi import configuration. By configuring this profile you can instruct Windows 8.1 (and later) devices to connect to desired Wi-Fi endpoint. Connect a Windows 8.1 device to the desired Wi-Fi network and extract the XML from that device to later embed into this Wi-Fi profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows81WifiImportConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link Windows81WifiImportConfiguration} and sets the default values.
     */
    public Windows81WifiImportConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windows81WifiImportConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Windows81WifiImportConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static Windows81WifiImportConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows81WifiImportConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("payload", (n) -> { this.setPayload(n.getByteArrayValue()); });
        deserializerMap.put("payloadFileName", (n) -> { this.setPayloadFileName(n.getStringValue()); });
        deserializerMap.put("profileName", (n) -> { this.setProfileName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the payload property value. Payload. (UTF8 encoded byte array). This is the XML file saved on the device you used to connect to the Wi-Fi endpoint.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getPayload() {
        return this.backingStore.get("payload");
    }
    /**
     * Gets the payloadFileName property value. Payload file name (.xml).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPayloadFileName() {
        return this.backingStore.get("payloadFileName");
    }
    /**
     * Gets the profileName property value. Profile name displayed in the UI.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProfileName() {
        return this.backingStore.get("profileName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeByteArrayValue("payload", this.getPayload());
        writer.writeStringValue("payloadFileName", this.getPayloadFileName());
        writer.writeStringValue("profileName", this.getProfileName());
    }
    /**
     * Sets the payload property value. Payload. (UTF8 encoded byte array). This is the XML file saved on the device you used to connect to the Wi-Fi endpoint.
     * @param value Value to set for the payload property.
     */
    public void setPayload(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("payload", value);
    }
    /**
     * Sets the payloadFileName property value. Payload file name (.xml).
     * @param value Value to set for the payloadFileName property.
     */
    public void setPayloadFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("payloadFileName", value);
    }
    /**
     * Sets the profileName property value. Profile name displayed in the UI.
     * @param value Value to set for the profileName property.
     */
    public void setProfileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("profileName", value);
    }
}

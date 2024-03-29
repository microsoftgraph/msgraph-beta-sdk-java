package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This topic provides descriptions of the declared methods, properties and relationships exposed by the macOSCustomAppConfiguration resource.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSCustomAppConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link MacOSCustomAppConfiguration} and sets the default values.
     */
    public MacOSCustomAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSCustomAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MacOSCustomAppConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static MacOSCustomAppConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSCustomAppConfiguration();
    }
    /**
     * Gets the bundleId property value. Bundle id for targeting.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getBundleId() {
        return this.backingStore.get("bundleId");
    }
    /**
     * Gets the configurationXml property value. Configuration xml. (UTF8 encoded byte array)
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getConfigurationXml() {
        return this.backingStore.get("configurationXml");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("configurationXml", (n) -> { this.setConfigurationXml(n.getByteArrayValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. Configuration file name (.plist
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileName() {
        return this.backingStore.get("fileName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeByteArrayValue("configurationXml", this.getConfigurationXml());
        writer.writeStringValue("fileName", this.getFileName());
    }
    /**
     * Sets the bundleId property value. Bundle id for targeting.
     * @param value Value to set for the bundleId property.
     */
    public void setBundleId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("bundleId", value);
    }
    /**
     * Sets the configurationXml property value. Configuration xml. (UTF8 encoded byte array)
     * @param value Value to set for the configurationXml property.
     */
    public void setConfigurationXml(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("configurationXml", value);
    }
    /**
     * Sets the fileName property value. Configuration file name (.plist
     * @param value Value to set for the fileName property.
     */
    public void setFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileName", value);
    }
}

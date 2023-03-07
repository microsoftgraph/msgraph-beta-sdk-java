package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSCustomAppConfiguration extends DeviceConfiguration implements Parsable {
    /** Bundle id for targeting. */
    private String bundleId;
    /** Configuration xml. (UTF8 encoded byte array) */
    private byte[] configurationXml;
    /** Configuration file name (.plist */
    private String fileName;
    /**
     * Instantiates a new MacOSCustomAppConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSCustomAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSCustomAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSCustomAppConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSCustomAppConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSCustomAppConfiguration();
    }
    /**
     * Gets the bundleId property value. Bundle id for targeting.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBundleId() {
        return this.bundleId;
    }
    /**
     * Gets the configurationXml property value. Configuration xml. (UTF8 encoded byte array)
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getConfigurationXml() {
        return this.configurationXml;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("bundleId", (n) -> { this.setBundleId(n.getStringValue()); });
        deserializerMap.put("configurationXml", (n) -> { this.setConfigurationXml(n.getByteArrayValue()); });
        deserializerMap.put("fileName", (n) -> { this.setFileName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileName property value. Configuration file name (.plist
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this.fileName;
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
        writer.writeStringValue("bundleId", this.getBundleId());
        writer.writeByteArrayValue("configurationXml", this.getConfigurationXml());
        writer.writeStringValue("fileName", this.getFileName());
    }
    /**
     * Sets the bundleId property value. Bundle id for targeting.
     * @param value Value to set for the bundleId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this.bundleId = value;
    }
    /**
     * Sets the configurationXml property value. Configuration xml. (UTF8 encoded byte array)
     * @param value Value to set for the configurationXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationXml(@javax.annotation.Nullable final byte[] value) {
        this.configurationXml = value;
    }
    /**
     * Sets the fileName property value. Configuration file name (.plist
     * @param value Value to set for the fileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileName(@javax.annotation.Nullable final String value) {
        this.fileName = value;
    }
}

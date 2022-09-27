package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSCustomAppConfiguration extends DeviceConfiguration implements Parsable {
    /** Bundle id for targeting. */
    private String _bundleId;
    /** Configuration xml. (UTF8 encoded byte array) */
    private byte[] _configurationXml;
    /** Configuration file name (.plist */
    private String _fileName;
    /**
     * Instantiates a new MacOSCustomAppConfiguration and sets the default values.
     * @return a void
     */
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
        return this._bundleId;
    }
    /**
     * Gets the configurationXml property value. Configuration xml. (UTF8 encoded byte array)
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getConfigurationXml() {
        return this._configurationXml;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSCustomAppConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("bundleId", (n) -> { currentObject.setBundleId(n.getStringValue()); });
            this.put("configurationXml", (n) -> { currentObject.setConfigurationXml(n.getByteArrayValue()); });
            this.put("fileName", (n) -> { currentObject.setFileName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileName property value. Configuration file name (.plist
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileName() {
        return this._fileName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setBundleId(@javax.annotation.Nullable final String value) {
        this._bundleId = value;
    }
    /**
     * Sets the configurationXml property value. Configuration xml. (UTF8 encoded byte array)
     * @param value Value to set for the configurationXml property.
     * @return a void
     */
    public void setConfigurationXml(@javax.annotation.Nullable final byte[] value) {
        this._configurationXml = value;
    }
    /**
     * Sets the fileName property value. Configuration file name (.plist
     * @param value Value to set for the fileName property.
     * @return a void
     */
    public void setFileName(@javax.annotation.Nullable final String value) {
        this._fileName = value;
    }
}

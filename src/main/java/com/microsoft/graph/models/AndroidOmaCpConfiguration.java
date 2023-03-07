package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidOmaCpConfiguration extends DeviceConfiguration implements Parsable {
    /** Configuration XML that will be applied to the device. When it is read, it only provides a placeholder string since the original data is encrypted and stored. */
    private byte[] configurationXml;
    /**
     * Instantiates a new AndroidOmaCpConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidOmaCpConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.androidOmaCpConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidOmaCpConfiguration
     */
    @javax.annotation.Nonnull
    public static AndroidOmaCpConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidOmaCpConfiguration();
    }
    /**
     * Gets the configurationXml property value. Configuration XML that will be applied to the device. When it is read, it only provides a placeholder string since the original data is encrypted and stored.
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
        deserializerMap.put("configurationXml", (n) -> { this.setConfigurationXml(n.getByteArrayValue()); });
        return deserializerMap;
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
        writer.writeByteArrayValue("configurationXml", this.getConfigurationXml());
    }
    /**
     * Sets the configurationXml property value. Configuration XML that will be applied to the device. When it is read, it only provides a placeholder string since the original data is encrypted and stored.
     * @param value Value to set for the configurationXml property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setConfigurationXml(@javax.annotation.Nullable final byte[] value) {
        this.configurationXml = value;
    }
}

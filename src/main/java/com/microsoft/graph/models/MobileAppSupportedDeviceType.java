package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device properties
 */
public class MobileAppSupportedDeviceType implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Maximum OS version
     */
    private String maximumOperatingSystemVersion;
    /**
     * Minimum OS version
     */
    private String minimumOperatingSystemVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Device type.
     */
    private DeviceType type;
    /**
     * Instantiates a new mobileAppSupportedDeviceType and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MobileAppSupportedDeviceType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileAppSupportedDeviceType
     */
    @javax.annotation.Nonnull
    public static MobileAppSupportedDeviceType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileAppSupportedDeviceType();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("maximumOperatingSystemVersion", (n) -> { this.setMaximumOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("minimumOperatingSystemVersion", (n) -> { this.setMinimumOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(DeviceType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the maximumOperatingSystemVersion property value. Maximum OS version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMaximumOperatingSystemVersion() {
        return this.maximumOperatingSystemVersion;
    }
    /**
     * Gets the minimumOperatingSystemVersion property value. Minimum OS version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMinimumOperatingSystemVersion() {
        return this.minimumOperatingSystemVersion;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the type property value. Device type.
     * @return a deviceType
     */
    @javax.annotation.Nullable
    public DeviceType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("maximumOperatingSystemVersion", this.getMaximumOperatingSystemVersion());
        writer.writeStringValue("minimumOperatingSystemVersion", this.getMinimumOperatingSystemVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the maximumOperatingSystemVersion property value. Maximum OS version
     * @param value Value to set for the maximumOperatingSystemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this.maximumOperatingSystemVersion = value;
    }
    /**
     * Sets the minimumOperatingSystemVersion property value. Minimum OS version
     * @param value Value to set for the minimumOperatingSystemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this.minimumOperatingSystemVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the type property value. Device type.
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final DeviceType value) {
        this.type = value;
    }
}

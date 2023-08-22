package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceManagementConfigurationSettingOccurrence implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Maximum times setting can be set on device.
     */
    private Integer maxDeviceOccurrence;
    /**
     * Minimum times setting can be set on device. A MinDeviceOccurrence of 0 means setting is optional
     */
    private Integer minDeviceOccurrence;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new deviceManagementConfigurationSettingOccurrence and sets the default values.
     */
    public DeviceManagementConfigurationSettingOccurrence() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingOccurrence
     */
    @jakarta.annotation.Nonnull
    public static DeviceManagementConfigurationSettingOccurrence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingOccurrence();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("maxDeviceOccurrence", (n) -> { this.setMaxDeviceOccurrence(n.getIntegerValue()); });
        deserializerMap.put("minDeviceOccurrence", (n) -> { this.setMinDeviceOccurrence(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the maxDeviceOccurrence property value. Maximum times setting can be set on device.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMaxDeviceOccurrence() {
        return this.maxDeviceOccurrence;
    }
    /**
     * Gets the minDeviceOccurrence property value. Minimum times setting can be set on device. A MinDeviceOccurrence of 0 means setting is optional
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getMinDeviceOccurrence() {
        return this.minDeviceOccurrence;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("maxDeviceOccurrence", this.getMaxDeviceOccurrence());
        writer.writeIntegerValue("minDeviceOccurrence", this.getMinDeviceOccurrence());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the maxDeviceOccurrence property value. Maximum times setting can be set on device.
     * @param value Value to set for the maxDeviceOccurrence property.
     */
    public void setMaxDeviceOccurrence(@jakarta.annotation.Nullable final Integer value) {
        this.maxDeviceOccurrence = value;
    }
    /**
     * Sets the minDeviceOccurrence property value. Minimum times setting can be set on device. A MinDeviceOccurrence of 0 means setting is optional
     * @param value Value to set for the minDeviceOccurrence property.
     */
    public void setMinDeviceOccurrence(@jakarta.annotation.Nullable final Integer value) {
        this.minDeviceOccurrence = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

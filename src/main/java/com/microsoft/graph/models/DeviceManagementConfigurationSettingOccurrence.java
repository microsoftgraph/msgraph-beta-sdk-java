package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementConfigurationSettingOccurrence implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Maximum times setting can be set on device. */
    private Integer _maxDeviceOccurrence;
    /** Minimum times setting can be set on device. A MinDeviceOccurrence of 0 means setting is optional */
    private Integer _minDeviceOccurrence;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new deviceManagementConfigurationSettingOccurrence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationSettingOccurrence() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementConfigurationSettingOccurrence");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationSettingOccurrence
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationSettingOccurrence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationSettingOccurrence();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementConfigurationSettingOccurrence currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(3) {{
            this.put("maxDeviceOccurrence", (n) -> { currentObject.setMaxDeviceOccurrence(n.getIntegerValue()); });
            this.put("minDeviceOccurrence", (n) -> { currentObject.setMinDeviceOccurrence(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the maxDeviceOccurrence property value. Maximum times setting can be set on device.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaxDeviceOccurrence() {
        return this._maxDeviceOccurrence;
    }
    /**
     * Gets the minDeviceOccurrence property value. Minimum times setting can be set on device. A MinDeviceOccurrence of 0 means setting is optional
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinDeviceOccurrence() {
        return this._minDeviceOccurrence;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("maxDeviceOccurrence", this.getMaxDeviceOccurrence());
        writer.writeIntegerValue("minDeviceOccurrence", this.getMinDeviceOccurrence());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the maxDeviceOccurrence property value. Maximum times setting can be set on device.
     * @param value Value to set for the maxDeviceOccurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaxDeviceOccurrence(@javax.annotation.Nullable final Integer value) {
        this._maxDeviceOccurrence = value;
    }
    /**
     * Sets the minDeviceOccurrence property value. Minimum times setting can be set on device. A MinDeviceOccurrence of 0 means setting is optional
     * @param value Value to set for the minDeviceOccurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinDeviceOccurrence(@javax.annotation.Nullable final Integer value) {
        this._minDeviceOccurrence = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}

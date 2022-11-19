package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RotateBitLockerKeysDeviceActionResult extends DeviceActionResult implements Parsable {
    /** RotateBitLockerKeys action error code */
    private Integer _errorCode;
    /**
     * Instantiates a new RotateBitLockerKeysDeviceActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RotateBitLockerKeysDeviceActionResult() {
        super();
        this.setOdataType("#microsoft.graph.rotateBitLockerKeysDeviceActionResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RotateBitLockerKeysDeviceActionResult
     */
    @javax.annotation.Nonnull
    public static RotateBitLockerKeysDeviceActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RotateBitLockerKeysDeviceActionResult();
    }
    /**
     * Gets the errorCode property value. RotateBitLockerKeys action error code
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final RotateBitLockerKeysDeviceActionResult currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorCode", (n) -> { currentObject.setErrorCode(n.getIntegerValue()); });
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
        writer.writeIntegerValue("errorCode", this.getErrorCode());
    }
    /**
     * Sets the errorCode property value. RotateBitLockerKeys action error code
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this._errorCode = value;
    }
}

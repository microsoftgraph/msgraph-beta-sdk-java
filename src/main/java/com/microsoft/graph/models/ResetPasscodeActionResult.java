package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Reset passcode action result
 */
public class ResetPasscodeActionResult extends DeviceActionResult implements Parsable {
    /**
     * RotateBitLockerKeys action error code. Valid values 0 to 2147483647
     */
    private Integer errorCode;
    /**
     * Newly generated passcode for the device
     */
    private String passcode;
    /**
     * Instantiates a new resetPasscodeActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ResetPasscodeActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a resetPasscodeActionResult
     */
    @javax.annotation.Nonnull
    public static ResetPasscodeActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ResetPasscodeActionResult();
    }
    /**
     * Gets the errorCode property value. RotateBitLockerKeys action error code. Valid values 0 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passcode property value. Newly generated passcode for the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasscode() {
        return this.passcode;
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
        writer.writeStringValue("passcode", this.getPasscode());
    }
    /**
     * Sets the errorCode property value. RotateBitLockerKeys action error code. Valid values 0 to 2147483647
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this.errorCode = value;
    }
    /**
     * Sets the passcode property value. Newly generated passcode for the device
     * @param value Value to set for the passcode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscode(@javax.annotation.Nullable final String value) {
        this.passcode = value;
    }
}

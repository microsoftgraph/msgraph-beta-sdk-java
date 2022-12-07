package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AndroidDeviceComplianceLocalActionLockDeviceWithPasscode extends AndroidDeviceComplianceLocalActionBase implements Parsable {
    /** Passcode to reset to Android device. This property is read-only. */
    private String _passcode;
    /** Number of sign in failures before wiping device, the value can be 4-11. Valid values 4 to 11 */
    private Integer _passcodeSignInFailureCountBeforeWipe;
    /**
     * Instantiates a new AndroidDeviceComplianceLocalActionLockDeviceWithPasscode and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AndroidDeviceComplianceLocalActionLockDeviceWithPasscode() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceComplianceLocalActionLockDeviceWithPasscode
     */
    @javax.annotation.Nonnull
    public static AndroidDeviceComplianceLocalActionLockDeviceWithPasscode createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceComplianceLocalActionLockDeviceWithPasscode();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        deserializerMap.put("passcodeSignInFailureCountBeforeWipe", (n) -> { this.setPasscodeSignInFailureCountBeforeWipe(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passcode property value. Passcode to reset to Android device. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPasscode() {
        return this._passcode;
    }
    /**
     * Gets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures before wiping device, the value can be 4-11. Valid values 4 to 11
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPasscodeSignInFailureCountBeforeWipe() {
        return this._passcodeSignInFailureCountBeforeWipe;
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
        writer.writeIntegerValue("passcodeSignInFailureCountBeforeWipe", this.getPasscodeSignInFailureCountBeforeWipe());
    }
    /**
     * Sets the passcode property value. Passcode to reset to Android device. This property is read-only.
     * @param value Value to set for the passcode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscode(@javax.annotation.Nullable final String value) {
        this._passcode = value;
    }
    /**
     * Sets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures before wiping device, the value can be 4-11. Valid values 4 to 11
     * @param value Value to set for the passcodeSignInFailureCountBeforeWipe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPasscodeSignInFailureCountBeforeWipe(@javax.annotation.Nullable final Integer value) {
        this._passcodeSignInFailureCountBeforeWipe = value;
    }
}

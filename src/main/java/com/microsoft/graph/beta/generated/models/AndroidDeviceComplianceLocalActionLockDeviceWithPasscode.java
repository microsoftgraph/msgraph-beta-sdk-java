package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Local Action Lock Device with Passcode Configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AndroidDeviceComplianceLocalActionLockDeviceWithPasscode extends AndroidDeviceComplianceLocalActionBase implements Parsable {
    /**
     * Instantiates a new AndroidDeviceComplianceLocalActionLockDeviceWithPasscode and sets the default values.
     */
    public AndroidDeviceComplianceLocalActionLockDeviceWithPasscode() {
        super();
        this.setOdataType("#microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AndroidDeviceComplianceLocalActionLockDeviceWithPasscode
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceComplianceLocalActionLockDeviceWithPasscode createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceComplianceLocalActionLockDeviceWithPasscode();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("passcode", (n) -> { this.setPasscode(n.getStringValue()); });
        deserializerMap.put("passcodeSignInFailureCountBeforeWipe", (n) -> { this.setPasscodeSignInFailureCountBeforeWipe(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the passcode property value. Passcode to reset to Android device. This property is read-only.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPasscode() {
        return this.backingStore.get("passcode");
    }
    /**
     * Gets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures before wiping device, the value can be 4-11. Valid values 4 to 11
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasscodeSignInFailureCountBeforeWipe() {
        return this.backingStore.get("passcodeSignInFailureCountBeforeWipe");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("passcodeSignInFailureCountBeforeWipe", this.getPasscodeSignInFailureCountBeforeWipe());
    }
    /**
     * Sets the passcode property value. Passcode to reset to Android device. This property is read-only.
     * @param value Value to set for the passcode property.
     */
    public void setPasscode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("passcode", value);
    }
    /**
     * Sets the passcodeSignInFailureCountBeforeWipe property value. Number of sign in failures before wiping device, the value can be 4-11. Valid values 4 to 11
     * @param value Value to set for the passcodeSignInFailureCountBeforeWipe property.
     */
    public void setPasscodeSignInFailureCountBeforeWipe(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("passcodeSignInFailureCountBeforeWipe", value);
    }
}

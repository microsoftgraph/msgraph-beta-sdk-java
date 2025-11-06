package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum of the supported types of Apple delivery protocols, representing the available protocols to deliver payloads to Apple devices
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AppleDeviceDeliveryProtocol implements ValuedEnum {
    /** Default. Set if the client hasn&apos;t specified a value for an entity. Indicates the payload will be delivered to devices using Intune&apos;s default delivery protocol, which is Mobile Device Management (MDM). This protocol is not specific to the apps payload. */
    Default("default"),
    /** Indicates the payload will be delivered to devices using the Mobile Device Management (MDM) protocol. This protocol is not specific to the apps payload. */
    MobileDeviceManagement("mobileDeviceManagement"),
    /** Indicates the payload will be delivered to devices using the Declarative Device Management (DDM) protocol. This protocol is not specific to the apps payload. */
    DeclarativeDeviceManagement("declarativeDeviceManagement"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AppleDeviceDeliveryProtocol(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AppleDeviceDeliveryProtocol forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "mobileDeviceManagement": return MobileDeviceManagement;
            case "declarativeDeviceManagement": return DeclarativeDeviceManagement;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileDeviceManagementPolicy extends MobilityManagementPolicy implements Parsable {
    /**
     * Instantiates a new {@link MobileDeviceManagementPolicy} and sets the default values.
     */
    public MobileDeviceManagementPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileDeviceManagementPolicy}
     */
    @jakarta.annotation.Nonnull
    public static MobileDeviceManagementPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileDeviceManagementPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isMdmEnrollmentDuringRegistrationDisabled", (n) -> { this.setIsMdmEnrollmentDuringRegistrationDisabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isMdmEnrollmentDuringRegistrationDisabled property value. Controls the option if users in an automatic enrollment configuration on Microsoft Entra registered devices are prompted to MDM enroll their device in the Entra account registration flow.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMdmEnrollmentDuringRegistrationDisabled() {
        return this.backingStore.get("isMdmEnrollmentDuringRegistrationDisabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isMdmEnrollmentDuringRegistrationDisabled", this.getIsMdmEnrollmentDuringRegistrationDisabled());
    }
    /**
     * Sets the isMdmEnrollmentDuringRegistrationDisabled property value. Controls the option if users in an automatic enrollment configuration on Microsoft Entra registered devices are prompted to MDM enroll their device in the Entra account registration flow.
     * @param value Value to set for the isMdmEnrollmentDuringRegistrationDisabled property.
     */
    public void setIsMdmEnrollmentDuringRegistrationDisabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMdmEnrollmentDuringRegistrationDisabled", value);
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Enrollment Configuration that restricts the types of devices a user can enroll for a single platform
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceEnrollmentPlatformRestrictionConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Restrictions based on platform, platform operating system version, and device ownership
     */
    private DeviceEnrollmentPlatformRestriction platformRestriction;
    /**
     * This enum indicates the platform type for which the enrollment restriction applies.
     */
    private EnrollmentRestrictionPlatformType platformType;
    /**
     * Instantiates a new DeviceEnrollmentPlatformRestrictionConfiguration and sets the default values.
     */
    public DeviceEnrollmentPlatformRestrictionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentPlatformRestrictionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentPlatformRestrictionConfiguration
     */
    @jakarta.annotation.Nonnull
    public static DeviceEnrollmentPlatformRestrictionConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentPlatformRestrictionConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("platformRestriction", (n) -> { this.setPlatformRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("platformType", (n) -> { this.setPlatformType(n.getEnumValue(EnrollmentRestrictionPlatformType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the platformRestriction property value. Restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getPlatformRestriction() {
        return this.platformRestriction;
    }
    /**
     * Gets the platformType property value. This enum indicates the platform type for which the enrollment restriction applies.
     * @return a EnrollmentRestrictionPlatformType
     */
    @jakarta.annotation.Nullable
    public EnrollmentRestrictionPlatformType getPlatformType() {
        return this.platformType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("platformRestriction", this.getPlatformRestriction());
        writer.writeEnumValue("platformType", this.getPlatformType());
    }
    /**
     * Sets the platformRestriction property value. Restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the platformRestriction property.
     */
    public void setPlatformRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.platformRestriction = value;
    }
    /**
     * Sets the platformType property value. This enum indicates the platform type for which the enrollment restriction applies.
     * @param value Value to set for the platformType property.
     */
    public void setPlatformType(@jakarta.annotation.Nullable final EnrollmentRestrictionPlatformType value) {
        this.platformType = value;
    }
}

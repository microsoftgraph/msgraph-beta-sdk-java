package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceEnrollmentPlatformRestrictionConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /** Restrictions based on platform, platform operating system version, and device ownership */
    private DeviceEnrollmentPlatformRestriction _platformRestriction;
    /** This enum indicates the platform type for which the enrollment restriction applies. */
    private EnrollmentRestrictionPlatformType _platformType;
    /**
     * Instantiates a new DeviceEnrollmentPlatformRestrictionConfiguration and sets the default values.
     * @return a void
     */
    public DeviceEnrollmentPlatformRestrictionConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentPlatformRestrictionConfiguration
     */
    @javax.annotation.Nonnull
    public static DeviceEnrollmentPlatformRestrictionConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentPlatformRestrictionConfiguration();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceEnrollmentPlatformRestrictionConfiguration currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("platformRestriction", (n) -> { currentObject.setPlatformRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
            this.put("platformType", (n) -> { currentObject.setPlatformType(n.getEnumValue(EnrollmentRestrictionPlatformType.class)); });
        }};
    }
    /**
     * Gets the platformRestriction property value. Restrictions based on platform, platform operating system version, and device ownership
     * @return a deviceEnrollmentPlatformRestriction
     */
    @javax.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getPlatformRestriction() {
        return this._platformRestriction;
    }
    /**
     * Gets the platformType property value. This enum indicates the platform type for which the enrollment restriction applies.
     * @return a enrollmentRestrictionPlatformType
     */
    @javax.annotation.Nullable
    public EnrollmentRestrictionPlatformType getPlatformType() {
        return this._platformType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("platformRestriction", this.getPlatformRestriction());
        writer.writeEnumValue("platformType", this.getPlatformType());
    }
    /**
     * Sets the platformRestriction property value. Restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the platformRestriction property.
     * @return a void
     */
    public void setPlatformRestriction(@javax.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this._platformRestriction = value;
    }
    /**
     * Sets the platformType property value. This enum indicates the platform type for which the enrollment restriction applies.
     * @param value Value to set for the platformType property.
     * @return a void
     */
    public void setPlatformType(@javax.annotation.Nullable final EnrollmentRestrictionPlatformType value) {
        this._platformType = value;
    }
}

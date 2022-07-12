package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AppleOwnerTypeEnrollmentType implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The enrollmentType property */
    private AppleUserInitiatedEnrollmentType _enrollmentType;
    /** Owner type of device. */
    private ManagedDeviceOwnerType _ownerType;
    /**
     * Instantiates a new appleOwnerTypeEnrollmentType and sets the default values.
     * @return a void
     */
    public AppleOwnerTypeEnrollmentType() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a appleOwnerTypeEnrollmentType
     */
    @javax.annotation.Nonnull
    public static AppleOwnerTypeEnrollmentType createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AppleOwnerTypeEnrollmentType();
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
     * Gets the enrollmentType property value. The enrollmentType property
     * @return a appleUserInitiatedEnrollmentType
     */
    @javax.annotation.Nullable
    public AppleUserInitiatedEnrollmentType getEnrollmentType() {
        return this._enrollmentType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AppleOwnerTypeEnrollmentType currentObject = this;
        return new HashMap<>(2) {{
            this.put("enrollmentType", (n) -> { currentObject.setEnrollmentType(n.getEnumValue(AppleUserInitiatedEnrollmentType.class)); });
            this.put("ownerType", (n) -> { currentObject.setOwnerType(n.getEnumValue(ManagedDeviceOwnerType.class)); });
        }};
    }
    /**
     * Gets the ownerType property value. Owner type of device.
     * @return a managedDeviceOwnerType
     */
    @javax.annotation.Nullable
    public ManagedDeviceOwnerType getOwnerType() {
        return this._ownerType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("enrollmentType", this.getEnrollmentType());
        writer.writeEnumValue("ownerType", this.getOwnerType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the enrollmentType property value. The enrollmentType property
     * @param value Value to set for the enrollmentType property.
     * @return a void
     */
    public void setEnrollmentType(@javax.annotation.Nullable final AppleUserInitiatedEnrollmentType value) {
        this._enrollmentType = value;
    }
    /**
     * Sets the ownerType property value. Owner type of device.
     * @param value Value to set for the ownerType property.
     * @return a void
     */
    public void setOwnerType(@javax.annotation.Nullable final ManagedDeviceOwnerType value) {
        this._ownerType = value;
    }
}

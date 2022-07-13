package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class FileEvidence extends AlertEvidence implements Parsable {
    /** The detectionStatus property */
    private DetectionStatus _detectionStatus;
    /** The fileDetails property */
    private FileDetails _fileDetails;
    /** The mdeDeviceId property */
    private String _mdeDeviceId;
    /**
     * Instantiates a new FileEvidence and sets the default values.
     * @return a void
     */
    public FileEvidence() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FileEvidence
     */
    @javax.annotation.Nonnull
    public static FileEvidence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileEvidence();
    }
    /**
     * Gets the detectionStatus property value. The detectionStatus property
     * @return a detectionStatus
     */
    @javax.annotation.Nullable
    public DetectionStatus getDetectionStatus() {
        return this._detectionStatus;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final FileEvidence currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("detectionStatus", (n) -> { currentObject.setDetectionStatus(n.getEnumValue(DetectionStatus.class)); });
            this.put("fileDetails", (n) -> { currentObject.setFileDetails(n.getObjectValue(FileDetails::createFromDiscriminatorValue)); });
            this.put("mdeDeviceId", (n) -> { currentObject.setMdeDeviceId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileDetails property value. The fileDetails property
     * @return a fileDetails
     */
    @javax.annotation.Nullable
    public FileDetails getFileDetails() {
        return this._fileDetails;
    }
    /**
     * Gets the mdeDeviceId property value. The mdeDeviceId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdeDeviceId() {
        return this._mdeDeviceId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("detectionStatus", this.getDetectionStatus());
        writer.writeObjectValue("fileDetails", this.getFileDetails());
        writer.writeStringValue("mdeDeviceId", this.getMdeDeviceId());
    }
    /**
     * Sets the detectionStatus property value. The detectionStatus property
     * @param value Value to set for the detectionStatus property.
     * @return a void
     */
    public void setDetectionStatus(@javax.annotation.Nullable final DetectionStatus value) {
        this._detectionStatus = value;
    }
    /**
     * Sets the fileDetails property value. The fileDetails property
     * @param value Value to set for the fileDetails property.
     * @return a void
     */
    public void setFileDetails(@javax.annotation.Nullable final FileDetails value) {
        this._fileDetails = value;
    }
    /**
     * Sets the mdeDeviceId property value. The mdeDeviceId property
     * @param value Value to set for the mdeDeviceId property.
     * @return a void
     */
    public void setMdeDeviceId(@javax.annotation.Nullable final String value) {
        this._mdeDeviceId = value;
    }
}

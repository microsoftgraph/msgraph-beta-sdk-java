package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcDeviceImage extends Entity implements Parsable {
    /** The image's display name. */
    private String _displayName;
    /** The date the image became unavailable. */
    private LocalDate _expirationDate;
    /** The data and time that the image was last modified. The time is shown in ISO 8601 format and  Coordinated Universal Time (UTC) time. For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'. */
    private OffsetDateTime _lastModifiedDateTime;
    /** The image's operating system. For example: Windows 10 Enterprise. */
    private String _operatingSystem;
    /** The image's OS build version. For example: 1909. */
    private String _osBuildNumber;
    /** The OS status of this image. Possible values are: supported, supportedWithWarning, unknownFutureValue. */
    private CloudPcDeviceImageOsStatus _osStatus;
    /** The ID of the source image resource on Azure. Required format: '/subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}'. */
    private String _sourceImageResourceId;
    /** The status of the image on Cloud PC. Possible values are: pending, ready, failed. */
    private CloudPcDeviceImageStatus _status;
    /** The details of the image's status, which indicates why the upload failed, if applicable. Possible values are: internalServerError, sourceImageNotFound, osVersionNotSupported, sourceImageInvalid, and sourceImageNotGeneralized. */
    private CloudPcDeviceImageStatusDetails _statusDetails;
    /** The image version. For example: 0.0.1, 1.5.13. */
    private String _version;
    /**
     * Instantiates a new CloudPcDeviceImage and sets the default values.
     * @return a void
     */
    public CloudPcDeviceImage() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcDeviceImage");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcDeviceImage
     */
    @javax.annotation.Nonnull
    public static CloudPcDeviceImage createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcDeviceImage();
    }
    /**
     * Gets the displayName property value. The image's display name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the expirationDate property value. The date the image became unavailable.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getExpirationDate() {
        return this._expirationDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcDeviceImage currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("expirationDate", (n) -> { currentObject.setExpirationDate(n.getLocalDateValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("operatingSystem", (n) -> { currentObject.setOperatingSystem(n.getStringValue()); });
            this.put("osBuildNumber", (n) -> { currentObject.setOsBuildNumber(n.getStringValue()); });
            this.put("osStatus", (n) -> { currentObject.setOsStatus(n.getEnumValue(CloudPcDeviceImageOsStatus.class)); });
            this.put("sourceImageResourceId", (n) -> { currentObject.setSourceImageResourceId(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(CloudPcDeviceImageStatus.class)); });
            this.put("statusDetails", (n) -> { currentObject.setStatusDetails(n.getEnumValue(CloudPcDeviceImageStatusDetails.class)); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. The data and time that the image was last modified. The time is shown in ISO 8601 format and  Coordinated Universal Time (UTC) time. For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the operatingSystem property value. The image's operating system. For example: Windows 10 Enterprise.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the osBuildNumber property value. The image's OS build version. For example: 1909.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsBuildNumber() {
        return this._osBuildNumber;
    }
    /**
     * Gets the osStatus property value. The OS status of this image. Possible values are: supported, supportedWithWarning, unknownFutureValue.
     * @return a cloudPcDeviceImageOsStatus
     */
    @javax.annotation.Nullable
    public CloudPcDeviceImageOsStatus getOsStatus() {
        return this._osStatus;
    }
    /**
     * Gets the sourceImageResourceId property value. The ID of the source image resource on Azure. Required format: '/subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourceImageResourceId() {
        return this._sourceImageResourceId;
    }
    /**
     * Gets the status property value. The status of the image on Cloud PC. Possible values are: pending, ready, failed.
     * @return a cloudPcDeviceImageStatus
     */
    @javax.annotation.Nullable
    public CloudPcDeviceImageStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the statusDetails property value. The details of the image's status, which indicates why the upload failed, if applicable. Possible values are: internalServerError, sourceImageNotFound, osVersionNotSupported, sourceImageInvalid, and sourceImageNotGeneralized.
     * @return a cloudPcDeviceImageStatusDetails
     */
    @javax.annotation.Nullable
    public CloudPcDeviceImageStatusDetails getStatusDetails() {
        return this._statusDetails;
    }
    /**
     * Gets the version property value. The image version. For example: 0.0.1, 1.5.13.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("expirationDate", this.getExpirationDate());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("osBuildNumber", this.getOsBuildNumber());
        writer.writeEnumValue("osStatus", this.getOsStatus());
        writer.writeStringValue("sourceImageResourceId", this.getSourceImageResourceId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("statusDetails", this.getStatusDetails());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the displayName property value. The image's display name.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the expirationDate property value. The date the image became unavailable.
     * @param value Value to set for the expirationDate property.
     * @return a void
     */
    public void setExpirationDate(@javax.annotation.Nullable final LocalDate value) {
        this._expirationDate = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The data and time that the image was last modified. The time is shown in ISO 8601 format and  Coordinated Universal Time (UTC) time. For example, midnight UTC on Jan 1, 2014 appears as '2014-01-01T00:00:00Z'.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the operatingSystem property value. The image's operating system. For example: Windows 10 Enterprise.
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the osBuildNumber property value. The image's OS build version. For example: 1909.
     * @param value Value to set for the osBuildNumber property.
     * @return a void
     */
    public void setOsBuildNumber(@javax.annotation.Nullable final String value) {
        this._osBuildNumber = value;
    }
    /**
     * Sets the osStatus property value. The OS status of this image. Possible values are: supported, supportedWithWarning, unknownFutureValue.
     * @param value Value to set for the osStatus property.
     * @return a void
     */
    public void setOsStatus(@javax.annotation.Nullable final CloudPcDeviceImageOsStatus value) {
        this._osStatus = value;
    }
    /**
     * Sets the sourceImageResourceId property value. The ID of the source image resource on Azure. Required format: '/subscriptions/{subscription-id}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/images/{imageName}'.
     * @param value Value to set for the sourceImageResourceId property.
     * @return a void
     */
    public void setSourceImageResourceId(@javax.annotation.Nullable final String value) {
        this._sourceImageResourceId = value;
    }
    /**
     * Sets the status property value. The status of the image on Cloud PC. Possible values are: pending, ready, failed.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final CloudPcDeviceImageStatus value) {
        this._status = value;
    }
    /**
     * Sets the statusDetails property value. The details of the image's status, which indicates why the upload failed, if applicable. Possible values are: internalServerError, sourceImageNotFound, osVersionNotSupported, sourceImageInvalid, and sourceImageNotGeneralized.
     * @param value Value to set for the statusDetails property.
     * @return a void
     */
    public void setStatusDetails(@javax.annotation.Nullable final CloudPcDeviceImageStatusDetails value) {
        this._statusDetails = value;
    }
    /**
     * Sets the version property value. The image version. For example: 0.0.1, 1.5.13.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}

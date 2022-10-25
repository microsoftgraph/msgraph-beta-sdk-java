package com.microsoft.graph.models;

import com.microsoft.graph.models.ImportedAppleDeviceIdentityResult;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The importedAppleDeviceIdentity resource represents the imported device identity of an Apple device . */
public class ImportedAppleDeviceIdentity extends Entity implements Parsable {
    /** Created Date Time of the device */
    private OffsetDateTime _createdDateTime;
    /** The description of the device */
    private String _description;
    /** The discoverySource property */
    private DiscoverySource _discoverySource;
    /** The enrollmentState property */
    private EnrollmentState _enrollmentState;
    /** Indicates if the device is deleted from Apple Business Manager */
    private Boolean _isDeleted;
    /** Indicates if the Apple device is supervised. More information is at: https://support.apple.com/en-us/HT202837 */
    private Boolean _isSupervised;
    /** Last Contacted Date Time of the device */
    private OffsetDateTime _lastContactedDateTime;
    /** The platform property */
    private Platform _platform;
    /** The time enrollment profile was assigned to the device */
    private OffsetDateTime _requestedEnrollmentProfileAssignmentDateTime;
    /** Enrollment profile Id admin intends to apply to the device during next enrollment */
    private String _requestedEnrollmentProfileId;
    /** Device serial number */
    private String _serialNumber;
    /**
     * Instantiates a new importedAppleDeviceIdentity and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ImportedAppleDeviceIdentity() {
        super();
        this.setOdataType("#microsoft.graph.importedAppleDeviceIdentity");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a importedAppleDeviceIdentity
     */
    @javax.annotation.Nonnull
    public static ImportedAppleDeviceIdentity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.importedAppleDeviceIdentityResult": return new ImportedAppleDeviceIdentityResult();
            }
        }
        return new ImportedAppleDeviceIdentity();
    }
    /**
     * Gets the createdDateTime property value. Created Date Time of the device
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the discoverySource property value. The discoverySource property
     * @return a discoverySource
     */
    @javax.annotation.Nullable
    public DiscoverySource getDiscoverySource() {
        return this._discoverySource;
    }
    /**
     * Gets the enrollmentState property value. The enrollmentState property
     * @return a enrollmentState
     */
    @javax.annotation.Nullable
    public EnrollmentState getEnrollmentState() {
        return this._enrollmentState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ImportedAppleDeviceIdentity currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("discoverySource", (n) -> { currentObject.setDiscoverySource(n.getEnumValue(DiscoverySource.class)); });
            this.put("enrollmentState", (n) -> { currentObject.setEnrollmentState(n.getEnumValue(EnrollmentState.class)); });
            this.put("isDeleted", (n) -> { currentObject.setIsDeleted(n.getBooleanValue()); });
            this.put("isSupervised", (n) -> { currentObject.setIsSupervised(n.getBooleanValue()); });
            this.put("lastContactedDateTime", (n) -> { currentObject.setLastContactedDateTime(n.getOffsetDateTimeValue()); });
            this.put("platform", (n) -> { currentObject.setPlatform(n.getEnumValue(Platform.class)); });
            this.put("requestedEnrollmentProfileAssignmentDateTime", (n) -> { currentObject.setRequestedEnrollmentProfileAssignmentDateTime(n.getOffsetDateTimeValue()); });
            this.put("requestedEnrollmentProfileId", (n) -> { currentObject.setRequestedEnrollmentProfileId(n.getStringValue()); });
            this.put("serialNumber", (n) -> { currentObject.setSerialNumber(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDeleted property value. Indicates if the device is deleted from Apple Business Manager
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDeleted() {
        return this._isDeleted;
    }
    /**
     * Gets the isSupervised property value. Indicates if the Apple device is supervised. More information is at: https://support.apple.com/en-us/HT202837
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSupervised() {
        return this._isSupervised;
    }
    /**
     * Gets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastContactedDateTime() {
        return this._lastContactedDateTime;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a platform
     */
    @javax.annotation.Nullable
    public Platform getPlatform() {
        return this._platform;
    }
    /**
     * Gets the requestedEnrollmentProfileAssignmentDateTime property value. The time enrollment profile was assigned to the device
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRequestedEnrollmentProfileAssignmentDateTime() {
        return this._requestedEnrollmentProfileAssignmentDateTime;
    }
    /**
     * Gets the requestedEnrollmentProfileId property value. Enrollment profile Id admin intends to apply to the device during next enrollment
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRequestedEnrollmentProfileId() {
        return this._requestedEnrollmentProfileId;
    }
    /**
     * Gets the serialNumber property value. Device serial number
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSerialNumber() {
        return this._serialNumber;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumValue("discoverySource", this.getDiscoverySource());
        writer.writeEnumValue("enrollmentState", this.getEnrollmentState());
        writer.writeBooleanValue("isDeleted", this.getIsDeleted());
        writer.writeBooleanValue("isSupervised", this.getIsSupervised());
        writer.writeOffsetDateTimeValue("lastContactedDateTime", this.getLastContactedDateTime());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeOffsetDateTimeValue("requestedEnrollmentProfileAssignmentDateTime", this.getRequestedEnrollmentProfileAssignmentDateTime());
        writer.writeStringValue("requestedEnrollmentProfileId", this.getRequestedEnrollmentProfileId());
        writer.writeStringValue("serialNumber", this.getSerialNumber());
    }
    /**
     * Sets the createdDateTime property value. Created Date Time of the device
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description of the device
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the discoverySource property value. The discoverySource property
     * @param value Value to set for the discoverySource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDiscoverySource(@javax.annotation.Nullable final DiscoverySource value) {
        this._discoverySource = value;
    }
    /**
     * Sets the enrollmentState property value. The enrollmentState property
     * @param value Value to set for the enrollmentState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentState(@javax.annotation.Nullable final EnrollmentState value) {
        this._enrollmentState = value;
    }
    /**
     * Sets the isDeleted property value. Indicates if the device is deleted from Apple Business Manager
     * @param value Value to set for the isDeleted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDeleted(@javax.annotation.Nullable final Boolean value) {
        this._isDeleted = value;
    }
    /**
     * Sets the isSupervised property value. Indicates if the Apple device is supervised. More information is at: https://support.apple.com/en-us/HT202837
     * @param value Value to set for the isSupervised property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSupervised(@javax.annotation.Nullable final Boolean value) {
        this._isSupervised = value;
    }
    /**
     * Sets the lastContactedDateTime property value. Last Contacted Date Time of the device
     * @param value Value to set for the lastContactedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastContactedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastContactedDateTime = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final Platform value) {
        this._platform = value;
    }
    /**
     * Sets the requestedEnrollmentProfileAssignmentDateTime property value. The time enrollment profile was assigned to the device
     * @param value Value to set for the requestedEnrollmentProfileAssignmentDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestedEnrollmentProfileAssignmentDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._requestedEnrollmentProfileAssignmentDateTime = value;
    }
    /**
     * Sets the requestedEnrollmentProfileId property value. Enrollment profile Id admin intends to apply to the device during next enrollment
     * @param value Value to set for the requestedEnrollmentProfileId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequestedEnrollmentProfileId(@javax.annotation.Nullable final String value) {
        this._requestedEnrollmentProfileId = value;
    }
    /**
     * Sets the serialNumber property value. Device serial number
     * @param value Value to set for the serialNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSerialNumber(@javax.annotation.Nullable final String value) {
        this._serialNumber = value;
    }
}

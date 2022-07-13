package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationCustomization implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Indicates whether the display name of the resource can be overwritten by the sync. */
    private Boolean _allowDisplayNameUpdate;
    /** Indicates whether synchronization of the parent entity is deferred to a later date. */
    private Boolean _isSyncDeferred;
    /** The collection of property names to sync. If set to null, all properties will be synchronized. Does not apply to Student Enrollments or Teacher Rosters */
    private java.util.List<String> _optionalPropertiesToSync;
    /** The date that the synchronization should start. This value should be set to a future date. If set to null, the resource will be synchronized when the profile setup completes. Only applies to Student Enrollments */
    private OffsetDateTime _synchronizationStartDate;
    /**
     * Instantiates a new educationSynchronizationCustomization and sets the default values.
     * @return a void
     */
    public EducationSynchronizationCustomization() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSynchronizationCustomization
     */
    @javax.annotation.Nonnull
    public static EducationSynchronizationCustomization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationCustomization();
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
     * Gets the allowDisplayNameUpdate property value. Indicates whether the display name of the resource can be overwritten by the sync.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowDisplayNameUpdate() {
        return this._allowDisplayNameUpdate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSynchronizationCustomization currentObject = this;
        return new HashMap<>(4) {{
            this.put("allowDisplayNameUpdate", (n) -> { currentObject.setAllowDisplayNameUpdate(n.getBooleanValue()); });
            this.put("isSyncDeferred", (n) -> { currentObject.setIsSyncDeferred(n.getBooleanValue()); });
            this.put("optionalPropertiesToSync", (n) -> { currentObject.setOptionalPropertiesToSync(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("synchronizationStartDate", (n) -> { currentObject.setSynchronizationStartDate(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the isSyncDeferred property value. Indicates whether synchronization of the parent entity is deferred to a later date.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSyncDeferred() {
        return this._isSyncDeferred;
    }
    /**
     * Gets the optionalPropertiesToSync property value. The collection of property names to sync. If set to null, all properties will be synchronized. Does not apply to Student Enrollments or Teacher Rosters
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOptionalPropertiesToSync() {
        return this._optionalPropertiesToSync;
    }
    /**
     * Gets the synchronizationStartDate property value. The date that the synchronization should start. This value should be set to a future date. If set to null, the resource will be synchronized when the profile setup completes. Only applies to Student Enrollments
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getSynchronizationStartDate() {
        return this._synchronizationStartDate;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowDisplayNameUpdate", this.getAllowDisplayNameUpdate());
        writer.writeBooleanValue("isSyncDeferred", this.getIsSyncDeferred());
        writer.writeCollectionOfPrimitiveValues("optionalPropertiesToSync", this.getOptionalPropertiesToSync());
        writer.writeOffsetDateTimeValue("synchronizationStartDate", this.getSynchronizationStartDate());
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
     * Sets the allowDisplayNameUpdate property value. Indicates whether the display name of the resource can be overwritten by the sync.
     * @param value Value to set for the allowDisplayNameUpdate property.
     * @return a void
     */
    public void setAllowDisplayNameUpdate(@javax.annotation.Nullable final Boolean value) {
        this._allowDisplayNameUpdate = value;
    }
    /**
     * Sets the isSyncDeferred property value. Indicates whether synchronization of the parent entity is deferred to a later date.
     * @param value Value to set for the isSyncDeferred property.
     * @return a void
     */
    public void setIsSyncDeferred(@javax.annotation.Nullable final Boolean value) {
        this._isSyncDeferred = value;
    }
    /**
     * Sets the optionalPropertiesToSync property value. The collection of property names to sync. If set to null, all properties will be synchronized. Does not apply to Student Enrollments or Teacher Rosters
     * @param value Value to set for the optionalPropertiesToSync property.
     * @return a void
     */
    public void setOptionalPropertiesToSync(@javax.annotation.Nullable final java.util.List<String> value) {
        this._optionalPropertiesToSync = value;
    }
    /**
     * Sets the synchronizationStartDate property value. The date that the synchronization should start. This value should be set to a future date. If set to null, the resource will be synchronized when the profile setup completes. Only applies to Student Enrollments
     * @param value Value to set for the synchronizationStartDate property.
     * @return a void
     */
    public void setSynchronizationStartDate(@javax.annotation.Nullable final OffsetDateTime value) {
        this._synchronizationStartDate = value;
    }
}

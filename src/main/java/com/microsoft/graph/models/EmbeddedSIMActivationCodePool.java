package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmbeddedSIMActivationCodePool extends Entity implements Parsable {
    /** The total count of activation codes which belong to this pool.  */
    private Integer _activationCodeCount;
    /** The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.  */
    private java.util.List<EmbeddedSIMActivationCode> _activationCodes;
    /** Navigational property to a list of targets to which this pool is assigned.  */
    private java.util.List<EmbeddedSIMActivationCodePoolAssignment> _assignments;
    /** The time the embedded SIM activation code pool was created. Generated service side.  */
    private OffsetDateTime _createdDateTime;
    /** Navigational property to a list of device states for this pool.  */
    private java.util.List<EmbeddedSIMDeviceState> _deviceStates;
    /** The admin defined name of the embedded SIM activation code pool.  */
    private String _displayName;
    /** The time the embedded SIM activation code pool was last modified. Updated service side.  */
    private OffsetDateTime _modifiedDateTime;
    /**
     * Instantiates a new embeddedSIMActivationCodePool and sets the default values.
     * @return a void
     */
    public EmbeddedSIMActivationCodePool() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a embeddedSIMActivationCodePool
     */
    @javax.annotation.Nonnull
    public static EmbeddedSIMActivationCodePool createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmbeddedSIMActivationCodePool();
    }
    /**
     * Gets the activationCodeCount property value. The total count of activation codes which belong to this pool.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getActivationCodeCount() {
        return this._activationCodeCount;
    }
    /**
     * Gets the activationCodes property value. The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.
     * @return a embeddedSIMActivationCode
     */
    @javax.annotation.Nullable
    public java.util.List<EmbeddedSIMActivationCode> getActivationCodes() {
        return this._activationCodes;
    }
    /**
     * Gets the assignments property value. Navigational property to a list of targets to which this pool is assigned.
     * @return a embeddedSIMActivationCodePoolAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<EmbeddedSIMActivationCodePoolAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the createdDateTime property value. The time the embedded SIM activation code pool was created. Generated service side.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deviceStates property value. Navigational property to a list of device states for this pool.
     * @return a embeddedSIMDeviceState
     */
    @javax.annotation.Nullable
    public java.util.List<EmbeddedSIMDeviceState> getDeviceStates() {
        return this._deviceStates;
    }
    /**
     * Gets the displayName property value. The admin defined name of the embedded SIM activation code pool.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EmbeddedSIMActivationCodePool currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activationCodeCount", (n) -> { currentObject.setActivationCodeCount(n.getIntegerValue()); });
            this.put("activationCodes", (n) -> { currentObject.setActivationCodes(n.getCollectionOfObjectValues(EmbeddedSIMActivationCode::createFromDiscriminatorValue)); });
            this.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(EmbeddedSIMActivationCodePoolAssignment::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("deviceStates", (n) -> { currentObject.setDeviceStates(n.getCollectionOfObjectValues(EmbeddedSIMDeviceState::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("modifiedDateTime", (n) -> { currentObject.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the modifiedDateTime property value. The time the embedded SIM activation code pool was last modified. Updated service side.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this._modifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("activationCodeCount", this.getActivationCodeCount());
        writer.writeCollectionOfObjectValues("activationCodes", this.getActivationCodes());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfObjectValues("deviceStates", this.getDeviceStates());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
    }
    /**
     * Sets the activationCodeCount property value. The total count of activation codes which belong to this pool.
     * @param value Value to set for the activationCodeCount property.
     * @return a void
     */
    public void setActivationCodeCount(@javax.annotation.Nullable final Integer value) {
        this._activationCodeCount = value;
    }
    /**
     * Sets the activationCodes property value. The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.
     * @param value Value to set for the activationCodes property.
     * @return a void
     */
    public void setActivationCodes(@javax.annotation.Nullable final java.util.List<EmbeddedSIMActivationCode> value) {
        this._activationCodes = value;
    }
    /**
     * Sets the assignments property value. Navigational property to a list of targets to which this pool is assigned.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    public void setAssignments(@javax.annotation.Nullable final java.util.List<EmbeddedSIMActivationCodePoolAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the createdDateTime property value. The time the embedded SIM activation code pool was created. Generated service side.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deviceStates property value. Navigational property to a list of device states for this pool.
     * @param value Value to set for the deviceStates property.
     * @return a void
     */
    public void setDeviceStates(@javax.annotation.Nullable final java.util.List<EmbeddedSIMDeviceState> value) {
        this._deviceStates = value;
    }
    /**
     * Sets the displayName property value. The admin defined name of the embedded SIM activation code pool.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the modifiedDateTime property value. The time the embedded SIM activation code pool was last modified. Updated service side.
     * @param value Value to set for the modifiedDateTime property.
     * @return a void
     */
    public void setModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._modifiedDateTime = value;
    }
}

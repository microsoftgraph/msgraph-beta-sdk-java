package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDeviceActivity extends Entity implements Parsable {
    /** The active peripheral devices attached to the device. */
    private TeamworkActivePeripherals _activePeripherals;
    /** Identity of the user who created the device activity document. */
    private IdentitySet _createdBy;
    /** The UTC date and time when the device activity document was created. */
    private OffsetDateTime _createdDateTime;
    /** Identity of the user who last modified the device activity details. */
    private IdentitySet _lastModifiedBy;
    /** The UTC date and time when the device activity detail was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /**
     * Instantiates a new teamworkDeviceActivity and sets the default values.
     * @return a void
     */
    public TeamworkDeviceActivity() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDeviceActivity
     */
    @javax.annotation.Nonnull
    public static TeamworkDeviceActivity createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDeviceActivity();
    }
    /**
     * Gets the activePeripherals property value. The active peripheral devices attached to the device.
     * @return a teamworkActivePeripherals
     */
    @javax.annotation.Nullable
    public TeamworkActivePeripherals getActivePeripherals() {
        return this._activePeripherals;
    }
    /**
     * Gets the createdBy property value. Identity of the user who created the device activity document.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this._createdBy;
    }
    /**
     * Gets the createdDateTime property value. The UTC date and time when the device activity document was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDeviceActivity currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("activePeripherals", (n) -> { currentObject.setActivePeripherals(n.getObjectValue(TeamworkActivePeripherals::createFromDiscriminatorValue)); });
            this.put("createdBy", (n) -> { currentObject.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("lastModifiedBy", (n) -> { currentObject.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        }};
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user who last modified the device activity details.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this._lastModifiedBy;
    }
    /**
     * Gets the lastModifiedDateTime property value. The UTC date and time when the device activity detail was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activePeripherals", this.getActivePeripherals());
        writer.writeObjectValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the activePeripherals property value. The active peripheral devices attached to the device.
     * @param value Value to set for the activePeripherals property.
     * @return a void
     */
    public void setActivePeripherals(@javax.annotation.Nullable final TeamworkActivePeripherals value) {
        this._activePeripherals = value;
    }
    /**
     * Sets the createdBy property value. Identity of the user who created the device activity document.
     * @param value Value to set for the createdBy property.
     * @return a void
     */
    public void setCreatedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._createdBy = value;
    }
    /**
     * Sets the createdDateTime property value. The UTC date and time when the device activity document was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user who last modified the device activity details.
     * @param value Value to set for the lastModifiedBy property.
     * @return a void
     */
    public void setLastModifiedBy(@javax.annotation.Nullable final IdentitySet value) {
        this._lastModifiedBy = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The UTC date and time when the device activity detail was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
}

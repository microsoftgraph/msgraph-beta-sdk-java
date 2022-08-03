package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CartToClassAssociation extends Entity implements Parsable {
    /** Identifiers of classrooms to be associated with device carts. */
    private java.util.List<String> _classroomIds;
    /** DateTime the object was created. */
    private OffsetDateTime _createdDateTime;
    /** Admin provided description of the CartToClassAssociation. */
    private String _description;
    /** Identifiers of device carts to be associated with classes. */
    private java.util.List<String> _deviceCartIds;
    /** Admin provided name of the device configuration. */
    private String _displayName;
    /** DateTime the object was last modified. */
    private OffsetDateTime _lastModifiedDateTime;
    /** Version of the CartToClassAssociation. */
    private Integer _version;
    /**
     * Instantiates a new CartToClassAssociation and sets the default values.
     * @return a void
     */
    public CartToClassAssociation() {
        super();
        this.setOdataType("#microsoft.graph.cartToClassAssociation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CartToClassAssociation
     */
    @javax.annotation.Nonnull
    public static CartToClassAssociation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CartToClassAssociation();
    }
    /**
     * Gets the classroomIds property value. Identifiers of classrooms to be associated with device carts.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getClassroomIds() {
        return this._classroomIds;
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. Admin provided description of the CartToClassAssociation.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the deviceCartIds property value. Identifiers of device carts to be associated with classes.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getDeviceCartIds() {
        return this._deviceCartIds;
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
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
        final CartToClassAssociation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("classroomIds", (n) -> { currentObject.setClassroomIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("deviceCartIds", (n) -> { currentObject.setDeviceCartIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the version property value. Version of the CartToClassAssociation.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
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
        writer.writeCollectionOfPrimitiveValues("classroomIds", this.getClassroomIds());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("deviceCartIds", this.getDeviceCartIds());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the classroomIds property value. Identifiers of classrooms to be associated with device carts.
     * @param value Value to set for the classroomIds property.
     * @return a void
     */
    public void setClassroomIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._classroomIds = value;
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. Admin provided description of the CartToClassAssociation.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the deviceCartIds property value. Identifiers of device carts to be associated with classes.
     * @param value Value to set for the deviceCartIds property.
     * @return a void
     */
    public void setDeviceCartIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._deviceCartIds = value;
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the version property value. Version of the CartToClassAssociation.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
}

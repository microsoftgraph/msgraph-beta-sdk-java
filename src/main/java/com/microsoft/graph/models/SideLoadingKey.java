package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SideLoadingKey extends Entity implements Parsable {
    /** Side Loading Key description displayed to the ITPro Admins..  */
    private String _description;
    /** Side Loading Key Name displayed to the ITPro Admins.  */
    private String _displayName;
    /** Side Loading Key Last Updated Date displayed to the ITPro Admins.  */
    private String _lastUpdatedDateTime;
    /** Side Loading Key Total Activation displayed to the ITPro Admins.  */
    private Integer _totalActivation;
    /** Side Loading Key Value, it is 5x5 value, seperated by hiphens.  */
    private String _value;
    /**
     * Instantiates a new sideLoadingKey and sets the default values.
     * @return a void
     */
    public SideLoadingKey() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sideLoadingKey
     */
    @javax.annotation.Nonnull
    public static SideLoadingKey createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SideLoadingKey();
    }
    /**
     * Gets the description property value. Side Loading Key description displayed to the ITPro Admins..
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Side Loading Key Name displayed to the ITPro Admins.
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
        final SideLoadingKey currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("lastUpdatedDateTime", (n) -> { currentObject.setLastUpdatedDateTime(n.getStringValue()); });
            this.put("totalActivation", (n) -> { currentObject.setTotalActivation(n.getIntegerValue()); });
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the lastUpdatedDateTime property value. Side Loading Key Last Updated Date displayed to the ITPro Admins.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastUpdatedDateTime() {
        return this._lastUpdatedDateTime;
    }
    /**
     * Gets the totalActivation property value. Side Loading Key Total Activation displayed to the ITPro Admins.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalActivation() {
        return this._totalActivation;
    }
    /**
     * Gets the value property value. Side Loading Key Value, it is 5x5 value, seperated by hiphens.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("lastUpdatedDateTime", this.getLastUpdatedDateTime());
        writer.writeIntegerValue("totalActivation", this.getTotalActivation());
        writer.writeStringValue("value", this.getValue());
    }
    /**
     * Sets the description property value. Side Loading Key description displayed to the ITPro Admins..
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Side Loading Key Name displayed to the ITPro Admins.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the lastUpdatedDateTime property value. Side Loading Key Last Updated Date displayed to the ITPro Admins.
     * @param value Value to set for the lastUpdatedDateTime property.
     * @return a void
     */
    public void setLastUpdatedDateTime(@javax.annotation.Nullable final String value) {
        this._lastUpdatedDateTime = value;
    }
    /**
     * Sets the totalActivation property value. Side Loading Key Total Activation displayed to the ITPro Admins.
     * @param value Value to set for the totalActivation property.
     * @return a void
     */
    public void setTotalActivation(@javax.annotation.Nullable final Integer value) {
        this._totalActivation = value;
    }
    /**
     * Sets the value property value. Side Loading Key Value, it is 5x5 value, seperated by hiphens.
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}

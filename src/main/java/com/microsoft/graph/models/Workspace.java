package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class Workspace extends Place implements Parsable {
    /** The building property */
    private String _building;
    /** The capacity property */
    private Integer _capacity;
    /** The emailAddress property */
    private String _emailAddress;
    /** The floorLabel property */
    private String _floorLabel;
    /** The floorNumber property */
    private Integer _floorNumber;
    /** The isWheelChairAccessible property */
    private Boolean _isWheelChairAccessible;
    /** The label property */
    private String _label;
    /** The nickname property */
    private String _nickname;
    /** The tags property */
    private java.util.List<String> _tags;
    /**
     * Instantiates a new workspace and sets the default values.
     * @return a void
     */
    public Workspace() {
        super();
        this.setOdataType("#microsoft.graph.workspace");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workspace
     */
    @javax.annotation.Nonnull
    public static Workspace createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Workspace();
    }
    /**
     * Gets the building property value. The building property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBuilding() {
        return this._building;
    }
    /**
     * Gets the capacity property value. The capacity property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCapacity() {
        return this._capacity;
    }
    /**
     * Gets the emailAddress property value. The emailAddress property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEmailAddress() {
        return this._emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Workspace currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("building", (n) -> { currentObject.setBuilding(n.getStringValue()); });
            this.put("capacity", (n) -> { currentObject.setCapacity(n.getIntegerValue()); });
            this.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
            this.put("floorLabel", (n) -> { currentObject.setFloorLabel(n.getStringValue()); });
            this.put("floorNumber", (n) -> { currentObject.setFloorNumber(n.getIntegerValue()); });
            this.put("isWheelChairAccessible", (n) -> { currentObject.setIsWheelChairAccessible(n.getBooleanValue()); });
            this.put("label", (n) -> { currentObject.setLabel(n.getStringValue()); });
            this.put("nickname", (n) -> { currentObject.setNickname(n.getStringValue()); });
            this.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the floorLabel property value. The floorLabel property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFloorLabel() {
        return this._floorLabel;
    }
    /**
     * Gets the floorNumber property value. The floorNumber property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFloorNumber() {
        return this._floorNumber;
    }
    /**
     * Gets the isWheelChairAccessible property value. The isWheelChairAccessible property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsWheelChairAccessible() {
        return this._isWheelChairAccessible;
    }
    /**
     * Gets the label property value. The label property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this._label;
    }
    /**
     * Gets the nickname property value. The nickname property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNickname() {
        return this._nickname;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("building", this.getBuilding());
        writer.writeIntegerValue("capacity", this.getCapacity());
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeStringValue("floorLabel", this.getFloorLabel());
        writer.writeIntegerValue("floorNumber", this.getFloorNumber());
        writer.writeBooleanValue("isWheelChairAccessible", this.getIsWheelChairAccessible());
        writer.writeStringValue("label", this.getLabel());
        writer.writeStringValue("nickname", this.getNickname());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
    }
    /**
     * Sets the building property value. The building property
     * @param value Value to set for the building property.
     * @return a void
     */
    public void setBuilding(@javax.annotation.Nullable final String value) {
        this._building = value;
    }
    /**
     * Sets the capacity property value. The capacity property
     * @param value Value to set for the capacity property.
     * @return a void
     */
    public void setCapacity(@javax.annotation.Nullable final Integer value) {
        this._capacity = value;
    }
    /**
     * Sets the emailAddress property value. The emailAddress property
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the floorLabel property value. The floorLabel property
     * @param value Value to set for the floorLabel property.
     * @return a void
     */
    public void setFloorLabel(@javax.annotation.Nullable final String value) {
        this._floorLabel = value;
    }
    /**
     * Sets the floorNumber property value. The floorNumber property
     * @param value Value to set for the floorNumber property.
     * @return a void
     */
    public void setFloorNumber(@javax.annotation.Nullable final Integer value) {
        this._floorNumber = value;
    }
    /**
     * Sets the isWheelChairAccessible property value. The isWheelChairAccessible property
     * @param value Value to set for the isWheelChairAccessible property.
     * @return a void
     */
    public void setIsWheelChairAccessible(@javax.annotation.Nullable final Boolean value) {
        this._isWheelChairAccessible = value;
    }
    /**
     * Sets the label property value. The label property
     * @param value Value to set for the label property.
     * @return a void
     */
    public void setLabel(@javax.annotation.Nullable final String value) {
        this._label = value;
    }
    /**
     * Sets the nickname property value. The nickname property
     * @param value Value to set for the nickname property.
     * @return a void
     */
    public void setNickname(@javax.annotation.Nullable final String value) {
        this._nickname = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
}

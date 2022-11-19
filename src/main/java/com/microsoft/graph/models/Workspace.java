package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of activityStatistics entities. */
public class Workspace extends Place implements Parsable {
    /** Specifies the building name or building number that the workspace is in. */
    private String _building;
    /** Specifies the capacity of the workspace. */
    private Integer _capacity;
    /** Email address of the workspace. */
    private String _emailAddress;
    /** Specifies a descriptive label for the floor, for example, P. */
    private String _floorLabel;
    /** Specifies the floor number that the workspace is on. */
    private Integer _floorNumber;
    /** Specifies whether the workspace is wheelchair accessible. */
    private Boolean _isWheelChairAccessible;
    /** Specifies a descriptive label for the workspace, for example, a number or name. */
    private String _label;
    /** Specifies a nickname for the workspace, for example, 'quiet workspace'. */
    private String _nickname;
    /** Specifies additional features of the workspace, for example, details like the type of view or furniture type. */
    private java.util.List<String> _tags;
    /**
     * Instantiates a new workspace and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
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
     * Gets the building property value. Specifies the building name or building number that the workspace is in.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getBuilding() {
        return this._building;
    }
    /**
     * Gets the capacity property value. Specifies the capacity of the workspace.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCapacity() {
        return this._capacity;
    }
    /**
     * Gets the emailAddress property value. Email address of the workspace.
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
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("building", (n) -> { currentObject.setBuilding(n.getStringValue()); });
        deserializerMap.put("capacity", (n) -> { currentObject.setCapacity(n.getIntegerValue()); });
        deserializerMap.put("emailAddress", (n) -> { currentObject.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("floorLabel", (n) -> { currentObject.setFloorLabel(n.getStringValue()); });
        deserializerMap.put("floorNumber", (n) -> { currentObject.setFloorNumber(n.getIntegerValue()); });
        deserializerMap.put("isWheelChairAccessible", (n) -> { currentObject.setIsWheelChairAccessible(n.getBooleanValue()); });
        deserializerMap.put("label", (n) -> { currentObject.setLabel(n.getStringValue()); });
        deserializerMap.put("nickname", (n) -> { currentObject.setNickname(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap
    }
    /**
     * Gets the floorLabel property value. Specifies a descriptive label for the floor, for example, P.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFloorLabel() {
        return this._floorLabel;
    }
    /**
     * Gets the floorNumber property value. Specifies the floor number that the workspace is on.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFloorNumber() {
        return this._floorNumber;
    }
    /**
     * Gets the isWheelChairAccessible property value. Specifies whether the workspace is wheelchair accessible.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsWheelChairAccessible() {
        return this._isWheelChairAccessible;
    }
    /**
     * Gets the label property value. Specifies a descriptive label for the workspace, for example, a number or name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLabel() {
        return this._label;
    }
    /**
     * Gets the nickname property value. Specifies a nickname for the workspace, for example, 'quiet workspace'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNickname() {
        return this._nickname;
    }
    /**
     * Gets the tags property value. Specifies additional features of the workspace, for example, details like the type of view or furniture type.
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
    @javax.annotation.Nonnull
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
     * Sets the building property value. Specifies the building name or building number that the workspace is in.
     * @param value Value to set for the building property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBuilding(@javax.annotation.Nullable final String value) {
        this._building = value;
    }
    /**
     * Sets the capacity property value. Specifies the capacity of the workspace.
     * @param value Value to set for the capacity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCapacity(@javax.annotation.Nullable final Integer value) {
        this._capacity = value;
    }
    /**
     * Sets the emailAddress property value. Email address of the workspace.
     * @param value Value to set for the emailAddress property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEmailAddress(@javax.annotation.Nullable final String value) {
        this._emailAddress = value;
    }
    /**
     * Sets the floorLabel property value. Specifies a descriptive label for the floor, for example, P.
     * @param value Value to set for the floorLabel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFloorLabel(@javax.annotation.Nullable final String value) {
        this._floorLabel = value;
    }
    /**
     * Sets the floorNumber property value. Specifies the floor number that the workspace is on.
     * @param value Value to set for the floorNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFloorNumber(@javax.annotation.Nullable final Integer value) {
        this._floorNumber = value;
    }
    /**
     * Sets the isWheelChairAccessible property value. Specifies whether the workspace is wheelchair accessible.
     * @param value Value to set for the isWheelChairAccessible property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsWheelChairAccessible(@javax.annotation.Nullable final Boolean value) {
        this._isWheelChairAccessible = value;
    }
    /**
     * Sets the label property value. Specifies a descriptive label for the workspace, for example, a number or name.
     * @param value Value to set for the label property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLabel(@javax.annotation.Nullable final String value) {
        this._label = value;
    }
    /**
     * Sets the nickname property value. Specifies a nickname for the workspace, for example, 'quiet workspace'.
     * @param value Value to set for the nickname property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNickname(@javax.annotation.Nullable final String value) {
        this._nickname = value;
    }
    /**
     * Sets the tags property value. Specifies additional features of the workspace, for example, details like the type of view or furniture type.
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
}

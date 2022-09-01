package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class ItemActivityOLD extends Entity implements Parsable {
    /** The action property */
    private ItemActionSet _action;
    /** The actor property */
    private IdentitySet _actor;
    /** The driveItem property */
    private DriveItem _driveItem;
    /** The listItem property */
    private ListItem _listItem;
    /** The times property */
    private ItemActivityTimeSet _times;
    /**
     * Instantiates a new itemActivityOLD and sets the default values.
     * @return a void
     */
    public ItemActivityOLD() {
        super();
        this.setOdataType("#microsoft.graph.itemActivityOLD");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActivityOLD
     */
    @javax.annotation.Nonnull
    public static ItemActivityOLD createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivityOLD();
    }
    /**
     * Gets the action property value. The action property
     * @return a itemActionSet
     */
    @javax.annotation.Nullable
    public ItemActionSet getAction() {
        return this._action;
    }
    /**
     * Gets the actor property value. The actor property
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getActor() {
        return this._actor;
    }
    /**
     * Gets the driveItem property value. The driveItem property
     * @return a driveItem
     */
    @javax.annotation.Nullable
    public DriveItem getDriveItem() {
        return this._driveItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ItemActivityOLD currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("action", (n) -> { currentObject.setAction(n.getObjectValue(ItemActionSet::createFromDiscriminatorValue)); });
            this.put("actor", (n) -> { currentObject.setActor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("driveItem", (n) -> { currentObject.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
            this.put("listItem", (n) -> { currentObject.setListItem(n.getObjectValue(ListItem::createFromDiscriminatorValue)); });
            this.put("times", (n) -> { currentObject.setTimes(n.getObjectValue(ItemActivityTimeSet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the listItem property value. The listItem property
     * @return a listItem
     */
    @javax.annotation.Nullable
    public ListItem getListItem() {
        return this._listItem;
    }
    /**
     * Gets the times property value. The times property
     * @return a itemActivityTimeSet
     */
    @javax.annotation.Nullable
    public ItemActivityTimeSet getTimes() {
        return this._times;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("action", this.getAction());
        writer.writeObjectValue("actor", this.getActor());
        writer.writeObjectValue("driveItem", this.getDriveItem());
        writer.writeObjectValue("listItem", this.getListItem());
        writer.writeObjectValue("times", this.getTimes());
    }
    /**
     * Sets the action property value. The action property
     * @param value Value to set for the action property.
     * @return a void
     */
    public void setAction(@javax.annotation.Nullable final ItemActionSet value) {
        this._action = value;
    }
    /**
     * Sets the actor property value. The actor property
     * @param value Value to set for the actor property.
     * @return a void
     */
    public void setActor(@javax.annotation.Nullable final IdentitySet value) {
        this._actor = value;
    }
    /**
     * Sets the driveItem property value. The driveItem property
     * @param value Value to set for the driveItem property.
     * @return a void
     */
    public void setDriveItem(@javax.annotation.Nullable final DriveItem value) {
        this._driveItem = value;
    }
    /**
     * Sets the listItem property value. The listItem property
     * @param value Value to set for the listItem property.
     * @return a void
     */
    public void setListItem(@javax.annotation.Nullable final ListItem value) {
        this._listItem = value;
    }
    /**
     * Sets the times property value. The times property
     * @param value Value to set for the times property.
     * @return a void
     */
    public void setTimes(@javax.annotation.Nullable final ItemActivityTimeSet value) {
        this._times = value;
    }
}

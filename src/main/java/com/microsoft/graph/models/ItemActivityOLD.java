package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemActivityOLD extends Entity implements Parsable {
    /**
     * The action property
     */
    private ItemActionSet action;
    /**
     * The actor property
     */
    private IdentitySet actor;
    /**
     * The driveItem property
     */
    private DriveItem driveItem;
    /**
     * The listItem property
     */
    private ListItem listItem;
    /**
     * The times property
     */
    private ItemActivityTimeSet times;
    /**
     * Instantiates a new itemActivityOLD and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ItemActivityOLD() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActivityOLD
     */
    @jakarta.annotation.Nonnull
    public static ItemActivityOLD createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivityOLD();
    }
    /**
     * Gets the action property value. The action property
     * @return a itemActionSet
     */
    @jakarta.annotation.Nullable
    public ItemActionSet getAction() {
        return this.action;
    }
    /**
     * Gets the actor property value. The actor property
     * @return a identitySet
     */
    @jakarta.annotation.Nullable
    public IdentitySet getActor() {
        return this.actor;
    }
    /**
     * Gets the driveItem property value. The driveItem property
     * @return a driveItem
     */
    @jakarta.annotation.Nullable
    public DriveItem getDriveItem() {
        return this.driveItem;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("action", (n) -> { this.setAction(n.getObjectValue(ItemActionSet::createFromDiscriminatorValue)); });
        deserializerMap.put("actor", (n) -> { this.setActor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("driveItem", (n) -> { this.setDriveItem(n.getObjectValue(DriveItem::createFromDiscriminatorValue)); });
        deserializerMap.put("listItem", (n) -> { this.setListItem(n.getObjectValue(ListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("times", (n) -> { this.setTimes(n.getObjectValue(ItemActivityTimeSet::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the listItem property value. The listItem property
     * @return a listItem
     */
    @jakarta.annotation.Nullable
    public ListItem getListItem() {
        return this.listItem;
    }
    /**
     * Gets the times property value. The times property
     * @return a itemActivityTimeSet
     */
    @jakarta.annotation.Nullable
    public ItemActivityTimeSet getTimes() {
        return this.times;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
    @jakarta.annotation.Nonnull
    public void setAction(@jakarta.annotation.Nullable final ItemActionSet value) {
        this.action = value;
    }
    /**
     * Sets the actor property value. The actor property
     * @param value Value to set for the actor property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setActor(@jakarta.annotation.Nullable final IdentitySet value) {
        this.actor = value;
    }
    /**
     * Sets the driveItem property value. The driveItem property
     * @param value Value to set for the driveItem property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDriveItem(@jakarta.annotation.Nullable final DriveItem value) {
        this.driveItem = value;
    }
    /**
     * Sets the listItem property value. The listItem property
     * @param value Value to set for the listItem property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setListItem(@jakarta.annotation.Nullable final ListItem value) {
        this.listItem = value;
    }
    /**
     * Sets the times property value. The times property
     * @param value Value to set for the times property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTimes(@jakarta.annotation.Nullable final ItemActivityTimeSet value) {
        this.times = value;
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemActivityOLD extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ItemActivityOLD} and sets the default values.
     */
    public ItemActivityOLD() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ItemActivityOLD}
     */
    @jakarta.annotation.Nonnull
    public static ItemActivityOLD createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivityOLD();
    }
    /**
     * Gets the action property value. The action property
     * @return a {@link ItemActionSet}
     */
    @jakarta.annotation.Nullable
    public ItemActionSet getAction() {
        return this.backingStore.get("action");
    }
    /**
     * Gets the actor property value. The actor property
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getActor() {
        return this.backingStore.get("actor");
    }
    /**
     * Gets the driveItem property value. The driveItem property
     * @return a {@link DriveItem}
     */
    @jakarta.annotation.Nullable
    public DriveItem getDriveItem() {
        return this.backingStore.get("driveItem");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * @return a {@link ListItem}
     */
    @jakarta.annotation.Nullable
    public ListItem getListItem() {
        return this.backingStore.get("listItem");
    }
    /**
     * Gets the times property value. The times property
     * @return a {@link ItemActivityTimeSet}
     */
    @jakarta.annotation.Nullable
    public ItemActivityTimeSet getTimes() {
        return this.backingStore.get("times");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setAction(@jakarta.annotation.Nullable final ItemActionSet value) {
        this.backingStore.set("action", value);
    }
    /**
     * Sets the actor property value. The actor property
     * @param value Value to set for the actor property.
     */
    public void setActor(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("actor", value);
    }
    /**
     * Sets the driveItem property value. The driveItem property
     * @param value Value to set for the driveItem property.
     */
    public void setDriveItem(@jakarta.annotation.Nullable final DriveItem value) {
        this.backingStore.set("driveItem", value);
    }
    /**
     * Sets the listItem property value. The listItem property
     * @param value Value to set for the listItem property.
     */
    public void setListItem(@jakarta.annotation.Nullable final ListItem value) {
        this.backingStore.set("listItem", value);
    }
    /**
     * Sets the times property value. The times property
     * @param value Value to set for the times property.
     */
    public void setTimes(@jakarta.annotation.Nullable final ItemActivityTimeSet value) {
        this.backingStore.set("times", value);
    }
}

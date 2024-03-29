package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RoomList extends Place implements Parsable {
    /**
     * Instantiates a new {@link RoomList} and sets the default values.
     */
    public RoomList() {
        super();
        this.setOdataType("#microsoft.graph.roomList");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RoomList}
     */
    @jakarta.annotation.Nonnull
    public static RoomList createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RoomList();
    }
    /**
     * Gets the emailAddress property value. The email address of the room list.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.backingStore.get("emailAddress");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("emailAddress", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("rooms", (n) -> { this.setRooms(n.getCollectionOfObjectValues(Room::createFromDiscriminatorValue)); });
        deserializerMap.put("workspaces", (n) -> { this.setWorkspaces(n.getCollectionOfObjectValues(Workspace::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the rooms property value. The rooms property
     * @return a {@link java.util.List<Room>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Room> getRooms() {
        return this.backingStore.get("rooms");
    }
    /**
     * Gets the workspaces property value. The workspaces property
     * @return a {@link java.util.List<Workspace>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<Workspace> getWorkspaces() {
        return this.backingStore.get("workspaces");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("emailAddress", this.getEmailAddress());
        writer.writeCollectionOfObjectValues("rooms", this.getRooms());
        writer.writeCollectionOfObjectValues("workspaces", this.getWorkspaces());
    }
    /**
     * Sets the emailAddress property value. The email address of the room list.
     * @param value Value to set for the emailAddress property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("emailAddress", value);
    }
    /**
     * Sets the rooms property value. The rooms property
     * @param value Value to set for the rooms property.
     */
    public void setRooms(@jakarta.annotation.Nullable final java.util.List<Room> value) {
        this.backingStore.set("rooms", value);
    }
    /**
     * Sets the workspaces property value. The workspaces property
     * @param value Value to set for the workspaces property.
     */
    public void setWorkspaces(@jakarta.annotation.Nullable final java.util.List<Workspace> value) {
        this.backingStore.set("workspaces", value);
    }
}

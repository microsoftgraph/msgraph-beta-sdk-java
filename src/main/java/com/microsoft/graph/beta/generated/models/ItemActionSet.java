package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ItemActionSet implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new ItemActionSet and sets the default values.
     */
    public ItemActionSet() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ItemActionSet
     */
    @jakarta.annotation.Nonnull
    public static ItemActionSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActionSet();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a BackingStore
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the comment property value. A comment was added to the item.
     * @return a CommentAction
     */
    @jakarta.annotation.Nullable
    public CommentAction getComment() {
        return this.backingStore.get("comment");
    }
    /**
     * Gets the create property value. An item was created.
     * @return a CreateAction
     */
    @jakarta.annotation.Nullable
    public CreateAction getCreate() {
        return this.backingStore.get("create");
    }
    /**
     * Gets the delete property value. An item was deleted.
     * @return a DeleteAction
     */
    @jakarta.annotation.Nullable
    public DeleteAction getDelete() {
        return this.backingStore.get("delete");
    }
    /**
     * Gets the edit property value. An item was edited.
     * @return a EditAction
     */
    @jakarta.annotation.Nullable
    public EditAction getEdit() {
        return this.backingStore.get("edit");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("comment", (n) -> { this.setComment(n.getObjectValue(CommentAction::createFromDiscriminatorValue)); });
        deserializerMap.put("create", (n) -> { this.setCreate(n.getObjectValue(CreateAction::createFromDiscriminatorValue)); });
        deserializerMap.put("delete", (n) -> { this.setDelete(n.getObjectValue(DeleteAction::createFromDiscriminatorValue)); });
        deserializerMap.put("edit", (n) -> { this.setEdit(n.getObjectValue(EditAction::createFromDiscriminatorValue)); });
        deserializerMap.put("mention", (n) -> { this.setMention(n.getObjectValue(MentionAction::createFromDiscriminatorValue)); });
        deserializerMap.put("move", (n) -> { this.setMove(n.getObjectValue(MoveAction::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rename", (n) -> { this.setRename(n.getObjectValue(RenameAction::createFromDiscriminatorValue)); });
        deserializerMap.put("restore", (n) -> { this.setRestore(n.getObjectValue(RestoreAction::createFromDiscriminatorValue)); });
        deserializerMap.put("share", (n) -> { this.setShare(n.getObjectValue(ShareAction::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getObjectValue(VersionAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the mention property value. A user was mentioned in the item.
     * @return a MentionAction
     */
    @jakarta.annotation.Nullable
    public MentionAction getMention() {
        return this.backingStore.get("mention");
    }
    /**
     * Gets the move property value. An item was moved.
     * @return a MoveAction
     */
    @jakarta.annotation.Nullable
    public MoveAction getMove() {
        return this.backingStore.get("move");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the rename property value. An item was renamed.
     * @return a RenameAction
     */
    @jakarta.annotation.Nullable
    public RenameAction getRename() {
        return this.backingStore.get("rename");
    }
    /**
     * Gets the restore property value. An item was restored.
     * @return a RestoreAction
     */
    @jakarta.annotation.Nullable
    public RestoreAction getRestore() {
        return this.backingStore.get("restore");
    }
    /**
     * Gets the share property value. An item was shared.
     * @return a ShareAction
     */
    @jakarta.annotation.Nullable
    public ShareAction getShare() {
        return this.backingStore.get("share");
    }
    /**
     * Gets the version property value. An item was versioned.
     * @return a VersionAction
     */
    @jakarta.annotation.Nullable
    public VersionAction getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("comment", this.getComment());
        writer.writeObjectValue("create", this.getCreate());
        writer.writeObjectValue("delete", this.getDelete());
        writer.writeObjectValue("edit", this.getEdit());
        writer.writeObjectValue("mention", this.getMention());
        writer.writeObjectValue("move", this.getMove());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("rename", this.getRename());
        writer.writeObjectValue("restore", this.getRestore());
        writer.writeObjectValue("share", this.getShare());
        writer.writeObjectValue("version", this.getVersion());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the comment property value. A comment was added to the item.
     * @param value Value to set for the comment property.
     */
    public void setComment(@jakarta.annotation.Nullable final CommentAction value) {
        this.backingStore.set("comment", value);
    }
    /**
     * Sets the create property value. An item was created.
     * @param value Value to set for the create property.
     */
    public void setCreate(@jakarta.annotation.Nullable final CreateAction value) {
        this.backingStore.set("create", value);
    }
    /**
     * Sets the delete property value. An item was deleted.
     * @param value Value to set for the delete property.
     */
    public void setDelete(@jakarta.annotation.Nullable final DeleteAction value) {
        this.backingStore.set("delete", value);
    }
    /**
     * Sets the edit property value. An item was edited.
     * @param value Value to set for the edit property.
     */
    public void setEdit(@jakarta.annotation.Nullable final EditAction value) {
        this.backingStore.set("edit", value);
    }
    /**
     * Sets the mention property value. A user was mentioned in the item.
     * @param value Value to set for the mention property.
     */
    public void setMention(@jakarta.annotation.Nullable final MentionAction value) {
        this.backingStore.set("mention", value);
    }
    /**
     * Sets the move property value. An item was moved.
     * @param value Value to set for the move property.
     */
    public void setMove(@jakarta.annotation.Nullable final MoveAction value) {
        this.backingStore.set("move", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the rename property value. An item was renamed.
     * @param value Value to set for the rename property.
     */
    public void setRename(@jakarta.annotation.Nullable final RenameAction value) {
        this.backingStore.set("rename", value);
    }
    /**
     * Sets the restore property value. An item was restored.
     * @param value Value to set for the restore property.
     */
    public void setRestore(@jakarta.annotation.Nullable final RestoreAction value) {
        this.backingStore.set("restore", value);
    }
    /**
     * Sets the share property value. An item was shared.
     * @param value Value to set for the share property.
     */
    public void setShare(@jakarta.annotation.Nullable final ShareAction value) {
        this.backingStore.set("share", value);
    }
    /**
     * Sets the version property value. An item was versioned.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final VersionAction value) {
        this.backingStore.set("version", value);
    }
}

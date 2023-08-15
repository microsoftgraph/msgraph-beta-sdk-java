package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemActionSet implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A comment was added to the item.
     */
    private CommentAction comment;
    /**
     * An item was created.
     */
    private CreateAction create;
    /**
     * An item was deleted.
     */
    private DeleteAction delete;
    /**
     * An item was edited.
     */
    private EditAction edit;
    /**
     * A user was mentioned in the item.
     */
    private MentionAction mention;
    /**
     * An item was moved.
     */
    private MoveAction move;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * An item was renamed.
     */
    private RenameAction rename;
    /**
     * An item was restored.
     */
    private RestoreAction restore;
    /**
     * An item was shared.
     */
    private ShareAction share;
    /**
     * An item was versioned.
     */
    private VersionAction version;
    /**
     * Instantiates a new itemActionSet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ItemActionSet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActionSet
     */
    @javax.annotation.Nonnull
    public static ItemActionSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActionSet();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the comment property value. A comment was added to the item.
     * @return a commentAction
     */
    @javax.annotation.Nullable
    public CommentAction getComment() {
        return this.comment;
    }
    /**
     * Gets the create property value. An item was created.
     * @return a createAction
     */
    @javax.annotation.Nullable
    public CreateAction getCreate() {
        return this.create;
    }
    /**
     * Gets the delete property value. An item was deleted.
     * @return a deleteAction
     */
    @javax.annotation.Nullable
    public DeleteAction getDelete() {
        return this.delete;
    }
    /**
     * Gets the edit property value. An item was edited.
     * @return a editAction
     */
    @javax.annotation.Nullable
    public EditAction getEdit() {
        return this.edit;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a mentionAction
     */
    @javax.annotation.Nullable
    public MentionAction getMention() {
        return this.mention;
    }
    /**
     * Gets the move property value. An item was moved.
     * @return a moveAction
     */
    @javax.annotation.Nullable
    public MoveAction getMove() {
        return this.move;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the rename property value. An item was renamed.
     * @return a renameAction
     */
    @javax.annotation.Nullable
    public RenameAction getRename() {
        return this.rename;
    }
    /**
     * Gets the restore property value. An item was restored.
     * @return a restoreAction
     */
    @javax.annotation.Nullable
    public RestoreAction getRestore() {
        return this.restore;
    }
    /**
     * Gets the share property value. An item was shared.
     * @return a shareAction
     */
    @javax.annotation.Nullable
    public ShareAction getShare() {
        return this.share;
    }
    /**
     * Gets the version property value. An item was versioned.
     * @return a versionAction
     */
    @javax.annotation.Nullable
    public VersionAction getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the comment property value. A comment was added to the item.
     * @param value Value to set for the comment property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComment(@javax.annotation.Nullable final CommentAction value) {
        this.comment = value;
    }
    /**
     * Sets the create property value. An item was created.
     * @param value Value to set for the create property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreate(@javax.annotation.Nullable final CreateAction value) {
        this.create = value;
    }
    /**
     * Sets the delete property value. An item was deleted.
     * @param value Value to set for the delete property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDelete(@javax.annotation.Nullable final DeleteAction value) {
        this.delete = value;
    }
    /**
     * Sets the edit property value. An item was edited.
     * @param value Value to set for the edit property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEdit(@javax.annotation.Nullable final EditAction value) {
        this.edit = value;
    }
    /**
     * Sets the mention property value. A user was mentioned in the item.
     * @param value Value to set for the mention property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMention(@javax.annotation.Nullable final MentionAction value) {
        this.mention = value;
    }
    /**
     * Sets the move property value. An item was moved.
     * @param value Value to set for the move property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMove(@javax.annotation.Nullable final MoveAction value) {
        this.move = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the rename property value. An item was renamed.
     * @param value Value to set for the rename property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRename(@javax.annotation.Nullable final RenameAction value) {
        this.rename = value;
    }
    /**
     * Sets the restore property value. An item was restored.
     * @param value Value to set for the restore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestore(@javax.annotation.Nullable final RestoreAction value) {
        this.restore = value;
    }
    /**
     * Sets the share property value. An item was shared.
     * @param value Value to set for the share property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShare(@javax.annotation.Nullable final ShareAction value) {
        this.share = value;
    }
    /**
     * Sets the version property value. An item was versioned.
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final VersionAction value) {
        this.version = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CommentAction implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If true, this activity was a reply to an existing comment thread. */
    private Boolean _isReply;
    /** The OdataType property */
    private String _odataType;
    /** The identity of the user who started the comment thread. */
    private IdentitySet _parentAuthor;
    /** The identities of the users participating in this comment thread. */
    private java.util.List<IdentitySet> _participants;
    /**
     * Instantiates a new commentAction and sets the default values.
     * @return a void
     */
    public CommentAction() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.commentAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a commentAction
     */
    @javax.annotation.Nonnull
    public static CommentAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CommentAction();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CommentAction currentObject = this;
        return new HashMap<>(4) {{
            this.put("isReply", (n) -> { currentObject.setIsReply(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("parentAuthor", (n) -> { currentObject.setParentAuthor(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
            this.put("participants", (n) -> { currentObject.setParticipants(n.getCollectionOfObjectValues(IdentitySet::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isReply property value. If true, this activity was a reply to an existing comment thread.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsReply() {
        return this._isReply;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the parentAuthor property value. The identity of the user who started the comment thread.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public IdentitySet getParentAuthor() {
        return this._parentAuthor;
    }
    /**
     * Gets the participants property value. The identities of the users participating in this comment thread.
     * @return a identitySet
     */
    @javax.annotation.Nullable
    public java.util.List<IdentitySet> getParticipants() {
        return this._participants;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("isReply", this.getIsReply());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("parentAuthor", this.getParentAuthor());
        writer.writeCollectionOfObjectValues("participants", this.getParticipants());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the isReply property value. If true, this activity was a reply to an existing comment thread.
     * @param value Value to set for the isReply property.
     * @return a void
     */
    public void setIsReply(@javax.annotation.Nullable final Boolean value) {
        this._isReply = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the parentAuthor property value. The identity of the user who started the comment thread.
     * @param value Value to set for the parentAuthor property.
     * @return a void
     */
    public void setParentAuthor(@javax.annotation.Nullable final IdentitySet value) {
        this._parentAuthor = value;
    }
    /**
     * Sets the participants property value. The identities of the users participating in this comment thread.
     * @param value Value to set for the participants property.
     * @return a void
     */
    public void setParticipants(@javax.annotation.Nullable final java.util.List<IdentitySet> value) {
        this._participants = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewPolicy extends Entity implements Parsable {
    /** Description for this policy. Read-only. */
    private String _description;
    /** Display name for this policy. Read-only. */
    private String _displayName;
    /** If true, group owners can create and manage access reviews on groups they own. */
    private Boolean _isGroupOwnerManagementEnabled;
    /**
     * Instantiates a new accessReviewPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AccessReviewPolicy() {
        super();
        this.setOdataType("#microsoft.graph.accessReviewPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewPolicy
     */
    @javax.annotation.Nonnull
    public static AccessReviewPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewPolicy();
    }
    /**
     * Gets the description property value. Description for this policy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. Display name for this policy. Read-only.
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
        final AccessReviewPolicy currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("isGroupOwnerManagementEnabled", (n) -> { currentObject.setIsGroupOwnerManagementEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isGroupOwnerManagementEnabled property value. If true, group owners can create and manage access reviews on groups they own.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsGroupOwnerManagementEnabled() {
        return this._isGroupOwnerManagementEnabled;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("isGroupOwnerManagementEnabled", this.getIsGroupOwnerManagementEnabled());
    }
    /**
     * Sets the description property value. Description for this policy. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. Display name for this policy. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the isGroupOwnerManagementEnabled property value. If true, group owners can create and manage access reviews on groups they own.
     * @param value Value to set for the isGroupOwnerManagementEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsGroupOwnerManagementEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isGroupOwnerManagementEnabled = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProtectGroup extends LabelActionBase implements Parsable {
    /** The allowEmailFromGuestUsers property */
    private Boolean _allowEmailFromGuestUsers;
    /** The allowGuestUsers property */
    private Boolean _allowGuestUsers;
    /** The privacy property */
    private GroupPrivacy _privacy;
    /**
     * Instantiates a new ProtectGroup and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ProtectGroup() {
        super();
        this.setOdataType("#microsoft.graph.protectGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProtectGroup
     */
    @javax.annotation.Nonnull
    public static ProtectGroup createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectGroup();
    }
    /**
     * Gets the allowEmailFromGuestUsers property value. The allowEmailFromGuestUsers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowEmailFromGuestUsers() {
        return this._allowEmailFromGuestUsers;
    }
    /**
     * Gets the allowGuestUsers property value. The allowGuestUsers property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowGuestUsers() {
        return this._allowGuestUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ProtectGroup currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowEmailFromGuestUsers", (n) -> { currentObject.setAllowEmailFromGuestUsers(n.getBooleanValue()); });
        deserializerMap.put("allowGuestUsers", (n) -> { currentObject.setAllowGuestUsers(n.getBooleanValue()); });
        deserializerMap.put("privacy", (n) -> { currentObject.setPrivacy(n.getEnumValue(GroupPrivacy.class)); });
        return deserializerMap;
    }
    /**
     * Gets the privacy property value. The privacy property
     * @return a groupPrivacy
     */
    @javax.annotation.Nullable
    public GroupPrivacy getPrivacy() {
        return this._privacy;
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
        writer.writeBooleanValue("allowEmailFromGuestUsers", this.getAllowEmailFromGuestUsers());
        writer.writeBooleanValue("allowGuestUsers", this.getAllowGuestUsers());
        writer.writeEnumValue("privacy", this.getPrivacy());
    }
    /**
     * Sets the allowEmailFromGuestUsers property value. The allowEmailFromGuestUsers property
     * @param value Value to set for the allowEmailFromGuestUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowEmailFromGuestUsers(@javax.annotation.Nullable final Boolean value) {
        this._allowEmailFromGuestUsers = value;
    }
    /**
     * Sets the allowGuestUsers property value. The allowGuestUsers property
     * @param value Value to set for the allowGuestUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAllowGuestUsers(@javax.annotation.Nullable final Boolean value) {
        this._allowGuestUsers = value;
    }
    /**
     * Sets the privacy property value. The privacy property
     * @param value Value to set for the privacy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacy(@javax.annotation.Nullable final GroupPrivacy value) {
        this._privacy = value;
    }
}

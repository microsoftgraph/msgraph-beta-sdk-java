package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ProtectGroup extends LabelActionBase implements Parsable {
    /**
     * The allowEmailFromGuestUsers property
     */
    private Boolean allowEmailFromGuestUsers;
    /**
     * The allowGuestUsers property
     */
    private Boolean allowGuestUsers;
    /**
     * The privacy property
     */
    private GroupPrivacy privacy;
    /**
     * Instantiates a new protectGroup and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ProtectGroup() {
        super();
        this.setOdataType("#microsoft.graph.protectGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a protectGroup
     */
    @jakarta.annotation.Nonnull
    public static ProtectGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectGroup();
    }
    /**
     * Gets the allowEmailFromGuestUsers property value. The allowEmailFromGuestUsers property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEmailFromGuestUsers() {
        return this.allowEmailFromGuestUsers;
    }
    /**
     * Gets the allowGuestUsers property value. The allowGuestUsers property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowGuestUsers() {
        return this.allowGuestUsers;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowEmailFromGuestUsers", (n) -> { this.setAllowEmailFromGuestUsers(n.getBooleanValue()); });
        deserializerMap.put("allowGuestUsers", (n) -> { this.setAllowGuestUsers(n.getBooleanValue()); });
        deserializerMap.put("privacy", (n) -> { this.setPrivacy(n.getEnumValue(GroupPrivacy.class)); });
        return deserializerMap;
    }
    /**
     * Gets the privacy property value. The privacy property
     * @return a groupPrivacy
     */
    @jakarta.annotation.Nullable
    public GroupPrivacy getPrivacy() {
        return this.privacy;
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
        writer.writeBooleanValue("allowEmailFromGuestUsers", this.getAllowEmailFromGuestUsers());
        writer.writeBooleanValue("allowGuestUsers", this.getAllowGuestUsers());
        writer.writeEnumValue("privacy", this.getPrivacy());
    }
    /**
     * Sets the allowEmailFromGuestUsers property value. The allowEmailFromGuestUsers property
     * @param value Value to set for the allowEmailFromGuestUsers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowEmailFromGuestUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.allowEmailFromGuestUsers = value;
    }
    /**
     * Sets the allowGuestUsers property value. The allowGuestUsers property
     * @param value Value to set for the allowGuestUsers property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAllowGuestUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.allowGuestUsers = value;
    }
    /**
     * Sets the privacy property value. The privacy property
     * @param value Value to set for the privacy property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setPrivacy(@jakarta.annotation.Nullable final GroupPrivacy value) {
        this.privacy = value;
    }
}

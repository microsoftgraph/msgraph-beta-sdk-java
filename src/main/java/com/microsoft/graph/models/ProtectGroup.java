package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProtectGroup extends LabelActionBase implements Parsable {
    /**
     * Instantiates a new ProtectGroup and sets the default values.
     */
    public ProtectGroup() {
        super();
        this.setOdataType("#microsoft.graph.protectGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ProtectGroup
     */
    @jakarta.annotation.Nonnull
    public static ProtectGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectGroup();
    }
    /**
     * Gets the allowEmailFromGuestUsers property value. The allowEmailFromGuestUsers property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowEmailFromGuestUsers() {
        return this.backingStore.get("allowEmailFromGuestUsers");
    }
    /**
     * Gets the allowGuestUsers property value. The allowGuestUsers property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowGuestUsers() {
        return this.backingStore.get("allowGuestUsers");
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
     * @return a GroupPrivacy
     */
    @jakarta.annotation.Nullable
    public GroupPrivacy getPrivacy() {
        return this.backingStore.get("privacy");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
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
     */
    public void setAllowEmailFromGuestUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowEmailFromGuestUsers", value);
    }
    /**
     * Sets the allowGuestUsers property value. The allowGuestUsers property
     * @param value Value to set for the allowGuestUsers property.
     */
    public void setAllowGuestUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowGuestUsers", value);
    }
    /**
     * Sets the privacy property value. The privacy property
     * @param value Value to set for the privacy property.
     */
    public void setPrivacy(@jakarta.annotation.Nullable final GroupPrivacy value) {
        this.backingStore.set("privacy", value);
    }
}

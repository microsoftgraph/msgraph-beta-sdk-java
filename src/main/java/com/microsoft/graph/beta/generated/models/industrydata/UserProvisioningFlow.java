package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserProvisioningFlow extends ProvisioningFlow implements Parsable {
    /**
     * Instantiates a new {@link UserProvisioningFlow} and sets the default values.
     */
    public UserProvisioningFlow() {
        super();
        this.setOdataType("#microsoft.graph.industryData.userProvisioningFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserProvisioningFlow}
     */
    @jakarta.annotation.Nonnull
    public static UserProvisioningFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserProvisioningFlow();
    }
    /**
     * Gets the createUnmatchedUsers property value. A boolean choice indicating whether unmatched users should be created or ignored.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCreateUnmatchedUsers() {
        return this.backingStore.get("createUnmatchedUsers");
    }
    /**
     * Gets the creationOptions property value. The different management choices for the new users to be provisioned.
     * @return a {@link UserCreationOptions}
     */
    @jakarta.annotation.Nullable
    public UserCreationOptions getCreationOptions() {
        return this.backingStore.get("creationOptions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createUnmatchedUsers", (n) -> { this.setCreateUnmatchedUsers(n.getBooleanValue()); });
        deserializerMap.put("creationOptions", (n) -> { this.setCreationOptions(n.getObjectValue(UserCreationOptions::createFromDiscriminatorValue)); });
        deserializerMap.put("managementOptions", (n) -> { this.setManagementOptions(n.getObjectValue(UserManagementOptions::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the managementOptions property value. The managementOptions property
     * @return a {@link UserManagementOptions}
     */
    @jakarta.annotation.Nullable
    public UserManagementOptions getManagementOptions() {
        return this.backingStore.get("managementOptions");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("createUnmatchedUsers", this.getCreateUnmatchedUsers());
        writer.writeObjectValue("creationOptions", this.getCreationOptions());
        writer.writeObjectValue("managementOptions", this.getManagementOptions());
    }
    /**
     * Sets the createUnmatchedUsers property value. A boolean choice indicating whether unmatched users should be created or ignored.
     * @param value Value to set for the createUnmatchedUsers property.
     */
    public void setCreateUnmatchedUsers(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("createUnmatchedUsers", value);
    }
    /**
     * Sets the creationOptions property value. The different management choices for the new users to be provisioned.
     * @param value Value to set for the creationOptions property.
     */
    public void setCreationOptions(@jakarta.annotation.Nullable final UserCreationOptions value) {
        this.backingStore.set("creationOptions", value);
    }
    /**
     * Sets the managementOptions property value. The managementOptions property
     * @param value Value to set for the managementOptions property.
     */
    public void setManagementOptions(@jakarta.annotation.Nullable final UserManagementOptions value) {
        this.backingStore.set("managementOptions", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointUserIdentityMapping extends SharePointIdentityMapping implements Parsable {
    /**
     * Instantiates a new {@link SharePointUserIdentityMapping} and sets the default values.
     */
    public SharePointUserIdentityMapping() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointUserIdentityMapping}
     */
    @jakarta.annotation.Nonnull
    public static SharePointUserIdentityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointUserIdentityMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("sourceUserIdentity", (n) -> { this.setSourceUserIdentity(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("targetUserIdentity", (n) -> { this.setTargetUserIdentity(n.getObjectValue(UserIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("targetUserMigrationData", (n) -> { this.setTargetUserMigrationData(n.getObjectValue(SharePointIdentityMappingUserMigrationData::createFromDiscriminatorValue)); });
        deserializerMap.put("userType", (n) -> { this.setUserType(n.getEnumValue(SharePointIdentityMappingUserType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceUserIdentity property value. The identity information of the source user in the originating organization. Contains the source user&apos;s principal name.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getSourceUserIdentity() {
        return this.backingStore.get("sourceUserIdentity");
    }
    /**
     * Gets the targetUserIdentity property value. The identity information of the target user in the destination organization. Contains the target user&apos;s principal name.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getTargetUserIdentity() {
        return this.backingStore.get("targetUserIdentity");
    }
    /**
     * Gets the targetUserMigrationData property value. Additional migration-specific data for the target user. Contains the email address for the user in the destination organization.
     * @return a {@link SharePointIdentityMappingUserMigrationData}
     */
    @jakarta.annotation.Nullable
    public SharePointIdentityMappingUserMigrationData getTargetUserMigrationData() {
        return this.backingStore.get("targetUserMigrationData");
    }
    /**
     * Gets the userType property value. The userType property
     * @return a {@link SharePointIdentityMappingUserType}
     */
    @jakarta.annotation.Nullable
    public SharePointIdentityMappingUserType getUserType() {
        return this.backingStore.get("userType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("sourceUserIdentity", this.getSourceUserIdentity());
        writer.writeObjectValue("targetUserIdentity", this.getTargetUserIdentity());
        writer.writeObjectValue("targetUserMigrationData", this.getTargetUserMigrationData());
        writer.writeEnumValue("userType", this.getUserType());
    }
    /**
     * Sets the sourceUserIdentity property value. The identity information of the source user in the originating organization. Contains the source user&apos;s principal name.
     * @param value Value to set for the sourceUserIdentity property.
     */
    public void setSourceUserIdentity(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("sourceUserIdentity", value);
    }
    /**
     * Sets the targetUserIdentity property value. The identity information of the target user in the destination organization. Contains the target user&apos;s principal name.
     * @param value Value to set for the targetUserIdentity property.
     */
    public void setTargetUserIdentity(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("targetUserIdentity", value);
    }
    /**
     * Sets the targetUserMigrationData property value. Additional migration-specific data for the target user. Contains the email address for the user in the destination organization.
     * @param value Value to set for the targetUserMigrationData property.
     */
    public void setTargetUserMigrationData(@jakarta.annotation.Nullable final SharePointIdentityMappingUserMigrationData value) {
        this.backingStore.set("targetUserMigrationData", value);
    }
    /**
     * Sets the userType property value. The userType property
     * @param value Value to set for the userType property.
     */
    public void setUserType(@jakarta.annotation.Nullable final SharePointIdentityMappingUserType value) {
        this.backingStore.set("userType", value);
    }
}

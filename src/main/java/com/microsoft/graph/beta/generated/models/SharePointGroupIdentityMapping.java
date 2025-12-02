package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointGroupIdentityMapping extends SharePointIdentityMapping implements Parsable {
    /**
     * Instantiates a new {@link SharePointGroupIdentityMapping} and sets the default values.
     */
    public SharePointGroupIdentityMapping() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointGroupIdentityMapping}
     */
    @jakarta.annotation.Nonnull
    public static SharePointGroupIdentityMapping createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointGroupIdentityMapping();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("groupType", (n) -> { this.setGroupType(n.getEnumValue(SharePointIdentityMappingGroupType::forValue)); });
        deserializerMap.put("sourceGroupIdentity", (n) -> { this.setSourceGroupIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("targetGroupIdentity", (n) -> { this.setTargetGroupIdentity(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        deserializerMap.put("targetGroupMigrationData", (n) -> { this.setTargetGroupMigrationData(n.getObjectValue(SharePointIdentityMappingGroupMigrationData::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groupType property value. The groupType property
     * @return a {@link SharePointIdentityMappingGroupType}
     */
    @jakarta.annotation.Nullable
    public SharePointIdentityMappingGroupType getGroupType() {
        return this.backingStore.get("groupType");
    }
    /**
     * Gets the sourceGroupIdentity property value. The identity information of the source group in the originating organization. Contains the ID of the source group.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getSourceGroupIdentity() {
        return this.backingStore.get("sourceGroupIdentity");
    }
    /**
     * Gets the targetGroupIdentity property value. The identity information of the target group in the destination organization. Contains the ID of the target group.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getTargetGroupIdentity() {
        return this.backingStore.get("targetGroupIdentity");
    }
    /**
     * Gets the targetGroupMigrationData property value. Additional migration-specific data for the target group.
     * @return a {@link SharePointIdentityMappingGroupMigrationData}
     */
    @jakarta.annotation.Nullable
    public SharePointIdentityMappingGroupMigrationData getTargetGroupMigrationData() {
        return this.backingStore.get("targetGroupMigrationData");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("groupType", this.getGroupType());
        writer.writeObjectValue("sourceGroupIdentity", this.getSourceGroupIdentity());
        writer.writeObjectValue("targetGroupIdentity", this.getTargetGroupIdentity());
        writer.writeObjectValue("targetGroupMigrationData", this.getTargetGroupMigrationData());
    }
    /**
     * Sets the groupType property value. The groupType property
     * @param value Value to set for the groupType property.
     */
    public void setGroupType(@jakarta.annotation.Nullable final SharePointIdentityMappingGroupType value) {
        this.backingStore.set("groupType", value);
    }
    /**
     * Sets the sourceGroupIdentity property value. The identity information of the source group in the originating organization. Contains the ID of the source group.
     * @param value Value to set for the sourceGroupIdentity property.
     */
    public void setSourceGroupIdentity(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("sourceGroupIdentity", value);
    }
    /**
     * Sets the targetGroupIdentity property value. The identity information of the target group in the destination organization. Contains the ID of the target group.
     * @param value Value to set for the targetGroupIdentity property.
     */
    public void setTargetGroupIdentity(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("targetGroupIdentity", value);
    }
    /**
     * Sets the targetGroupMigrationData property value. Additional migration-specific data for the target group.
     * @param value Value to set for the targetGroupMigrationData property.
     */
    public void setTargetGroupMigrationData(@jakarta.annotation.Nullable final SharePointIdentityMappingGroupMigrationData value) {
        this.backingStore.set("targetGroupMigrationData", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointGroupMigrationTaskParameters extends SharePointMigrationTaskParameters implements Parsable {
    /**
     * Instantiates a new {@link SharePointGroupMigrationTaskParameters} and sets the default values.
     */
    public SharePointGroupMigrationTaskParameters() {
        super();
        this.setOdataType("#microsoft.graph.sharePointGroupMigrationTaskParameters");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointGroupMigrationTaskParameters}
     */
    @jakarta.annotation.Nonnull
    public static SharePointGroupMigrationTaskParameters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointGroupMigrationTaskParameters();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("sourceGroupIdentity", (n) -> { this.setSourceGroupIdentity(n.getObjectValue(GroupIdentity::createFromDiscriminatorValue)); });
        deserializerMap.put("targetGroupIdentity", (n) -> { this.setTargetGroupIdentity(n.getObjectValue(GroupIdentity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the sourceGroupIdentity property value. The identity of the source group in the source tenant, including its mail nickname.
     * @return a {@link GroupIdentity}
     */
    @jakarta.annotation.Nullable
    public GroupIdentity getSourceGroupIdentity() {
        return this.backingStore.get("sourceGroupIdentity");
    }
    /**
     * Gets the targetGroupIdentity property value. The identity of the target group in the target tenant, including its mail nickname.
     * @return a {@link GroupIdentity}
     */
    @jakarta.annotation.Nullable
    public GroupIdentity getTargetGroupIdentity() {
        return this.backingStore.get("targetGroupIdentity");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("sourceGroupIdentity", this.getSourceGroupIdentity());
        writer.writeObjectValue("targetGroupIdentity", this.getTargetGroupIdentity());
    }
    /**
     * Sets the sourceGroupIdentity property value. The identity of the source group in the source tenant, including its mail nickname.
     * @param value Value to set for the sourceGroupIdentity property.
     */
    public void setSourceGroupIdentity(@jakarta.annotation.Nullable final GroupIdentity value) {
        this.backingStore.set("sourceGroupIdentity", value);
    }
    /**
     * Sets the targetGroupIdentity property value. The identity of the target group in the target tenant, including its mail nickname.
     * @param value Value to set for the targetGroupIdentity property.
     */
    public void setTargetGroupIdentity(@jakarta.annotation.Nullable final GroupIdentity value) {
        this.backingStore.set("targetGroupIdentity", value);
    }
}

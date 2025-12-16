package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointUserMigrationTaskParameters extends SharePointMigrationTaskParameters implements Parsable {
    /**
     * Instantiates a new {@link SharePointUserMigrationTaskParameters} and sets the default values.
     */
    public SharePointUserMigrationTaskParameters() {
        super();
        this.setOdataType("#microsoft.graph.sharePointUserMigrationTaskParameters");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointUserMigrationTaskParameters}
     */
    @jakarta.annotation.Nonnull
    public static SharePointUserMigrationTaskParameters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointUserMigrationTaskParameters();
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
        return deserializerMap;
    }
    /**
     * Gets the sourceUserIdentity property value. The source user in the source tenant, including the user object ID and the user principal name.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getSourceUserIdentity() {
        return this.backingStore.get("sourceUserIdentity");
    }
    /**
     * Gets the targetUserIdentity property value. The target user in the target tenant, including the user object ID and the user principal name.
     * @return a {@link UserIdentity}
     */
    @jakarta.annotation.Nullable
    public UserIdentity getTargetUserIdentity() {
        return this.backingStore.get("targetUserIdentity");
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
    }
    /**
     * Sets the sourceUserIdentity property value. The source user in the source tenant, including the user object ID and the user principal name.
     * @param value Value to set for the sourceUserIdentity property.
     */
    public void setSourceUserIdentity(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("sourceUserIdentity", value);
    }
    /**
     * Sets the targetUserIdentity property value. The target user in the target tenant, including the user object ID and the user principal name.
     * @param value Value to set for the targetUserIdentity property.
     */
    public void setTargetUserIdentity(@jakarta.annotation.Nullable final UserIdentity value) {
        this.backingStore.set("targetUserIdentity", value);
    }
}

package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdatableAssetGroup extends UpdatableAsset implements Parsable {
    /**
     * Instantiates a new {@link UpdatableAssetGroup} and sets the default values.
     */
    public UpdatableAssetGroup() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.updatableAssetGroup");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdatableAssetGroup}
     */
    @jakarta.annotation.Nonnull
    public static UpdatableAssetGroup createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdatableAssetGroup();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("members", (n) -> { this.setMembers(n.getCollectionOfObjectValues(UpdatableAsset::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the members property value. Members of the group. Read-only.
     * @return a {@link java.util.List<UpdatableAsset>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<UpdatableAsset> getMembers() {
        return this.backingStore.get("members");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("members", this.getMembers());
    }
    /**
     * Sets the members property value. Members of the group. Read-only.
     * @param value Value to set for the members property.
     */
    public void setMembers(@jakarta.annotation.Nullable final java.util.List<UpdatableAsset> value) {
        this.backingStore.set("members", value);
    }
}

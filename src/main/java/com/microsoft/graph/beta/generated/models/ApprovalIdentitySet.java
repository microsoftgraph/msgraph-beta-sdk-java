package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApprovalIdentitySet extends IdentitySet implements Parsable {
    /**
     * Instantiates a new {@link ApprovalIdentitySet} and sets the default values.
     */
    public ApprovalIdentitySet() {
        super();
        this.setOdataType("#microsoft.graph.approvalIdentitySet");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApprovalIdentitySet}
     */
    @jakarta.annotation.Nonnull
    public static ApprovalIdentitySet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApprovalIdentitySet();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("group", (n) -> { this.setGroup(n.getObjectValue(Identity::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the group property value. The Microsoft Entra group associated with the approval item.
     * @return a {@link Identity}
     */
    @jakarta.annotation.Nullable
    public Identity getGroup() {
        return this.backingStore.get("group");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("group", this.getGroup());
    }
    /**
     * Sets the group property value. The Microsoft Entra group associated with the approval item.
     * @param value Value to set for the group property.
     */
    public void setGroup(@jakarta.annotation.Nullable final Identity value) {
        this.backingStore.set("group", value);
    }
}
